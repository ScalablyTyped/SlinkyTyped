package typingsSlinky.jqueryFlagstrap.jQueryFlagStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagStrapOptions extends js.Object {
  /**
    * Default: "btn-md"
    * The bootstrap button size `class` for this drop down
    */
  var buttonSize: String = js.native
  /**
    * Default: "btn-default"
    * The bootstrap button type `class` for this drop down
    */
  var buttonType: String = js.native
  /**
    * Default: (all)
    * Only show specific countries
    * Example:
    * 
    * {"GB": "United Kingdom", "US": "United States"}
    * 
    * will only show the USA and UK.
    */
  var countries: js.UndefOr[js.Object] = js.native
  /**
    * Default: uniquely generated
    * the `id` attribute for the actual `select` input
    */
  var inputId: js.UndefOr[String] = js.native
  /**
    * Default: uniquely generated
    * the `name` attribute for the actual `select` input
    */
  var inputName: String = js.native
  /**
    * Default: "20px"
    * The `margin` between `flag` and `text label`
    */
  var labelMargin: String = js.native
  /**
    * Default: null
    * This callback gets called each time the select is changed. It receives two parameters, the new value, and the select element.
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* element */ js.Any, Unit]] = js.native
  /**
    * Default: {value: "", text: "Please select a country"}
    * Set the placeholder value and text. To disable the placeholder define as (boolean) false.
    */
  var placeholder: Boolean | FlagStrapPlaceholderOptions = js.native
  /**
    * Default: false
    * Scrollable or full height drop down
    */
  var scrollable: Boolean = js.native
  /**
    * Default: "250px"
    * `max-height` for the scrollable drop down
    */
  var scrollableHeight: js.UndefOr[String] = js.native
}

object FlagStrapOptions {
  @scala.inline
  def apply(
    buttonSize: String,
    buttonType: String,
    inputName: String,
    labelMargin: String,
    placeholder: Boolean | FlagStrapPlaceholderOptions,
    scrollable: Boolean
  ): FlagStrapOptions = {
    val __obj = js.Dynamic.literal(buttonSize = buttonSize.asInstanceOf[js.Any], buttonType = buttonType.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], labelMargin = labelMargin.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], scrollable = scrollable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagStrapOptions]
  }
  @scala.inline
  implicit class FlagStrapOptionsOps[Self <: FlagStrapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: Boolean | FlagStrapPlaceholderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountries(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* value */ js.Any, /* element */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableHeight")(js.undefined)
        ret
    }
  }
  
}

