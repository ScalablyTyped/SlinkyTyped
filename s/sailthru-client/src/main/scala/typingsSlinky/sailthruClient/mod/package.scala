package typingsSlinky.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SailthruCallback = js.Function2[
    /* err */ typingsSlinky.sailthruClient.mod.SailthruError, 
    /* response */ typingsSlinky.sailthruClient.mod.SailthruResponse, 
    scala.Unit
  ]
  type SailthruError = typingsSlinky.sailthruClient.AnonError | scala.Null
  type SailthruResponse = js.Object | java.lang.String
}
