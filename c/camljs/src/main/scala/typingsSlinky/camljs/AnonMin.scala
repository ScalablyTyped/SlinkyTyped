package typingsSlinky.camljs

import typingsSlinky.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMin extends Aggregation {
  var min: String
}

object AnonMin {
  @scala.inline
  def apply(min: String): AnonMin = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMin]
  }
}

