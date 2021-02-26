package typingsSlinky.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The wrap modes that are supported by pixi.
  *
  * The {@link PIXI.settings.WRAP_MODE} wrap mode affects the default wrapping mode of future operations.
  * It can be re-assigned to either CLAMP or REPEAT, depending upon suitability.
  * If the texture is non power of two then clamp will be used regardless as WebGL can
  * only use REPEAT if the texture is po2.
  *
  * This property only affects WebGL.
  *
  * @name WRAP_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} CLAMP - The textures uvs are clamped
  * @property {number} REPEAT - The texture uvs tile and repeat
  * @property {number} MIRRORED_REPEAT - The texture uvs tile and repeat with mirroring
  */
@JSGlobal("PIXI.WRAP_MODES")
@js.native
object WRAP_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.WRAP_MODES with Double] = js.native
  
  /* 0 */ val CLAMP: typingsSlinky.pixiJs.PIXI.WRAP_MODES.CLAMP with Double = js.native
  
  /* 2 */ val MIRRORED_REPEAT: typingsSlinky.pixiJs.PIXI.WRAP_MODES.MIRRORED_REPEAT with Double = js.native
  
  /* 1 */ val REPEAT: typingsSlinky.pixiJs.PIXI.WRAP_MODES.REPEAT with Double = js.native
}
