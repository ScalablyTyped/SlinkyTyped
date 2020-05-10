package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typingsSlinky.chromeApps.chromeAppsStrings.DISABLED
import typingsSlinky.chromeApps.chromeAppsStrings.INITIALIZING
import typingsSlinky.chromeApps.chromeAppsStrings.RUNNING
import typingsSlinky.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import typingsSlinky.chromeApps.chromeAppsStrings.authentication_required_
import typingsSlinky.chromeApps.chromeAppsStrings.disabled__
import typingsSlinky.chromeApps.chromeAppsStrings.initializing_
import typingsSlinky.chromeApps.chromeAppsStrings.running_
import typingsSlinky.chromeApps.chromeAppsStrings.temporary_unavailable_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonState extends js.Object {
  var description: String = js.native
  var state: ToStringLiteral[
    AnonAUTHENTICATIONREQUIRED, 
    /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
    Exclude[
      /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
    ]
  ] = js.native
}

object AnonState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AnonAUTHENTICATIONREQUIRED, 
      /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      Exclude[
        /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
      ]
    ]
  ): AnonState = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
  @scala.inline
  implicit class AnonStateOps[Self <: AnonState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(
      value: ToStringLiteral[
          AnonAUTHENTICATIONREQUIRED, 
          /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          Exclude[
            /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
            temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

