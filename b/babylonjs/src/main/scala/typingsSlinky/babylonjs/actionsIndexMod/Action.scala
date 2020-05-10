package typingsSlinky.babylonjs.actionsIndexMod

import typingsSlinky.babylonjs.AnonName
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/index", "Action")
@js.native
class Action protected ()
  extends typingsSlinky.babylonjs.actionMod.Action {
  /**
    * Creates a new Action
    * @param triggerOptions the trigger, with or without parameters, for the action
    * @param condition an optional determinant of action
    */
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any) = this()
  def this(
    /** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any,
    condition: typingsSlinky.babylonjs.conditionMod.Condition
  ) = this()
}

/* static members */
@JSImport("babylonjs/Actions/index", "Action")
@js.native
object Action extends js.Object {
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: Node): AnonName = js.native
  def _GetTargetProperty(target: Scene): AnonName = js.native
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): String = js.native
}

