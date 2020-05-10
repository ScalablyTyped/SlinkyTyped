package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedConcurrencyConfigsResponse extends js.Object {
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * A list of provisioned concurrency configurations.
    */
  var ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList] = js.native
}

object ListProvisionedConcurrencyConfigsResponse {
  @scala.inline
  def apply(): ListProvisionedConcurrencyConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedConcurrencyConfigsResponse]
  }
  @scala.inline
  implicit class ListProvisionedConcurrencyConfigsResponseOps[Self <: ListProvisionedConcurrencyConfigsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedConcurrencyConfigs(value: ProvisionedConcurrencyConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedConcurrencyConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedConcurrencyConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedConcurrencyConfigs")(js.undefined)
        ret
    }
  }
  
}

