package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Action")
@js.native
class Action protected ()
  extends typingsSlinky.babylonjs.BABYLON.Action {
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
    condition: typingsSlinky.babylonjs.BABYLON.Condition
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.Action")
@js.native
object Action extends js.Object {
  
  def _GetTargetProperty(target: typingsSlinky.babylonjs.BABYLON.Node): Name = js.native
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: typingsSlinky.babylonjs.BABYLON.Scene): Name = js.native
  
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): String = js.native
}
