package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How to clear renderTextures in filter
  *
  * @name CLEAR_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} BLEND - Preserve the information in the texture, blend above
  * @property {number} CLEAR - Must use `gl.clear` operation
  * @property {number} BLIT - Clear or blit it, depends on device and level of paranoia
  * @property {number} NO - Alias for BLEND, same as `false` in earlier versions
  * @property {number} YES - Alias for CLEAR, same as `true` in earlier versions
  * @property {number} AUTO - Alias for BLIT
  */
@JSGlobal("PIXI.CLEAR_MODES")
@js.native
object CLEAR_MODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.CLEAR_MODES with Double] = js.native
  
  /* 5 */ val AUTO: typingsSlinky.pixiJs.PIXI.CLEAR_MODES.AUTO with Double = js.native
  
  /* 0 */ val BLEND: typingsSlinky.pixiJs.PIXI.CLEAR_MODES.BLEND with Double = js.native
  
  /* 2 */ val BLIT: typingsSlinky.pixiJs.PIXI.CLEAR_MODES.BLIT with Double = js.native
  
  /* 1 */ val CLEAR: typingsSlinky.pixiJs.PIXI.CLEAR_MODES.CLEAR with Double = js.native
  
  /* 3 */ val NO: typingsSlinky.pixiJs.PIXI.CLEAR_MODES.NO with Double = js.native
  
  /* 4 */ val YES: typingsSlinky.pixiJs.PIXI.CLEAR_MODES.YES with Double = js.native
}
