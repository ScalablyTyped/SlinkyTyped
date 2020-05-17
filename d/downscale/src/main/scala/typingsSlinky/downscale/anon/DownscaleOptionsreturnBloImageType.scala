package typingsSlinky.downscale.anon

import typingsSlinky.downscale.downscaleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined downscale.downscale.DownscaleOptions & {  returnBlob ? :false,   returnCanvas ? :false} */
@js.native
trait DownscaleOptionsreturnBloImageType extends js.Object {
  var imageType: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var returnBlob: js.UndefOr[Boolean with `false`] = js.native
  var returnCanvas: js.UndefOr[Boolean with `false`] = js.native
  var sourceX: js.UndefOr[Double] = js.native
  var sourceY: js.UndefOr[Double] = js.native
}

object DownscaleOptionsreturnBloImageType {
  @scala.inline
  def apply(): DownscaleOptionsreturnBloImageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownscaleOptionsreturnBloImageType]
  }
  @scala.inline
  implicit class DownscaleOptionsreturnBloImageTypeOps[Self <: DownscaleOptionsreturnBloImageType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnBlob(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnCanvas(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceX")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceY")(js.undefined)
        ret
    }
  }
  
}

