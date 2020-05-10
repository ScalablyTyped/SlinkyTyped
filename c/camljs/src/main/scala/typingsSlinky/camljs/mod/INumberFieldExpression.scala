package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumberFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Double): IExpression = js.native
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: Double): IExpression = js.native
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: Double): IExpression = js.native
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[Double]): IExpression = js.native
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression = js.native
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression = js.native
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: Double): IExpression = js.native
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: Double): IExpression = js.native
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Double): IExpression = js.native
}

object INumberFieldExpression {
  @scala.inline
  def apply(
    EqualTo: Double => IExpression,
    GreaterThan: Double => IExpression,
    GreaterThanOrEqualTo: Double => IExpression,
    In: js.Array[Double] => IExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    LessThan: Double => IExpression,
    LessThanOrEqualTo: Double => IExpression,
    NotEqualTo: Double => IExpression
  ): INumberFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), GreaterThan = js.Any.fromFunction1(GreaterThan), GreaterThanOrEqualTo = js.Any.fromFunction1(GreaterThanOrEqualTo), In = js.Any.fromFunction1(In), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), LessThan = js.Any.fromFunction1(LessThan), LessThanOrEqualTo = js.Any.fromFunction1(LessThanOrEqualTo), NotEqualTo = js.Any.fromFunction1(NotEqualTo))
    __obj.asInstanceOf[INumberFieldExpression]
  }
  @scala.inline
  implicit class INumberFieldExpressionOps[Self <: INumberFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualTo(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGreaterThan(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGreaterThanOrEqualTo(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIn(value: js.Array[Double] => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("In")(js.Any.fromFunction1(value))
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
    def withLessThan(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLessThanOrEqualTo(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotEqualTo(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotEqualTo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

