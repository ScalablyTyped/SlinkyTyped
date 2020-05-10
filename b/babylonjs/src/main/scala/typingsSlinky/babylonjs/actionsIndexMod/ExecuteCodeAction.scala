package typingsSlinky.babylonjs.actionsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/index", "ExecuteCodeAction")
@js.native
class ExecuteCodeAction protected ()
  extends typingsSlinky.babylonjs.directActionsMod.ExecuteCodeAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param func defines the callback function to run
    * @param condition defines the trigger related conditions
    */
  def this(
    triggerOptions: js.Any,
    func: js.Function1[/* evt */ typingsSlinky.babylonjs.actionEventMod.ActionEvent, Unit]
  ) = this()
  def this(
    triggerOptions: js.Any,
    func: js.Function1[/* evt */ typingsSlinky.babylonjs.actionEventMod.ActionEvent, Unit],
    condition: typingsSlinky.babylonjs.conditionMod.Condition
  ) = this()
}

