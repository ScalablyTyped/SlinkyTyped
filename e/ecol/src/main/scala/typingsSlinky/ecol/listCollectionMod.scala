package typingsSlinky.ecol

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.ecol.collectionEventMod.CollectionEvent
import typingsSlinky.ecol.collectionEventMod.CollectionEvent.Listener
import typingsSlinky.ecol.collectionEventMod.CollectionEvent.Type
import typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.listIteratorMod.ListIterator
import typingsSlinky.tstl.listMod.List
import typingsSlinky.tstl.listMod.List.Iterator
import typingsSlinky.tstl.listMod.List.ReverseIterator
import typingsSlinky.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/ListCollection", JSImport.Namespace)
@js.native
object listCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.isizeMod.ISize because Already inherited
  - typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsSlinky.tstl.ipushMod.IPush because Already inherited
  - typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
  - typingsSlinky.std.Iterable because Already inherited
  - typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
  - typingsSlinky.tstl.containerContainerMod.Container because Already inherited
  - typingsSlinky.ecol.icollectionMod.ICollection because var conflicts: iterator, iterator_IContainer_. Inlined refresh, refresh, refresh */ @js.native
  class ListCollection[T] ()
    extends List[T]
       with IEventDispatcher[T, List[T], Iterator[T], ReverseIterator[T]] {
    /**
      * @hidden
      */
    var _Notify_erase: js.Any = js.native
    /**
      * @hidden
      */
    var _Notify_insert: js.Any = js.native
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, List[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
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
    override def begin(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, List[T], Iterator[T], ReverseIterator[T], T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, List[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Test whether container is empty.
      */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, List[T], Iterator[T], ReverseIterator[T], T] = js.native
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
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def pop_front(): Unit = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: T*): Double = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def push_back(`val`: T): Unit = js.native
    /**
      * Insert an element at the first.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    override def push_front(`val`: T): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[T] = js.native
    /**
      * @inheritdoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritdoc
      */
    def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * @inheritdoc
      */
    def refresh(it: Iterator[T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, List[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[T] = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: List[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  
  @js.native
  object ListCollection extends js.Object {
    /**
      * Iterator of {@link List}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class Iterator[T] protected ()
      extends ListIterator[
              T, 
              List[T], 
              typingsSlinky.tstl.listMod.List.Iterator[T], 
              typingsSlinky.tstl.listMod.List.ReverseIterator[T], 
              T
            ] {
      var source_ptr_ : js.Any = js.native
      def equals(obj: typingsSlinky.tstl.listMod.List.Iterator[T]): Boolean = js.native
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
    /**
      * Reverse iterator of {@link List}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class ReverseIterator[T] ()
      extends typingsSlinky.tstl.reverseIteratorMod.ReverseIterator[
              T, 
              List[T], 
              typingsSlinky.tstl.listMod.List.Iterator[T], 
              typingsSlinky.tstl.listMod.List.ReverseIterator[T], 
              T
            ]
    
    val Event: Instantiable3[
        /* type */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
        CollectionEvent[
          js.Object, 
          Container[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ], 
          js.Iterator[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any
        ]
      ] = js.native
    type Event[T] = CollectionEvent[
        T, 
        List[T], 
        typingsSlinky.tstl.listMod.List.Iterator[T], 
        typingsSlinky.tstl.listMod.List.ReverseIterator[T]
      ]
    type Listener[T] = typingsSlinky.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        List[T], 
        typingsSlinky.tstl.listMod.List.Iterator[T], 
        typingsSlinky.tstl.listMod.List.ReverseIterator[T]
      ]
  }
  
}

