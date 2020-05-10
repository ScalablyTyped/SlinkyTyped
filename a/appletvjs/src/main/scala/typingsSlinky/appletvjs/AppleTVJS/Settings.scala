package typingsSlinky.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /** Contains the language the device displays information in. */
  var language: String = js.native
  /** Contains the restriction information on the device. */
  var restrictions: Restrictions = js.native
  /** Contains the country code used by the store on this device. */
  var storefrontCountryCode: String = js.native
  /**
  		* Called when changes to a device’s restriction information changes.
  		*/
  def onRestrictionsChange(): Unit = js.native
}

object Settings {
  @scala.inline
  def apply(
    language: String,
    onRestrictionsChange: () => Unit,
    restrictions: Restrictions,
    storefrontCountryCode: String
  ): Settings = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], onRestrictionsChange = js.Any.fromFunction0(onRestrictionsChange), restrictions = restrictions.asInstanceOf[js.Any], storefrontCountryCode = storefrontCountryCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRestrictionsChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRestrictionsChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestrictions(value: Restrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorefrontCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storefrontCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

