package typingsSlinky.babylonjs.effectRendererMod

import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/effectRenderer", "EffectWrapper")
@js.native
class EffectWrapper protected () extends js.Object {
  /**
    * Creates an effect to be renderer
    * @param creationOptions options to create the effect
    */
  def this(creationOptions: EffectWrapperCreationOptions) = this()
  
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit = js.native
  
  /**
    * The underlying effect
    */
  var effect: Effect = js.native
  
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object] = js.native
}
