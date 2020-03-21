package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  // the term with which to search.
  var limit: Double
  var term: String
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double, term: String): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLimit]
  }
}

