package typingsSlinky.samchon

import typingsSlinky.samchon.entityCollectionMod.EntityDequeCollection
import typingsSlinky.samchon.externalSystemMod.ExternalSystem
import typingsSlinky.samchon.externalSystemRoleMod.ExternalSystemRole
import typingsSlinky.samchon.iprotocolMod.IProtocol
import typingsSlinky.tstl.dequeMod.Deque
import typingsSlinky.tstl.dequeMod.Deque.Iterator
import typingsSlinky.tstl.dequeMod.Deque.ReverseIterator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystemArray", JSImport.Namespace)
@js.native
object externalSystemArrayMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: ExternalSystem */] ()
    extends EntityDequeCollection[System]
       with IProtocol {
    /**
      * @hidden
      */
    var _Handle_system_erase: js.Any = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[System, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[System], last: Iterator[System]): Iterator[System] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[System]): Iterator[System] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(): System = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(`val`: System): Unit = js.native
    /**
      * Get a role.
      *
      * @param name Name, identifier of target {@link ExternalSystemRole role}.
      *
      * @return The specified role.
      */
    def getRole(name: String): ExternalSystemRole = js.native
    /**
      * Test whether the role exists.
      *
      * @param name Name, identifier of target {@link ExternalSystemRole role}.
      *
      * @return Whether the role has or not.
      */
    def hasRole(name: String): Boolean = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def push_back(`val`: System): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[System] = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[System] = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: Deque[System]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[System] = js.native
  }
  
}

