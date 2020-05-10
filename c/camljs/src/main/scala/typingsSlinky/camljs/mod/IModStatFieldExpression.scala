package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModStatFieldExpression extends js.Object {
  /** Checks whether the value of the field is Approved - same as ModStatId.EqualTo(0) */
  def IsApproved(): IExpression = js.native
  /** Checks whether the value of the field is Pending - same as ModStatId.EqualTo(2) */
  def IsPending(): IExpression = js.native
  /** Checks whether the value of the field is Rejected - same as ModStatId.EqualTo(1) */
  def IsRejected(): IExpression = js.native
  /** Represents moderation status ID. */
  def ModStatId(): INumberFieldExpression = js.native
  /** Represents moderation status as localized text. In most cases it is better to use ModStatId in the queries instead of ValueAsText. */
  def ValueAsText(): ITextFieldExpression = js.native
}

object IModStatFieldExpression {
  @scala.inline
  def apply(
    IsApproved: () => IExpression,
    IsPending: () => IExpression,
    IsRejected: () => IExpression,
    ModStatId: () => INumberFieldExpression,
    ValueAsText: () => ITextFieldExpression
  ): IModStatFieldExpression = {
    val __obj = js.Dynamic.literal(IsApproved = js.Any.fromFunction0(IsApproved), IsPending = js.Any.fromFunction0(IsPending), IsRejected = js.Any.fromFunction0(IsRejected), ModStatId = js.Any.fromFunction0(ModStatId), ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[IModStatFieldExpression]
  }
  @scala.inline
  implicit class IModStatFieldExpressionOps[Self <: IModStatFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsApproved(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsApproved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPending(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRejected(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRejected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModStatId(value: () => INumberFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModStatId")(js.Any.fromFunction0(value))
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

