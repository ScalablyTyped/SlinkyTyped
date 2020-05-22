package typingsSlinky.camljs.anon

import typingsSlinky.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avg extends Aggregation {
  var avg: String
}

object Avg {
  @scala.inline
  def apply(avg: String): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
}

