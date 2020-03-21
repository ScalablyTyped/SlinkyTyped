package typingsSlinky.errorhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ java.lang.String, 
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    scala.Unit
  ]
}
