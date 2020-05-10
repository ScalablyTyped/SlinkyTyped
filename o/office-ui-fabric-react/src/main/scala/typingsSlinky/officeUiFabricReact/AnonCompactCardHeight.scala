package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompactCardHeight extends js.Object {
  var compactCardHeight: Double = js.native
  var directionalHintFixed: Boolean = js.native
  var expandedCardHeight: Double = js.native
}

object AnonCompactCardHeight {
  @scala.inline
  def apply(compactCardHeight: Double, directionalHintFixed: Boolean, expandedCardHeight: Double): AnonCompactCardHeight = {
    val __obj = js.Dynamic.literal(compactCardHeight = compactCardHeight.asInstanceOf[js.Any], directionalHintFixed = directionalHintFixed.asInstanceOf[js.Any], expandedCardHeight = expandedCardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompactCardHeight]
  }
  @scala.inline
  implicit class AnonCompactCardHeightOps[Self <: AnonCompactCardHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactCardHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactCardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionalHintFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedCardHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

