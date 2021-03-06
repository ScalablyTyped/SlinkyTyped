package typingsSlinky.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/DeferObservable", "DeferObservable")
  @js.native
  class DeferObservable[T] ()
    extends typingsSlinky.rxjsCompat.deferObservableMod.DeferObservable[T]
  /* static members */
  object DeferObservable {
    
    @JSImport("rxjs/observable/DeferObservable", "DeferObservable.create")
    @js.native
    def create[T](
      observableFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _) | Unit
        ]
    ): js.Any = js.native
  }
}
