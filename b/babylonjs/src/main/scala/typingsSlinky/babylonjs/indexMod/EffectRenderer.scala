package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.effectRendererMod.IEffectRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "EffectRenderer")
@js.native
class EffectRenderer protected ()
  extends typingsSlinky.babylonjs.materialsIndexMod.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine, options: IEffectRendererOptions) = this()
}
/* static members */
object EffectRenderer {
  
  @JSImport("babylonjs/index", "EffectRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "EffectRenderer._DefaultOptions")
  @js.native
  def _DefaultOptions: js.Any = js.native
  @scala.inline
  def _DefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultOptions")(x.asInstanceOf[js.Any])
}
