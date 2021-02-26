package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.samchon.mediatorSystemMod.MediatorSystem
import typingsSlinky.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typingsSlinky.samchon.parallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediatorServerMod {
  
  @JSImport("samchon/templates/parallel/derived/MediatorServer", "MediatorDedicatedWorkerServer")
  @js.native
  class MediatorDedicatedWorkerServer protected () extends MediatorServer {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], port: Double) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.slaveSystemMod.SlaveSystem because Already inherited
  - typingsSlinky.samchon.slaveServerMod.ISlaveServer because var conflicts: _Complete_process, communicator_. Inlined  */ @JSImport("samchon/templates/parallel/derived/MediatorServer", "MediatorServer")
  @js.native
  class MediatorServer protected ()
    extends MediatorSystem
       with IServer {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], port: Double) = this()
    
    /**
      * Factory method creating {@link IServer} object.
      *
      * This method {@link createServerBase createServerBase()} determines which protocol is used in this server,
      * {@link MediatorServer}. Note that, **slave** (this {@link MediatorServer} object) must follow the **master**'s
      *
      *
      * Overrides and return one of them considering the which protocol to follow:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
      */
    /* protected */ def createServerBase(): IServer = js.native
    
    /**
      * @hidden
      */
    var port: js.Any = js.native
    
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorServer", "MediatorSharedWorkerServer")
  @js.native
  class MediatorSharedWorkerServer protected () extends MediatorServer {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], port: Double) = this()
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorServer", "MediatorWebServer")
  @js.native
  class MediatorWebServer protected () extends MediatorServer {
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
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], port: Double) = this()
  }
}
