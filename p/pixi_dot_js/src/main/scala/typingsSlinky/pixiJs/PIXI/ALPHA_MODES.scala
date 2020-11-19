package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ALPHA_MODES extends js.Object
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
  
  @js.native
  sealed trait NO_PREMULTIPLIED_ALPHA extends ALPHA_MODES
  
  @js.native
  sealed trait NPM extends ALPHA_MODES
  
  @js.native
  sealed trait PMA extends ALPHA_MODES
  
  @js.native
  sealed trait PREMULTIPLIED_ALPHA extends ALPHA_MODES
  
  @js.native
  sealed trait PREMULTIPLY_ON_UPLOAD extends ALPHA_MODES
  
  @js.native
  sealed trait UNPACK extends ALPHA_MODES
}
