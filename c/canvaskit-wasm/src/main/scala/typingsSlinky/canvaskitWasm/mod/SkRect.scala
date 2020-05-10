package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkRect extends js.Object {
  var fBottom: Double = js.native
  var fLeft: Double = js.native
  var fRight: Double = js.native
  var fTop: Double = js.native
}

object SkRect {
  @scala.inline
  def apply(fBottom: Double, fLeft: Double, fRight: Double, fTop: Double): SkRect = {
    val __obj = js.Dynamic.literal(fBottom = fBottom.asInstanceOf[js.Any], fLeft = fLeft.asInstanceOf[js.Any], fRight = fRight.asInstanceOf[js.Any], fTop = fTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkRect]
  }
  @scala.inline
  implicit class SkRectOps[Self <: SkRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

