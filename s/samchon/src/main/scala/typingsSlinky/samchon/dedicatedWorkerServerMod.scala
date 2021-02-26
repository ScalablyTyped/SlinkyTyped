package typingsSlinky.samchon

import typingsSlinky.samchon.dedicatedWorkerClientDriverMod.DedicatedWorkerClientDriver
import typingsSlinky.samchon.iserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dedicatedWorkerServerMod {
  
  @JSImport("samchon/protocol/server/DedicatedWorkerServer", "DedicatedWorkerServer")
  @js.native
  abstract class DedicatedWorkerServer () extends IServer {
    
    /**
      * @inheritdoc
      */
    def addClient(driver: DedicatedWorkerClientDriver): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def open(): Unit = js.native
  }
}
