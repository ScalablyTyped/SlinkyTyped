package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesAuthenticationMiddlewareOptionsMod {
  import typingsSlinky.authmosphere.libSrcTypesLoggerMod.Logger
  import typingsSlinky.express.expressMod.NextFunction
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type onNotAuthenticatedHandler = js.Function4[
    /* request */ Request[ParamsDictionary], 
    /* resonse */ Response, 
    /* next */ NextFunction, 
    /* logger */ Logger, 
    Unit
  ]
}
