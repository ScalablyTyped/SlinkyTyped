package typingsSlinky.samchon

import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.samchon.webClientDriverMod.WebClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webServerMod {
  
  @JSImport("samchon/protocol/server/WebServer", "WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebServer () extends IServer {
    
    /**
      * @hidden
      */
    var _Fetch_session_id: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Handle_request: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Issue_session_id: js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def addClient(driver: WebClientDriver): Unit = js.native
    
    /**
      * @hidden
      */
    var http_server_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var my_port_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var sequence_ : js.Any = js.native
  }
}
