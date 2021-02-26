package typingsSlinky.samchon

import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.samchon.webServerMod.WebServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/WebServerBase", "WebServerBase")
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
