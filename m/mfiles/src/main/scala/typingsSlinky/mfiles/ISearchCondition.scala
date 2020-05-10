package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchCondition extends js.Object {
  var ConditionType: MFConditionType = js.native
  var Expression: IExpression = js.native
  var TypedValue: ITypedValue = js.native
  def Clone(): ISearchCondition = js.native
  def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit = js.native
}

object ISearchCondition {
  @scala.inline
  def apply(
    Clone: () => ISearchCondition,
    ConditionType: MFConditionType,
    Expression: IExpression,
    Set: (IExpression, MFConditionType, ITypedValue) => Unit,
    TypedValue: ITypedValue
  ): ISearchCondition = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ConditionType = ConditionType.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Set = js.Any.fromFunction3(Set), TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCondition]
  }
  @scala.inline
  implicit class ISearchConditionOps[Self <: ISearchCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISearchCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConditionType(value: MFConditionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (IExpression, MFConditionType, ITypedValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTypedValue(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

