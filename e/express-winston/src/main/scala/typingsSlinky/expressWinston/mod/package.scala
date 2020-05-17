package typingsSlinky.expressWinston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DynamicLevelFunction = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    /* err */ js.Error, 
    java.lang.String
  ]
  type DynamicMetaFunction = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    /* err */ js.Error, 
    js.Object
  ]
  type ErrorRouteFilter = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    /* err */ js.Error, 
    scala.Boolean
  ]
  type ExceptionToMetaFunction = js.Function1[/* err */ js.Error, js.Object]
  type RequestFilter = js.Function2[
    /* req */ typingsSlinky.expressWinston.mod.FilterRequest, 
    /* propName */ java.lang.String, 
    js.Any
  ]
  type ResponseFilter = js.Function2[
    /* res */ typingsSlinky.expressWinston.mod.FilterResponse, 
    /* propName */ java.lang.String, 
    js.Any
  ]
  type RouteFilter = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
