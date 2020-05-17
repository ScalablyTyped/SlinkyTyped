package typingsSlinky.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.ecol.collectionEventMod.CollectionEvent
import typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher
import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorMod.ArrayIterator
import typingsSlinky.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typingsSlinky.tstl.dequeMod.Deque
import typingsSlinky.tstl.dequeMod.Deque.Iterator
import typingsSlinky.tstl.dequeMod.Deque.ReverseIterator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/DequeCollection", JSImport.Namespace)
@js.native
object dequeCollectionMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.isizeMod.ISize because Already inherited
  - typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsSlinky.tstl.ipushMod.IPush because Already inherited
  - typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
  - typingsSlinky.std.Iterable because Already inherited
  - typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
  - typingsSlinky.tstl.containerContainerMod.Container because Already inherited
  - typingsSlinky.ecol.icollectionMod.ICollection because var conflicts: iterator, iterator_IContainer_. Inlined refresh, refresh, refresh */ @js.native
  class DequeCollection[T] ()
    extends Deque[T]
       with IEventDispatcher[T, Deque[T], Iterator[T], ReverseIterator[T]] {
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
    override def front(): T = js.native
    /**
      * @inheritDoc
      */
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
    override def push_back(`val`: T): Unit = js.native
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
  
  @js.native
  object DequeCollection extends js.Object {
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
    val Iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    type Event[T] = CollectionEvent[
        T, 
        Deque[T], 
        typingsSlinky.tstl.dequeMod.Deque.Iterator[T], 
        typingsSlinky.tstl.dequeMod.Deque.ReverseIterator[T]
      ]
    /**
      * Iterator of {@link Deque}
      */
    type Iterator[T] = ArrayIterator[T, Deque[T]]
    type Listener[T] = typingsSlinky.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        Deque[T], 
        typingsSlinky.tstl.dequeMod.Deque.Iterator[T], 
        typingsSlinky.tstl.dequeMod.Deque.ReverseIterator[T]
      ]
    /**
      * Reverse iterator of {@link Deque}
      */
    type ReverseIterator[T] = ArrayReverseIterator[T, Deque[T]]
  }
  
}

