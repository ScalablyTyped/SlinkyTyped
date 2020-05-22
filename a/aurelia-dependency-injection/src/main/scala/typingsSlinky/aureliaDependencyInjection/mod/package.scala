package typingsSlinky.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Args[TBase] = typingsSlinky.aureliaDependencyInjection.mod.CtorArgs[TBase] | typingsSlinky.aureliaDependencyInjection.mod.FuncArgs[TBase]
  type CtorArgs[TBase] = js.Array[js.Any]
  type CtorImpl[TBase] = js.Any
  type DependencyCtor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = org.scalablytyped.runtime.Instantiable1[/* args */ TArgs, TImpl | TBase]
  type DependencyCtorOrFunctor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | (typingsSlinky.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs])
  type DependencyFunctor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function1[/* args */ TArgs, TImpl | TBase]
  type FuncArgs[TBase] = js.Array[js.Any]
  type FuncReturns[TBase] = js.Any
  type Impl[TBase] = typingsSlinky.aureliaDependencyInjection.mod.CtorImpl[TBase] | typingsSlinky.aureliaDependencyInjection.mod.FuncReturns[TBase]
  type ImplOrAny[TImpl] = TImpl
  type Primitive = scala.Boolean | java.lang.String | scala.Double | js.Symbol | js.Object | (js.Function1[/* repeated */ js.Any, js.Any]) | js.Array[js.Any]
  type PrimitiveOrDependencyCtor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | typingsSlinky.aureliaDependencyInjection.mod.Primitive
  type PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | (typingsSlinky.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs]) | typingsSlinky.aureliaDependencyInjection.mod.Primitive
  type StrategyFunctor[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function3[
    /* container */ js.UndefOr[typingsSlinky.aureliaDependencyInjection.mod.Container], 
    /* ctor */ js.UndefOr[
      typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]
    ], 
    /* strategyResolver */ js.UndefOr[js.Any], 
    TImpl
  ]
}
