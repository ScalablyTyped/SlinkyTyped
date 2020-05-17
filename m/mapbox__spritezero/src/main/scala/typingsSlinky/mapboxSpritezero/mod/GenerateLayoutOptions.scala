package typingsSlinky.mapboxSpritezero.mod

import typingsSlinky.mapboxSpritezero.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateLayoutOptions extends js.Object {
  /** If true, generate DataLayout ; if false, generate ImgLayout */
  var format: Boolean = js.native
  var imgs: js.Array[Id] = js.native
  /** overrides the max_size in mapnik */
  var maxIconSize: js.UndefOr[Double] = js.native
  /** Ratio of a 72dpi screen pixel to the destination pixel density */
  var pixelRatio: Double = js.native
  /** filters out icons that mapnik says are too big */
  var removeOversizedIcons: js.UndefOr[Boolean] = js.native
}

object GenerateLayoutOptions {
  @scala.inline
  def apply(format: Boolean, imgs: js.Array[Id], pixelRatio: Double): GenerateLayoutOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], imgs = imgs.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateLayoutOptions]
  }
  @scala.inline
  implicit class GenerateLayoutOptionsOps[Self <: GenerateLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImgs(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOversizedIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOversizedIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOversizedIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOversizedIcons")(js.undefined)
        ret
    }
  }
  
}

