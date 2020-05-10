package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Local Inventory ads (LIA) settings. All methods except listposdataproviders
  * require the admin role.
  */
@js.native
trait SchemaLiaSettings extends js.Object {
  /**
    * The ID of the account to which these LIA settings belong. Ignored upon
    * update, always present in get request responses.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The LIA settings for each country.
    */
  var countrySettings: js.UndefOr[js.Array[SchemaLiaCountrySettings]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liaSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaLiaSettings {
  @scala.inline
  def apply(): SchemaLiaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaSettings]
  }
  @scala.inline
  implicit class SchemaLiaSettingsOps[Self <: SchemaLiaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrySettings(value: js.Array[SchemaLiaCountrySettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countrySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countrySettings")(js.undefined)
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

