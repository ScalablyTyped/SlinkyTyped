package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends StObject {
  
  /** A boolean exposing the active status of the shipping service. Required. */
  var active: js.UndefOr[Boolean] = js.native
  
  /** The CLDR code of the currency to which this service applies. Must match that of the prices in rate groups. */
  var currency: js.UndefOr[String] = js.native
  
  /** The CLDR territory code of the country to which the service applies. Required. */
  var deliveryCountry: js.UndefOr[String] = js.native
  
  /** Time spent in various aspects from order to the delivery of the product. Required. */
  var deliveryTime: js.UndefOr[DeliveryTime] = js.native
  
  /** Eligibility for this service. Acceptable values are: - "`All scenarios`" - "`All scenarios except Shopping Actions`" - "`Shopping Actions`" */
  var eligibility: js.UndefOr[String] = js.native
  
  /**
    * Minimum order value for this service. If set, indicates that customers will have to spend at least this amount. All prices within a service must have the same currency. Cannot be
    * set together with minimum_order_value_table.
    */
  var minimumOrderValue: js.UndefOr[Price] = js.native
  
  /** Table of per store minimum order values for the pickup fulfillment type. Cannot be set together with minimum_order_value. */
  var minimumOrderValueTable: js.UndefOr[MinimumOrderValueTable] = js.native
  
  /** Free-form name of the service. Must be unique within target account. Required. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The carrier-service pair delivering items to collection points. The list of supported pickup services can be retrieved via the `getSupportedPickupServices` method. Required if and
    * only if the service delivery type is `pickup`.
    */
  var pickupService: js.UndefOr[PickupCarrierService] = js.native
  
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an empty `applicableShippingLabels`, which means "everything else". The other `applicableShippingLabels` must
    * not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[RateGroup]] = js.native
  
  /** Type of locations this service ships orders to. Acceptable values are: - "`delivery`" - "`pickup`" */
  var shipmentType: js.UndefOr[String] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDeliveryCountry(value: String): Self = StObject.set(x, "deliveryCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryCountryUndefined: Self = StObject.set(x, "deliveryCountry", js.undefined)
    
    @scala.inline
    def setDeliveryTime(value: DeliveryTime): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
    
    @scala.inline
    def setEligibility(value: String): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    @scala.inline
    def setMinimumOrderValue(value: Price): Self = StObject.set(x, "minimumOrderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumOrderValueTable(value: MinimumOrderValueTable): Self = StObject.set(x, "minimumOrderValueTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumOrderValueTableUndefined: Self = StObject.set(x, "minimumOrderValueTable", js.undefined)
    
    @scala.inline
    def setMinimumOrderValueUndefined: Self = StObject.set(x, "minimumOrderValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPickupService(value: PickupCarrierService): Self = StObject.set(x, "pickupService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupServiceUndefined: Self = StObject.set(x, "pickupService", js.undefined)
    
    @scala.inline
    def setRateGroups(value: js.Array[RateGroup]): Self = StObject.set(x, "rateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateGroupsUndefined: Self = StObject.set(x, "rateGroups", js.undefined)
    
    @scala.inline
    def setRateGroupsVarargs(value: RateGroup*): Self = StObject.set(x, "rateGroups", js.Array(value :_*))
    
    @scala.inline
    def setShipmentType(value: String): Self = StObject.set(x, "shipmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentTypeUndefined: Self = StObject.set(x, "shipmentType", js.undefined)
  }
}
