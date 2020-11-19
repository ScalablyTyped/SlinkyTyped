package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.effectRendererMod.IEffectRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EffectRenderer")
@js.native
class EffectRenderer protected ()
  extends typingsSlinky.babylonjs.legacyMod.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine, options: IEffectRendererOptions) = this()
}
/* static members */
@JSImport("babylonjs", "EffectRenderer")
@js.native
object EffectRenderer extends js.Object {
  
  var _DefaultOptions: js.Any = js.native
}
