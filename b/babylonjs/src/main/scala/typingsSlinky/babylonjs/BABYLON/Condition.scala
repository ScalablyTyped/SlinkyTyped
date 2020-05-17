package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * Internal only - manager for action
    * @hidden
    */
  var _actionManager: ActionManager = js.native
  /**
    * Internal only
    * @hidden
    */
  var _currentResult: Boolean = js.native
  /**
    * Internal only
    * @hidden
    */
  var _evaluationId: Double = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getProperty(propertyPath: String): String = js.native
  /**
    * Internal only
    * @hidden
    */
  /* protected */ def _serialize(serializedCondition: js.Any): js.Any = js.native
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  def isValid(): Boolean = js.native
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

object Condition {
  @scala.inline
  def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _evaluationId: Double,
    _getEffectiveTarget: (js.Any, String) => js.Any,
    _getProperty: String => String,
    _serialize: js.Any => js.Any,
    isValid: () => Boolean,
    serialize: () => js.Any
  ): Condition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _serialize = js.Any.fromFunction1(_serialize), isValid = js.Any.fromFunction0(isValid), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_actionManager(value: ActionManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actionManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_evaluationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_evaluationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getEffectiveTarget(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getEffectiveTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_getProperty(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_serialize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

