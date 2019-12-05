package typingsSlinky.samchon.templatesMod

import typingsSlinky.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typingsSlinky.samchon.protocolInvokeInvokeMod.Invoke
import typingsSlinky.samchon.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "distributed")
@js.native
object distributed extends js.Object {
  @js.native
  class DSInvokeHistory protected ()
    extends typingsSlinky.samchon.templatesDistributedMod.DSInvokeHistory {
    /**
      * Construct from a DistributedSystem.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      */
    def this(system: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem) = this()
    /**
      * Initilizer Constructor.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
      * @param invoke An {@link Invoke} message requesting the *distributed process*.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
      */
    def this(
      system: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem,
      process: typingsSlinky.samchon.templatesDistributedDistributedProcessMod.DistributedProcess,
      invoke: Invoke,
      weight: Double
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArray[System /* <: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedClientArrayMediator[System]
  
  @js.native
  abstract class DistributedProcess protected ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  abstract class DistributedServer protected ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedServerClientArrayMediator[System]
  
  @js.native
  abstract class DistributedSystem protected ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
    /**
      * Constrct from parent {@link DistributedSystemArray} and communicator.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typingsSlinky.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArray[System /* <: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: typingsSlinky.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.templatesDistributedMod.DistributedSystemArrayMediator[System]
  
}

