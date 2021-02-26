package typingsSlinky.angularRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type DeprecatedLoadChildren = java.lang.String
  
  type DetachedRouteHandle = js.Object
  
  /**
    * Error handler that is invoked when a navigation error occurs.
    *
    * If the handler returns a value, the navigation Promise is resolved with this value.
    * If the handler throws an exception, the navigation Promise is rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  
  type LoadChildren = typingsSlinky.angularRouter.mod.LoadChildrenCallback | typingsSlinky.angularRouter.mod.DeprecatedLoadChildren
  
  type LoadChildrenCallback = js.Function0[
    typingsSlinky.angularCore.mod.Type[js.Any] | typingsSlinky.angularCore.mod.NgModuleFactory[js.Any] | typingsSlinky.rxjs.mod.Observable_[typingsSlinky.angularCore.mod.Type[js.Any]] | (js.Promise[
      typingsSlinky.angularCore.mod.NgModuleFactory[js.Any] | typingsSlinky.angularCore.mod.Type[js.Any] | js.Any
    ])
  ]
  
  @scala.inline
  def PRIMARY_OUTLET: /* "primary" */ java.lang.String = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PRIMARY_OUTLET").asInstanceOf[/* "primary" */ java.lang.String]
  
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def ROUTER_CONFIGURATION: typingsSlinky.angularCore.mod.InjectionToken[typingsSlinky.angularRouter.mod.ExtraOptions] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROUTER_CONFIGURATION").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[typingsSlinky.angularRouter.mod.ExtraOptions]]
  
  @scala.inline
  def ROUTER_INITIALIZER: typingsSlinky.angularCore.mod.InjectionToken[
    js.Function1[/* compRef */ typingsSlinky.angularCore.mod.ComponentRef[js.Any], scala.Unit]
  ] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROUTER_INITIALIZER").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[
    js.Function1[/* compRef */ typingsSlinky.angularCore.mod.ComponentRef[js.Any], scala.Unit]
  ]]
  
  @scala.inline
  def ROUTES_ : typingsSlinky.angularCore.mod.InjectionToken[js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]]] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROUTES").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]]]]
  
  type ResolveData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Routes = js.Array[typingsSlinky.angularRouter.mod.Route]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.angularRouter.angularRouterStrings.pathParamsChange
    - typingsSlinky.angularRouter.angularRouterStrings.pathParamsOrQueryParamsChange
    - typingsSlinky.angularRouter.angularRouterStrings.paramsChange
    - typingsSlinky.angularRouter.angularRouterStrings.paramsOrQueryParamsChange
    - typingsSlinky.angularRouter.angularRouterStrings.always
    - js.Function2[
  / * from * / typingsSlinky.angularRouter.mod.ActivatedRouteSnapshot, 
  / * to * / typingsSlinky.angularRouter.mod.ActivatedRouteSnapshot, 
  scala.Boolean]
  */
  type RunGuardsAndResolvers = typingsSlinky.angularRouter.mod._RunGuardsAndResolvers | (js.Function2[
    /* from */ typingsSlinky.angularRouter.mod.ActivatedRouteSnapshot, 
    /* to */ typingsSlinky.angularRouter.mod.ActivatedRouteSnapshot, 
    scala.Boolean
  ])
  
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[typingsSlinky.angularRouter.mod.UrlSegment], 
    /* group */ typingsSlinky.angularRouter.mod.UrlSegmentGroup, 
    /* route */ typingsSlinky.angularRouter.mod.Route, 
    typingsSlinky.angularRouter.mod.UrlMatchResult | scala.Null
  ]
  
  @scala.inline
  def VERSION: typingsSlinky.angularCore.mod.Version = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typingsSlinky.angularCore.mod.Version]
  
  @scala.inline
  def convertToParamMap(params: typingsSlinky.angularRouter.mod.Params): typingsSlinky.angularRouter.mod.ParamMap = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertToParamMap")(params.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularRouter.mod.ParamMap]
  
  @scala.inline
  def provideRoutes(routes: typingsSlinky.angularRouter.mod.Routes): js.Any = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵROUTERPROVIDERS: js.Array[typingsSlinky.angularCore.mod.Provider] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ROUTER_PROVIDERS").asInstanceOf[js.Array[typingsSlinky.angularCore.mod.Provider]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterA: typingsSlinky.angularCore.mod.InjectionToken[scala.Unit] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_router_router_a").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterB(): typingsSlinky.angularCore.mod.NgProbeToken = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_b")().asInstanceOf[typingsSlinky.angularCore.mod.NgProbeToken]
  
  @scala.inline
  def ɵangularPackagesRouterRouterC(
    router: typingsSlinky.angularRouter.mod.Router,
    viewportScroller: typingsSlinky.angularCommon.mod.ViewportScroller,
    config: typingsSlinky.angularRouter.mod.ExtraOptions
  ): typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterO = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_c")(router.asInstanceOf[js.Any], viewportScroller.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterO]
  
  @scala.inline
  def ɵangularPackagesRouterRouterD(
    platformLocationStrategy: typingsSlinky.angularCommon.mod.PlatformLocation,
    baseHref: java.lang.String
  ): typingsSlinky.angularCommon.mod.HashLocationStrategy | typingsSlinky.angularCommon.mod.PathLocationStrategy = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_d")(platformLocationStrategy.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCommon.mod.HashLocationStrategy | typingsSlinky.angularCommon.mod.PathLocationStrategy]
  @scala.inline
  def ɵangularPackagesRouterRouterD(
    platformLocationStrategy: typingsSlinky.angularCommon.mod.PlatformLocation,
    baseHref: java.lang.String,
    options: typingsSlinky.angularRouter.mod.ExtraOptions
  ): typingsSlinky.angularCommon.mod.HashLocationStrategy | typingsSlinky.angularCommon.mod.PathLocationStrategy = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_d")(platformLocationStrategy.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCommon.mod.HashLocationStrategy | typingsSlinky.angularCommon.mod.PathLocationStrategy]
  
  @scala.inline
  def ɵangularPackagesRouterRouterE(router: typingsSlinky.angularRouter.mod.Router): js.Any = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_e")(router.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]]
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: js.UndefOr[scala.Nothing],
    routeReuseStrategy: typingsSlinky.angularRouter.mod.RouteReuseStrategy
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: typingsSlinky.angularRouter.mod.UrlHandlingStrategy
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: typingsSlinky.angularRouter.mod.UrlHandlingStrategy,
    routeReuseStrategy: typingsSlinky.angularRouter.mod.RouteReuseStrategy
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: typingsSlinky.angularRouter.mod.ExtraOptions
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: typingsSlinky.angularRouter.mod.ExtraOptions,
    urlHandlingStrategy: js.UndefOr[scala.Nothing],
    routeReuseStrategy: typingsSlinky.angularRouter.mod.RouteReuseStrategy
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: typingsSlinky.angularRouter.mod.ExtraOptions,
    urlHandlingStrategy: typingsSlinky.angularRouter.mod.UrlHandlingStrategy
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typingsSlinky.angularRouter.mod.UrlSerializer,
    contexts: typingsSlinky.angularRouter.mod.ChildrenOutletContexts,
    location: typingsSlinky.angularCommon.mod.Location,
    injector: typingsSlinky.angularCore.mod.Injector,
    loader: typingsSlinky.angularCore.mod.NgModuleFactoryLoader,
    compiler: typingsSlinky.angularCore.mod.Compiler,
    config: js.Array[js.Array[typingsSlinky.angularRouter.mod.Route]],
    opts: typingsSlinky.angularRouter.mod.ExtraOptions,
    urlHandlingStrategy: typingsSlinky.angularRouter.mod.UrlHandlingStrategy,
    routeReuseStrategy: typingsSlinky.angularRouter.mod.RouteReuseStrategy
  ): typingsSlinky.angularRouter.mod.Router = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularRouter.mod.Router]
  
  @scala.inline
  def ɵangularPackagesRouterRouterG(router: typingsSlinky.angularRouter.mod.Router): typingsSlinky.angularRouter.mod.ActivatedRoute = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_g")(router.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularRouter.mod.ActivatedRoute]
  
  @scala.inline
  def ɵangularPackagesRouterRouterI(r: typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterH): js.Function0[js.Promise[_]] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_i")(r.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[_]]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterJ(r: typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterH): js.Function1[
    /* bootstrappedComponentRef */ typingsSlinky.angularCore.mod.ComponentRef[_], 
    scala.Unit
  ] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_j")(r.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* bootstrappedComponentRef */ typingsSlinky.angularCore.mod.ComponentRef[_], 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterK(): js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      /* injector */ typingsSlinky.angularCore.mod.Injector, 
      typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterH
    ]) | typingsSlinky.angularRouter.anon.Deps | typingsSlinky.angularRouter.anon.Multi | typingsSlinky.angularRouter.anon.Provide
  ] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_k")().asInstanceOf[js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      /* injector */ typingsSlinky.angularCore.mod.Injector, 
      typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterH
    ]) | typingsSlinky.angularRouter.anon.Deps | typingsSlinky.angularRouter.anon.Multi | typingsSlinky.angularRouter.anon.Provide
  ]]
  
  @scala.inline
  def ɵassignExtraOptionsToRouter(opts: typingsSlinky.angularRouter.mod.ExtraOptions, router: typingsSlinky.angularRouter.mod.Router): scala.Unit = (typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275assignExtraOptionsToRouter")(opts.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = typingsSlinky.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
