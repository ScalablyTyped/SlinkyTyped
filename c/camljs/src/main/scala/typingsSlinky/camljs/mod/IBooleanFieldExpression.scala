package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBooleanFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Boolean): IExpression = js.native
  /** Checks whether the value of the field is False */
  def IsFalse(): IExpression = js.native
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  /** Checks whether the value of the field is True */
  def IsTrue(): IExpression = js.native
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Boolean): IExpression = js.native
}

object IBooleanFieldExpression {
  @scala.inline
  def apply(
    EqualTo: Boolean => IExpression,
    IsFalse: () => IExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    IsTrue: () => IExpression,
    NotEqualTo: Boolean => IExpression
  ): IBooleanFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), IsFalse = js.Any.fromFunction0(IsFalse), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), IsTrue = js.Any.fromFunction0(IsTrue), NotEqualTo = js.Any.fromFunction1(NotEqualTo))
    __obj.asInstanceOf[IBooleanFieldExpression]
  }
  @scala.inline
  implicit class IBooleanFieldExpressionOps[Self <: IBooleanFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualTo(value: Boolean => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFalse(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFalse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNotNull(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNotNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNull(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTrue(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTrue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotEqualTo(value: Boolean => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotEqualTo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

