package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContent.anon.DatafeedId
import typingsSlinky.gapiClientContent.anon.DryRun
import typingsSlinky.gapiClientContent.anon.MaxResults
import typingsSlinky.gapiClientContent.anon.MerchantId
import typingsSlinky.gapiClientContent.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsResource extends js.Object {
  def custombatch(request: DryRun): Request[DatafeedsCustomBatchResponse] = js.native
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: DatafeedId): Request[Unit] = js.native
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: PrettyPrint): Request[Datafeed] = js.native
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: MerchantId): Request[Datafeed] = js.native
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: MaxResults): Request[DatafeedsListResponse] = js.native
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: DatafeedId): Request[Datafeed] = js.native
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: DatafeedId): Request[Datafeed] = js.native
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[DatafeedsCustomBatchResponse],
    delete: DatafeedId => Request[Unit],
    get: PrettyPrint => Request[Datafeed],
    insert: MerchantId => Request[Datafeed],
    list: MaxResults => Request[DatafeedsListResponse],
    patch: DatafeedId => Request[Datafeed],
    update: DatafeedId => Request[Datafeed]
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
    def withCustombatch(value: DryRun => Request[DatafeedsCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: DatafeedId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: PrettyPrint => Request[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: MerchantId => Request[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[DatafeedsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: DatafeedId => Request[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: DatafeedId => Request[Datafeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

