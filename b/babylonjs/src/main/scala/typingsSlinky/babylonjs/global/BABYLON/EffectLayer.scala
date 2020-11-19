package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EffectLayer")
@js.native
abstract class EffectLayer protected ()
  extends typingsSlinky.babylonjs.BABYLON.EffectLayer {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(
    /** The Friendly of the effect in the scene */
  name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.EffectLayer")
@js.native
object EffectLayer extends js.Object {
  
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  def Parse(parsedEffectLayer: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.EffectLayer = js.native
  
  /** @hidden */
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}
