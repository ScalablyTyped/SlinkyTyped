package typingsSlinky.ecol

import typingsSlinky.ecol.collectionEventMod.CollectionEvent
import typingsSlinky.ecol.icollectionMod.ICollection
import typingsSlinky.ecol.vectorCollectionMod.ArrayCollection.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector<T> * / any */ @JSImport("ecol/lib/linear/VectorCollection", "ArrayCollection")
  @js.native
  class ArrayCollection[T] ()
    extends ICollection[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ js.Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ js.Any
    ): js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardIterator<U, InputIterator> */ js.Any */](
      pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ js.Any,
      first: InputIterator,
      last: InputIterator
    ): js.Any = js.native
    
    /**
      * @hidden
      */
    var _Notify_erase: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Notify_insert: js.Any = js.native
    
    def clear(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def dispatchEvent(
      event: Event[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ _
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def pop_back(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def push(items: T*): Double = js.native
    
    /**
      * @inheritdoc
      */
    def push_back(`val`: T): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def set(index: Double, `val`: T): Unit = js.native
  }
  object ArrayCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/linear/VectorCollection", "ArrayCollection.Event")
    @js.native
    class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    /* was `typeof CollectionEvent` */
    object Event
    
    type Listener[T] = typingsSlinky.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.ReverseIterator<T> */ js.Any
      ]
  }
}
