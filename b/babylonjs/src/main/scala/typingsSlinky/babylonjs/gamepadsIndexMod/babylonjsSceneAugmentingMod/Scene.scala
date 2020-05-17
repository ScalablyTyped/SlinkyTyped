package typingsSlinky.babylonjs.gamepadsIndexMod.babylonjsSceneAugmentingMod

import typingsSlinky.babylonjs.gamepadManagerMod.GamepadManager
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  /** @hidden */
  var _gamepadManager: Nullable[GamepadManager] = js.native
  /**
    * Gets the gamepad manager associated with the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_gamepads
    */
  var gamepadManager: GamepadManager = js.native
}

object Scene {
  @scala.inline
  def apply(gamepadManager: GamepadManager): Scene = {
    val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGamepadManager(value: GamepadManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepadManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_gamepadManager(value: Nullable[GamepadManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gamepadManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_gamepadManagerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gamepadManager")(null)
        ret
    }
  }
  
}

