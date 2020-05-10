package typingsSlinky.samchon

import typingsSlinky.samchon.distributedSystemArrayMod.DistributedSystemArray
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.iserverconnectorMod.IServerConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/derived/DistributedServer", JSImport.Namespace)
@js.native
object distributedServerMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.isizeMod.ISize because Already inherited
  - typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsSlinky.tstl.ipushMod.IPush because Already inherited
  - typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
  - typingsSlinky.std.Iterable because Already inherited
  - typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
  - typingsSlinky.tstl.ipushbackMod.IPushBack because Already inherited
  - typingsSlinky.tstl.containerContainerMod.Container because Already inherited
  - typingsSlinky.tstl.ifrontMod.IFront because Already inherited
  - typingsSlinky.tstl.arrayContainerMod.ArrayContainer because Already inherited
  - typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typingsSlinky.tstl.dequeMod.Deque because Already inherited
  - typingsSlinky.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typingsSlinky.samchon.externalSystemMod.ExternalSystem because Already inherited
  - typingsSlinky.samchon.iexternalserverMod.IExternalServer because var conflicts: _Compute_col_size, _Fetch_index, _Handle_close, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Reserve, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, communicator, communicator_, dispatcher_, iterator, iterator_IContainer_, matrix_, name, size_, system_array_. Inlined connect */ @js.native
  abstract class DistributedServer protected () extends DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: DistributedSystemArray[DistributedSystem]) = this()
    /**
      * IP address of target external system to connect.
      */
    var ip: String = js.native
    /**
      * Port number of target external system to connect.
      */
    var port: Double = js.native
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
  }
  
}

