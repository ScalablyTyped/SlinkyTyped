package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.anon.Block
import typingsSlinky.coinbaseCommerceNode.anon.Context
import typingsSlinky.coinbaseCommerceNode.anon.Id
import typingsSlinky.coinbaseCommerceNode.anon.PartialRecordCryptoNamest
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.charge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var checkout: js.UndefOr[Id] = js.native
  
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
  var payments: js.Array[Block] = js.native
  
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
  var timeline: js.Array[Context] = js.native
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
    payments: js.Array[Block],
    pricing: Pricing,
    pricing_type: PricingType,
    resource: charge,
    timeline: js.Array[Context]
  ): ChargeResource = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], hosted_url = hosted_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeResource]
  }
  
  @scala.inline
  implicit class ChargeResourceMutableBuilder[Self <: ChargeResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: PartialRecordCryptoNamest): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout(value: Id): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckoutUndefined: Self = StObject.set(x, "checkout", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmed_at(value: Timestamp): Self = StObject.set(x, "confirmed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmed_atUndefined: Self = StObject.set(x, "confirmed_at", js.undefined)
    
    @scala.inline
    def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: Timestamp): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHosted_url(value: String): Self = StObject.set(x, "hosted_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo_url(value: String): Self = StObject.set(x, "logo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo_urlUndefined: Self = StObject.set(x, "logo_url", js.undefined)
    
    @scala.inline
    def setMetadata(value: KeyVal): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayments(value: js.Array[Block]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentsVarargs(value: Block*): Self = StObject.set(x, "payments", js.Array(value :_*))
    
    @scala.inline
    def setPricing(value: Pricing): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: charge): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: js.Array[Context]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineVarargs(value: Context*): Self = StObject.set(x, "timeline", js.Array(value :_*))
  }
}
