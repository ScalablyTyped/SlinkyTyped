package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IEffectRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EffectRenderer")
@js.native
class EffectRenderer protected ()
  extends typingsSlinky.babylonjs.BABYLON.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: typingsSlinky.babylonjs.BABYLON.ThinEngine) = this()
  def this(engine: typingsSlinky.babylonjs.BABYLON.ThinEngine, options: IEffectRendererOptions) = this()
}
/* static members */
object EffectRenderer {
  
  @JSGlobal("BABYLON.EffectRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.EffectRenderer._DefaultOptions")
  @js.native
  def _DefaultOptions: js.Any = js.native
  @scala.inline
  def _DefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultOptions")(x.asInstanceOf[js.Any])
}
