package typingsSlinky.dropboxjs.global.Dropbox

import org.scalajs.dom.raw.Storage
import typingsSlinky.dropboxjs.Dropbox.RedirectOptions
import typingsSlinky.dropboxjs.anon.Port
import typingsSlinky.dropboxjs.anon.ReceiverPath
import typingsSlinky.dropboxjs.anon.RedirectFile
import typingsSlinky.dropboxjs.anon.RememberUser
import typingsSlinky.dropboxjs.anon.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver ()
  extends typingsSlinky.dropboxjs.Dropbox.AuthDriver
@JSGlobal("Dropbox.AuthDriver")
@js.native
object AuthDriver extends js.Object {
  
  @js.native
  class BrowserBase protected ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.BrowserBase {
    def this(options: RememberUser) = this()
  }
  /* static members */
  @js.native
  object BrowserBase extends js.Object {
    
    def cleanupLocation(): Unit = js.native
    
    def currentLocation(): String = js.native
    
    def localStorage(): Storage = js.native
  }
  
  @js.native
  class ChromeApp ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: Scope) = this()
  }
  
  @js.native
  class ChromeExtension ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: ReceiverPath) = this()
  }
  /* static members */
  @js.native
  object ChromeExtension extends js.Object {
    
    def oauthReceiver(): Unit = js.native
  }
  
  @js.native
  class Cordova ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.Cordova {
    def this(options: ReceiverPath) = this()
  }
  /* static members */
  @js.native
  object Cordova extends js.Object {
    
    def oauthReceiver(): Unit = js.native
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @js.native
  class IAuthDriver ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.IAuthDriver
  
  @js.native
  class NodeServer ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.NodeServer {
    def this(options: Port) = this()
  }
  
  @js.native
  class Popup ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.Popup {
    def this(options: RedirectOptions) = this()
  }
  /* static members */
  @js.native
  object Popup extends js.Object {
    
    def locationOrigin(location: String): String = js.native
    
    def oauthReceiver(): Unit = js.native
  }
  
  @js.native
  class Redirect ()
    extends typingsSlinky.dropboxjs.Dropbox.AuthDriver.Redirect {
    def this(options: RedirectFile) = this()
  }
}
