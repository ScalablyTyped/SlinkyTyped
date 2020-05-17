package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintData extends js.Object {
  var name: String = js.native
  var order: Double = js.native
  var skinRequired: Boolean = js.native
}

object ConstraintData {
  @scala.inline
  def apply(name: String, order: Double, skinRequired: Boolean): ConstraintData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintData]
  }
  @scala.inline
  implicit class ConstraintDataOps[Self <: ConstraintData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkinRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

