package typingsSlinky.samchon

import typingsSlinky.samchon.distributedClientArrayMediatorMod.DistributedClientArrayMediator
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/distributed/derived/DistributedServerClientArrayMediator", JSImport.Namespace)
@js.native
object distributedServerClientArrayMediatorMod extends js.Object {
  
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
  - typingsSlinky.samchon.iserverMod.IServer because Already inherited
  - typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typingsSlinky.samchon.iexternalserverclientarrayMod.IExternalServerClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Reserve, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer_, matrix_, size_. Inlined connect */ @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: DistributedSystem */] () extends DistributedClientArrayMediator[System] {
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
    
    /**
      * Factory method creating an {@link IDistributedServer} object.
      *
      * @param xml An {@link XML} object represents child element, so that can identify the type of child to create.
      * @return A newly created {@link IDistributedServer} object.
      */
    /* protected */ def createExternalServer(xml: XML): System = js.native
  }
}
