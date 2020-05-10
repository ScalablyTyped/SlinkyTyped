package typingsSlinky.oracleOraclejet.ojmenuMod

import typingsSlinky.oracleOraclejet.AnonAriaFocusSkipLink
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenuSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean = js.native
  var openOptions: OpenOptions = js.native
  @JSName("translations")
  var translations_ojMenuSettableProperties: AnonAriaFocusSkipLink = js.native
}

object ojMenuSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, openOptions: OpenOptions, translations: AnonAriaFocusSkipLink): ojMenuSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSettableProperties]
  }
  @scala.inline
  implicit class ojMenuSettablePropertiesOps[Self <: ojMenuSettableProperties] (val x: Self) extends AnyVal {
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
    def withOpenOptions(value: OpenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonAriaFocusSkipLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

