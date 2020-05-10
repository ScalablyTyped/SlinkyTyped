package typingsSlinky.samchon

import typingsSlinky.samchon.clientDriverMod.ClientDriver
import typingsSlinky.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/Server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  @js.native
  abstract class Server () extends IServer {
    /**
      * @hidden
      */
    var _Handle_connect: js.Any = js.native
    /**
      * @hidden
      */
    var net_driver_ : js.Any = js.native
    /**
      * @inheritdoc
      */
    def addClient(driver: ClientDriver): Unit = js.native
  }
  
}

