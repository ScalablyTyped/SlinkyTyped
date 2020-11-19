package typingsSlinky.samchon

import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/server/SharedWorkerServer", JSImport.Namespace)
@js.native
object sharedWorkerServerMod extends js.Object {
  
  @js.native
  abstract class SharedWorkerServer () extends IServer {
    
    /**
      * @hidden
      */
    var _Handle_connect: js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def addClient(driver: SharedWorkerClientDriver): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def open(): Unit = js.native
  }
}
