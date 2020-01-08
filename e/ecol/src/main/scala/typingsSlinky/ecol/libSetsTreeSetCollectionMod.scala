package typingsSlinky.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.ecol.ecolBooleans.`true`
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsSlinky.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typingsSlinky.tstl.baseContainerSetContainerMod.SetContainer
import typingsSlinky.tstl.containerTreeSetMod.TreeSet
import typingsSlinky.tstl.containerTreeSetMod.TreeSet.Iterator
import typingsSlinky.tstl.containerTreeSetMod.TreeSet.ReverseIterator
import typingsSlinky.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/TreeSetCollection", JSImport.Namespace)
@js.native
object libSetsTreeSetCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Already inherited
  - typings.ecol.libBasicICollectionMod.ICollection because var conflicts: iterator, iterator_IContainer. Inlined refresh, refresh, refresh */ @js.native
  class TreeSetCollection[T] ()
    extends TreeSet[T]
       with IEventDispatcher[T, TreeSet[T], Iterator[T], ReverseIterator[T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, TreeSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def begin(): typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[T, TreeSet[T], Iterator[T], ReverseIterator[T], T] = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, TreeSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
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
    override def end(): typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[T, TreeSet[T], Iterator[T], ReverseIterator[T], T] = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def push(items: T*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[T] = js.native
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(it: Iterator[T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, TreeSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[T] = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
  @js.native
  object TreeSetCollection extends js.Object {
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
          typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ], 
          typingsSlinky.tstl.tstlMod.base.ReverseIterator[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val Iterator: Instantiable0[
        typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    type Event[T] = CollectionEvent[
        T, 
        TreeSet[T], 
        typingsSlinky.tstl.containerTreeSetMod.TreeSet.Iterator[T], 
        typingsSlinky.tstl.containerTreeSetMod.TreeSet.ReverseIterator[T]
      ]
    type Iterator[Key] = typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.Iterator[Key, `true`, TreeSet[Key]]
    type Listener[T] = typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        TreeSet[T], 
        typingsSlinky.tstl.containerTreeSetMod.TreeSet.Iterator[T], 
        typingsSlinky.tstl.containerTreeSetMod.TreeSet.ReverseIterator[T]
      ]
    type ReverseIterator[Key] = typingsSlinky.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[Key, `true`, TreeSet[Key]]
  }
  
}

