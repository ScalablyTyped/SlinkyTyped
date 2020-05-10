package typingsSlinky.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidationResult extends js.Object {
  var Children: js.Array[IValidationResult] = js.native
  var ErrorCount: Double = js.native
  var ErrorMessage: String = js.native
  var HasErrors: Boolean = js.native
  var HasErrorsDirty: Boolean = js.native
  var Name: String = js.native
  var Optional: js.UndefOr[IOptional] = js.native
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.native
  def Add(validationResult: IValidationResult): Unit = js.native
  def Remove(index: Double): Unit = js.native
}

object IValidationResult {
  @scala.inline
  def apply(
    Add: IValidationResult => Unit,
    Children: js.Array[IValidationResult],
    ErrorCount: Double,
    ErrorMessage: String,
    HasErrors: Boolean,
    HasErrorsDirty: Boolean,
    Name: String,
    Remove: Double => Unit
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Children = Children.asInstanceOf[js.Any], ErrorCount = ErrorCount.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasErrors = HasErrors.asInstanceOf[js.Any], HasErrorsDirty = HasErrorsDirty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IValidationResult]
  }
  @scala.inline
  implicit class IValidationResultOps[Self <: IValidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: IValidationResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[IValidationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasErrorsDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasErrorsDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptional(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Optional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Optional")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateArgs(value: js.Array[IErrorTranslateArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateArgs")(js.undefined)
        ret
    }
  }
  
}

