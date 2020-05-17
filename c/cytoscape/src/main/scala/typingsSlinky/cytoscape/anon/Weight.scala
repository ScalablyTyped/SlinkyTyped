package typingsSlinky.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Weight extends js.Object {
  var weight: Double = js.native
}

object Weight {
  @scala.inline
  def apply(weight: Double): Weight = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
  @scala.inline
  implicit class WeightOps[Self <: Weight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

