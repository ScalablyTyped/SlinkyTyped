package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsExtenders[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: knockout.knockout.Extender<knockout.knockout.Subscribable<any>, T[P]>}
    */ typingsSlinky.knockout.knockoutStrings.AsExtenders with org.scalablytyped.runtime.TopLevel[T]
  type BindingAccessors = org.scalablytyped.runtime.StringDictionary[js.Function]
  type BindingContextExtendCallback[T] = js.Function3[
    /* self */ typingsSlinky.knockout.mod.BindingContext[T], 
    /* parentContext */ typingsSlinky.knockout.mod.BindingContext[T] | scala.Null, 
    /* dataItem */ T, 
    scala.Unit
  ]
  type BindingHandlerAddBinding = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.knockout.mod.Subscribable_[T]
    - typingsSlinky.knockout.mod.Observable_[T]
    - typingsSlinky.knockout.mod.Computed_[T]
    - js.ThisFunction0[/ * this * / TTarget, T]
  */
  type ComputedReadFunction[T, TTarget] = (typingsSlinky.knockout.mod._ComputedReadFunction[T, TTarget]) | typingsSlinky.knockout.mod.Subscribable_[T] | (js.ThisFunction0[/* this */ TTarget, T])
  type ComputedWriteFunction[T, TTarget] = js.ThisFunction1[/* this */ TTarget, /* val */ T, scala.Unit]
  type Extender[T /* <: typingsSlinky.knockout.mod.Subscribable_[_] */, O] = js.Function2[/* target */ T, /* options */ O, T]
  type Flatten[T] = T
  type MaybeComputed[T] = T | typingsSlinky.knockout.mod.Computed_[T]
  type MaybeObservable[T] = T | typingsSlinky.knockout.mod.Observable_[T]
  type MaybeObservableArray[T] = js.Array[T] | typingsSlinky.knockout.mod.ObservableArray_[T]
  type MaybeSubscribable[T] = T | typingsSlinky.knockout.mod.Subscribable_[T]
  type PureComputed_[T] = typingsSlinky.knockout.mod.Computed_[T]
  type RateLimitMethod = js.Function3[
    /* callback */ js.Function0[scala.Unit], 
    /* timeout */ scala.Double, 
    /* options */ js.Any, 
    js.Function0[scala.Unit]
  ]
  type Subscribable_[T] = typingsSlinky.knockout.mod.SubscribableFunctions[T]
  type SubscriptionCallback[T, TTarget] = js.ThisFunction1[/* this */ TTarget, /* val */ T, scala.Unit]
  //#endregion
  //#region subscribables/mappingHelpers.js
  type Unwrapped[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias knockout.knockout.Unwrapped<T[P]> * / object}
    */ typingsSlinky.knockout.knockoutStrings.Unwrapped with org.scalablytyped.runtime.TopLevel[js.Any])
}
