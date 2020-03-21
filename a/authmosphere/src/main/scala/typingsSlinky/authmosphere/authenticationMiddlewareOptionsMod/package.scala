package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authenticationMiddlewareOptionsMod {
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* resonse */ typingsSlinky.express.mod.Response_, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    /* logger */ typingsSlinky.authmosphere.loggerMod.Logger, 
    scala.Unit
  ]
}
