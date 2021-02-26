package typingsSlinky.samchonFramework.mod.templates

import typingsSlinky.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.invokeMod.Invoke
import typingsSlinky.samchon.iparallelserverMod.IParallelServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallel {
  
  @JSImport("samchon-framework", "templates.parallel.MediatorClient")
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorDedicatedWorkerServer")
  @js.native
  class MediatorDedicatedWorkerServer protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorDedicatedWorkerServer {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorServer")
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorSharedWorkerClient")
  @js.native
  class MediatorSharedWorkerClient protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorSharedWorkerClient {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorSharedWorkerServer")
  @js.native
  class MediatorSharedWorkerServer protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorSharedWorkerServer {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorSystem")
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorWebClient")
  @js.native
  class MediatorWebClient protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorWebClient {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorWebServer")
  @js.native
  class MediatorWebServer protected ()
    extends typingsSlinky.samchon.mod.templates.parallel.MediatorWebServer {
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
  
  @JSImport("samchon-framework", "templates.parallel.PRInvokeHistory")
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
  
  @JSImport("samchon-framework", "templates.parallel.ParallelClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelClientArray[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelClientArrayMediator[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelServer")
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
  
  @JSImport("samchon-framework", "templates.parallel.ParallelServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerArray[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerArrayMediator[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerClientArray[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelServerClientArrayMediator[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelSystem")
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
  
  @JSImport("samchon-framework", "templates.parallel.ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelSystemArray[System]
  
  @JSImport("samchon-framework", "templates.parallel.ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: typingsSlinky.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typingsSlinky.samchon.mod.templates.parallel.ParallelSystemArrayMediator[System]
}
