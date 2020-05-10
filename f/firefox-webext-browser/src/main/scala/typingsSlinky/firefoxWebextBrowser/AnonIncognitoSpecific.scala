package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.types.LevelOfControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncognitoSpecific extends js.Object {
  /**
    * Whether the value that has changed is specific to the incognito session.
    * This property will _only_ be present if the user has enabled the extension in incognito mode.
    */
  var incognitoSpecific: js.UndefOr[Boolean] = js.native
  /** The level of control of the setting. */
  var levelOfControl: LevelOfControl = js.native
  /** The value of the setting after the change. */
  var value: js.Any = js.native
}

object AnonIncognitoSpecific {
  @scala.inline
  def apply(levelOfControl: LevelOfControl, value: js.Any): AnonIncognitoSpecific = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncognitoSpecific]
  }
  @scala.inline
  implicit class AnonIncognitoSpecificOps[Self <: AnonIncognitoSpecific] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevelOfControl(value: LevelOfControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelOfControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognitoSpecific(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognitoSpecific")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognitoSpecific: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognitoSpecific")(js.undefined)
        ret
    }
  }
  
}

