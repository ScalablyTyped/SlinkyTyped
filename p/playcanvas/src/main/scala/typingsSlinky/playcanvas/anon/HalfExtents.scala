package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HalfExtents extends js.Object {
  var halfExtents: js.UndefOr[Vec2] = js.native
  var lengthSegments: js.UndefOr[Double] = js.native
  var widthSegments: js.UndefOr[Double] = js.native
}

object HalfExtents {
  @scala.inline
  def apply(): HalfExtents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HalfExtents]
  }
  @scala.inline
  implicit class HalfExtentsOps[Self <: HalfExtents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHalfExtents(value: Vec2): Self = {
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

