package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPremisesProvisioningError extends js.Object {
  /**
    * Category of the provisioning error. Note: Currently, there is only one possible value. Possible value: PropertyConflict
    * - indicates a property value is not unique. Other objects contain the same value for the property.
    */
  var category: js.UndefOr[String] = js.native
  // The date and time at which the error occurred.
  var occurredDateTime: js.UndefOr[String] = js.native
  // Name of the directory property causing the error. Current possible values: UserPrincipalName or ProxyAddress
  var propertyCausingError: js.UndefOr[String] = js.native
  // Value of the property causing the error.
  var value: js.UndefOr[String] = js.native
}

object OnPremisesProvisioningError {
  @scala.inline
  def apply(): OnPremisesProvisioningError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesProvisioningError]
  }
  @scala.inline
  implicit class OnPremisesProvisioningErrorOps[Self <: OnPremisesProvisioningError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurredDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurredDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurredDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurredDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyCausingError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyCausingError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyCausingError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyCausingError")(js.undefined)
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

