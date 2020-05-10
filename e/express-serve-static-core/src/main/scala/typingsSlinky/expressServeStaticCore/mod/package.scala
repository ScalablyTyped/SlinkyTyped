package typingsSlinky.expressServeStaticCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApplicationRequestHandler[T] = typingsSlinky.expressServeStaticCore.mod.IRouterHandler[T] with (typingsSlinky.expressServeStaticCore.mod.IRouterMatcher[T, _]) with (js.Function1[
    /* repeated */ typingsSlinky.expressServeStaticCore.mod.RequestHandlerParams[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      _, 
      _, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    T
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Errback = js.Function1[/* err */ js.Error, scala.Unit]
  type ErrorRequestHandler[P /* <: typingsSlinky.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsSlinky.expressServeStaticCore.mod.Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ typingsSlinky.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ typingsSlinky.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type Handler = typingsSlinky.expressServeStaticCore.mod.RequestHandler[
    typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
    js.Any, 
    js.Any, 
    typingsSlinky.expressServeStaticCore.mod.Query
  ]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type Params = typingsSlinky.expressServeStaticCore.mod.ParamsDictionary | typingsSlinky.expressServeStaticCore.mod.ParamsArray
  type ParamsArray = js.Array[java.lang.String]
  type ParamsDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PathParams = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type RequestHandler[P /* <: typingsSlinky.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = js.Function3[
    /* req */ typingsSlinky.expressServeStaticCore.mod.Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ typingsSlinky.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ typingsSlinky.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type RequestHandlerParams[P /* <: typingsSlinky.expressServeStaticCore.mod.Params */, ResBody, ReqBody, ReqQuery] = (typingsSlinky.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (typingsSlinky.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]) | (js.Array[
    (typingsSlinky.expressServeStaticCore.mod.RequestHandler[P, js.Any, js.Any, typingsSlinky.expressServeStaticCore.mod.Query]) | (typingsSlinky.expressServeStaticCore.mod.ErrorRequestHandler[P, js.Any, js.Any, typingsSlinky.expressServeStaticCore.mod.Query])
  ])
  type RequestParamHandler = js.Function5[
    /* req */ typingsSlinky.expressServeStaticCore.mod.Request[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.expressServeStaticCore.mod.Response[js.Any], 
    /* next */ typingsSlinky.expressServeStaticCore.mod.NextFunction, 
    /* value */ js.Any, 
    /* name */ java.lang.String, 
    js.Any
  ]
  type RequestRanges = typingsSlinky.rangeParser.mod.Ranges
  type Router = typingsSlinky.expressServeStaticCore.mod.IRouter
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
}
