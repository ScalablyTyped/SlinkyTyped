package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamePadFactory extends js.Object {
  /**
    * Returns whether or not the current gamepad can be created for this type of controller.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns true if it can be created, otherwise false
    */
  def canCreate(gamepadInfo: js.Any): Boolean = js.native
  /**
    * Creates a new instance of the Gamepad.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns the new gamepad instance
    */
  def create(gamepadInfo: js.Any): Gamepad = js.native
}

object GamePadFactory {
  @scala.inline
  def apply(canCreate: js.Any => Boolean, create: js.Any => Gamepad): GamePadFactory = {
    val __obj = js.Dynamic.literal(canCreate = js.Any.fromFunction1(canCreate), create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[GamePadFactory]
  }
  @scala.inline
  implicit class GamePadFactoryOps[Self <: GamePadFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCreate(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: js.Any => Gamepad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

