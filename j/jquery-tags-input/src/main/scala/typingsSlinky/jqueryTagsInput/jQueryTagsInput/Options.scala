package typingsSlinky.jqueryTagsInput.jQueryTagsInput

import typingsSlinky.jqueryTagsInput.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Autocomplete options
    */
  var autocomplete: js.UndefOr[js.Object] = js.native
  /**
    * Url for autocomplete
    */
  var autocomplete_url: js.UndefOr[String] = js.native
  /**
    * Placeholder of field when tags is empty
    */
  var defaultText: js.UndefOr[String] = js.native
  /**
    * Delimiters on tags creation
    */
  var delimiter: js.UndefOr[js.Array[String] | String] = js.native
  /**
    * Height of tag
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Interactive tags
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * Max char length for tag
    */
  var maxChars: js.UndefOr[Double] = js.native
  /**
    * Minimun char length for tag
    */
  var minChars: js.UndefOr[Double] = js.native
  /**
    * Callback function on add tag
    */
  var onAddTag: js.UndefOr[js.Function1[/* addedValue */ String, Unit]] = js.native
  /**
    * Callback function on change list of tags
    */
  var onChange: js.UndefOr[js.Function2[/* element */ JQuery, /* changedValue */ String, Unit]] = js.native
  /**
    * Callback function on remove tag
    */
  var onRemoveTag: js.UndefOr[js.Function1[/* removedValue */ String, Unit]] = js.native
  /**
    * Placeholder color of tags
    */
  var placeholderColor: js.UndefOr[String] = js.native
  /**
    * Remove with tag backspace
    */
  var removeWithBackspace: js.UndefOr[Boolean] = js.native
  /**
    * Width of tag
    */
  var width: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete_url")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChars")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddTag(value: /* addedValue */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAddTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddTag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* element */ JQuery, /* changedValue */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveTag(value: /* removedValue */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveTag")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveWithBackspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWithBackspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveWithBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWithBackspace")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

