package typingsSlinky.ecol

import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionEventMod {
  
  @JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
  @js.native
  class CollectionEvent[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends Iterable[T] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    
    val first: IteratorT = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_CollectionEvent: js.Function0[IterableIterator[T]] = js.native
    
    val last: IteratorT = js.native
    
    val `type`: String = js.native
  }
  object CollectionEvent {
    
    type Listener[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] = js.Function1[/* event */ CollectionEvent[T, SourceT, IteratorT, ReverseT], Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.ecol.ecolStrings.insert
      - typingsSlinky.ecol.ecolStrings.erase
      - typingsSlinky.ecol.ecolStrings.refresh
    */
    trait Type extends StObject
    object Type {
      
      @scala.inline
      def erase: typingsSlinky.ecol.ecolStrings.erase = "erase".asInstanceOf[typingsSlinky.ecol.ecolStrings.erase]
      
      @scala.inline
      def insert: typingsSlinky.ecol.ecolStrings.insert = "insert".asInstanceOf[typingsSlinky.ecol.ecolStrings.insert]
      
      @scala.inline
      def refresh: typingsSlinky.ecol.ecolStrings.refresh = "refresh".asInstanceOf[typingsSlinky.ecol.ecolStrings.refresh]
    }
  }
}
