package typingsSlinky.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadIndices extends js.Object {
  /**
    * The indices of this component in the gamepad object
    */
  var gamepadIndices: Button = js.native
  /**
    * The mesh's root node name
    */
  var rootNodeName: String = js.native
  /**
    * If touch enabled, what is the name of node to display user feedback
    */
  var touchPointNodeName: js.UndefOr[String] = js.native
  /**
    * The type of input the component outputs
    */
  var `type`: MotionControllerComponentType = js.native
  /**
    * Animation definitions for this model
    */
  var visualResponses: StringDictionary[ComponentProperty] = js.native
}

object GamepadIndices {
  @scala.inline
  def apply(
    gamepadIndices: Button,
    rootNodeName: String,
    `type`: MotionControllerComponentType,
    visualResponses: StringDictionary[ComponentProperty]
  ): GamepadIndices = {
    val __obj = js.Dynamic.literal(gamepadIndices = gamepadIndices.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], visualResponses = visualResponses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadIndices]
  }
  @scala.inline
  implicit class GamepadIndicesOps[Self <: GamepadIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGamepadIndices(value: Button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepadIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MotionControllerComponentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualResponses(value: StringDictionary[ComponentProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchPointNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchPointNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchPointNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchPointNodeName")(js.undefined)
        ret
    }
  }
  
}

