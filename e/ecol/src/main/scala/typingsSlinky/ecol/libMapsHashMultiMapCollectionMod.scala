package typingsSlinky.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.ecol.ecolBooleans.`false`
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsSlinky.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typingsSlinky.tstl.baseContainerMapContainerMod.MapContainer
import typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap
import typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap.Iterator
import typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator
import typingsSlinky.tstl.tstlMod.base.Container
import typingsSlinky.tstl.utilityEntryMod.Entry
import typingsSlinky.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/HashMultiMapCollection", JSImport.Namespace)
@js.native
object libMapsHashMultiMapCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined begin, empty, end, push, rbegin, rend, size
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class HashMultiMapCollection[Key, T] ()
    extends HashMultiMap[Key, T]
       with IEventDispatcher[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[
        Entry[Key, T], 
        HashMultiMap[Key, T], 
        Iterator[Key, T], 
        ReverseIterator[Key, T], 
        IPair[Key, T]
      ] = js.native
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
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
    override def end(): typingsSlinky.tstl.baseIteratorIteratorMod.Iterator[
        Entry[Key, T], 
        HashMultiMap[Key, T], 
        Iterator[Key, T], 
        ReverseIterator[Key, T], 
        IPair[Key, T]
      ] = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: (IPair[Key, T])*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(it: Iterator[Key, T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[Key, T] = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
  @js.native
  object HashMultiMapCollection extends js.Object {
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
        typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    type Event[Key, T] = CollectionEvent[
        Entry[Key, T], 
        HashMultiMap[Key, T], 
        typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap.Iterator[Key, T], 
        typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
      ]
    type Iterator[Key, T] = typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.Iterator[Key, T, `false`, HashMultiMap[Key, T]]
    type Listener[Key, T] = typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        Entry[Key, T], 
        HashMultiMap[Key, T], 
        typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap.Iterator[Key, T], 
        typingsSlinky.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
      ]
    type ReverseIterator[Key, T] = typingsSlinky.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[Key, T, `false`, HashMultiMap[Key, T]]
  }
  
}

