package typingsSlinky.babylonjs.gamepadSceneComponentMod

import typingsSlinky.babylonjs.sceneComponentMod.ISceneComponent
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gamepads/gamepadSceneComponent", "GamepadSystemSceneComponent")
@js.native
class GamepadSystemSceneComponent protected () extends ISceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  var _beforeCameraUpdate: js.Any = js.native
}

