package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /** The type of param can be either "purpose" or "pref". */
  var condition: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition] = js.native
  /** A url parameter name */
  var name: String = js.native
  /** The preference to retreive the value from. */
  var pref: js.UndefOr[String] = js.native
  /** The context that initiates a search, required if condition is "purpose". */
  var purpose: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose] = js.native
  /** A url parameter value. */
  var value: js.UndefOr[String] = js.native
}

object Condition {
  @scala.inline
  def apply(name: String): Condition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withPref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pref")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpose(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

