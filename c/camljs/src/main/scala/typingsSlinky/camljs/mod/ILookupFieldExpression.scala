package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILookupFieldExpression extends js.Object {
  /** Specifies that lookup id value will be used. */
  def Id(): INumberFieldExpression = js.native
  /** Specifies that lookup value will be used and this value is of type Boolean */
  def ValueAsBoolean(): IBooleanFieldExpression = js.native
  /** Specifies that lookup value will be used and this value is of type Date */
  def ValueAsDate(): IDateTimeFieldExpression = js.native
  /** Specifies that lookup value will be used and this value is of type DateTime */
  def ValueAsDateTime(): IDateTimeFieldExpression = js.native
  /** Specifies that lookup value will be used and this value is of type Number */
  def ValueAsNumber(): INumberFieldExpression = js.native
  /** Specifies that lookup value will be used and this value is of type Text */
  def ValueAsText(): ITextFieldExpression = js.native
}

object ILookupFieldExpression {
  @scala.inline
  def apply(
    Id: () => INumberFieldExpression,
    ValueAsBoolean: () => IBooleanFieldExpression,
    ValueAsDate: () => IDateTimeFieldExpression,
    ValueAsDateTime: () => IDateTimeFieldExpression,
    ValueAsNumber: () => INumberFieldExpression,
    ValueAsText: () => ITextFieldExpression
  ): ILookupFieldExpression = {
    val __obj = js.Dynamic.literal(Id = js.Any.fromFunction0(Id), ValueAsBoolean = js.Any.fromFunction0(ValueAsBoolean), ValueAsDate = js.Any.fromFunction0(ValueAsDate), ValueAsDateTime = js.Any.fromFunction0(ValueAsDateTime), ValueAsNumber = js.Any.fromFunction0(ValueAsNumber), ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[ILookupFieldExpression]
  }
  @scala.inline
  implicit class ILookupFieldExpressionOps[Self <: ILookupFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: () => INumberFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAsBoolean(value: () => IBooleanFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueAsBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAsDate(value: () => IDateTimeFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueAsDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAsDateTime(value: () => IDateTimeFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueAsDateTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAsNumber(value: () => INumberFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueAsNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueAsText(value: () => ITextFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueAsText")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

