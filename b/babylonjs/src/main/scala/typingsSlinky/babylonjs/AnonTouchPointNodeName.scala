package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.BABYLON.MotionControllerComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTouchPointNodeName extends js.Object {
  /**
    * The indices of this component in the gamepad object
    */
  var gamepadIndices: AnonButton = js.native
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
  var visualResponses: StringDictionary[AnonMinNodeName] = js.native
}

object AnonTouchPointNodeName {
  @scala.inline
  def apply(
    gamepadIndices: AnonButton,
    rootNodeName: String,
    `type`: MotionControllerComponentType,
    visualResponses: StringDictionary[AnonMinNodeName]
  ): AnonTouchPointNodeName = {
    val __obj = js.Dynamic.literal(gamepadIndices = gamepadIndices.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], visualResponses = visualResponses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTouchPointNodeName]
  }
  @scala.inline
  implicit class AnonTouchPointNodeNameOps[Self <: AnonTouchPointNodeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGamepadIndices(value: AnonButton): Self = {
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
    def withVisualResponses(value: StringDictionary[AnonMinNodeName]): Self = {
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

