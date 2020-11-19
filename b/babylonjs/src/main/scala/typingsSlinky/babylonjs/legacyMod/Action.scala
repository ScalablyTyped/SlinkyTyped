package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Action")
@js.native
class Action protected ()
  extends typingsSlinky.babylonjs.indexMod.Action {
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
@JSImport("babylonjs/Legacy/legacy", "Action")
@js.native
object Action extends js.Object {
  
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: typingsSlinky.babylonjs.nodeMod.Node): Name = js.native
  def _GetTargetProperty(target: typingsSlinky.babylonjs.sceneMod.Scene): Name = js.native
  
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): String = js.native
}
