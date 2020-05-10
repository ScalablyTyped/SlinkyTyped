package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonDatafeedId
import typingsSlinky.gapiClientContent.AnonDryRun
import typingsSlinky.gapiClientContent.AnonMaxResults
import typingsSlinky.gapiClientContent.AnonMerchantId
import typingsSlinky.gapiClientContent.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsResource extends js.Object {
  def custombatch(request: AnonDryRun): Request_[DatafeedsCustomBatchResponse] = js.native
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: AnonDatafeedId): Request_[Unit] = js.native
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonPrettyPrint): Request_[Datafeed] = js.native
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: AnonMerchantId): Request_[Datafeed] = js.native
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonMaxResults): Request_[DatafeedsListResponse] = js.native
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: AnonDatafeedId): Request_[Datafeed] = js.native
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: AnonDatafeedId): Request_[Datafeed] = js.native
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[DatafeedsCustomBatchResponse],
    delete: AnonDatafeedId => Request_[Unit],
    get: AnonPrettyPrint => Request_[Datafeed],
    insert: AnonMerchantId => Request_[Datafeed],
    list: AnonMaxResults => Request_[DatafeedsListResponse],
    patch: AnonDatafeedId => Request_[Datafeed],
    update: AnonDatafeedId => Request_[Datafeed]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatafeedsResource]
  }
  @scala.inline
  implicit class DatafeedsResourceOps[Self <: DatafeedsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: AnonDryRun => Request_[DatafeedsCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonDatafeedId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPrettyPrint => Request_[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonMerchantId => Request_[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[DatafeedsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonDatafeedId => Request_[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonDatafeedId => Request_[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

