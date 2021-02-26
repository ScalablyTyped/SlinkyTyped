package typingsSlinky.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/IteratorObservable", "IteratorObservable")
  @js.native
  class IteratorObservable[T] () extends StObject
  /* static members */
  object IteratorObservable {
    
    @JSImport("rxjs-compat/observable/IteratorObservable", "IteratorObservable.create")
    @js.native
    def create[T](iterable: js.Iterable[T]): js.Any = js.native
    @JSImport("rxjs-compat/observable/IteratorObservable", "IteratorObservable.create")
    @js.native
    def create[T](
      iterable: js.Iterable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
