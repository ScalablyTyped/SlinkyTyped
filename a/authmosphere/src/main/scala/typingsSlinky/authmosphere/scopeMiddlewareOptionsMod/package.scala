package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scopeMiddlewareOptionsMod {
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* resonse */ typingsSlinky.express.mod.Response_, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    /* scopes */ js.Array[java.lang.String], 
    /* logger */ typingsSlinky.authmosphere.loggerMod.Logger, 
    scala.Unit
  ]
}
