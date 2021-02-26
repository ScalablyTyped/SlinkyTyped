package typingsSlinky.aureliaDependencyInjection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def all[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("all")(keyValue.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ]]
  
  @scala.inline
  def autoinject[TPotential](): (js.Function1[/* target */ typingsSlinky.aureliaDependencyInjection.mod.Injectable, scala.Unit]) | scala.Unit = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("autoinject")().asInstanceOf[(js.Function1[/* target */ typingsSlinky.aureliaDependencyInjection.mod.Injectable, scala.Unit]) | scala.Unit]
  @scala.inline
  def autoinject[TPotential](potentialTarget: TPotential): (js.Function1[/* target */ typingsSlinky.aureliaDependencyInjection.mod.Injectable, scala.Unit]) | scala.Unit = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("autoinject")(potentialTarget.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* target */ typingsSlinky.aureliaDependencyInjection.mod.Injectable, scala.Unit]) | scala.Unit]
  
  @scala.inline
  def emptyParameters: js.Array[js.Any] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].selectDynamic("_emptyParameters").asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def factory[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("factory")(keyValue.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ]]
  
  @scala.inline
  def getDecoratorDependencies[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](
    target: (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase])
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDecoratorDependencies")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
  ]]
  
  @scala.inline
  def inject[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](
    rest: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ): js.Any = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(rest.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def invokeAsFactory[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](): scala.Unit | (js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ]) = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invokeAsFactory")().asInstanceOf[scala.Unit | (js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ])]
  @scala.inline
  def invokeAsFactory[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](potentialTarget: typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]): scala.Unit | (js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ]) = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invokeAsFactory")(potentialTarget.asInstanceOf[js.Any]).asInstanceOf[scala.Unit | (js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ])]
  
  @scala.inline
  def invoker[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](value: typingsSlinky.aureliaDependencyInjection.mod.Invoker_[TBase, TImpl, TArgs]): js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invoker")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ]]
  
  @scala.inline
  def `lazy`[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(keyValue.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ]]
  
  @scala.inline
  def newInstance[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](
    asKeyOrTarget: js.UndefOr[
      (typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase])
    ],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ): js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ] = (typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(asKeyOrTarget.asInstanceOf[js.Any], dynamicDependencies.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ]]
  
  @scala.inline
  def optional[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](): js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ]]
  @scala.inline
  def optional[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](checkParentOrTarget: scala.Boolean): js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("optional")(checkParentOrTarget.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ scala.Double, 
    scala.Unit
  ]]
  
  @scala.inline
  def parent[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](
    target: (typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) with (typingsSlinky.aureliaDependencyInjection.anon.Inject[TArgs, TBase]),
    _key: js.Any,
    index: scala.Double
  ): scala.Unit = (typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parent")(target.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registration[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](value: typingsSlinky.aureliaDependencyInjection.mod.Registration_[TBase, TImpl, TArgs]): js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registration")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ]]
  
  @scala.inline
  def resolver: typingsSlinky.aureliaDependencyInjection.anon.Decorates with js.Function0[_] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].selectDynamic("resolver").asInstanceOf[typingsSlinky.aureliaDependencyInjection.anon.Decorates with js.Function0[_]]
  
  @scala.inline
  def singleton(): js.Any = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[js.Any]
  @scala.inline
  def singleton(registerInChild: scala.Boolean): js.Any = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(registerInChild.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def singleton[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](
    key: js.UndefOr[
      typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]
    ],
    registerInChild: scala.Boolean
  ): js.Any = (typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(key.asInstanceOf[js.Any], registerInChild.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def singleton[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](key: typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Any = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def singleton_TBaseTImpl_ImplTBaseTArgs_ArgsTBase[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](): js.Any = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[js.Any]
  
  @scala.inline
  def transient[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](): js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transient")().asInstanceOf[js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ]]
  @scala.inline
  def transient[TBase, TImpl /* <: typingsSlinky.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsSlinky.aureliaDependencyInjection.mod.Args[TBase] */](key: typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ] = typingsSlinky.aureliaDependencyInjection.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transient")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs], 
    scala.Unit
  ]]
}
