package typingsSlinky.materialToolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlexibleExpansionRatio extends js.Object {
  var flexibleExpansionRatio: Double = js.native
}

object AnonFlexibleExpansionRatio {
  @scala.inline
  def apply(flexibleExpansionRatio: Double): AnonFlexibleExpansionRatio = {
    val __obj = js.Dynamic.literal(flexibleExpansionRatio = flexibleExpansionRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlexibleExpansionRatio]
  }
  @scala.inline
  implicit class AnonFlexibleExpansionRatioOps[Self <: AnonFlexibleExpansionRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexibleExpansionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexibleExpansionRatio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

