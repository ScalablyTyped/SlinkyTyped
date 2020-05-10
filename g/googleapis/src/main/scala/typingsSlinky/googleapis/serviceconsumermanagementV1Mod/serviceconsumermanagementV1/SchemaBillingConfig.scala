package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the billing configuration for a new tenant project.
  */
@js.native
trait SchemaBillingConfig extends js.Object {
  /**
    * Name of the billing account. For example
    * `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String] = js.native
}

object SchemaBillingConfig {
  @scala.inline
  def apply(): SchemaBillingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingConfig]
  }
  @scala.inline
  implicit class SchemaBillingConfigOps[Self <: SchemaBillingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAccount")(js.undefined)
        ret
    }
  }
  
}

