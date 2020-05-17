package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete extends js.Object {
  var autocomplete: String = js.native
  var lang: Cancel = js.native
  var onCancel: js.Any = js.native
  var onChange: js.Any = js.native
  var onClear: js.Any = js.native
  var onSubmit: js.Any = js.native
  var placeholder: String = js.native
  var searchName: String = js.native
}

object Autocomplete {
  @scala.inline
  def apply(
    autocomplete: String,
    lang: Cancel,
    onCancel: js.Any,
    onChange: js.Any,
    onClear: js.Any,
    onSubmit: js.Any,
    placeholder: String,
    searchName: String
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClear = onClear.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], searchName = searchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autocomplete]
  }
  @scala.inline
  implicit class AutocompleteOps[Self <: Autocomplete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: Cancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClear(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSubmit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

