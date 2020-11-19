package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CombineAction")
@js.native
class CombineAction protected ()
  extends typingsSlinky.babylonjs.legacyMod.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, children: js.Array[typingsSlinky.babylonjs.actionMod.Action]) = this()
  def this(
    triggerOptions: js.Any,
    children: js.Array[typingsSlinky.babylonjs.actionMod.Action],
    condition: typingsSlinky.babylonjs.conditionMod.Condition
  ) = this()
}
