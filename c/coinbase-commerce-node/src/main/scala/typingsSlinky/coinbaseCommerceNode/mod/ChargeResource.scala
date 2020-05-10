package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.AnonBlock
import typingsSlinky.coinbaseCommerceNode.AnonContext
import typingsSlinky.coinbaseCommerceNode.AnonId
import typingsSlinky.coinbaseCommerceNode.PartialRecordCryptoNamest
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.charge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Charge creation response.
  *
  * @link https://commerce.coinbase.com/docs/api/#charge-resource
  */
@js.native
trait ChargeResource extends BaseCharge {
  /**
    * Set of addresses associated with the charge.
    */
  var addresses: PartialRecordCryptoNamest = js.native
  /**
    * Associated checkout resource.
    */
  var checkout: js.UndefOr[AnonId] = js.native
  /**
    * User fiendly primary key.
    */
  var code: String = js.native
  /**
    * Charge confirmation time.
    */
  var confirmed_at: js.UndefOr[Timestamp] = js.native
  /**
    * Charge creation time.
    */
  var created_at: Timestamp = js.native
  /**
    * Charge expiration time.
    */
  var expires_at: Timestamp = js.native
  /**
    * Hosted charge URL.
    */
  var hosted_url: String = js.native
  /**
    * Charge UUID
    */
  var id: String = js.native
  /**
    * Charge image URL.
    */
  var logo_url: js.UndefOr[String] = js.native
  /**
    * Charge metadata provided by you, the developer.
    */
  @JSName("metadata")
  var metadata_ChargeResource: KeyVal = js.native
  /**
    * Array of charge payment objects.
    */
  var payments: js.Array[AnonBlock] = js.native
  /**
    * Charge price information object.
    */
  var pricing: Pricing = js.native
  /**
    * Resource name.
    */
  var resource: charge = js.native
  /**
    * Array of status update objects.
    */
  var timeline: js.Array[AnonContext] = js.native
}

object ChargeResource {
  @scala.inline
  def apply(
    addresses: PartialRecordCryptoNamest,
    code: String,
    created_at: Timestamp,
    description: String,
    expires_at: Timestamp,
    hosted_url: String,
    id: String,
    metadata: KeyVal,
    name: String,
    payments: js.Array[AnonBlock],
    pricing: Pricing,
    pricing_type: PricingType,
    resource: charge,
    timeline: js.Array[AnonContext]
  ): ChargeResource = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], hosted_url = hosted_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeResource]
  }
  @scala.inline
  implicit class ChargeResourceOps[Self <: ChargeResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: PartialRecordCryptoNamest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHosted_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: KeyVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayments(value: js.Array[AnonBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPricing(value: Pricing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: charge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: js.Array[AnonContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckout(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmed_at(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmed_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_url")(js.undefined)
        ret
    }
  }
  
}

