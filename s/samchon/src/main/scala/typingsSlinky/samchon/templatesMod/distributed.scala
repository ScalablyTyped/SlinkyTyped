package typingsSlinky.samchon.templatesMod

import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.idistributedserverMod.IDistributedServer
import typingsSlinky.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributed {
  
  @JSImport("samchon/templates", "distributed.DSInvokeHistory")
  @js.native
  class DSInvokeHistory protected ()
    extends typingsSlinky.samchon.distributedMod.DSInvokeHistory {
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
  
  @JSImport("samchon/templates", "distributed.DistributedClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArray[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedClientArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedClientArrayMediator[System]
  
  @JSImport("samchon/templates", "distributed.DistributedProcess")
  @js.native
  abstract class DistributedProcess protected ()
    extends typingsSlinky.samchon.distributedMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @JSImport("samchon/templates", "distributed.DistributedServer")
  @js.native
  abstract class DistributedServer protected ()
    extends typingsSlinky.samchon.distributedMod.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray[typingsSlinky.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @JSImport("samchon/templates", "distributed.DistributedServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedServerArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedServerArrayMediator[System]
  
  @JSImport("samchon/templates", "distributed.DistributedServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedServerClientArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedServerClientArrayMediator[System]
  
  @JSImport("samchon/templates", "distributed.DistributedSystem")
  @js.native
  abstract class DistributedSystem protected ()
    extends typingsSlinky.samchon.distributedMod.DistributedSystem {
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
  
  @JSImport("samchon/templates", "distributed.DistributedSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArray[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedSystemArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: typingsSlinky.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typingsSlinky.samchon.distributedMod.DistributedSystemArrayMediator[System]
}
