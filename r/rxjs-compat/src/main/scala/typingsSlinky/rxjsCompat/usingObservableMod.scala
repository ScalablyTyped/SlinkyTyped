package typingsSlinky.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usingObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/UsingObservable", "UsingObservable")
  @js.native
  class UsingObservable[T] () extends StObject
  /* static members */
  object UsingObservable {
    
    @JSImport("rxjs-compat/observable/UsingObservable", "UsingObservable.create")
    @js.native
    def create[T](
      resourceFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Unsubscribable */ _) | Unit
        ],
      observableFactory: js.Function1[
          /* resource */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Unsubscribable */ js.Any) | Unit, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _) | Unit
        ]
    ): js.Any = js.native
  }
}
