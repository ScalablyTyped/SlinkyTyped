package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type ExpressHandler = js.Function2[
    /* request */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsSlinky.express.mod.Response_, 
    scala.Unit
  ]
}
