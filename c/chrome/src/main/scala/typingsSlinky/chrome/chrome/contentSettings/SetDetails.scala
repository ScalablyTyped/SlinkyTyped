package typingsSlinky.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDetails extends js.Object {
  /** The pattern for the primary URL. For details on the format of a pattern, see Content Setting Patterns. */
  var primaryPattern: String = js.native
  /** Optional. The resource identifier for the content type.  */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  /** Optional. Where to set the setting (default: regular).  */
  var scope: js.UndefOr[ScopeEnum] = js.native
  /** Optional. The pattern for the secondary URL. Defaults to matching all URLs. For details on the format of a pattern, see Content Setting Patterns.  */
  var secondaryPattern: js.UndefOr[String] = js.native
  /** The setting applied by this rule. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any = js.native
}

object SetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: js.Any): SetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDetails]
  }
  @scala.inline
  implicit class SetDetailsOps[Self <: SetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceIdentifier(value: ResourceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: ScopeEnum): Self = {
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
    @scala.inline
    def withSecondaryPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryPattern")(js.undefined)
        ret
    }
  }
  
}

