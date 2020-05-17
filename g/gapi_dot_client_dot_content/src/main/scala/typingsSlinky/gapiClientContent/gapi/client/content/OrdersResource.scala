package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContent.anon.Acknowledged
import typingsSlinky.gapiClientContent.anon.Alt
import typingsSlinky.gapiClientContent.anon.MerchantOrderId
import typingsSlinky.gapiClientContent.anon.OrderId
import typingsSlinky.gapiClientContent.anon.QuotaUser
import typingsSlinky.gapiClientContent.anon.TemplateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: OrderId): Request[OrdersAcknowledgeResponse] = js.native
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: OrderId): Request[OrdersAdvanceTestOrderResponse] = js.native
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: OrderId): Request[OrdersCancelResponse] = js.native
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: OrderId): Request[OrdersCancelLineItemResponse] = js.native
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: QuotaUser): Request[OrdersCreateTestOrderResponse] = js.native
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: Alt): Request[OrdersCustomBatchResponse] = js.native
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: OrderId): Request[Order] = js.native
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: MerchantOrderId): Request[OrdersGetByMerchantOrderIdResponse] = js.native
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: TemplateName): Request[OrdersGetTestOrderTemplateResponse] = js.native
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Acknowledged): Request[OrdersListResponse] = js.native
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: OrderId): Request[OrdersRefundResponse] = js.native
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: OrderId): Request[OrdersReturnLineItemResponse] = js.native
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: OrderId): Request[OrdersShipLineItemsResponse] = js.native
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: OrderId): Request[OrdersUpdateMerchantOrderIdResponse] = js.native
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: OrderId): Request[OrdersUpdateShipmentResponse] = js.native
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: OrderId => Request[OrdersAcknowledgeResponse],
    advancetestorder: OrderId => Request[OrdersAdvanceTestOrderResponse],
    cancel: OrderId => Request[OrdersCancelResponse],
    cancellineitem: OrderId => Request[OrdersCancelLineItemResponse],
    createtestorder: QuotaUser => Request[OrdersCreateTestOrderResponse],
    custombatch: Alt => Request[OrdersCustomBatchResponse],
    get: OrderId => Request[Order],
    getbymerchantorderid: MerchantOrderId => Request[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: TemplateName => Request[OrdersGetTestOrderTemplateResponse],
    list: Acknowledged => Request[OrdersListResponse],
    refund: OrderId => Request[OrdersRefundResponse],
    returnlineitem: OrderId => Request[OrdersReturnLineItemResponse],
    shiplineitems: OrderId => Request[OrdersShipLineItemsResponse],
    updatemerchantorderid: OrderId => Request[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: OrderId => Request[OrdersUpdateShipmentResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), advancetestorder = js.Any.fromFunction1(advancetestorder), cancel = js.Any.fromFunction1(cancel), cancellineitem = js.Any.fromFunction1(cancellineitem), createtestorder = js.Any.fromFunction1(createtestorder), custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getbymerchantorderid = js.Any.fromFunction1(getbymerchantorderid), gettestordertemplate = js.Any.fromFunction1(gettestordertemplate), list = js.Any.fromFunction1(list), refund = js.Any.fromFunction1(refund), returnlineitem = js.Any.fromFunction1(returnlineitem), shiplineitems = js.Any.fromFunction1(shiplineitems), updatemerchantorderid = js.Any.fromFunction1(updatemerchantorderid), updateshipment = js.Any.fromFunction1(updateshipment))
    __obj.asInstanceOf[OrdersResource]
  }
  @scala.inline
  implicit class OrdersResourceOps[Self <: OrdersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledge(value: OrderId => Request[OrdersAcknowledgeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdvancetestorder(value: OrderId => Request[OrdersAdvanceTestOrderResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancetestorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancel(value: OrderId => Request[OrdersCancelResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancellineitem(value: OrderId => Request[OrdersCancelLineItemResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellineitem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreatetestorder(value: QuotaUser => Request[OrdersCreateTestOrderResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createtestorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustombatch(value: Alt => Request[OrdersCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: OrderId => Request[Order]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetbymerchantorderid(value: MerchantOrderId => Request[OrdersGetByMerchantOrderIdResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getbymerchantorderid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGettestordertemplate(value: TemplateName => Request[OrdersGetTestOrderTemplateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettestordertemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Acknowledged => Request[OrdersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefund(value: OrderId => Request[OrdersRefundResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReturnlineitem(value: OrderId => Request[OrdersReturnLineItemResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnlineitem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShiplineitems(value: OrderId => Request[OrdersShipLineItemsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiplineitems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdatemerchantorderid(value: OrderId => Request[OrdersUpdateMerchantOrderIdResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatemerchantorderid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateshipment(value: OrderId => Request[OrdersUpdateShipmentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateshipment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

