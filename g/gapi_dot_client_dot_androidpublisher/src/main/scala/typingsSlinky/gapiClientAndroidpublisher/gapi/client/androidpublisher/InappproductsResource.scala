package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonAutoConvertMissingPrices
import typingsSlinky.gapiClientAndroidpublisher.AnonPrettyPrint
import typingsSlinky.gapiClientAndroidpublisher.AnonQuotaUser
import typingsSlinky.gapiClientAndroidpublisher.AnonSku
import typingsSlinky.gapiClientAndroidpublisher.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsResource extends js.Object {
  def batch(request: AnonPrettyPrint): Request_[InappproductsBatchResponse] = js.native
  /** Delete an in-app product for an app. */
  def delete(request: AnonQuotaUser): Request_[Unit] = js.native
  /** Returns information about the in-app product specified. */
  def get(request: AnonQuotaUser): Request_[InAppProduct] = js.native
  /** Creates a new in-app product for an app. */
  def insert(request: AnonAutoConvertMissingPrices): Request_[InAppProduct] = js.native
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: AnonStartIndex): Request_[InappproductsListResponse] = js.native
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: AnonSku): Request_[InAppProduct] = js.native
  /** Updates the details of an in-app product. */
  def update(request: AnonSku): Request_[InAppProduct] = js.native
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: AnonPrettyPrint => Request_[InappproductsBatchResponse],
    delete: AnonQuotaUser => Request_[Unit],
    get: AnonQuotaUser => Request_[InAppProduct],
    insert: AnonAutoConvertMissingPrices => Request_[InAppProduct],
    list: AnonStartIndex => Request_[InappproductsListResponse],
    patch: AnonSku => Request_[InAppProduct],
    update: AnonSku => Request_[InAppProduct]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction1(batch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[InappproductsResource]
  }
  @scala.inline
  implicit class InappproductsResourceOps[Self <: InappproductsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch(value: AnonPrettyPrint => Request_[InappproductsBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonQuotaUser => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUser => Request_[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAutoConvertMissingPrices => Request_[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonStartIndex => Request_[InappproductsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonSku => Request_[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonSku => Request_[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

