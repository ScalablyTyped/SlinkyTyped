package typingsSlinky.playcanvas

import typingsSlinky.playcanvas.pc.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeightSegments extends js.Object {
  var halfExtents: js.UndefOr[Vec3] = js.native
  var heightSegments: js.UndefOr[Double] = js.native
  var lengthSegments: js.UndefOr[Double] = js.native
  var widthSegments: js.UndefOr[Double] = js.native
}

object AnonHeightSegments {
  @scala.inline
  def apply(): AnonHeightSegments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHeightSegments]
  }
  @scala.inline
  implicit class AnonHeightSegmentsOps[Self <: AnonHeightSegments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHalfExtents(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfExtents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalfExtents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfExtents")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSegments")(js.undefined)
        ret
    }
  }
  
}

