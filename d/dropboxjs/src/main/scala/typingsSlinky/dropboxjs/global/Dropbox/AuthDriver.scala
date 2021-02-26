package typingsSlinky.dropboxjs.global.Dropbox

import org.scalajs.dom.raw.Storage
import typingsSlinky.dropboxjs.Dropbox.RedirectOptions
import typingsSlinky.dropboxjs.anon.Port
import typingsSlinky.dropboxjs.anon.ReceiverPath
import typingsSlinky.dropboxjs.anon.RedirectFile
import typingsSlinky.dropboxjs.anon.RememberUser
import typingsSlinky.dropboxjs.anon.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver ()
  extends typingsSlinky.dropboxjs.Dropbox.AuthDriver
object AuthDriver {
  
  @JSGlobal("Dropbox.AuthDriver.BrowserBase")
  @js.native
  class BrowserBase protected ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.BrowserBase {
    def this(options: RememberUser) = this()
  }
  object BrowserBase {
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.BrowserBase.cleanupLocation")
    @js.native
    def cleanupLocation(): Unit = js.native
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.BrowserBase.currentLocation")
    @js.native
    def currentLocation(): String = js.native
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.BrowserBase.localStorage")
    @js.native
    def localStorage(): Storage = js.native
  }
  
  @JSGlobal("Dropbox.AuthDriver.ChromeApp")
  @js.native
  class ChromeApp ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: Scope) = this()
  }
  
  @JSGlobal("Dropbox.AuthDriver.ChromeExtension")
  @js.native
  class ChromeExtension ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: ReceiverPath) = this()
  }
  object ChromeExtension {
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.ChromeExtension.oauthReceiver")
    @js.native
    def oauthReceiver(): Unit = js.native
  }
  
  @JSGlobal("Dropbox.AuthDriver.Cordova")
  @js.native
  class Cordova ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.Cordova {
    def this(options: ReceiverPath) = this()
  }
  object Cordova {
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.Cordova.oauthReceiver")
    @js.native
    def oauthReceiver(): Unit = js.native
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @JSGlobal("Dropbox.AuthDriver.IAuthDriver")
  @js.native
  class IAuthDriver ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.IAuthDriver
  
  @JSGlobal("Dropbox.AuthDriver.NodeServer")
  @js.native
  class NodeServer ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.NodeServer {
    def this(options: Port) = this()
  }
  
  @JSGlobal("Dropbox.AuthDriver.Popup")
  @js.native
  class Popup ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.Popup {
    def this(options: RedirectOptions) = this()
  }
  object Popup {
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.Popup.locationOrigin")
    @js.native
    def locationOrigin(location: String): String = js.native
    
    /* static member */
    @JSGlobal("Dropbox.AuthDriver.Popup.oauthReceiver")
    @js.native
    def oauthReceiver(): Unit = js.native
  }
  
  @JSGlobal("Dropbox.AuthDriver.Redirect")
  @js.native
  class Redirect ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.Redirect {
    def this(options: RedirectFile) = this()
  }
}
