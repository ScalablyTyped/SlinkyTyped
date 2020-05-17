package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal texture for WebGL context
  * @class
  * @memberof PIXI
  */
@js.native
trait GLTexture extends js.Object {
  /**
    * Texture contents dirty flag
    * @member {number} PIXI.GLTexture#dirtyId
    */
  var dirtyId: Double = js.native
  /**
    * Texture style dirty flag
    * @member {number} PIXI.GLTexture#dirtyStyleId
    */
  var dirtyStyleId: Double = js.native
  /**
    * Height of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#height
    */
  var height: Double = js.native
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#internalFormat
    */
  var internalFormat: Double = js.native
  /**
    * Whether mip levels has to be generated
    * @member {boolean} PIXI.GLTexture#mipmap
    */
  var mipmap: Boolean = js.native
  /**
    * The WebGL texture
    * @member {WebGLTexture} PIXI.GLTexture#texture
    */
  var texture: WebGLTexture = js.native
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#type
    */
  var `type`: Double = js.native
  /**
    * Width of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#width
    */
  var width: Double = js.native
  /**
    * WrapMode copied from baseTexture
    * @member {number} PIXI.GLTexture#wrapMode
    */
  var wrapMode: Double = js.native
}

object GLTexture {
  @scala.inline
  def apply(
    dirtyId: Double,
    dirtyStyleId: Double,
    height: Double,
    internalFormat: Double,
    mipmap: Boolean,
    texture: WebGLTexture,
    `type`: Double,
    width: Double,
    wrapMode: Double
  ): GLTexture = {
    val __obj = js.Dynamic.literal(dirtyId = dirtyId.asInstanceOf[js.Any], dirtyStyleId = dirtyStyleId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], internalFormat = internalFormat.asInstanceOf[js.Any], mipmap = mipmap.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wrapMode = wrapMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLTexture]
  }
  @scala.inline
  implicit class GLTextureOps[Self <: GLTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirtyId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirtyStyleId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyStyleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMipmap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture(value: WebGLTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

