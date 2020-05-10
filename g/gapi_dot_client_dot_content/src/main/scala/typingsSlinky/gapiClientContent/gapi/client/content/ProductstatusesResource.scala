package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonFieldsIncludeAttributes
import typingsSlinky.gapiClientContent.AnonIncludeAttributes
import typingsSlinky.gapiClientContent.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonIncludeAttributes): Request_[ProductstatusesCustomBatchResponse] = js.native
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonFieldsIncludeAttributes): Request_[ProductStatus] = js.native
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonPageToken): Request_[ProductstatusesListResponse] = js.native
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonIncludeAttributes => Request_[ProductstatusesCustomBatchResponse],
    get: AnonFieldsIncludeAttributes => Request_[ProductStatus],
    list: AnonPageToken => Request_[ProductstatusesListResponse]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProductstatusesResource]
  }
  @scala.inline
  implicit class ProductstatusesResourceOps[Self <: ProductstatusesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: AnonIncludeAttributes => Request_[ProductstatusesCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsIncludeAttributes => Request_[ProductStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageToken => Request_[ProductstatusesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

