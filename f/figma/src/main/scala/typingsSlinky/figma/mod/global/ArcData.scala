package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcData extends js.Object {
  val endingAngle: Double = js.native
  val innerRadius: Double = js.native
  val startingAngle: Double = js.native
}

object ArcData {
  @scala.inline
  def apply(endingAngle: Double, innerRadius: Double, startingAngle: Double): ArcData = {
    val __obj = js.Dynamic.literal(endingAngle = endingAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], startingAngle = startingAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcData]
  }
  @scala.inline
  implicit class ArcDataOps[Self <: ArcData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndingAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endingAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingAngle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

