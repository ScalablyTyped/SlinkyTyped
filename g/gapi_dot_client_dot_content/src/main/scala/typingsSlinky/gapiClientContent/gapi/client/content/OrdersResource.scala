package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonAcknowledged
import typingsSlinky.gapiClientContent.AnonAlt
import typingsSlinky.gapiClientContent.AnonMerchantOrderId
import typingsSlinky.gapiClientContent.AnonOrderId
import typingsSlinky.gapiClientContent.AnonQuotaUser
import typingsSlinky.gapiClientContent.AnonTemplateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: AnonOrderId): Request_[OrdersAcknowledgeResponse] = js.native
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: AnonOrderId): Request_[OrdersAdvanceTestOrderResponse] = js.native
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: AnonOrderId): Request_[OrdersCancelResponse] = js.native
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: AnonOrderId): Request_[OrdersCancelLineItemResponse] = js.native
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: AnonQuotaUser): Request_[OrdersCreateTestOrderResponse] = js.native
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonAlt): Request_[OrdersCustomBatchResponse] = js.native
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonOrderId): Request_[Order] = js.native
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: AnonMerchantOrderId): Request_[OrdersGetByMerchantOrderIdResponse] = js.native
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: AnonTemplateName): Request_[OrdersGetTestOrderTemplateResponse] = js.native
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonAcknowledged): Request_[OrdersListResponse] = js.native
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: AnonOrderId): Request_[OrdersRefundResponse] = js.native
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: AnonOrderId): Request_[OrdersReturnLineItemResponse] = js.native
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: AnonOrderId): Request_[OrdersShipLineItemsResponse] = js.native
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: AnonOrderId): Request_[OrdersUpdateMerchantOrderIdResponse] = js.native
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: AnonOrderId): Request_[OrdersUpdateShipmentResponse] = js.native
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: AnonOrderId => Request_[OrdersAcknowledgeResponse],
    advancetestorder: AnonOrderId => Request_[OrdersAdvanceTestOrderResponse],
    cancel: AnonOrderId => Request_[OrdersCancelResponse],
    cancellineitem: AnonOrderId => Request_[OrdersCancelLineItemResponse],
    createtestorder: AnonQuotaUser => Request_[OrdersCreateTestOrderResponse],
    custombatch: AnonAlt => Request_[OrdersCustomBatchResponse],
    get: AnonOrderId => Request_[Order],
    getbymerchantorderid: AnonMerchantOrderId => Request_[OrdersGetByMerchantOrderIdResponse],
    gettestordertemplate: AnonTemplateName => Request_[OrdersGetTestOrderTemplateResponse],
    list: AnonAcknowledged => Request_[OrdersListResponse],
    refund: AnonOrderId => Request_[OrdersRefundResponse],
    returnlineitem: AnonOrderId => Request_[OrdersReturnLineItemResponse],
    shiplineitems: AnonOrderId => Request_[OrdersShipLineItemsResponse],
    updatemerchantorderid: AnonOrderId => Request_[OrdersUpdateMerchantOrderIdResponse],
    updateshipment: AnonOrderId => Request_[OrdersUpdateShipmentResponse]
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
    def withAcknowledge(value: AnonOrderId => Request_[OrdersAcknowledgeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdvancetestorder(value: AnonOrderId => Request_[OrdersAdvanceTestOrderResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancetestorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancel(value: AnonOrderId => Request_[OrdersCancelResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancellineitem(value: AnonOrderId => Request_[OrdersCancelLineItemResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellineitem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreatetestorder(value: AnonQuotaUser => Request_[OrdersCreateTestOrderResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createtestorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustombatch(value: AnonAlt => Request_[OrdersCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOrderId => Request_[Order]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetbymerchantorderid(value: AnonMerchantOrderId => Request_[OrdersGetByMerchantOrderIdResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getbymerchantorderid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGettestordertemplate(value: AnonTemplateName => Request_[OrdersGetTestOrderTemplateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettestordertemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAcknowledged => Request_[OrdersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefund(value: AnonOrderId => Request_[OrdersRefundResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReturnlineitem(value: AnonOrderId => Request_[OrdersReturnLineItemResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnlineitem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShiplineitems(value: AnonOrderId => Request_[OrdersShipLineItemsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiplineitems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdatemerchantorderid(value: AnonOrderId => Request_[OrdersUpdateMerchantOrderIdResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatemerchantorderid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateshipment(value: AnonOrderId => Request_[OrdersUpdateShipmentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateshipment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

