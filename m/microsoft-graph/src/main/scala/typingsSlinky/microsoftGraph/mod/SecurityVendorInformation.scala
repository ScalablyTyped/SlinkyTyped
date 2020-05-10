package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityVendorInformation extends js.Object {
  // Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
  var provider: js.UndefOr[String] = js.native
  // Version of the provider or subprovider, if it exists, that generated the alert. Required
  var providerVersion: js.UndefOr[String] = js.native
  // Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
  var subProvider: js.UndefOr[String] = js.native
  // Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
  var vendor: js.UndefOr[String] = js.native
}

object SecurityVendorInformation {
  @scala.inline
  def apply(): SecurityVendorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityVendorInformation]
  }
  @scala.inline
  implicit class SecurityVendorInformationOps[Self <: SecurityVendorInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSubProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
  }
  
}

