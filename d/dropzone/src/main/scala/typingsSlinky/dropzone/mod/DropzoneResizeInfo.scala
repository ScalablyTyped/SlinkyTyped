package typingsSlinky.dropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneResizeInfo extends js.Object {
  var srcHeight: js.UndefOr[Double] = js.native
  var srcWidth: js.UndefOr[Double] = js.native
  var srcX: js.UndefOr[Double] = js.native
  var srcY: js.UndefOr[Double] = js.native
  var trgHeight: js.UndefOr[Double] = js.native
  var trgWidth: js.UndefOr[Double] = js.native
  var trgX: js.UndefOr[Double] = js.native
  var trgY: js.UndefOr[Double] = js.native
}

object DropzoneResizeInfo {
  @scala.inline
  def apply(): DropzoneResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneResizeInfo]
  }
  @scala.inline
  implicit class DropzoneResizeInfoOps[Self <: DropzoneResizeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrcHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcX")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcY")(js.undefined)
        ret
    }
    @scala.inline
    def withTrgHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrgHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTrgWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrgWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTrgX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrgX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgX")(js.undefined)
        ret
    }
    @scala.inline
    def withTrgY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrgY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trgY")(js.undefined)
        ret
    }
  }
  
}

