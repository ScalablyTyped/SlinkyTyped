package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/distributed/interfaces/IDistributedServer", JSImport.Namespace)
@js.native
object idistributedserverMod extends js.Object {
  
  @js.native
  trait IDistributedServer extends DistributedSystem {
    
    /**
      * Connect to external server.
      */
    def connect(): Unit = js.native
  }
}
