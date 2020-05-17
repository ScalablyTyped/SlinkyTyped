package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueCondition extends Condition {
  /**
    * Internal only
    * @hidden
    */
  var _effectiveTarget: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _property: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _target: js.Any = js.native
  /** the conditional operator, default ValueCondition.IsEqual */
  var operator: Double = js.native
  /** path to specify the property of the target the conditional operator uses  */
  var propertyPath: String = js.native
  /** the value compared by the conditional operator against the current value of the property */
  var value: js.Any = js.native
}

object ValueCondition {
  @scala.inline
  def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _effectiveTarget: js.Any,
    _evaluationId: Double,
    _getEffectiveTarget: (js.Any, String) => js.Any,
    _getProperty: String => String,
    _property: js.Any,
    _serialize: js.Any => js.Any,
    _target: js.Any,
    isValid: () => Boolean,
    operator: Double,
    propertyPath: String,
    serialize: () => js.Any,
    value: js.Any
  ): ValueCondition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _effectiveTarget = _effectiveTarget.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _property = _property.asInstanceOf[js.Any], _serialize = js.Any.fromFunction1(_serialize), _target = _target.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), operator = operator.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCondition]
  }
  @scala.inline
  implicit class ValueConditionOps[Self <: ValueCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_effectiveTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_property(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_target(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

