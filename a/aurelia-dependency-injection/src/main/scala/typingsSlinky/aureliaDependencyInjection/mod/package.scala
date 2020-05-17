package typingsSlinky.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CtorArgs[TBase] = js.Array[js.Any]
  type CtorImpl[TBase] = js.Any
  type DependencyCtor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = org.scalablytyped.runtime.Instantiable1[/* args */ TArgs, TImpl | TBase]
  type DependencyFunctor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function1[/* args */ TArgs, TImpl | TBase]
  type FuncArgs[TBase] = js.Array[js.Any]
  type FuncReturns[TBase] = js.Any
  type ImplOrAny[TImpl] = TImpl
  type StrategyFunctor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function3[
    /* container */ js.UndefOr[typingsSlinky.aureliaDependencyInjection.mod.Container], 
    /* ctor */ js.UndefOr[
      typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]
    ], 
    /* strategyResolver */ js.UndefOr[js.Any], 
    TImpl
  ]
}
