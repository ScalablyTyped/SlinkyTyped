package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scale modes that are supported by pixi.
  *
  * The {@link PIXI.settings.SCALE_MODE} scale mode affects the default scaling mode of future operations.
  * It can be re-assigned to either LINEAR or NEAREST, depending upon suitability.
  *
  * @memberof PIXI
  * @static
  * @name SCALE_MODES
  * @enum {number}
  * @property {number} LINEAR Smooth scaling
  * @property {number} NEAREST Pixelating scaling
  */
@JSGlobal("PIXI.SCALE_MODES")
@js.native
object SCALE_MODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.SCALE_MODES with Double] = js.native
  
  /* 0 */ val LINEAR: typingsSlinky.pixiJs.PIXI.SCALE_MODES.LINEAR with Double = js.native
  
  /* 1 */ val NEAREST: typingsSlinky.pixiJs.PIXI.SCALE_MODES.NEAREST with Double = js.native
}
