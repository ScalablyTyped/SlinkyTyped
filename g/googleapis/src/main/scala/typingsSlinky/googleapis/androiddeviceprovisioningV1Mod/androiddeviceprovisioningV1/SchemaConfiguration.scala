package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration collects the provisioning options for Android devices. Each
  * configuration combines the following:  * The EMM device policy controller
  * (DPC) installed on the devices. * EMM policies enforced on the devices. *
  * Metadata displayed on the device to help users during setup.  Customers can
  * add as many configurations as they need. However, zero-touch enrollment
  * works best when a customer sets a default configuration that&#39;s applied
  * to any new devices the organization purchases.
  */
@js.native
trait SchemaConfiguration extends js.Object {
  /**
    * Required. The name of the organization. Zero-touch enrollment shows this
    * organization name to device users during device provisioning.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Output only. The ID of the configuration. Assigned by the server.
    */
  var configurationId: js.UndefOr[String] = js.native
  /**
    * Required. A short name that describes the configuration&#39;s purpose.
    * For example, _Sales team_ or _Temporary employees_. The zero-touch
    * enrollment portal displays this name to IT admins.
    */
  var configurationName: js.UndefOr[String] = js.native
  /**
    * Required. The email address that device users can contact to get help.
    * Zero-touch enrollment shows this email address to device users before
    * device provisioning. The value is validated on input.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * Required. The telephone number that device users can call, using another
    * device, to get help. Zero-touch enrollment shows this number to device
    * users before device provisioning. Accepts numerals, spaces, the plus
    * sign, hyphens, and parentheses.
    */
  var contactPhone: js.UndefOr[String] = js.native
  /**
    * A message, containing one or two sentences, to help device users get help
    * or give them more details about what’s happening to their device.
    * Zero-touch enrollment shows this message before the device is
    * provisioned.
    */
  var customMessage: js.UndefOr[String] = js.native
  /**
    * The JSON-formatted EMM provisioning extras that are passed to the DPC.
    */
  var dpcExtras: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the selected DPC (device policy
    * controller) in the format `customers/[CUSTOMER_ID]/dpcs/x. To list the
    * supported DPCs, call `customers.dpcs.list`.
    */
  var dpcResourcePath: js.UndefOr[String] = js.native
  /**
    * Required. Whether this is the default configuration that zero-touch
    * enrollment applies to any new devices the organization purchases in the
    * future. Only one customer configuration can be the default. Setting this
    * value to `true`, changes the previous default configuration&#39;s
    * `isDefault` value to `false`.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The API resource name in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by
    * the server.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaConfiguration {
  @scala.inline
  def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  @scala.inline
  implicit class SchemaConfigurationOps[Self <: SchemaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withContactEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withContactPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPhone")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDpcExtras(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpcExtras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpcExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpcExtras")(js.undefined)
        ret
    }
    @scala.inline
    def withDpcResourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpcResourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpcResourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpcResourcePath")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

