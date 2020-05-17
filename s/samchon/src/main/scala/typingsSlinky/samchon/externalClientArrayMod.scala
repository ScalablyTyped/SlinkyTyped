package typingsSlinky.samchon

import typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray
import typingsSlinky.samchon.externalSystemMod.ExternalSystem
import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.tstl.dequeMod.Deque
import typingsSlinky.tstl.dequeMod.Deque.Iterator
import typingsSlinky.tstl.dequeMod.Deque.ReverseIterator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/derived/ExternalClientArray", JSImport.Namespace)
@js.native
object externalClientArrayMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: ExternalSystem */] ()
    extends ExternalSystemArray[T]
       with IServer {
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def begin(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, Deque[T], Iterator[T], ReverseIterator[T], T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /**
      * Factory method creating a child {@link ExternalSystem} object.
      *
      * @param driver A communicator with connected client.
      * @return A newly created {@link ExternalSystem} object.
      */
    /* protected */ def createExternalClient(driver: IClientDriver): T = js.native
    /**
      * Factory method creating {@link IServerBase} object.
      *
      * This method {@link createServerBase createServerBase()} determines which templates is used in this server,
      * {@link ExternalClientArray}. If the templates is determined, then {@link ExternalSystem external clients} who
      * may connect to {@link ExternalClientArray this server} must follow the specified templates.
      *
      * Creates and returns one of them:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
      *
      * @return A new {@link IServerBase} object.
      */
    /* protected */ def createServerBase(): IServer = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def end(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, Deque[T], Iterator[T], ReverseIterator[T], T] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[T]): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(): T = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(`val`: T): Unit = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def push_back(`val`: T): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[T] = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[T] = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: Deque[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  
}

