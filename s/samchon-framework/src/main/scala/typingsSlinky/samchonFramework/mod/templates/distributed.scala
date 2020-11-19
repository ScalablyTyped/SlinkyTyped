package typingsSlinky.samchonFramework.mod.templates

import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.idistributedserverMod.IDistributedServer
import typingsSlinky.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon-framework", "templates.distributed")
@js.native
object distributed extends js.Object {
  
  @js.native
  class DSInvokeHistory protected ()
    extends typingsSlinky.samchon.mod.templates.distributed.DSInvokeHistory {
    /**
      * Construct from a DistributedSystem.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      */
    def this(system: typingsSlinky.samchon.distributedSystemMod.DistributedSystem) = this()
    /**
      * Initilizer Constructor.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
      * @param invoke An {@link Invoke} message requesting the *distributed process*.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
      */
    def this(
      system: typingsSlinky.samchon.distributedSystemMod.DistributedSystem,
      process: typingsSlinky.samchon.distributedProcessMod.DistributedProcess,
      invoke: Invoke,
      weight: Double
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArray[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedClientArrayMediator[System]
  
  @js.native
  abstract class DistributedProcess protected ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  abstract class DistributedServer protected ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedServerClientArrayMediator[System]
  
  @js.native
  abstract class DistributedSystem protected ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.distributedSystemMod.DistributedSystem]) = this()
    /**
      * Constrct from parent {@link DistributedSystemArray} and communicator.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.distributedSystemMod.DistributedSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArray[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.mod.templates.distributed.DistributedSystemArrayMediator[System]
}
