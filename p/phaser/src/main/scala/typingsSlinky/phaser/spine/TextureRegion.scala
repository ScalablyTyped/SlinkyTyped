package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureRegion extends js.Object {
  var height: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var originalHeight: Double = js.native
  var originalWidth: Double = js.native
  var renderObject: js.Any = js.native
  var rotate: Boolean = js.native
  var u: Double = js.native
  var u2: Double = js.native
  var v: Double = js.native
  var v2: Double = js.native
  var width: Double = js.native
}

object TextureRegion {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    renderObject: js.Any,
    rotate: Boolean,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], renderObject = renderObject.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def withRenderObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
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
  }
  
}

