package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.Order
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersAcknowledgeRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersAcknowledgeResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersAdvanceTestOrderResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCancelLineItemRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCancelLineItemResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCancelRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCancelResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCancelTestOrderByCustomerRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCancelTestOrderByCustomerResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCreateTestOrderRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCreateTestOrderResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCreateTestReturnRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCreateTestReturnResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersGetByMerchantOrderIdResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersGetTestOrderTemplateResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersInStoreRefundLineItemRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersInStoreRefundLineItemResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersListResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersRefundRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersRefundResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersRejectReturnLineItemRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersRejectReturnLineItemResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersReturnLineItemRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersReturnLineItemResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersReturnRefundLineItemRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersReturnRefundLineItemResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersSetLineItemMetadataRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersSetLineItemMetadataResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersShipLineItemsRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersShipLineItemsResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersUpdateLineItemShippingDetailsRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersUpdateLineItemShippingDetailsResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersUpdateMerchantOrderIdRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersUpdateMerchantOrderIdResponse
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersUpdateShipmentRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrdersUpdateShipmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCollection extends js.Object {
  // Marks an order as acknowledged.
  def acknowledge(resource: OrdersAcknowledgeRequest, merchantId: String, orderId: String): OrdersAcknowledgeResponse = js.native
  // Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment".
  def advancetestorder(merchantId: String, orderId: String): OrdersAdvanceTestOrderResponse = js.native
  // Cancels all line items in an order, making a full refund.
  def cancel(resource: OrdersCancelRequest, merchantId: String, orderId: String): OrdersCancelResponse = js.native
  // Cancels a line item, making a full refund.
  def cancellineitem(resource: OrdersCancelLineItemRequest, merchantId: String, orderId: String): OrdersCancelLineItemResponse = js.native
  // Sandbox only. Cancels a test order for customer-initiated cancellation.
  def canceltestorderbycustomer(resource: OrdersCancelTestOrderByCustomerRequest, merchantId: String, orderId: String): OrdersCancelTestOrderByCustomerResponse = js.native
  // Sandbox only. Creates a test order.
  def createtestorder(resource: OrdersCreateTestOrderRequest, merchantId: String): OrdersCreateTestOrderResponse = js.native
  // Sandbox only. Creates a test return.
  def createtestreturn(resource: OrdersCreateTestReturnRequest, merchantId: String, orderId: String): OrdersCreateTestReturnResponse = js.native
  // Retrieves or modifies multiple orders in a single request.
  def custombatch(resource: OrdersCustomBatchRequest): OrdersCustomBatchResponse = js.native
  // Retrieves an order from your Merchant Center account.
  def get(merchantId: String, orderId: String): Order = js.native
  // Retrieves an order using merchant order ID.
  def getbymerchantorderid(merchantId: String, merchantOrderId: String): OrdersGetByMerchantOrderIdResponse = js.native
  // Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
  def gettestordertemplate(merchantId: String, templateName: String): OrdersGetTestOrderTemplateResponse = js.native
  // Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox.
  def gettestordertemplate(merchantId: String, templateName: String, optionalArgs: js.Object): OrdersGetTestOrderTemplateResponse = js.native
  // Notifies that item return and refund was handled directly by merchant outside of Google payments processing (e.g. cash refund done in store).
  // Note: We recommend calling the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between merchant and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first refunding via Google then via an in-store return.
  def instorerefundlineitem(resource: OrdersInStoreRefundLineItemRequest, merchantId: String, orderId: String): OrdersInStoreRefundLineItemResponse = js.native
  // Lists the orders in your Merchant Center account.
  def list(merchantId: String): OrdersListResponse = js.native
  // Lists the orders in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): OrdersListResponse = js.native
  // Deprecated, please use returnRefundLineItem instead.
  def refund(resource: OrdersRefundRequest, merchantId: String, orderId: String): OrdersRefundResponse = js.native
  // Rejects return on an line item.
  def rejectreturnlineitem(resource: OrdersRejectReturnLineItemRequest, merchantId: String, orderId: String): OrdersRejectReturnLineItemResponse = js.native
  // Returns a line item.
  def returnlineitem(resource: OrdersReturnLineItemRequest, merchantId: String, orderId: String): OrdersReturnLineItemResponse = js.native
  // Returns and refunds a line item. Note that this method can only be called on fully shipped orders.
  def returnrefundlineitem(resource: OrdersReturnRefundLineItemRequest, merchantId: String, orderId: String): OrdersReturnRefundLineItemResponse = js.native
  // Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information about a line item that cannot be provided via other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
  def setlineitemmetadata(resource: OrdersSetLineItemMetadataRequest, merchantId: String, orderId: String): OrdersSetLineItemMetadataResponse = js.native
  // Marks line item(s) as shipped.
  def shiplineitems(resource: OrdersShipLineItemsRequest, merchantId: String, orderId: String): OrdersShipLineItemsResponse = js.native
  // Updates ship by and delivery by dates for a line item.
  def updatelineitemshippingdetails(resource: OrdersUpdateLineItemShippingDetailsRequest, merchantId: String, orderId: String): OrdersUpdateLineItemShippingDetailsResponse = js.native
  // Updates the merchant order ID for a given order.
  def updatemerchantorderid(resource: OrdersUpdateMerchantOrderIdRequest, merchantId: String, orderId: String): OrdersUpdateMerchantOrderIdResponse = js.native
  // Updates a shipment's status, carrier, and/or tracking ID.
  def updateshipment(resource: OrdersUpdateShipmentRequest, merchantId: String, orderId: String): OrdersUpdateShipmentResponse = js.native
}

