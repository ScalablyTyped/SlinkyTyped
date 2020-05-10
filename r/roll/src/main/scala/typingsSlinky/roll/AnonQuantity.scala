package typingsSlinky.roll

import typingsSlinky.roll.mod.RollTransformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQuantity extends js.Object {
  var quantity: Double = js.native
  var sides: Double = js.native
  var transformations: js.Array[RollTransformation] = js.native
}

object AnonQuantity {
  @scala.inline
  def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): AnonQuantity = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuantity]
  }
  @scala.inline
  implicit class AnonQuantityOps[Self <: AnonQuantity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformations(value: js.Array[RollTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

