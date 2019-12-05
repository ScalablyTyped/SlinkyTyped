package typingsSlinky.samchon

import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsSlinky.samchon.protocolServerIServerMod.IServer
import typingsSlinky.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typingsSlinky.tstl.containerDequeMod.Deque
import typingsSlinky.tstl.containerDequeMod.Deque.Iterator
import typingsSlinky.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/interfaces/IExternalClientArray", JSImport.Namespace)
@js.native
object templatesExternalInterfacesIExternalClientArrayMod extends js.Object {
  @js.native
  trait IExternalClientArray[System /* <: ExternalSystem */]
    extends ExternalSystemArray[System]
       with IServer {
    /* CompleteClass */
    /* InferMemberOverrides */
    override def addEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def begin(): typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Test whether container is empty.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def end(): typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: System*): Double = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    override def push_back(`val`: System): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[System] = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[System] = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
}

