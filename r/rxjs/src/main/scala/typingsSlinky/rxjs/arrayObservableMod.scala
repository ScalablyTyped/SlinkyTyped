package typingsSlinky.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/ArrayObservable", "ArrayObservable")
  @js.native
  class ArrayObservable[T] ()
    extends typingsSlinky.rxjsCompat.arrayObservableMod.ArrayObservable[T]
  /* static members */
  object ArrayObservable {
    
    @JSImport("rxjs/observable/ArrayObservable", "ArrayObservable.create")
    @js.native
    def create[T](array: js.Array[T]): js.Any = js.native
    @JSImport("rxjs/observable/ArrayObservable", "ArrayObservable.create")
    @js.native
    def create[T](
      array: js.Array[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
