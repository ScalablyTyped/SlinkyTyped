package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.CROP
import typingsSlinky.figma.figmaStrings.FILL
import typingsSlinky.figma.figmaStrings.FIT
import typingsSlinky.figma.figmaStrings.IMAGE
import typingsSlinky.figma.figmaStrings.TILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.native
   // setting for "TILE"
  val filters: js.UndefOr[ImageFilters] = js.native
  val imageHash: String | Null = js.native
  val imageTransform: js.UndefOr[Transform] = js.native
  val opacity: js.UndefOr[Double] = js.native
  val scaleMode: FILL | FIT | CROP | TILE = js.native
   // setting for "CROP"
  val scalingFactor: js.UndefOr[Double] = js.native
  val `type`: IMAGE = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object ImagePaint {
  @scala.inline
  def apply(scaleMode: FILL | FIT | CROP | TILE, `type`: IMAGE): ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePaint]
  }
  @scala.inline
  implicit class ImagePaintOps[Self <: ImagePaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleMode(value: FILL | FIT | CROP | TILE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IMAGE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: BlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: ImageFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withImageHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageHashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHash")(null)
        ret
    }
    @scala.inline
    def withImageTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

