package typingsSlinky.cesium

import typingsSlinky.cesium.mod.BoundingRectangle
import typingsSlinky.cesium.mod.Color
import typingsSlinky.cesium.mod.PixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClearColor extends js.Object {
  var clearColor: js.UndefOr[Color] = js.native
  var forcePowerOfTwo: js.UndefOr[Boolean] = js.native
  var fragmentShader: String = js.native
  var name: js.UndefOr[String] = js.native
  var pixelFormat: js.UndefOr[PixelFormat] = js.native
  var scissorRectangle: js.UndefOr[BoundingRectangle] = js.native
  var textureScale: js.UndefOr[Double] = js.native
  var uniforms: js.UndefOr[js.Object] = js.native
}

object AnonClearColor {
  @scala.inline
  def apply(fragmentShader: String): AnonClearColor = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearColor]
  }
  @scala.inline
  implicit class AnonClearColorOps[Self <: AnonClearColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragmentShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearColor")(js.undefined)
        ret
    }
    @scala.inline
    def withForcePowerOfTwo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePowerOfTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePowerOfTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePowerOfTwo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelFormat(value: PixelFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withScissorRectangle(value: BoundingRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scissorRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScissorRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scissorRectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureScale")(js.undefined)
        ret
    }
    @scala.inline
    def withUniforms(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(js.undefined)
        ret
    }
  }
  
}

