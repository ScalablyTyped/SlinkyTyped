package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iserverconnectorMod.IServerConnector
import typingsSlinky.samchon.mediatorSystemMod.MediatorSystem
import typingsSlinky.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typingsSlinky.samchon.parallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediatorClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.slaveSystemMod.SlaveSystem because Already inherited
  - typingsSlinky.samchon.slaveClientMod.ISlaveClient because var conflicts: _Complete_process, communicator_. Inlined connect */ @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorClient")
  @js.native
  class MediatorClient protected () extends MediatorSystem {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], ip: String, port: Double) = this()
    
    /**
      * @inheritdoc
      */
    def connect(): Unit = js.native
    def connect(ip: String, port: Double): Unit = js.native
    
    /**
      * Factory method creating {@link IServerConnector} object.
      *
      * The {@link createServerConnector createServerConnector()} is an abstract method creating
      * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the **master**
      * server follows:
      *
      * - {@link ServerConnector}
      * - {@link WebServerConnector}
      * - {@link SharedWorkerServerConnector}
      *
      * @return A newly created {@link IServerConnector} object.
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
    
    /**
      * @hidden
      */
    var ip: js.Any = js.native
    
    /**
      * @hidden
      */
    var port: js.Any = js.native
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorSharedWorkerClient")
  @js.native
  class MediatorSharedWorkerClient protected () extends MediatorClient {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], ip: String, port: Double) = this()
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorWebClient")
  @js.native
  class MediatorWebClient protected () extends MediatorClient {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], ip: String, port: Double) = this()
  }
}
