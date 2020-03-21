package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queuesMod {
  type JobCallback = js.Function3[
    /* result */ js.Any, 
    /* jobData */ js.Any, 
    /* job */ typingsSlinky.arangodb.DocumentJob, 
    scala.Unit
  ]
}
