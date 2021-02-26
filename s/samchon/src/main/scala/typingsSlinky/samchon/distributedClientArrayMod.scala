package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.iserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedClientArrayMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typingsSlinky.ecol.icollectionMod.ICollection because Already inherited
  - typingsSlinky.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typingsSlinky.ecol.mod.DequeCollection because Already inherited
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typingsSlinky.samchon.iexternalclientarrayMod.IExternalClientArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined  */ @JSImport("samchon/templates/distributed/derived/DistributedClientArray", "DistributedClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArray[System /* <: DistributedSystem */] ()
    extends DistributedSystemArray[System]
       with IServer {
    
    /**
      * Factory method creating {@link DistributedSystem} object.
      *
      * The method {@link createExternalClient createExternalClient()} is a factory method creating a child
      * {@link ParallelSystem} object, that is called whenever a parallel client has connected, by
      * {@link addClient addClient()}.
      *
      * Overrides this {@link createExternalClient} method and creates a type of {@link DistributedSystem} object with
      * the *driver* that communicates with the parallel client. After the creation, returns the object. Then whenever
      * a parallel client has connected, matched {@link DistributedSystem} object will be constructed and
      * {@link insert inserted} into this {@link DistributedSystemArray} object.
      *
      * @param driver A communicator with the parallel client.
      * @return A newly created {@link ParallelSystem} object.
      */
    /* protected */ def createExternalClient(driver: IClientDriver): System = js.native
    
    /**
      * Factory method creating {@link IServerBase} object.
      *
      * This method {@link createServerBase createServerBase()} determines which protocol is used in this server,
      * {@link ExternalClientArray}. If the protocol is determined, then {@link ExternalSystem external clients} who
      * may connect to {@link ExternalClientArray this server} must follow the specified protocol.
      *
      * Overrides the {@link createServerBase createServerBase()} method to create and return one of them:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
      *
      * @return A new {@link IServerBase} object.
      */
    /* protected */ def createServerBase(): IServer = js.native
    
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
  }
}
