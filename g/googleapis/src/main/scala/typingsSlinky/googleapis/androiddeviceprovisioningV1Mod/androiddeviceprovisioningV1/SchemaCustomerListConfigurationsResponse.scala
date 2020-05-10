package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s listing configuration.
  */
@js.native
trait SchemaCustomerListConfigurationsResponse extends js.Object {
  /**
    * The configurations.
    */
  var configurations: js.UndefOr[js.Array[SchemaConfiguration]] = js.native
}

object SchemaCustomerListConfigurationsResponse {
  @scala.inline
  def apply(): SchemaCustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListConfigurationsResponse]
  }
  @scala.inline
  implicit class SchemaCustomerListConfigurationsResponseOps[Self <: SchemaCustomerListConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurations(value: js.Array[SchemaConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(js.undefined)
        ret
    }
  }
  
}

