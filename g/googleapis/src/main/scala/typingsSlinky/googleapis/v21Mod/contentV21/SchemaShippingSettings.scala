package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The merchant account&#39;s shipping settings. All methods except
  * getsupportedcarriers and getsupportedholidays require the admin role.
  */
@js.native
trait SchemaShippingSettings extends js.Object {
  /**
    * The ID of the account to which these account shipping settings belong.
    * Ignored upon update, always present in get request responses.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of postal code groups that can be referred to in services.
    * Optional.
    */
  var postalCodeGroups: js.UndefOr[js.Array[SchemaPostalCodeGroup]] = js.native
  /**
    * The target account&#39;s list of services. Optional.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaShippingSettings {
  @scala.inline
  def apply(): SchemaShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingSettings]
  }
  @scala.inline
  implicit class SchemaShippingSettingsOps[Self <: SchemaShippingSettings] (val x: Self) extends AnyVal {
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
    def withPostalCodeGroups(value: js.Array[SchemaPostalCodeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[SchemaService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

