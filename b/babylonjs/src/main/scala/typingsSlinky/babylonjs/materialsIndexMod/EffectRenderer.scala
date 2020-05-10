package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.effectRendererMod.IEffectRendererOptions
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "EffectRenderer")
@js.native
class EffectRenderer protected ()
  extends typingsSlinky.babylonjs.effectRendererMod.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: ThinEngine) = this()
  def this(engine: ThinEngine, options: IEffectRendererOptions) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "EffectRenderer")
@js.native
object EffectRenderer extends js.Object {
  var _DefaultOptions: js.Any = js.native
}

