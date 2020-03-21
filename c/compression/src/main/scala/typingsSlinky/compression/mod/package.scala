package typingsSlinky.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A function to decide if the response should be considered for compression.
    */
  type CompressionFilter = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    scala.Boolean
  ]
}
