package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILookupMultiFieldExpression extends js.Object {
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: js.Any): IExpression = js.native
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: js.Any): IExpression = js.native
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): ILookupFieldExpression = js.native
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression = js.native
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression = js.native
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: js.Any): IExpression = js.native
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: js.Any): IExpression = js.native
}

object ILookupMultiFieldExpression {
  @scala.inline
  def apply(
    EqualTo: js.Any => IExpression,
    Includes: js.Any => IExpression,
    IncludesSuchItemThat: () => ILookupFieldExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    NotEqualTo: js.Any => IExpression,
    NotIncludes: js.Any => IExpression
  ): ILookupMultiFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), Includes = js.Any.fromFunction1(Includes), IncludesSuchItemThat = js.Any.fromFunction0(IncludesSuchItemThat), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), NotEqualTo = js.Any.fromFunction1(NotEqualTo), NotIncludes = js.Any.fromFunction1(NotIncludes))
    __obj.asInstanceOf[ILookupMultiFieldExpression]
  }
  @scala.inline
  implicit class ILookupMultiFieldExpressionOps[Self <: ILookupMultiFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualTo(value: js.Any => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludes(value: js.Any => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludesSuchItemThat(value: () => ILookupFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludesSuchItemThat")(js.Any.fromFunction0(value))
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
    def withNotEqualTo(value: js.Any => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotEqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotIncludes(value: js.Any => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotIncludes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

