package typingsSlinky.braintreeWeb.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Data about Hosted Fields fields, sent in {@link HostedFields~stateObject|stateObjects}.
  * @property {HTMLElement} container Reference to the container DOM element on your page associated with the current event.
  * @property {boolean} isFocused Whether or not the input is currently focused.
  * @property {boolean} isEmpty Whether or not the user has entered a value in the input.
  * @property {boolean} isPotentiallyValid
  * A determination based on the future validity of the input value.
  * This is helpful when a user is entering a card number and types <code>"41"</code>.
  * While that value is not valid for submission, it is still possible for
  * it to become a fully qualified entry. However, if the user enters <code>"4x"</code>
  * it is clear that the card number can never become valid and isPotentiallyValid will
  * return false.
  * @property {boolean} isValid Whether or not the value of the associated input is <i>fully</i> qualified for submission.
  */
@js.native
trait HostedFieldsHostedFieldsFieldData extends js.Object {
  var container: HTMLElement = js.native
  var isEmpty: Boolean = js.native
  var isFocused: Boolean = js.native
  var isPotentiallyValid: Boolean = js.native
  var isValid: Boolean = js.native
}

object HostedFieldsHostedFieldsFieldData {
  @scala.inline
  def apply(
    container: HTMLElement,
    isEmpty: Boolean,
    isFocused: Boolean,
    isPotentiallyValid: Boolean,
    isValid: Boolean
  ): HostedFieldsHostedFieldsFieldData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsFieldData]
  }
  @scala.inline
  implicit class HostedFieldsHostedFieldsFieldDataOps[Self <: HostedFieldsHostedFieldsFieldData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPotentiallyValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPotentiallyValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

