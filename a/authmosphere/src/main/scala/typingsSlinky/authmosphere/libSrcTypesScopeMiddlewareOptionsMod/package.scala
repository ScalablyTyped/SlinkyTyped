package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesScopeMiddlewareOptionsMod {
  import typingsSlinky.authmosphere.libSrcTypesLoggerMod.Logger
  import typingsSlinky.express.expressMod.NextFunction
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type onAuthorizationFailedHandler = js.Function5[
    /* request */ Request[ParamsDictionary], 
    /* resonse */ Response, 
    /* next */ NextFunction, 
    /* scopes */ js.Array[String], 
    /* logger */ Logger, 
    Unit
  ]
}
