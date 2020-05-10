package typingsSlinky.babylonjs.panoramaToCubemapMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeMapInfo extends js.Object {
  /**
    * The pixel array for the back face.
    * This is stored in format, left to right, up to down format.
    */
  var back: Nullable[js.typedarray.ArrayBufferView] = js.native
  /**
    * The pixel array for the down face.
    * This is stored in format, left to right, up to down format.
    */
  var down: Nullable[js.typedarray.ArrayBufferView] = js.native
  /**
    * The format of the texture.
    *
    * RGBA, RGB.
    */
  var format: Double = js.native
  /**
    * The pixel array for the front face.
    * This is stored in format, left to right, up to down format.
    */
  var front: Nullable[js.typedarray.ArrayBufferView] = js.native
  /**
    * Specifies whether the texture is in gamma space.
    */
  var gammaSpace: Boolean = js.native
  /**
    * The pixel array for the left face.
    * This is stored in format, left to right, up to down format.
    */
  var left: Nullable[js.typedarray.ArrayBufferView] = js.native
  /**
    * The pixel array for the right face.
    * This is stored in format, left to right, up to down format.
    */
  var right: Nullable[js.typedarray.ArrayBufferView] = js.native
  /**
    * The size of the cubemap stored.
    *
    * Each faces will be size * size pixels.
    */
  var size: Double = js.native
  /**
    * The type of the texture data.
    *
    * UNSIGNED_INT, FLOAT.
    */
  var `type`: Double = js.native
  /**
    * The pixel array for the up face.
    * This is stored in format, left to right, up to down format.
    */
  var up: Nullable[js.typedarray.ArrayBufferView] = js.native
}

object CubeMapInfo {
  @scala.inline
  def apply(format: Double, gammaSpace: Boolean, size: Double, `type`: Double): CubeMapInfo = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapInfo]
  }
  @scala.inline
  implicit class CubeMapInfoOps[Self <: CubeMapInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGammaSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gammaSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBack(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(null)
        ret
    }
    @scala.inline
    def withDown(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(null)
        ret
    }
    @scala.inline
    def withFront(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrontNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(null)
        ret
    }
    @scala.inline
    def withLeft(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(null)
        ret
    }
    @scala.inline
    def withRight(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(null)
        ret
    }
    @scala.inline
    def withUp(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(null)
        ret
    }
  }
  
}

