package typingsSlinky.samchon

import typingsSlinky.samchon.parallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/parallel/interfaces/IParallelServer", JSImport.Namespace)
@js.native
object iparallelserverMod extends js.Object {
  
  @js.native
  trait IParallelServer extends ParallelSystem {
    
    /**
      * Connect to slave server.
      */
    def connect(): Unit = js.native
  }
}
