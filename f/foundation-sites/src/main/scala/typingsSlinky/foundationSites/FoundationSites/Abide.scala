package typingsSlinky.foundationSites.FoundationSites

import typingsSlinky.foundationSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/abide.html#javascript-reference
@js.native
trait Abide extends js.Object {
  def addErrorClasses(element: JQuery): Unit = js.native
  def destroy(): Unit = js.native
  def findFormError(element: JQuery): JQuery = js.native
  def findLabel(element: JQuery): Boolean = js.native
  def matchValidation(element: JQuery, validators: String, required: Boolean): Boolean = js.native
  def removeErrorClasses(element: JQuery): Unit = js.native
  def removeRadioErrorClasses(groupName: String): Unit = js.native
  def requiredChecked(element: JQuery): Boolean = js.native
  def resetForm(): Unit = js.native
  def validateForm(): Boolean = js.native
  def validateInput(element: JQuery): Boolean = js.native
  def validateRadio(groupName: String): Boolean = js.native
  def validateText(element: JQuery, pattern: String): Boolean = js.native
}

object Abide {
  @scala.inline
  def apply(
    addErrorClasses: JQuery => Unit,
    destroy: () => Unit,
    findFormError: JQuery => JQuery,
    findLabel: JQuery => Boolean,
    matchValidation: (JQuery, String, Boolean) => Boolean,
    removeErrorClasses: JQuery => Unit,
    removeRadioErrorClasses: String => Unit,
    requiredChecked: JQuery => Boolean,
    resetForm: () => Unit,
    validateForm: () => Boolean,
    validateInput: JQuery => Boolean,
    validateRadio: String => Boolean,
    validateText: (JQuery, String) => Boolean
  ): Abide = {
    val __obj = js.Dynamic.literal(addErrorClasses = js.Any.fromFunction1(addErrorClasses), destroy = js.Any.fromFunction0(destroy), findFormError = js.Any.fromFunction1(findFormError), findLabel = js.Any.fromFunction1(findLabel), matchValidation = js.Any.fromFunction3(matchValidation), removeErrorClasses = js.Any.fromFunction1(removeErrorClasses), removeRadioErrorClasses = js.Any.fromFunction1(removeRadioErrorClasses), requiredChecked = js.Any.fromFunction1(requiredChecked), resetForm = js.Any.fromFunction0(resetForm), validateForm = js.Any.fromFunction0(validateForm), validateInput = js.Any.fromFunction1(validateInput), validateRadio = js.Any.fromFunction1(validateRadio), validateText = js.Any.fromFunction2(validateText))
    __obj.asInstanceOf[Abide]
  }
  @scala.inline
  implicit class AbideOps[Self <: Abide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddErrorClasses(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addErrorClasses")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindFormError(value: JQuery => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findFormError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindLabel(value: JQuery => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatchValidation(value: (JQuery, String, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchValidation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveErrorClasses(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeErrorClasses")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveRadioErrorClasses(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRadioErrorClasses")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequiredChecked(value: JQuery => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetForm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidateForm(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidateInput(value: JQuery => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateRadio(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRadio")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateText(value: (JQuery, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateText")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

