package typingsSlinky.samchon

import typingsSlinky.samchon.clientDriverMod.ClientDriver
import typingsSlinky.samchon.iserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("samchon/protocol/server/Server", "Server")
  @js.native
  abstract class Server () extends IServer {
    
    /**
      * @hidden
      */
    var _Handle_connect: js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def addClient(driver: ClientDriver): Unit = js.native
    
    /**
      * @hidden
      */
    var net_driver_ : js.Any = js.native
  }
}
