package typingsSlinky.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base charge properties.
  */
@js.native
trait BaseCharge extends js.Object {
  /**
    * Redirect the user to this URL on cancel.
    */
  var cancel_url: js.UndefOr[String] = js.native
  /**
    * More detailed description of the charge.
    * 200 characters or less.
    */
  var description: String = js.native
  /**
    * Optional key value pairs for your own use.
    */
  var metadata: js.UndefOr[KeyVal] = js.native
  /**
    * Charge name.
    * 100 characters or less.
    */
  var name: String = js.native
  /**
    * Charge pricing type.
    */
  var pricing_type: PricingType = js.native
  /**
    * Redirect the user to this URL on completion.
    */
  var redirect_url: js.UndefOr[String] = js.native
}

object BaseCharge {
  @scala.inline
  def apply(description: String, name: String, pricing_type: PricingType): BaseCharge = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCharge]
  }
  @scala.inline
  implicit class BaseChargeOps[Self <: BaseCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPricing_type(value: PricingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: KeyVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_url")(js.undefined)
        ret
    }
  }
  
}

