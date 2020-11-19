package typingsSlinky.samchonFramework.mod.templates

import typingsSlinky.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.invokeMod.Invoke
import typingsSlinky.samchon.iparallelserverMod.IParallelServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon-framework", "templates.parallel")
@js.native
object parallel extends js.Object {
  
  @js.native
  class MediatorClient protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorClient {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(
      systemArray: typingsSlinky.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsSlinky.samchon.parallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @js.native
  class MediatorDedicatedWorkerServer ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorDedicatedWorkerServer
  
  @js.native
  class MediatorServer protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(
      systemArray: typingsSlinky.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsSlinky.samchon.parallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @js.native
  class MediatorSharedWorkerClient ()
    extends typingsSlinky.samchon.mediatorClientMod.MediatorSharedWorkerClient
  
  @js.native
  class MediatorSharedWorkerServer ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorSharedWorkerServer
  
  @js.native
  abstract class MediatorSystem protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorSystem {
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
    def this(systemArray: typingsSlinky.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typingsSlinky.samchon.parallelSystemMod.ParallelSystem]) = this()
  }
  
  @js.native
  class MediatorWebClient ()
    extends typingsSlinky.samchon.mediatorClientMod.MediatorWebClient
  
  @js.native
  class MediatorWebServer ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorWebServer
  
  @js.native
  /**
    * Default Constructor.
    */
  class PRInvokeHistory ()
    extends typingsSlinky.samchon.mod.templates.parallel.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelClientArrayMediator[System]
  
  @js.native
  abstract class ParallelServer protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerClientArrayMediator[System]
  
  @js.native
  abstract class ParallelSystem protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray[typingsSlinky.samchon.parallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray[typingsSlinky.samchon.parallelSystemMod.ParallelSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelSystemArrayMediator[System]
}
