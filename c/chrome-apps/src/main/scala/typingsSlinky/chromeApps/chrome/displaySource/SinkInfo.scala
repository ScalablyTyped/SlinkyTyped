package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.anon.CONNECTED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTING
import typingsSlinky.chromeApps.chromeAppsStrings.Connected_
import typingsSlinky.chromeApps.chromeAppsStrings.Connecting_
import typingsSlinky.chromeApps.chromeAppsStrings.DISCONNECTED
import typingsSlinky.chromeApps.chromeAppsStrings.Disconnected_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    CONNECTED, 
    /* keyof chrome-apps.anon.CONNECTED */ typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
    Exclude[
      /* keyof chrome-apps.anon.CONNECTED */ typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
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
      CONNECTED, 
      /* keyof chrome-apps.anon.CONNECTED */ typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
      Exclude[
        /* keyof chrome-apps.anon.CONNECTED */ typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(
      value: ToStringLiteral[
          CONNECTED, 
          /* keyof chrome-apps.anon.CONNECTED */ typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
          Exclude[
            /* keyof chrome-apps.anon.CONNECTED */ typingsSlinky.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
            Connected_ | Connecting_ | Disconnected_
          ]
        ]
    ): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
