package typingsSlinky.dojo.dojox.form.FormSelectWidget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/_FormSelectWidget.__SelectOption.html
  *
  *
  */
@js.native
trait SelectOption extends js.Object {
  /**
    * Whether or not this specific option is disabled
    *
    */
  var disabled: Boolean = js.native
  /**
    * The label for our option.  It can contain html tags.
    *
    */
  var label: String = js.native
  /**
    * Whether or not we are a selected option
    *
    */
  var selected: Boolean = js.native
  /**
    * The value of the option.  Setting to empty (or missing) will
    * place a separator at that location
    *
    */
  var value: String = js.native
}

object SelectOption {
  @scala.inline
  def apply(disabled: Boolean, label: String, selected: Boolean, value: String): SelectOption = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOption]
  }
  @scala.inline
  implicit class SelectOptionOps[Self <: SelectOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

