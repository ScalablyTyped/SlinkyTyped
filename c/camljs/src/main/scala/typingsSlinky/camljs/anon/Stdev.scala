package typingsSlinky.camljs.anon

import typingsSlinky.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stdev extends Aggregation {
  var stdev: String
}

object Stdev {
  @scala.inline
  def apply(stdev: String): Stdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdev]
  }
}

