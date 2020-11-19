package typingsSlinky.samchon

import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.samchon.webServerMod.WebServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/server/base/WebServerBase", JSImport.Namespace)
@js.native
object webServerBaseMod extends js.Object {
  
  @js.native
  class WebServerBase protected () extends WebServer {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    
    /**
      * @hidden
      */
    var hooker_ : js.Any = js.native
  }
}
