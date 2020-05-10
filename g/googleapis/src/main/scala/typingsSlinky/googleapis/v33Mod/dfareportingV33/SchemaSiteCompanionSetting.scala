package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Companion Settings
  */
@js.native
trait SchemaSiteCompanionSetting extends js.Object {
  /**
    * Whether companions are disabled for this site template.
    */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whitelist of companion sizes to be served via this site template. Set
    * this list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteCompanionSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSiteCompanionSetting {
  @scala.inline
  def apply(): SchemaSiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteCompanionSetting]
  }
  @scala.inline
  implicit class SchemaSiteCompanionSettingOps[Self <: SchemaSiteCompanionSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledSizes(value: js.Array[SchemaSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

