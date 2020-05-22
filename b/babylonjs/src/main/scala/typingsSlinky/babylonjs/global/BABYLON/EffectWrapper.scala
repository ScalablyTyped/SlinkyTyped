package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.EffectWrapperCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EffectWrapper")
@js.native
class EffectWrapper protected ()
  extends typingsSlinky.babylonjs.BABYLON.EffectWrapper {
  /**
    * Creates an effect to be renderer
    * @param creationOptions options to create the effect
    */
  def this(creationOptions: EffectWrapperCreationOptions) = this()
  /**
    * The underlying effect
    */
  /* CompleteClass */
  override var effect: typingsSlinky.babylonjs.BABYLON.Effect = js.native
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  /* CompleteClass */
  override var onApplyObservable: typingsSlinky.babylonjs.BABYLON.Observable[js.Object] = js.native
  /**
    * Disposes of the effect wrapper
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

