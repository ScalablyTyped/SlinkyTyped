package typingsSlinky.samchon

import typingsSlinky.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsSlinky.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typingsSlinky.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typingsSlinky.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray
import typingsSlinky.samchon.templatesParallelParallelSystemMod.ParallelSystem
import typingsSlinky.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/MediatorSystem", JSImport.Namespace)
@js.native
object templatesParallelMediatorSystemMod extends js.Object {
  @js.native
  abstract class MediatorSystem protected () extends SlaveSystem {
    /**
      * Construct from parent {@link DistributedSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      */
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem]) = this()
    /**
      * @hidden
      */
    var _Complete_history: js.Any = js.native
    /**
      * @hidden
      */
    var progress_list_ : js.Any = js.native
    /**
      * @hidden
      */
    var system_array_ : js.Any = js.native
    /**
      * Get parent {@link ParallelSystemArrayMediator} or {@link DistributedSystemArrayMediator} object.
      */
    def getSystemArray(): ParallelSystemArrayMediator[ParallelSystem] | DistributedSystemArrayMediator[DistributedSystem] = js.native
    /**
      * Get parent {@link DistributedSystemArrayMediator} object.
      */
    @JSName("getSystemArray")
    def getSystemArray_SystemArray_DistributedSystemArrayDistributedSystem_SystemArray[SystemArray /* <: DistributedSystemArray[DistributedSystem] */](): SystemArray = js.native
    /**
      * Get parent {@link ParallelSystemArrayMediator} object.
      */
    @JSName("getSystemArray")
    def getSystemArray_SystemArray_ParallelSystemArrayParallelSystem_SystemArray[SystemArray /* <: ParallelSystemArray[ParallelSystem] */](): SystemArray = js.native
    /**
      * Start interaction.
      *
      * The {@link start start()} is an abstract method starting interaction with the **master** system. If the
      * **master** is a server, then connects to the **master**. Otherwise, the **master** is client, then this
      * {@link MediatorSystem} object wil open a server accepting the **master**.
      */
    def start(): Unit = js.native
  }
  
}

