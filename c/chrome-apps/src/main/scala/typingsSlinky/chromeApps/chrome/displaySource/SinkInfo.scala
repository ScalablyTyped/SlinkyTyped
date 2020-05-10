package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.AnonCONNECTED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTING
import typingsSlinky.chromeApps.chromeAppsStrings.Connected_
import typingsSlinky.chromeApps.chromeAppsStrings.Connecting_
import typingsSlinky.chromeApps.chromeAppsStrings.DISCONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.Disconnected_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: integer = js.native
  /** Human readable name of the sink. */
  var name: String = js.native
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: ToStringLiteral[
    AnonCONNECTED, 
    /* keyof chrome-apps.AnonCONNECTED */ CONNECTED | CONNECTING | DISCONNECTED, 
    Exclude[
      /* keyof chrome-apps.AnonCONNECTED */ CONNECTED | CONNECTING | DISCONNECTED, 
      Connected_ | Connecting_ | Disconnected_
    ]
  ] = js.native
}

object SinkInfo {
  @scala.inline
  def apply(
    id: integer,
    name: String,
    state: ToStringLiteral[
      AnonCONNECTED, 
      /* keyof chrome-apps.AnonCONNECTED */ CONNECTED | CONNECTING | DISCONNECTED, 
      Exclude[
        /* keyof chrome-apps.AnonCONNECTED */ CONNECTED | CONNECTING | DISCONNECTED, 
        Connected_ | Connecting_ | Disconnected_
      ]
    ]
  ): SinkInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinkInfo]
  }
  @scala.inline
  implicit class SinkInfoOps[Self <: SinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(
      value: ToStringLiteral[
          AnonCONNECTED, 
          /* keyof chrome-apps.AnonCONNECTED */ CONNECTED | CONNECTING | DISCONNECTED, 
          Exclude[
            /* keyof chrome-apps.AnonCONNECTED */ CONNECTED | CONNECTING | DISCONNECTED, 
            Connected_ | Connecting_ | Disconnected_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

