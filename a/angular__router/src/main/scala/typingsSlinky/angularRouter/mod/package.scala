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
    * If the handler returns a value, the navigation promise is resolved with this value.
    * If the handler throws an exception, the navigation promise is rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  type LoadChildrenCallback = js.Function0[
    typingsSlinky.angularCore.mod.Type[js.Any] | typingsSlinky.angularCore.mod.NgModuleFactory[js.Any] | typingsSlinky.rxjs.mod.Observable_[typingsSlinky.angularCore.mod.Type[js.Any]] | (js.Promise[
      typingsSlinky.angularCore.mod.NgModuleFactory[js.Any] | typingsSlinky.angularCore.mod.Type[js.Any] | js.Any
    ])
  ]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResolveData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Routes = js.Array[typingsSlinky.angularRouter.mod.Route]
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[typingsSlinky.angularRouter.mod.UrlSegment], 
    /* group */ typingsSlinky.angularRouter.mod.UrlSegmentGroup, 
    /* route */ typingsSlinky.angularRouter.mod.Route, 
    typingsSlinky.angularRouter.mod.UrlMatchResult
  ]
}
