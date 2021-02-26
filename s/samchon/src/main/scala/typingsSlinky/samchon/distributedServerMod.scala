package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iserverconnectorMod.IServerConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedServerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typingsSlinky.ecol.icollectionMod.ICollection because Already inherited
  - typingsSlinky.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typingsSlinky.ecol.mod.DequeCollection because Already inherited
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typingsSlinky.samchon.externalSystemMod.ExternalSystem because Already inherited
  - typingsSlinky.samchon.iexternalserverMod.IExternalServer because var conflicts: _Handle_close, _Notify_erase, _Notify_insert, communicator, communicator_, dispatcher_, name, system_array_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServer", "DistributedServer")
  @js.native
  abstract class DistributedServer protected () extends DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: DistributedSystemArray[DistributedSystem]) = this()
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to the external server.
      */
    def connect(): Unit = js.native
    
    /**
      * Factory method creating {@link IServerConnector} object.
      *
      * The {@link createServerConnector createServerConnector()} is an abstract method creating
      * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the slave server
      * follows:
      *
      * - {@link ServerConnector}
      * - {@link WebServerConnector}
      * - {@link DedicatedWorkerServerConnector}
      * - {@link SharedWorkerServerConnector}
      *
      * @return A newly created {@link IServerConnector} object.
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
    
    /**
      * IP address of target external system to connect.
      */
    var ip: String = js.native
    
    /**
      * Port number of target external system to connect.
      */
    var port: Double = js.native
  }
}
