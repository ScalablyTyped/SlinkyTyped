package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPremisesConditionalAccessSettings extends Entity {
  // Indicates if on premises conditional access is enabled for this organization
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the
    * conditional access policy.
    */
  var excludedGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * User groups that will be targeted by on premises conditional access. All users in these groups will be required to have
    * mobile device managed and compliant for mail access.
    */
  var includedGroups: js.UndefOr[js.Array[String]] = js.native
  // Override the default access rule when allowing a device to ensure access is granted.
  var overrideDefaultRule: js.UndefOr[Boolean] = js.native
}

object OnPremisesConditionalAccessSettings {
  @scala.inline
  def apply(): OnPremisesConditionalAccessSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesConditionalAccessSettings]
  }
  @scala.inline
  implicit class OnPremisesConditionalAccessSettingsOps[Self <: OnPremisesConditionalAccessSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideDefaultRule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideDefaultRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideDefaultRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideDefaultRule")(js.undefined)
        ret
    }
  }
  
}

