package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateCondition extends Condition {
  
  /**
    * Internal only
    * @hidden
    */
  var _target: js.Any = js.native
  
  /** Value to compare with target state  */
  var value: String = js.native
}
object StateCondition {
  
  @scala.inline
  def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _evaluationId: Double,
    _getEffectiveTarget: (js.Any, String) => js.Any,
    _getProperty: String => String,
    _serialize: js.Any => js.Any,
    _target: js.Any,
    isValid: () => Boolean,
    serialize: () => js.Any,
    value: String
  ): StateCondition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _serialize = js.Any.fromFunction1(_serialize), _target = _target.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), serialize = js.Any.fromFunction0(serialize), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateCondition]
  }
  
  @scala.inline
  implicit class StateConditionMutableBuilder[Self <: StateCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_target(value: js.Any): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
  }
}
