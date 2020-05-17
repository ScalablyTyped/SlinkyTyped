package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureRegion extends js.Object {
  val height: Double = js.native
  val offsetX: Double = js.native
  val offsetY: Double = js.native
  val originalHeight: Double = js.native
  val originalWidth: Double = js.native
  val pixiOffsetY: Double = js.native
  val rotate: Boolean = js.native
  var size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any = js.native
  val spineOffsetY: Double = js.native
  var texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any = js.native
  val u: Double = js.native
  val u2: Double = js.native
  val v: Double = js.native
  val v2: Double = js.native
  val width: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
}

object TextureRegion {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    pixiOffsetY: Double,
    rotate: Boolean,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any,
    spineOffsetY: Double,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double,
    x: Double,
    y: Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], pixiOffsetY = pixiOffsetY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spineOffsetY = spineOffsetY.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureRegion]
  }
  @scala.inline
  implicit class TextureRegionOps[Self <: TextureRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixiOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixiOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpineOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

