package typingsSlinky.meyda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Specific extends js.Object {
  var specific: js.typedarray.Float32Array
  var total: Double
}

object Specific {
  @scala.inline
  def apply(specific: js.typedarray.Float32Array, total: Double): Specific = {
    val __obj = js.Dynamic.literal(specific = specific.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specific]
  }
}

