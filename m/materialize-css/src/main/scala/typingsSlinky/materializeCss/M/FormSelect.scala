package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSelect extends Component[FormSelectOptions] {
  /**
    * Instance of the dropdown plugin for this select
    */
  var dropdown: Dropdown = js.native
  /**
    * Dropdown UL element
    */
  var dropdownOptions: HTMLUListElement = js.native
  /**
    * Text input that shows current selected option
    */
  var input: HTMLInputElement = js.native
  /**
    * If this is a multiple select
    */
  var isMultiple: Boolean = js.native
  /**
    * The select wrapper element
    */
  var wrapper: Element = js.native
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[String] = js.native
}

object FormSelect {
  @scala.inline
  def apply(
    destroy: () => Unit,
    dropdown: Dropdown,
    dropdownOptions: HTMLUListElement,
    el: Element,
    getSelectedValues: () => js.Array[String],
    input: HTMLInputElement,
    isMultiple: Boolean,
    options: FormSelectOptions,
    wrapper: Element
  ): FormSelect = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), dropdown = dropdown.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], getSelectedValues = js.Any.fromFunction0(getSelectedValues), input = input.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelect]
  }
  @scala.inline
  implicit class FormSelectOps[Self <: FormSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropdown(value: Dropdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownOptions(value: HTMLUListElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSelectedValues(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInput(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

