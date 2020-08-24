package typingsSlinky.angularRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
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
}
