package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorVertex extends js.Object {
  val cornerRadius: js.UndefOr[Double] = js.native
  val handleMirroring: js.UndefOr[HandleMirroring] = js.native
  val strokeCap: js.UndefOr[StrokeCap] = js.native
  val strokeJoin: js.UndefOr[StrokeJoin] = js.native
  val x: Double = js.native
  val y: Double = js.native
}

object VectorVertex {
  @scala.inline
  def apply(x: Double, y: Double): VectorVertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorVertex]
  }
  @scala.inline
  implicit class VectorVertexOps[Self <: VectorVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMirroring(value: HandleMirroring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMirroring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleMirroring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMirroring")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeCap(value: StrokeCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeJoin(value: StrokeJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(js.undefined)
        ret
    }
  }
  
}

