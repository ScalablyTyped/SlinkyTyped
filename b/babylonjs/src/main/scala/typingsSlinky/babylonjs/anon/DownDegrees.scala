package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownDegrees extends js.Object {
  var downDegrees: Double = js.native
  var leftDegrees: Double = js.native
  var rightDegrees: Double = js.native
  var upDegrees: Double = js.native
}

object DownDegrees {
  @scala.inline
  def apply(downDegrees: Double, leftDegrees: Double, rightDegrees: Double, upDegrees: Double): DownDegrees = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees.asInstanceOf[js.Any], leftDegrees = leftDegrees.asInstanceOf[js.Any], rightDegrees = rightDegrees.asInstanceOf[js.Any], upDegrees = upDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownDegrees]
  }
  @scala.inline
  implicit class DownDegreesOps[Self <: DownDegrees] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upDegrees")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

