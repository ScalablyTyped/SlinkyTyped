package typingsSlinky.chromeApps.chrome.accessibilityFeatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityFeaturesSetArg extends js.Object {
  /**
    * The scope of the ChromeSetting. One of
    * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
    * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
    */
  var scope: js.UndefOr[Scope] = js.native
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An extension should not set a value of a different type.
    */
  var value: js.Any = js.native
}

object AccessibilityFeaturesSetArg {
  @scala.inline
  def apply(value: js.Any): AccessibilityFeaturesSetArg = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityFeaturesSetArg]
  }
  @scala.inline
  implicit class AccessibilityFeaturesSetArgOps[Self <: AccessibilityFeaturesSetArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

