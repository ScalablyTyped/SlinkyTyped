package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.AccountsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.AccountstatusesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.AccounttaxCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.DatafeedsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.DatafeedstatusesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.InventoryCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.LiasettingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.OrderinvoicesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.OrderpaymentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.OrderreportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.OrderreturnsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.OrdersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.PosCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.ProductsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.ProductstatusesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection.ShippingsettingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Account
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountAddress
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountAdwordsLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountBusinessInformation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountCustomerService
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountGoogleMyBusinessLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountTax
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountTaxTaxRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountUser
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountYouTubeChannelLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequestEntryLinkRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsLinkRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Amount
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.CarrierRate
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.CustomAttribute
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.CustomGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.CutoffTime
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Datafeed
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedFetchSchedule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedFormat
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedTarget
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedsCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedsCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.DeliveryTime
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Error
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Headers
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.HolidayCutoff
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Installment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Inventory
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryPickup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.InventorySetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.InvoiceSummary
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.InvoiceSummaryAdditionalChargeSummary
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiaAboutPageSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiaCountrySettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiaInventorySettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiaOnDisplayToOrderSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiaPosDataProvider
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiaSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LocationIdSet
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.LoyaltyPoints
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLegacyPromotion
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLegacyPromotionBenefit
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemProductVariantAttribute
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemReturnInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemShippingDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemShippingDetailsMethod
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderMerchantProvidedAnnotation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderShipmentLineItemShipment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersAcknowledgeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCancelLineItemRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCancelRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCancelTestOrderByCustomerRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCreateTestOrderRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCreateTestReturnRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryCancel
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryCancelLineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryCreateTestReturnReturnItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryInStoreRefundLineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryRefund
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryRejectReturnLineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryReturnLineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryReturnRefundLineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntrySetLineItemMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryShipLineItems
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryUpdateShipment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersInStoreRefundLineItemRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersRefundRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersRejectReturnLineItemRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersReturnLineItemRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersReturnRefundLineItemRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersSetLineItemMetadataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersShipLineItemsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersUpdateLineItemShippingDetailsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersUpdateMerchantOrderIdRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersUpdateShipmentRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosInventory
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosInventoryRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosSale
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosSaleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PosStore
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PostalCodeGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.PostalCodeRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Price
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Product
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductAspect
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductDestination
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductShipping
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductShippingDimension
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductShippingWeight
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductTax
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductUnitPricingBaseMeasure
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductUnitPricingMeasure
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductsCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductsCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Promotion
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.RateGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Row
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Service
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ShipmentInvoice
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ShipmentInvoiceLineItemInvoice
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ShippingSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ShippingsettingsCustomBatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.ShippingsettingsCustomBatchRequestEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Table
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrder
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderCustomer
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderCustomerMarketingRightsInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderLineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderLineItemProduct
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderPaymentMethod
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TransitTable
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TransitTableTransitTimeRow
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.TransitTableTransitTimeRowTransitTimeValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.UnitInvoice
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.UnitInvoiceAdditionalCharge
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.UnitInvoiceTaxLine
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Value
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var Accountstatuses: js.UndefOr[AccountstatusesCollection] = js.native
  var Accounttax: js.UndefOr[AccounttaxCollection] = js.native
  var Datafeeds: js.UndefOr[DatafeedsCollection] = js.native
  var Datafeedstatuses: js.UndefOr[DatafeedstatusesCollection] = js.native
  var Inventory: js.UndefOr[InventoryCollection] = js.native
  var Liasettings: js.UndefOr[LiasettingsCollection] = js.native
  var Orderinvoices: js.UndefOr[OrderinvoicesCollection] = js.native
  var Orderpayments: js.UndefOr[OrderpaymentsCollection] = js.native
  var Orderreports: js.UndefOr[OrderreportsCollection] = js.native
  var Orderreturns: js.UndefOr[OrderreturnsCollection] = js.native
  var Orders: js.UndefOr[OrdersCollection] = js.native
  var Pos: js.UndefOr[PosCollection] = js.native
  var Products: js.UndefOr[ProductsCollection] = js.native
  var Productstatuses: js.UndefOr[ProductstatusesCollection] = js.native
  var Shippingsettings: js.UndefOr[ShippingsettingsCollection] = js.native
  // Create a new instance of Account
  def newAccount(): Account = js.native
  // Create a new instance of AccountAddress
  def newAccountAddress(): AccountAddress = js.native
  // Create a new instance of AccountAdwordsLink
  def newAccountAdwordsLink(): AccountAdwordsLink = js.native
  // Create a new instance of AccountBusinessInformation
  def newAccountBusinessInformation(): AccountBusinessInformation = js.native
  // Create a new instance of AccountCustomerService
  def newAccountCustomerService(): AccountCustomerService = js.native
  // Create a new instance of AccountGoogleMyBusinessLink
  def newAccountGoogleMyBusinessLink(): AccountGoogleMyBusinessLink = js.native
  // Create a new instance of AccountTax
  def newAccountTax(): AccountTax = js.native
  // Create a new instance of AccountTaxTaxRule
  def newAccountTaxTaxRule(): AccountTaxTaxRule = js.native
  // Create a new instance of AccountUser
  def newAccountUser(): AccountUser = js.native
  // Create a new instance of AccountYouTubeChannelLink
  def newAccountYouTubeChannelLink(): AccountYouTubeChannelLink = js.native
  // Create a new instance of AccountsCustomBatchRequest
  def newAccountsCustomBatchRequest(): AccountsCustomBatchRequest = js.native
  // Create a new instance of AccountsCustomBatchRequestEntry
  def newAccountsCustomBatchRequestEntry(): AccountsCustomBatchRequestEntry = js.native
  // Create a new instance of AccountsCustomBatchRequestEntryLinkRequest
  def newAccountsCustomBatchRequestEntryLinkRequest(): AccountsCustomBatchRequestEntryLinkRequest = js.native
  // Create a new instance of AccountsLinkRequest
  def newAccountsLinkRequest(): AccountsLinkRequest = js.native
  // Create a new instance of AccountstatusesCustomBatchRequest
  def newAccountstatusesCustomBatchRequest(): AccountstatusesCustomBatchRequest = js.native
  // Create a new instance of AccountstatusesCustomBatchRequestEntry
  def newAccountstatusesCustomBatchRequestEntry(): AccountstatusesCustomBatchRequestEntry = js.native
  // Create a new instance of AccounttaxCustomBatchRequest
  def newAccounttaxCustomBatchRequest(): AccounttaxCustomBatchRequest = js.native
  // Create a new instance of AccounttaxCustomBatchRequestEntry
  def newAccounttaxCustomBatchRequestEntry(): AccounttaxCustomBatchRequestEntry = js.native
  // Create a new instance of Amount
  def newAmount(): Amount = js.native
  // Create a new instance of CarrierRate
  def newCarrierRate(): CarrierRate = js.native
  // Create a new instance of CustomAttribute
  def newCustomAttribute(): CustomAttribute = js.native
  // Create a new instance of CustomGroup
  def newCustomGroup(): CustomGroup = js.native
  // Create a new instance of CutoffTime
  def newCutoffTime(): CutoffTime = js.native
  // Create a new instance of Datafeed
  def newDatafeed(): Datafeed = js.native
  // Create a new instance of DatafeedFetchSchedule
  def newDatafeedFetchSchedule(): DatafeedFetchSchedule = js.native
  // Create a new instance of DatafeedFormat
  def newDatafeedFormat(): DatafeedFormat = js.native
  // Create a new instance of DatafeedTarget
  def newDatafeedTarget(): DatafeedTarget = js.native
  // Create a new instance of DatafeedsCustomBatchRequest
  def newDatafeedsCustomBatchRequest(): DatafeedsCustomBatchRequest = js.native
  // Create a new instance of DatafeedsCustomBatchRequestEntry
  def newDatafeedsCustomBatchRequestEntry(): DatafeedsCustomBatchRequestEntry = js.native
  // Create a new instance of DatafeedstatusesCustomBatchRequest
  def newDatafeedstatusesCustomBatchRequest(): DatafeedstatusesCustomBatchRequest = js.native
  // Create a new instance of DatafeedstatusesCustomBatchRequestEntry
  def newDatafeedstatusesCustomBatchRequestEntry(): DatafeedstatusesCustomBatchRequestEntry = js.native
  // Create a new instance of DeliveryTime
  def newDeliveryTime(): DeliveryTime = js.native
  // Create a new instance of Error
  def newError(): Error = js.native
  // Create a new instance of Headers
  def newHeaders(): Headers = js.native
  // Create a new instance of HolidayCutoff
  def newHolidayCutoff(): HolidayCutoff = js.native
  // Create a new instance of Installment
  def newInstallment(): Installment = js.native
  // Create a new instance of Inventory
  def newInventory(): Inventory = js.native
  // Create a new instance of InventoryCustomBatchRequest
  def newInventoryCustomBatchRequest(): InventoryCustomBatchRequest = js.native
  // Create a new instance of InventoryCustomBatchRequestEntry
  def newInventoryCustomBatchRequestEntry(): InventoryCustomBatchRequestEntry = js.native
  // Create a new instance of InventoryPickup
  def newInventoryPickup(): InventoryPickup = js.native
  // Create a new instance of InventorySetRequest
  def newInventorySetRequest(): InventorySetRequest = js.native
  // Create a new instance of InvoiceSummary
  def newInvoiceSummary(): InvoiceSummary = js.native
  // Create a new instance of InvoiceSummaryAdditionalChargeSummary
  def newInvoiceSummaryAdditionalChargeSummary(): InvoiceSummaryAdditionalChargeSummary = js.native
  // Create a new instance of LiaAboutPageSettings
  def newLiaAboutPageSettings(): LiaAboutPageSettings = js.native
  // Create a new instance of LiaCountrySettings
  def newLiaCountrySettings(): LiaCountrySettings = js.native
  // Create a new instance of LiaInventorySettings
  def newLiaInventorySettings(): LiaInventorySettings = js.native
  // Create a new instance of LiaOnDisplayToOrderSettings
  def newLiaOnDisplayToOrderSettings(): LiaOnDisplayToOrderSettings = js.native
  // Create a new instance of LiaPosDataProvider
  def newLiaPosDataProvider(): LiaPosDataProvider = js.native
  // Create a new instance of LiaSettings
  def newLiaSettings(): LiaSettings = js.native
  // Create a new instance of LiasettingsCustomBatchRequest
  def newLiasettingsCustomBatchRequest(): LiasettingsCustomBatchRequest = js.native
  // Create a new instance of LiasettingsCustomBatchRequestEntry
  def newLiasettingsCustomBatchRequestEntry(): LiasettingsCustomBatchRequestEntry = js.native
  // Create a new instance of LocationIdSet
  def newLocationIdSet(): LocationIdSet = js.native
  // Create a new instance of LoyaltyPoints
  def newLoyaltyPoints(): LoyaltyPoints = js.native
  // Create a new instance of OrderLegacyPromotion
  def newOrderLegacyPromotion(): OrderLegacyPromotion = js.native
  // Create a new instance of OrderLegacyPromotionBenefit
  def newOrderLegacyPromotionBenefit(): OrderLegacyPromotionBenefit = js.native
  // Create a new instance of OrderLineItemProductVariantAttribute
  def newOrderLineItemProductVariantAttribute(): OrderLineItemProductVariantAttribute = js.native
  // Create a new instance of OrderLineItemReturnInfo
  def newOrderLineItemReturnInfo(): OrderLineItemReturnInfo = js.native
  // Create a new instance of OrderLineItemShippingDetails
  def newOrderLineItemShippingDetails(): OrderLineItemShippingDetails = js.native
  // Create a new instance of OrderLineItemShippingDetailsMethod
  def newOrderLineItemShippingDetailsMethod(): OrderLineItemShippingDetailsMethod = js.native
  // Create a new instance of OrderMerchantProvidedAnnotation
  def newOrderMerchantProvidedAnnotation(): OrderMerchantProvidedAnnotation = js.native
  // Create a new instance of OrderShipmentLineItemShipment
  def newOrderShipmentLineItemShipment(): OrderShipmentLineItemShipment = js.native
  // Create a new instance of OrderinvoicesCreateChargeInvoiceRequest
  def newOrderinvoicesCreateChargeInvoiceRequest(): OrderinvoicesCreateChargeInvoiceRequest = js.native
  // Create a new instance of OrderinvoicesCreateRefundInvoiceRequest
  def newOrderinvoicesCreateRefundInvoiceRequest(): OrderinvoicesCreateRefundInvoiceRequest = js.native
  // Create a new instance of OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption
  def newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = js.native
  // Create a new instance of OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption
  def newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = js.native
  // Create a new instance of OrderpaymentsNotifyAuthApprovedRequest
  def newOrderpaymentsNotifyAuthApprovedRequest(): OrderpaymentsNotifyAuthApprovedRequest = js.native
  // Create a new instance of OrderpaymentsNotifyAuthDeclinedRequest
  def newOrderpaymentsNotifyAuthDeclinedRequest(): OrderpaymentsNotifyAuthDeclinedRequest = js.native
  // Create a new instance of OrderpaymentsNotifyChargeRequest
  def newOrderpaymentsNotifyChargeRequest(): OrderpaymentsNotifyChargeRequest = js.native
  // Create a new instance of OrderpaymentsNotifyRefundRequest
  def newOrderpaymentsNotifyRefundRequest(): OrderpaymentsNotifyRefundRequest = js.native
  // Create a new instance of OrdersAcknowledgeRequest
  def newOrdersAcknowledgeRequest(): OrdersAcknowledgeRequest = js.native
  // Create a new instance of OrdersCancelLineItemRequest
  def newOrdersCancelLineItemRequest(): OrdersCancelLineItemRequest = js.native
  // Create a new instance of OrdersCancelRequest
  def newOrdersCancelRequest(): OrdersCancelRequest = js.native
  // Create a new instance of OrdersCancelTestOrderByCustomerRequest
  def newOrdersCancelTestOrderByCustomerRequest(): OrdersCancelTestOrderByCustomerRequest = js.native
  // Create a new instance of OrdersCreateTestOrderRequest
  def newOrdersCreateTestOrderRequest(): OrdersCreateTestOrderRequest = js.native
  // Create a new instance of OrdersCreateTestReturnRequest
  def newOrdersCreateTestReturnRequest(): OrdersCreateTestReturnRequest = js.native
  // Create a new instance of OrdersCustomBatchRequest
  def newOrdersCustomBatchRequest(): OrdersCustomBatchRequest = js.native
  // Create a new instance of OrdersCustomBatchRequestEntry
  def newOrdersCustomBatchRequestEntry(): OrdersCustomBatchRequestEntry = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryCancel
  def newOrdersCustomBatchRequestEntryCancel(): OrdersCustomBatchRequestEntryCancel = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryCancelLineItem
  def newOrdersCustomBatchRequestEntryCancelLineItem(): OrdersCustomBatchRequestEntryCancelLineItem = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryCreateTestReturnReturnItem
  def newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem(): OrdersCustomBatchRequestEntryCreateTestReturnReturnItem = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryInStoreRefundLineItem
  def newOrdersCustomBatchRequestEntryInStoreRefundLineItem(): OrdersCustomBatchRequestEntryInStoreRefundLineItem = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryRefund
  def newOrdersCustomBatchRequestEntryRefund(): OrdersCustomBatchRequestEntryRefund = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryRejectReturnLineItem
  def newOrdersCustomBatchRequestEntryRejectReturnLineItem(): OrdersCustomBatchRequestEntryRejectReturnLineItem = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryReturnLineItem
  def newOrdersCustomBatchRequestEntryReturnLineItem(): OrdersCustomBatchRequestEntryReturnLineItem = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryReturnRefundLineItem
  def newOrdersCustomBatchRequestEntryReturnRefundLineItem(): OrdersCustomBatchRequestEntryReturnRefundLineItem = js.native
  // Create a new instance of OrdersCustomBatchRequestEntrySetLineItemMetadata
  def newOrdersCustomBatchRequestEntrySetLineItemMetadata(): OrdersCustomBatchRequestEntrySetLineItemMetadata = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryShipLineItems
  def newOrdersCustomBatchRequestEntryShipLineItems(): OrdersCustomBatchRequestEntryShipLineItems = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo
  def newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo(): OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails
  def newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails(): OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = js.native
  // Create a new instance of OrdersCustomBatchRequestEntryUpdateShipment
  def newOrdersCustomBatchRequestEntryUpdateShipment(): OrdersCustomBatchRequestEntryUpdateShipment = js.native
  // Create a new instance of OrdersInStoreRefundLineItemRequest
  def newOrdersInStoreRefundLineItemRequest(): OrdersInStoreRefundLineItemRequest = js.native
  // Create a new instance of OrdersRefundRequest
  def newOrdersRefundRequest(): OrdersRefundRequest = js.native
  // Create a new instance of OrdersRejectReturnLineItemRequest
  def newOrdersRejectReturnLineItemRequest(): OrdersRejectReturnLineItemRequest = js.native
  // Create a new instance of OrdersReturnLineItemRequest
  def newOrdersReturnLineItemRequest(): OrdersReturnLineItemRequest = js.native
  // Create a new instance of OrdersReturnRefundLineItemRequest
  def newOrdersReturnRefundLineItemRequest(): OrdersReturnRefundLineItemRequest = js.native
  // Create a new instance of OrdersSetLineItemMetadataRequest
  def newOrdersSetLineItemMetadataRequest(): OrdersSetLineItemMetadataRequest = js.native
  // Create a new instance of OrdersShipLineItemsRequest
  def newOrdersShipLineItemsRequest(): OrdersShipLineItemsRequest = js.native
  // Create a new instance of OrdersUpdateLineItemShippingDetailsRequest
  def newOrdersUpdateLineItemShippingDetailsRequest(): OrdersUpdateLineItemShippingDetailsRequest = js.native
  // Create a new instance of OrdersUpdateMerchantOrderIdRequest
  def newOrdersUpdateMerchantOrderIdRequest(): OrdersUpdateMerchantOrderIdRequest = js.native
  // Create a new instance of OrdersUpdateShipmentRequest
  def newOrdersUpdateShipmentRequest(): OrdersUpdateShipmentRequest = js.native
  // Create a new instance of PosCustomBatchRequest
  def newPosCustomBatchRequest(): PosCustomBatchRequest = js.native
  // Create a new instance of PosCustomBatchRequestEntry
  def newPosCustomBatchRequestEntry(): PosCustomBatchRequestEntry = js.native
  // Create a new instance of PosInventory
  def newPosInventory(): PosInventory = js.native
  // Create a new instance of PosInventoryRequest
  def newPosInventoryRequest(): PosInventoryRequest = js.native
  // Create a new instance of PosSale
  def newPosSale(): PosSale = js.native
  // Create a new instance of PosSaleRequest
  def newPosSaleRequest(): PosSaleRequest = js.native
  // Create a new instance of PosStore
  def newPosStore(): PosStore = js.native
  // Create a new instance of PostalCodeGroup
  def newPostalCodeGroup(): PostalCodeGroup = js.native
  // Create a new instance of PostalCodeRange
  def newPostalCodeRange(): PostalCodeRange = js.native
  // Create a new instance of Price
  def newPrice(): Price = js.native
  // Create a new instance of Product
  def newProduct(): Product = js.native
  // Create a new instance of ProductAspect
  def newProductAspect(): ProductAspect = js.native
  // Create a new instance of ProductDestination
  def newProductDestination(): ProductDestination = js.native
  // Create a new instance of ProductShipping
  def newProductShipping(): ProductShipping = js.native
  // Create a new instance of ProductShippingDimension
  def newProductShippingDimension(): ProductShippingDimension = js.native
  // Create a new instance of ProductShippingWeight
  def newProductShippingWeight(): ProductShippingWeight = js.native
  // Create a new instance of ProductTax
  def newProductTax(): ProductTax = js.native
  // Create a new instance of ProductUnitPricingBaseMeasure
  def newProductUnitPricingBaseMeasure(): ProductUnitPricingBaseMeasure = js.native
  // Create a new instance of ProductUnitPricingMeasure
  def newProductUnitPricingMeasure(): ProductUnitPricingMeasure = js.native
  // Create a new instance of ProductsCustomBatchRequest
  def newProductsCustomBatchRequest(): ProductsCustomBatchRequest = js.native
  // Create a new instance of ProductsCustomBatchRequestEntry
  def newProductsCustomBatchRequestEntry(): ProductsCustomBatchRequestEntry = js.native
  // Create a new instance of ProductstatusesCustomBatchRequest
  def newProductstatusesCustomBatchRequest(): ProductstatusesCustomBatchRequest = js.native
  // Create a new instance of ProductstatusesCustomBatchRequestEntry
  def newProductstatusesCustomBatchRequestEntry(): ProductstatusesCustomBatchRequestEntry = js.native
  // Create a new instance of Promotion
  def newPromotion(): Promotion = js.native
  // Create a new instance of RateGroup
  def newRateGroup(): RateGroup = js.native
  // Create a new instance of Row
  def newRow(): Row = js.native
  // Create a new instance of Service
  def newService(): Service = js.native
  // Create a new instance of ShipmentInvoice
  def newShipmentInvoice(): ShipmentInvoice = js.native
  // Create a new instance of ShipmentInvoiceLineItemInvoice
  def newShipmentInvoiceLineItemInvoice(): ShipmentInvoiceLineItemInvoice = js.native
  // Create a new instance of ShippingSettings
  def newShippingSettings(): ShippingSettings = js.native
  // Create a new instance of ShippingsettingsCustomBatchRequest
  def newShippingsettingsCustomBatchRequest(): ShippingsettingsCustomBatchRequest = js.native
  // Create a new instance of ShippingsettingsCustomBatchRequestEntry
  def newShippingsettingsCustomBatchRequestEntry(): ShippingsettingsCustomBatchRequestEntry = js.native
  // Create a new instance of Table
  def newTable(): Table = js.native
  // Create a new instance of TestOrder
  def newTestOrder(): TestOrder = js.native
  // Create a new instance of TestOrderCustomer
  def newTestOrderCustomer(): TestOrderCustomer = js.native
  // Create a new instance of TestOrderCustomerMarketingRightsInfo
  def newTestOrderCustomerMarketingRightsInfo(): TestOrderCustomerMarketingRightsInfo = js.native
  // Create a new instance of TestOrderLineItem
  def newTestOrderLineItem(): TestOrderLineItem = js.native
  // Create a new instance of TestOrderLineItemProduct
  def newTestOrderLineItemProduct(): TestOrderLineItemProduct = js.native
  // Create a new instance of TestOrderPaymentMethod
  def newTestOrderPaymentMethod(): TestOrderPaymentMethod = js.native
  // Create a new instance of TransitTable
  def newTransitTable(): TransitTable = js.native
  // Create a new instance of TransitTableTransitTimeRow
  def newTransitTableTransitTimeRow(): TransitTableTransitTimeRow = js.native
  // Create a new instance of TransitTableTransitTimeRowTransitTimeValue
  def newTransitTableTransitTimeRowTransitTimeValue(): TransitTableTransitTimeRowTransitTimeValue = js.native
  // Create a new instance of UnitInvoice
  def newUnitInvoice(): UnitInvoice = js.native
  // Create a new instance of UnitInvoiceAdditionalCharge
  def newUnitInvoiceAdditionalCharge(): UnitInvoiceAdditionalCharge = js.native
  // Create a new instance of UnitInvoiceTaxLine
  def newUnitInvoiceTaxLine(): UnitInvoiceTaxLine = js.native
  // Create a new instance of Value
  def newValue(): Value = js.native
  // Create a new instance of Weight
  def newWeight(): Weight = js.native
}

object Content_ {
  @scala.inline
  def apply(
    newAccount: () => Account,
    newAccountAddress: () => AccountAddress,
    newAccountAdwordsLink: () => AccountAdwordsLink,
    newAccountBusinessInformation: () => AccountBusinessInformation,
    newAccountCustomerService: () => AccountCustomerService,
    newAccountGoogleMyBusinessLink: () => AccountGoogleMyBusinessLink,
    newAccountTax: () => AccountTax,
    newAccountTaxTaxRule: () => AccountTaxTaxRule,
    newAccountUser: () => AccountUser,
    newAccountYouTubeChannelLink: () => AccountYouTubeChannelLink,
    newAccountsCustomBatchRequest: () => AccountsCustomBatchRequest,
    newAccountsCustomBatchRequestEntry: () => AccountsCustomBatchRequestEntry,
    newAccountsCustomBatchRequestEntryLinkRequest: () => AccountsCustomBatchRequestEntryLinkRequest,
    newAccountsLinkRequest: () => AccountsLinkRequest,
    newAccountstatusesCustomBatchRequest: () => AccountstatusesCustomBatchRequest,
    newAccountstatusesCustomBatchRequestEntry: () => AccountstatusesCustomBatchRequestEntry,
    newAccounttaxCustomBatchRequest: () => AccounttaxCustomBatchRequest,
    newAccounttaxCustomBatchRequestEntry: () => AccounttaxCustomBatchRequestEntry,
    newAmount: () => Amount,
    newCarrierRate: () => CarrierRate,
    newCustomAttribute: () => CustomAttribute,
    newCustomGroup: () => CustomGroup,
    newCutoffTime: () => CutoffTime,
    newDatafeed: () => Datafeed,
    newDatafeedFetchSchedule: () => DatafeedFetchSchedule,
    newDatafeedFormat: () => DatafeedFormat,
    newDatafeedTarget: () => DatafeedTarget,
    newDatafeedsCustomBatchRequest: () => DatafeedsCustomBatchRequest,
    newDatafeedsCustomBatchRequestEntry: () => DatafeedsCustomBatchRequestEntry,
    newDatafeedstatusesCustomBatchRequest: () => DatafeedstatusesCustomBatchRequest,
    newDatafeedstatusesCustomBatchRequestEntry: () => DatafeedstatusesCustomBatchRequestEntry,
    newDeliveryTime: () => DeliveryTime,
    newError: () => Error,
    newHeaders: () => Headers,
    newHolidayCutoff: () => HolidayCutoff,
    newInstallment: () => Installment,
    newInventory: () => Inventory,
    newInventoryCustomBatchRequest: () => InventoryCustomBatchRequest,
    newInventoryCustomBatchRequestEntry: () => InventoryCustomBatchRequestEntry,
    newInventoryPickup: () => InventoryPickup,
    newInventorySetRequest: () => InventorySetRequest,
    newInvoiceSummary: () => InvoiceSummary,
    newInvoiceSummaryAdditionalChargeSummary: () => InvoiceSummaryAdditionalChargeSummary,
    newLiaAboutPageSettings: () => LiaAboutPageSettings,
    newLiaCountrySettings: () => LiaCountrySettings,
    newLiaInventorySettings: () => LiaInventorySettings,
    newLiaOnDisplayToOrderSettings: () => LiaOnDisplayToOrderSettings,
    newLiaPosDataProvider: () => LiaPosDataProvider,
    newLiaSettings: () => LiaSettings,
    newLiasettingsCustomBatchRequest: () => LiasettingsCustomBatchRequest,
    newLiasettingsCustomBatchRequestEntry: () => LiasettingsCustomBatchRequestEntry,
    newLocationIdSet: () => LocationIdSet,
    newLoyaltyPoints: () => LoyaltyPoints,
    newOrderLegacyPromotion: () => OrderLegacyPromotion,
    newOrderLegacyPromotionBenefit: () => OrderLegacyPromotionBenefit,
    newOrderLineItemProductVariantAttribute: () => OrderLineItemProductVariantAttribute,
    newOrderLineItemReturnInfo: () => OrderLineItemReturnInfo,
    newOrderLineItemShippingDetails: () => OrderLineItemShippingDetails,
    newOrderLineItemShippingDetailsMethod: () => OrderLineItemShippingDetailsMethod,
    newOrderMerchantProvidedAnnotation: () => OrderMerchantProvidedAnnotation,
    newOrderShipmentLineItemShipment: () => OrderShipmentLineItemShipment,
    newOrderinvoicesCreateChargeInvoiceRequest: () => OrderinvoicesCreateChargeInvoiceRequest,
    newOrderinvoicesCreateRefundInvoiceRequest: () => OrderinvoicesCreateRefundInvoiceRequest,
    newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption: () => OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption,
    newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption: () => OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption,
    newOrderpaymentsNotifyAuthApprovedRequest: () => OrderpaymentsNotifyAuthApprovedRequest,
    newOrderpaymentsNotifyAuthDeclinedRequest: () => OrderpaymentsNotifyAuthDeclinedRequest,
    newOrderpaymentsNotifyChargeRequest: () => OrderpaymentsNotifyChargeRequest,
    newOrderpaymentsNotifyRefundRequest: () => OrderpaymentsNotifyRefundRequest,
    newOrdersAcknowledgeRequest: () => OrdersAcknowledgeRequest,
    newOrdersCancelLineItemRequest: () => OrdersCancelLineItemRequest,
    newOrdersCancelRequest: () => OrdersCancelRequest,
    newOrdersCancelTestOrderByCustomerRequest: () => OrdersCancelTestOrderByCustomerRequest,
    newOrdersCreateTestOrderRequest: () => OrdersCreateTestOrderRequest,
    newOrdersCreateTestReturnRequest: () => OrdersCreateTestReturnRequest,
    newOrdersCustomBatchRequest: () => OrdersCustomBatchRequest,
    newOrdersCustomBatchRequestEntry: () => OrdersCustomBatchRequestEntry,
    newOrdersCustomBatchRequestEntryCancel: () => OrdersCustomBatchRequestEntryCancel,
    newOrdersCustomBatchRequestEntryCancelLineItem: () => OrdersCustomBatchRequestEntryCancelLineItem,
    newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem: () => OrdersCustomBatchRequestEntryCreateTestReturnReturnItem,
    newOrdersCustomBatchRequestEntryInStoreRefundLineItem: () => OrdersCustomBatchRequestEntryInStoreRefundLineItem,
    newOrdersCustomBatchRequestEntryRefund: () => OrdersCustomBatchRequestEntryRefund,
    newOrdersCustomBatchRequestEntryRejectReturnLineItem: () => OrdersCustomBatchRequestEntryRejectReturnLineItem,
    newOrdersCustomBatchRequestEntryReturnLineItem: () => OrdersCustomBatchRequestEntryReturnLineItem,
    newOrdersCustomBatchRequestEntryReturnRefundLineItem: () => OrdersCustomBatchRequestEntryReturnRefundLineItem,
    newOrdersCustomBatchRequestEntrySetLineItemMetadata: () => OrdersCustomBatchRequestEntrySetLineItemMetadata,
    newOrdersCustomBatchRequestEntryShipLineItems: () => OrdersCustomBatchRequestEntryShipLineItems,
    newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo: () => OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo,
    newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails: () => OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails,
    newOrdersCustomBatchRequestEntryUpdateShipment: () => OrdersCustomBatchRequestEntryUpdateShipment,
    newOrdersInStoreRefundLineItemRequest: () => OrdersInStoreRefundLineItemRequest,
    newOrdersRefundRequest: () => OrdersRefundRequest,
    newOrdersRejectReturnLineItemRequest: () => OrdersRejectReturnLineItemRequest,
    newOrdersReturnLineItemRequest: () => OrdersReturnLineItemRequest,
    newOrdersReturnRefundLineItemRequest: () => OrdersReturnRefundLineItemRequest,
    newOrdersSetLineItemMetadataRequest: () => OrdersSetLineItemMetadataRequest,
    newOrdersShipLineItemsRequest: () => OrdersShipLineItemsRequest,
    newOrdersUpdateLineItemShippingDetailsRequest: () => OrdersUpdateLineItemShippingDetailsRequest,
    newOrdersUpdateMerchantOrderIdRequest: () => OrdersUpdateMerchantOrderIdRequest,
    newOrdersUpdateShipmentRequest: () => OrdersUpdateShipmentRequest,
    newPosCustomBatchRequest: () => PosCustomBatchRequest,
    newPosCustomBatchRequestEntry: () => PosCustomBatchRequestEntry,
    newPosInventory: () => PosInventory,
    newPosInventoryRequest: () => PosInventoryRequest,
    newPosSale: () => PosSale,
    newPosSaleRequest: () => PosSaleRequest,
    newPosStore: () => PosStore,
    newPostalCodeGroup: () => PostalCodeGroup,
    newPostalCodeRange: () => PostalCodeRange,
    newPrice: () => Price,
    newProduct: () => Product,
    newProductAspect: () => ProductAspect,
    newProductDestination: () => ProductDestination,
    newProductShipping: () => ProductShipping,
    newProductShippingDimension: () => ProductShippingDimension,
    newProductShippingWeight: () => ProductShippingWeight,
    newProductTax: () => ProductTax,
    newProductUnitPricingBaseMeasure: () => ProductUnitPricingBaseMeasure,
    newProductUnitPricingMeasure: () => ProductUnitPricingMeasure,
    newProductsCustomBatchRequest: () => ProductsCustomBatchRequest,
    newProductsCustomBatchRequestEntry: () => ProductsCustomBatchRequestEntry,
    newProductstatusesCustomBatchRequest: () => ProductstatusesCustomBatchRequest,
    newProductstatusesCustomBatchRequestEntry: () => ProductstatusesCustomBatchRequestEntry,
    newPromotion: () => Promotion,
    newRateGroup: () => RateGroup,
    newRow: () => Row,
    newService: () => Service,
    newShipmentInvoice: () => ShipmentInvoice,
    newShipmentInvoiceLineItemInvoice: () => ShipmentInvoiceLineItemInvoice,
    newShippingSettings: () => ShippingSettings,
    newShippingsettingsCustomBatchRequest: () => ShippingsettingsCustomBatchRequest,
    newShippingsettingsCustomBatchRequestEntry: () => ShippingsettingsCustomBatchRequestEntry,
    newTable: () => Table,
    newTestOrder: () => TestOrder,
    newTestOrderCustomer: () => TestOrderCustomer,
    newTestOrderCustomerMarketingRightsInfo: () => TestOrderCustomerMarketingRightsInfo,
    newTestOrderLineItem: () => TestOrderLineItem,
    newTestOrderLineItemProduct: () => TestOrderLineItemProduct,
    newTestOrderPaymentMethod: () => TestOrderPaymentMethod,
    newTransitTable: () => TransitTable,
    newTransitTableTransitTimeRow: () => TransitTableTransitTimeRow,
    newTransitTableTransitTimeRowTransitTimeValue: () => TransitTableTransitTimeRowTransitTimeValue,
    newUnitInvoice: () => UnitInvoice,
    newUnitInvoiceAdditionalCharge: () => UnitInvoiceAdditionalCharge,
    newUnitInvoiceTaxLine: () => UnitInvoiceTaxLine,
    newValue: () => Value,
    newWeight: () => Weight
  ): Content_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountAddress = js.Any.fromFunction0(newAccountAddress), newAccountAdwordsLink = js.Any.fromFunction0(newAccountAdwordsLink), newAccountBusinessInformation = js.Any.fromFunction0(newAccountBusinessInformation), newAccountCustomerService = js.Any.fromFunction0(newAccountCustomerService), newAccountGoogleMyBusinessLink = js.Any.fromFunction0(newAccountGoogleMyBusinessLink), newAccountTax = js.Any.fromFunction0(newAccountTax), newAccountTaxTaxRule = js.Any.fromFunction0(newAccountTaxTaxRule), newAccountUser = js.Any.fromFunction0(newAccountUser), newAccountYouTubeChannelLink = js.Any.fromFunction0(newAccountYouTubeChannelLink), newAccountsCustomBatchRequest = js.Any.fromFunction0(newAccountsCustomBatchRequest), newAccountsCustomBatchRequestEntry = js.Any.fromFunction0(newAccountsCustomBatchRequestEntry), newAccountsCustomBatchRequestEntryLinkRequest = js.Any.fromFunction0(newAccountsCustomBatchRequestEntryLinkRequest), newAccountsLinkRequest = js.Any.fromFunction0(newAccountsLinkRequest), newAccountstatusesCustomBatchRequest = js.Any.fromFunction0(newAccountstatusesCustomBatchRequest), newAccountstatusesCustomBatchRequestEntry = js.Any.fromFunction0(newAccountstatusesCustomBatchRequestEntry), newAccounttaxCustomBatchRequest = js.Any.fromFunction0(newAccounttaxCustomBatchRequest), newAccounttaxCustomBatchRequestEntry = js.Any.fromFunction0(newAccounttaxCustomBatchRequestEntry), newAmount = js.Any.fromFunction0(newAmount), newCarrierRate = js.Any.fromFunction0(newCarrierRate), newCustomAttribute = js.Any.fromFunction0(newCustomAttribute), newCustomGroup = js.Any.fromFunction0(newCustomGroup), newCutoffTime = js.Any.fromFunction0(newCutoffTime), newDatafeed = js.Any.fromFunction0(newDatafeed), newDatafeedFetchSchedule = js.Any.fromFunction0(newDatafeedFetchSchedule), newDatafeedFormat = js.Any.fromFunction0(newDatafeedFormat), newDatafeedTarget = js.Any.fromFunction0(newDatafeedTarget), newDatafeedsCustomBatchRequest = js.Any.fromFunction0(newDatafeedsCustomBatchRequest), newDatafeedsCustomBatchRequestEntry = js.Any.fromFunction0(newDatafeedsCustomBatchRequestEntry), newDatafeedstatusesCustomBatchRequest = js.Any.fromFunction0(newDatafeedstatusesCustomBatchRequest), newDatafeedstatusesCustomBatchRequestEntry = js.Any.fromFunction0(newDatafeedstatusesCustomBatchRequestEntry), newDeliveryTime = js.Any.fromFunction0(newDeliveryTime), newError = js.Any.fromFunction0(newError), newHeaders = js.Any.fromFunction0(newHeaders), newHolidayCutoff = js.Any.fromFunction0(newHolidayCutoff), newInstallment = js.Any.fromFunction0(newInstallment), newInventory = js.Any.fromFunction0(newInventory), newInventoryCustomBatchRequest = js.Any.fromFunction0(newInventoryCustomBatchRequest), newInventoryCustomBatchRequestEntry = js.Any.fromFunction0(newInventoryCustomBatchRequestEntry), newInventoryPickup = js.Any.fromFunction0(newInventoryPickup), newInventorySetRequest = js.Any.fromFunction0(newInventorySetRequest), newInvoiceSummary = js.Any.fromFunction0(newInvoiceSummary), newInvoiceSummaryAdditionalChargeSummary = js.Any.fromFunction0(newInvoiceSummaryAdditionalChargeSummary), newLiaAboutPageSettings = js.Any.fromFunction0(newLiaAboutPageSettings), newLiaCountrySettings = js.Any.fromFunction0(newLiaCountrySettings), newLiaInventorySettings = js.Any.fromFunction0(newLiaInventorySettings), newLiaOnDisplayToOrderSettings = js.Any.fromFunction0(newLiaOnDisplayToOrderSettings), newLiaPosDataProvider = js.Any.fromFunction0(newLiaPosDataProvider), newLiaSettings = js.Any.fromFunction0(newLiaSettings), newLiasettingsCustomBatchRequest = js.Any.fromFunction0(newLiasettingsCustomBatchRequest), newLiasettingsCustomBatchRequestEntry = js.Any.fromFunction0(newLiasettingsCustomBatchRequestEntry), newLocationIdSet = js.Any.fromFunction0(newLocationIdSet), newLoyaltyPoints = js.Any.fromFunction0(newLoyaltyPoints), newOrderLegacyPromotion = js.Any.fromFunction0(newOrderLegacyPromotion), newOrderLegacyPromotionBenefit = js.Any.fromFunction0(newOrderLegacyPromotionBenefit), newOrderLineItemProductVariantAttribute = js.Any.fromFunction0(newOrderLineItemProductVariantAttribute), newOrderLineItemReturnInfo = js.Any.fromFunction0(newOrderLineItemReturnInfo), newOrderLineItemShippingDetails = js.Any.fromFunction0(newOrderLineItemShippingDetails), newOrderLineItemShippingDetailsMethod = js.Any.fromFunction0(newOrderLineItemShippingDetailsMethod), newOrderMerchantProvidedAnnotation = js.Any.fromFunction0(newOrderMerchantProvidedAnnotation), newOrderShipmentLineItemShipment = js.Any.fromFunction0(newOrderShipmentLineItemShipment), newOrderinvoicesCreateChargeInvoiceRequest = js.Any.fromFunction0(newOrderinvoicesCreateChargeInvoiceRequest), newOrderinvoicesCreateRefundInvoiceRequest = js.Any.fromFunction0(newOrderinvoicesCreateRefundInvoiceRequest), newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = js.Any.fromFunction0(newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption), newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = js.Any.fromFunction0(newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption), newOrderpaymentsNotifyAuthApprovedRequest = js.Any.fromFunction0(newOrderpaymentsNotifyAuthApprovedRequest), newOrderpaymentsNotifyAuthDeclinedRequest = js.Any.fromFunction0(newOrderpaymentsNotifyAuthDeclinedRequest), newOrderpaymentsNotifyChargeRequest = js.Any.fromFunction0(newOrderpaymentsNotifyChargeRequest), newOrderpaymentsNotifyRefundRequest = js.Any.fromFunction0(newOrderpaymentsNotifyRefundRequest), newOrdersAcknowledgeRequest = js.Any.fromFunction0(newOrdersAcknowledgeRequest), newOrdersCancelLineItemRequest = js.Any.fromFunction0(newOrdersCancelLineItemRequest), newOrdersCancelRequest = js.Any.fromFunction0(newOrdersCancelRequest), newOrdersCancelTestOrderByCustomerRequest = js.Any.fromFunction0(newOrdersCancelTestOrderByCustomerRequest), newOrdersCreateTestOrderRequest = js.Any.fromFunction0(newOrdersCreateTestOrderRequest), newOrdersCreateTestReturnRequest = js.Any.fromFunction0(newOrdersCreateTestReturnRequest), newOrdersCustomBatchRequest = js.Any.fromFunction0(newOrdersCustomBatchRequest), newOrdersCustomBatchRequestEntry = js.Any.fromFunction0(newOrdersCustomBatchRequestEntry), newOrdersCustomBatchRequestEntryCancel = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryCancel), newOrdersCustomBatchRequestEntryCancelLineItem = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryCancelLineItem), newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem), newOrdersCustomBatchRequestEntryInStoreRefundLineItem = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryInStoreRefundLineItem), newOrdersCustomBatchRequestEntryRefund = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryRefund), newOrdersCustomBatchRequestEntryRejectReturnLineItem = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryRejectReturnLineItem), newOrdersCustomBatchRequestEntryReturnLineItem = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryReturnLineItem), newOrdersCustomBatchRequestEntryReturnRefundLineItem = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryReturnRefundLineItem), newOrdersCustomBatchRequestEntrySetLineItemMetadata = js.Any.fromFunction0(newOrdersCustomBatchRequestEntrySetLineItemMetadata), newOrdersCustomBatchRequestEntryShipLineItems = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryShipLineItems), newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo), newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails), newOrdersCustomBatchRequestEntryUpdateShipment = js.Any.fromFunction0(newOrdersCustomBatchRequestEntryUpdateShipment), newOrdersInStoreRefundLineItemRequest = js.Any.fromFunction0(newOrdersInStoreRefundLineItemRequest), newOrdersRefundRequest = js.Any.fromFunction0(newOrdersRefundRequest), newOrdersRejectReturnLineItemRequest = js.Any.fromFunction0(newOrdersRejectReturnLineItemRequest), newOrdersReturnLineItemRequest = js.Any.fromFunction0(newOrdersReturnLineItemRequest), newOrdersReturnRefundLineItemRequest = js.Any.fromFunction0(newOrdersReturnRefundLineItemRequest), newOrdersSetLineItemMetadataRequest = js.Any.fromFunction0(newOrdersSetLineItemMetadataRequest), newOrdersShipLineItemsRequest = js.Any.fromFunction0(newOrdersShipLineItemsRequest), newOrdersUpdateLineItemShippingDetailsRequest = js.Any.fromFunction0(newOrdersUpdateLineItemShippingDetailsRequest), newOrdersUpdateMerchantOrderIdRequest = js.Any.fromFunction0(newOrdersUpdateMerchantOrderIdRequest), newOrdersUpdateShipmentRequest = js.Any.fromFunction0(newOrdersUpdateShipmentRequest), newPosCustomBatchRequest = js.Any.fromFunction0(newPosCustomBatchRequest), newPosCustomBatchRequestEntry = js.Any.fromFunction0(newPosCustomBatchRequestEntry), newPosInventory = js.Any.fromFunction0(newPosInventory), newPosInventoryRequest = js.Any.fromFunction0(newPosInventoryRequest), newPosSale = js.Any.fromFunction0(newPosSale), newPosSaleRequest = js.Any.fromFunction0(newPosSaleRequest), newPosStore = js.Any.fromFunction0(newPosStore), newPostalCodeGroup = js.Any.fromFunction0(newPostalCodeGroup), newPostalCodeRange = js.Any.fromFunction0(newPostalCodeRange), newPrice = js.Any.fromFunction0(newPrice), newProduct = js.Any.fromFunction0(newProduct), newProductAspect = js.Any.fromFunction0(newProductAspect), newProductDestination = js.Any.fromFunction0(newProductDestination), newProductShipping = js.Any.fromFunction0(newProductShipping), newProductShippingDimension = js.Any.fromFunction0(newProductShippingDimension), newProductShippingWeight = js.Any.fromFunction0(newProductShippingWeight), newProductTax = js.Any.fromFunction0(newProductTax), newProductUnitPricingBaseMeasure = js.Any.fromFunction0(newProductUnitPricingBaseMeasure), newProductUnitPricingMeasure = js.Any.fromFunction0(newProductUnitPricingMeasure), newProductsCustomBatchRequest = js.Any.fromFunction0(newProductsCustomBatchRequest), newProductsCustomBatchRequestEntry = js.Any.fromFunction0(newProductsCustomBatchRequestEntry), newProductstatusesCustomBatchRequest = js.Any.fromFunction0(newProductstatusesCustomBatchRequest), newProductstatusesCustomBatchRequestEntry = js.Any.fromFunction0(newProductstatusesCustomBatchRequestEntry), newPromotion = js.Any.fromFunction0(newPromotion), newRateGroup = js.Any.fromFunction0(newRateGroup), newRow = js.Any.fromFunction0(newRow), newService = js.Any.fromFunction0(newService), newShipmentInvoice = js.Any.fromFunction0(newShipmentInvoice), newShipmentInvoiceLineItemInvoice = js.Any.fromFunction0(newShipmentInvoiceLineItemInvoice), newShippingSettings = js.Any.fromFunction0(newShippingSettings), newShippingsettingsCustomBatchRequest = js.Any.fromFunction0(newShippingsettingsCustomBatchRequest), newShippingsettingsCustomBatchRequestEntry = js.Any.fromFunction0(newShippingsettingsCustomBatchRequestEntry), newTable = js.Any.fromFunction0(newTable), newTestOrder = js.Any.fromFunction0(newTestOrder), newTestOrderCustomer = js.Any.fromFunction0(newTestOrderCustomer), newTestOrderCustomerMarketingRightsInfo = js.Any.fromFunction0(newTestOrderCustomerMarketingRightsInfo), newTestOrderLineItem = js.Any.fromFunction0(newTestOrderLineItem), newTestOrderLineItemProduct = js.Any.fromFunction0(newTestOrderLineItemProduct), newTestOrderPaymentMethod = js.Any.fromFunction0(newTestOrderPaymentMethod), newTransitTable = js.Any.fromFunction0(newTransitTable), newTransitTableTransitTimeRow = js.Any.fromFunction0(newTransitTableTransitTimeRow), newTransitTableTransitTimeRowTransitTimeValue = js.Any.fromFunction0(newTransitTableTransitTimeRowTransitTimeValue), newUnitInvoice = js.Any.fromFunction0(newUnitInvoice), newUnitInvoiceAdditionalCharge = js.Any.fromFunction0(newUnitInvoiceAdditionalCharge), newUnitInvoiceTaxLine = js.Any.fromFunction0(newUnitInvoiceTaxLine), newValue = js.Any.fromFunction0(newValue), newWeight = js.Any.fromFunction0(newWeight))
    __obj.asInstanceOf[Content_]
  }
  @scala.inline
  implicit class Content_Ops[Self <: Content_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAccount(value: () => Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountAddress(value: () => AccountAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountAdwordsLink(value: () => AccountAdwordsLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountAdwordsLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountBusinessInformation(value: () => AccountBusinessInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountBusinessInformation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountCustomerService(value: () => AccountCustomerService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountCustomerService")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountGoogleMyBusinessLink(value: () => AccountGoogleMyBusinessLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountGoogleMyBusinessLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountTax(value: () => AccountTax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountTax")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountTaxTaxRule(value: () => AccountTaxTaxRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountTaxTaxRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountUser(value: () => AccountUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountYouTubeChannelLink(value: () => AccountYouTubeChannelLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountYouTubeChannelLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountsCustomBatchRequest(value: () => AccountsCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountsCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountsCustomBatchRequestEntry(value: () => AccountsCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountsCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountsCustomBatchRequestEntryLinkRequest(value: () => AccountsCustomBatchRequestEntryLinkRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountsCustomBatchRequestEntryLinkRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountsLinkRequest(value: () => AccountsLinkRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountsLinkRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountstatusesCustomBatchRequest(value: () => AccountstatusesCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountstatusesCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountstatusesCustomBatchRequestEntry(value: () => AccountstatusesCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountstatusesCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccounttaxCustomBatchRequest(value: () => AccounttaxCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccounttaxCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccounttaxCustomBatchRequestEntry(value: () => AccounttaxCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccounttaxCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAmount(value: () => Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCarrierRate(value: () => CarrierRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCarrierRate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomAttribute(value: () => CustomAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomAttribute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomGroup(value: () => CustomGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCutoffTime(value: () => CutoffTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCutoffTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeed(value: () => Datafeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedFetchSchedule(value: () => DatafeedFetchSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedFetchSchedule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedFormat(value: () => DatafeedFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedTarget(value: () => DatafeedTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedsCustomBatchRequest(value: () => DatafeedsCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedsCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedsCustomBatchRequestEntry(value: () => DatafeedsCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedsCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedstatusesCustomBatchRequest(value: () => DatafeedstatusesCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedstatusesCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDatafeedstatusesCustomBatchRequestEntry(value: () => DatafeedstatusesCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDatafeedstatusesCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeliveryTime(value: () => DeliveryTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeliveryTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewError(value: () => Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHeaders(value: () => Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHolidayCutoff(value: () => HolidayCutoff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHolidayCutoff")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInstallment(value: () => Installment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInstallment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInventory(value: () => Inventory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInventory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInventoryCustomBatchRequest(value: () => InventoryCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInventoryCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInventoryCustomBatchRequestEntry(value: () => InventoryCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInventoryCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInventoryPickup(value: () => InventoryPickup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInventoryPickup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInventorySetRequest(value: () => InventorySetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInventorySetRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvoiceSummary(value: () => InvoiceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvoiceSummary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvoiceSummaryAdditionalChargeSummary(value: () => InvoiceSummaryAdditionalChargeSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvoiceSummaryAdditionalChargeSummary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiaAboutPageSettings(value: () => LiaAboutPageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiaAboutPageSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiaCountrySettings(value: () => LiaCountrySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiaCountrySettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiaInventorySettings(value: () => LiaInventorySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiaInventorySettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiaOnDisplayToOrderSettings(value: () => LiaOnDisplayToOrderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiaOnDisplayToOrderSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiaPosDataProvider(value: () => LiaPosDataProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiaPosDataProvider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiaSettings(value: () => LiaSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiaSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiasettingsCustomBatchRequest(value: () => LiasettingsCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiasettingsCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiasettingsCustomBatchRequestEntry(value: () => LiasettingsCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiasettingsCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLocationIdSet(value: () => LocationIdSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLocationIdSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLoyaltyPoints(value: () => LoyaltyPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLoyaltyPoints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderLegacyPromotion(value: () => OrderLegacyPromotion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderLegacyPromotion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderLegacyPromotionBenefit(value: () => OrderLegacyPromotionBenefit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderLegacyPromotionBenefit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderLineItemProductVariantAttribute(value: () => OrderLineItemProductVariantAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderLineItemProductVariantAttribute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderLineItemReturnInfo(value: () => OrderLineItemReturnInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderLineItemReturnInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderLineItemShippingDetails(value: () => OrderLineItemShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderLineItemShippingDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderLineItemShippingDetailsMethod(value: () => OrderLineItemShippingDetailsMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderLineItemShippingDetailsMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderMerchantProvidedAnnotation(value: () => OrderMerchantProvidedAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderMerchantProvidedAnnotation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderShipmentLineItemShipment(value: () => OrderShipmentLineItemShipment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderShipmentLineItemShipment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderinvoicesCreateChargeInvoiceRequest(value: () => OrderinvoicesCreateChargeInvoiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderinvoicesCreateChargeInvoiceRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderinvoicesCreateRefundInvoiceRequest(value: () => OrderinvoicesCreateRefundInvoiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderinvoicesCreateRefundInvoiceRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption(value: () => OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption(value: () => OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderpaymentsNotifyAuthApprovedRequest(value: () => OrderpaymentsNotifyAuthApprovedRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderpaymentsNotifyAuthApprovedRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderpaymentsNotifyAuthDeclinedRequest(value: () => OrderpaymentsNotifyAuthDeclinedRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderpaymentsNotifyAuthDeclinedRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderpaymentsNotifyChargeRequest(value: () => OrderpaymentsNotifyChargeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderpaymentsNotifyChargeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderpaymentsNotifyRefundRequest(value: () => OrderpaymentsNotifyRefundRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderpaymentsNotifyRefundRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersAcknowledgeRequest(value: () => OrdersAcknowledgeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersAcknowledgeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCancelLineItemRequest(value: () => OrdersCancelLineItemRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCancelLineItemRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCancelRequest(value: () => OrdersCancelRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCancelRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCancelTestOrderByCustomerRequest(value: () => OrdersCancelTestOrderByCustomerRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCancelTestOrderByCustomerRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCreateTestOrderRequest(value: () => OrdersCreateTestOrderRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCreateTestOrderRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCreateTestReturnRequest(value: () => OrdersCreateTestReturnRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCreateTestReturnRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequest(value: () => OrdersCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntry(value: () => OrdersCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryCancel(value: () => OrdersCustomBatchRequestEntryCancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryCancelLineItem(value: () => OrdersCustomBatchRequestEntryCancelLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryCancelLineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryCreateTestReturnReturnItem(value: () => OrdersCustomBatchRequestEntryCreateTestReturnReturnItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryInStoreRefundLineItem(value: () => OrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryInStoreRefundLineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryRefund(value: () => OrdersCustomBatchRequestEntryRefund): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryRefund")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryRejectReturnLineItem(value: () => OrdersCustomBatchRequestEntryRejectReturnLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryRejectReturnLineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryReturnLineItem(value: () => OrdersCustomBatchRequestEntryReturnLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryReturnLineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryReturnRefundLineItem(value: () => OrdersCustomBatchRequestEntryReturnRefundLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryReturnRefundLineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntrySetLineItemMetadata(value: () => OrdersCustomBatchRequestEntrySetLineItemMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntrySetLineItemMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryShipLineItems(value: () => OrdersCustomBatchRequestEntryShipLineItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryShipLineItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo(value: () => OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails(value: () => OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersCustomBatchRequestEntryUpdateShipment(value: () => OrdersCustomBatchRequestEntryUpdateShipment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersCustomBatchRequestEntryUpdateShipment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersInStoreRefundLineItemRequest(value: () => OrdersInStoreRefundLineItemRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersInStoreRefundLineItemRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersRefundRequest(value: () => OrdersRefundRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersRefundRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersRejectReturnLineItemRequest(value: () => OrdersRejectReturnLineItemRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersRejectReturnLineItemRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersReturnLineItemRequest(value: () => OrdersReturnLineItemRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersReturnLineItemRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersReturnRefundLineItemRequest(value: () => OrdersReturnRefundLineItemRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersReturnRefundLineItemRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersSetLineItemMetadataRequest(value: () => OrdersSetLineItemMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersSetLineItemMetadataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersShipLineItemsRequest(value: () => OrdersShipLineItemsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersShipLineItemsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersUpdateLineItemShippingDetailsRequest(value: () => OrdersUpdateLineItemShippingDetailsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersUpdateLineItemShippingDetailsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersUpdateMerchantOrderIdRequest(value: () => OrdersUpdateMerchantOrderIdRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersUpdateMerchantOrderIdRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrdersUpdateShipmentRequest(value: () => OrdersUpdateShipmentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrdersUpdateShipmentRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosCustomBatchRequest(value: () => PosCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosCustomBatchRequestEntry(value: () => PosCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosInventory(value: () => PosInventory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosInventory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosInventoryRequest(value: () => PosInventoryRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosInventoryRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosSale(value: () => PosSale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosSale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosSaleRequest(value: () => PosSaleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosSaleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPosStore(value: () => PosStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPostalCodeGroup(value: () => PostalCodeGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPostalCodeGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPostalCodeRange(value: () => PostalCodeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPostalCodeRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPrice(value: () => Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPrice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProduct(value: () => Product): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProduct")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductAspect(value: () => ProductAspect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductAspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductDestination(value: () => ProductDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductDestination")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductShipping(value: () => ProductShipping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductShipping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductShippingDimension(value: () => ProductShippingDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductShippingDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductShippingWeight(value: () => ProductShippingWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductShippingWeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductTax(value: () => ProductTax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductTax")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductUnitPricingBaseMeasure(value: () => ProductUnitPricingBaseMeasure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductUnitPricingBaseMeasure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductUnitPricingMeasure(value: () => ProductUnitPricingMeasure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductUnitPricingMeasure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductsCustomBatchRequest(value: () => ProductsCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductsCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductsCustomBatchRequestEntry(value: () => ProductsCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductsCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductstatusesCustomBatchRequest(value: () => ProductstatusesCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductstatusesCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProductstatusesCustomBatchRequestEntry(value: () => ProductstatusesCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProductstatusesCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPromotion(value: () => Promotion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPromotion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRateGroup(value: () => RateGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRateGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRow(value: () => Row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewService(value: () => Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newService")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShipmentInvoice(value: () => ShipmentInvoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShipmentInvoice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShipmentInvoiceLineItemInvoice(value: () => ShipmentInvoiceLineItemInvoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShipmentInvoiceLineItemInvoice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShippingSettings(value: () => ShippingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShippingsettingsCustomBatchRequest(value: () => ShippingsettingsCustomBatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingsettingsCustomBatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShippingsettingsCustomBatchRequestEntry(value: () => ShippingsettingsCustomBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingsettingsCustomBatchRequestEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTestOrder(value: () => TestOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTestOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTestOrderCustomer(value: () => TestOrderCustomer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTestOrderCustomer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTestOrderCustomerMarketingRightsInfo(value: () => TestOrderCustomerMarketingRightsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTestOrderCustomerMarketingRightsInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTestOrderLineItem(value: () => TestOrderLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTestOrderLineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTestOrderLineItemProduct(value: () => TestOrderLineItemProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTestOrderLineItemProduct")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTestOrderPaymentMethod(value: () => TestOrderPaymentMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTestOrderPaymentMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTransitTable(value: () => TransitTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransitTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTransitTableTransitTimeRow(value: () => TransitTableTransitTimeRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransitTableTransitTimeRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTransitTableTransitTimeRowTransitTimeValue(value: () => TransitTableTransitTimeRowTransitTimeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransitTableTransitTimeRowTransitTimeValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnitInvoice(value: () => UnitInvoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnitInvoice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnitInvoiceAdditionalCharge(value: () => UnitInvoiceAdditionalCharge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnitInvoiceAdditionalCharge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnitInvoiceTaxLine(value: () => UnitInvoiceTaxLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnitInvoiceTaxLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewValue(value: () => Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWeight(value: () => Weight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAccounts(value: AccountsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountstatuses(value: AccountstatusesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accountstatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountstatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accountstatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withAccounttax(value: AccounttaxCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounttax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounttax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounttax")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafeeds(value: DatafeedsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datafeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatafeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datafeeds")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafeedstatuses(value: DatafeedstatusesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datafeedstatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatafeedstatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datafeedstatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withInventory(value: InventoryCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inventory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inventory")(js.undefined)
        ret
    }
    @scala.inline
    def withLiasettings(value: LiasettingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Liasettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiasettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Liasettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderinvoices(value: OrderinvoicesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderinvoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderinvoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderinvoices")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderpayments(value: OrderpaymentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderpayments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderpayments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderpayments")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderreports(value: OrderreportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderreports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderreports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderreports")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderreturns(value: OrderreturnsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderreturns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderreturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orderreturns")(js.undefined)
        ret
    }
    @scala.inline
    def withOrders(value: OrdersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orders")(js.undefined)
        ret
    }
    @scala.inline
    def withPos(value: PosCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pos")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts(value: ProductsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Products")(js.undefined)
        ret
    }
    @scala.inline
    def withProductstatuses(value: ProductstatusesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Productstatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductstatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Productstatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingsettings(value: ShippingsettingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shippingsettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingsettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shippingsettings")(js.undefined)
        ret
    }
  }
  
}

