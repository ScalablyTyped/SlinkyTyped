package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.babylonjsStrings.button
import typingsSlinky.babylonjs.babylonjsStrings.state
import typingsSlinky.babylonjs.babylonjsStrings.transform
import typingsSlinky.babylonjs.babylonjsStrings.visibility
import typingsSlinky.babylonjs.babylonjsStrings.xAxis
import typingsSlinky.babylonjs.babylonjsStrings.yAxis
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentStateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentProperty extends js.Object {
  /**
    * What property will be animated
    */
  var componentProperty: xAxis | yAxis | button | state = js.native
  /**
    * Max movement node
    */
  var maxNodeName: js.UndefOr[String] = js.native
  /**
    * Minimum movement node
    */
  var minNodeName: js.UndefOr[String] = js.native
  /**
    * What states influence this visual response
    */
  var states: js.Array[MotionControllerComponentStateType] = js.native
  /**
    * Base node name to move. Its position will be calculated according to the min and max nodes
    */
  var valueNodeName: js.UndefOr[String] = js.native
  /**
    * Type of animation - movement or visibility
    */
  var valueNodeProperty: transform | visibility = js.native
}

object AnonComponentProperty {
  @scala.inline
  def apply(
    componentProperty: xAxis | yAxis | button | state,
    states: js.Array[MotionControllerComponentStateType],
    valueNodeProperty: transform | visibility
  ): AnonComponentProperty = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], valueNodeProperty = valueNodeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentProperty]
  }
  @scala.inline
  implicit class AnonComponentPropertyOps[Self <: AnonComponentProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentProperty(value: xAxis | yAxis | button | state): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: js.Array[MotionControllerComponentStateType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNodeProperty(value: transform | visibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNodeProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNodeName")(js.undefined)
        ret
    }
  }
  
}

