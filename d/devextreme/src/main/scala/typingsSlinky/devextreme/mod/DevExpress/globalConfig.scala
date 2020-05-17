package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.anon.CloseIcon
import typingsSlinky.devextreme.devextremeStrings.filled
import typingsSlinky.devextreme.devextremeStrings.outlined
import typingsSlinky.devextreme.devextremeStrings.underlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait globalConfig extends js.Object {
  /** @deprecated  */
  /** A decimal separator. No longer applies. */
  var decimalSeparator: js.UndefOr[String] = js.native
  /** The default currency. Accepts a 3-letter ISO 4217 code. */
  var defaultCurrency: js.UndefOr[String] = js.native
  /** Specifies how editors' text fields are styled in your application. */
  var editorStylingMode: js.UndefOr[outlined | underlined | filled] = js.native
  /** Configures a Floating Action Button (FAB) that emits a stack of related actions (speed dial). */
  var floatingActionButtonConfig: js.UndefOr[CloseIcon] = js.native
  /** Specifies whether dates are parsed and serialized according to the ISO 8601 standard in all browsers. */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.native
  /** Specifies whether to convert string values to lowercase in filter and search requests to OData services. Applies to the following operations: "startswith", "endswith", "contains", and "notcontains". */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.native
  /** Specifies whether the widgets support a right-to-left representation. Available for individual widgets as well. */
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  /** The decimal separator that is used when submitting a value to the server. */
  var serverDecimalSeparator: js.UndefOr[String] = js.native
  /** @deprecated  */
  /** A group separator. No longer applies. */
  var thousandsSeparator: js.UndefOr[String] = js.native
  var useLegacyStoreResult: js.UndefOr[Boolean] = js.native
  var useLegacyVisibleIndex: js.UndefOr[Boolean] = js.native
}

object globalConfig {
  @scala.inline
  def apply(): globalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[globalConfig]
  }
  @scala.inline
  implicit class globalConfigOps[Self <: globalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorStylingMode(value: outlined | underlined | filled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorStylingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorStylingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorStylingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingActionButtonConfig(value: CloseIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingActionButtonConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingActionButtonConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingActionButtonConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIsoDateParsing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIsoDateParsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIsoDateParsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIsoDateParsing")(js.undefined)
        ret
    }
    @scala.inline
    def withODataFilterToLower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oDataFilterToLower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutODataFilterToLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oDataFilterToLower")(js.undefined)
        ret
    }
    @scala.inline
    def withRtlEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtlEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverDecimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverDecimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLegacyStoreResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacyStoreResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLegacyStoreResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacyStoreResult")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLegacyVisibleIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacyVisibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLegacyVisibleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacyVisibleIndex")(js.undefined)
        ret
    }
  }
  
}

