package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.invokeMod.Invoke
import typingsSlinky.samchon.iparallelserverMod.IParallelServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelMod {
  
  @JSImport("samchon/templates/parallel", "MediatorClient")
  @js.native
  class MediatorClient protected ()
    extends typingsSlinky.samchon.mediatorClientMod.MediatorClient {
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
  
  @JSImport("samchon/templates/parallel", "MediatorDedicatedWorkerServer")
  @js.native
  class MediatorDedicatedWorkerServer protected ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorDedicatedWorkerServer {
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
  
  @JSImport("samchon/templates/parallel", "MediatorServer")
  @js.native
  class MediatorServer protected ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorServer {
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
  
  @JSImport("samchon/templates/parallel", "MediatorSharedWorkerClient")
  @js.native
  class MediatorSharedWorkerClient protected ()
    extends typingsSlinky.samchon.mediatorClientMod.MediatorSharedWorkerClient {
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
  
  @JSImport("samchon/templates/parallel", "MediatorSharedWorkerServer")
  @js.native
  class MediatorSharedWorkerServer protected ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorSharedWorkerServer {
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
  
  @JSImport("samchon/templates/parallel", "MediatorSystem")
  @js.native
  abstract class MediatorSystem protected ()
    extends typingsSlinky.samchon.mediatorSystemMod.MediatorSystem {
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
  
  @JSImport("samchon/templates/parallel", "MediatorWebClient")
  @js.native
  class MediatorWebClient protected ()
    extends typingsSlinky.samchon.mediatorClientMod.MediatorWebClient {
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
  
  @JSImport("samchon/templates/parallel", "MediatorWebServer")
  @js.native
  class MediatorWebServer protected ()
    extends typingsSlinky.samchon.mediatorServerMod.MediatorWebServer {
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
  
  @JSImport("samchon/templates/parallel", "PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  class PRInvokeHistory ()
    extends typingsSlinky.samchon.prinvokehistoryMod.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @JSImport("samchon/templates/parallel", "ParallelClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.parallelClientArrayMod.ParallelClientArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.parallelClientArrayMediatorMod.ParallelClientArrayMediator[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServer")
  @js.native
  abstract class ParallelServer protected ()
    extends typingsSlinky.samchon.parallelServerMod.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  @JSImport("samchon/templates/parallel", "ParallelServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typingsSlinky.samchon.parallelServerArrayMod.ParallelServerArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typingsSlinky.samchon.parallelServerArrayMediatorMod.ParallelServerArrayMediator[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.parallelServerClientArrayMod.ParallelServerClientArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.parallelServerClientArrayMediatorMod.ParallelServerClientArrayMediator[System]
  
  @JSImport("samchon/templates/parallel", "ParallelSystem")
  @js.native
  abstract class ParallelSystem protected ()
    extends typingsSlinky.samchon.parallelSystemMod.ParallelSystem {
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
  
  @JSImport("samchon/templates/parallel", "ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[System]
}
