package typingsSlinky.meyda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpecific extends js.Object {
  var specific: scala.scalajs.js.typedarray.Float32Array
  var total: Double
}

object AnonSpecific {
  @scala.inline
  def apply(specific: scala.scalajs.js.typedarray.Float32Array, total: Double): AnonSpecific = {
    val __obj = js.Dynamic.literal(specific = specific.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSpecific]
  }
}

