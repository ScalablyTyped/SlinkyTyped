package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How to treat textures with premultiplied alpha
  *
  * @name ALPHA_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} NO_PREMULTIPLIED_ALPHA - Source is not premultiplied, leave it like that.
  *  Option for compressed and data textures that are created from typed arrays.
  * @property {number} PREMULTIPLY_ON_UPLOAD - Source is not premultiplied, premultiply on upload.
  *  Default option, used for all loaded images.
  * @property {number} PREMULTIPLIED_ALPHA - Source is already premultiplied
  *  Example: spine atlases with `_pma` suffix.
  * @property {number} NPM - Alias for NO_PREMULTIPLIED_ALPHA.
  * @property {number} UNPACK - Default option, alias for PREMULTIPLY_ON_UPLOAD.
  * @property {number} PMA - Alias for PREMULTIPLIED_ALPHA.
  */
@JSGlobal("PIXI.ALPHA_MODES")
@js.native
object ALPHA_MODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.ALPHA_MODES with Double] = js.native
  
  /* 0 */ val NO_PREMULTIPLIED_ALPHA: typingsSlinky.pixiJs.PIXI.ALPHA_MODES.NO_PREMULTIPLIED_ALPHA with Double = js.native
  
  /* 3 */ val NPM: typingsSlinky.pixiJs.PIXI.ALPHA_MODES.NPM with Double = js.native
  
  /* 5 */ val PMA: typingsSlinky.pixiJs.PIXI.ALPHA_MODES.PMA with Double = js.native
  
  /* 2 */ val PREMULTIPLIED_ALPHA: typingsSlinky.pixiJs.PIXI.ALPHA_MODES.PREMULTIPLIED_ALPHA with Double = js.native
  
  /* 1 */ val PREMULTIPLY_ON_UPLOAD: typingsSlinky.pixiJs.PIXI.ALPHA_MODES.PREMULTIPLY_ON_UPLOAD with Double = js.native
  
  /* 4 */ val UNPACK: typingsSlinky.pixiJs.PIXI.ALPHA_MODES.UNPACK with Double = js.native
}
