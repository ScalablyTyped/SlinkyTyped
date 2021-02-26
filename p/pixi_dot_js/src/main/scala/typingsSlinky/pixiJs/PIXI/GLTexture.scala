package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal texture for WebGL context
  * @class
  * @memberof PIXI
  */
@js.native
trait GLTexture extends StObject {
  
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
  implicit class GLTextureMutableBuilder[Self <: GLTexture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirtyId(value: Double): Self = StObject.set(x, "dirtyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyStyleId(value: Double): Self = StObject.set(x, "dirtyStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalFormat(value: Double): Self = StObject.set(x, "internalFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMipmap(value: Boolean): Self = StObject.set(x, "mipmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapMode(value: Double): Self = StObject.set(x, "wrapMode", value.asInstanceOf[js.Any])
  }
}
