package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidpublisher.anon.AutoConvertMissingPrices
import typingsSlinky.gapiClientAndroidpublisher.anon.PrettyPrint
import typingsSlinky.gapiClientAndroidpublisher.anon.QuotaUser
import typingsSlinky.gapiClientAndroidpublisher.anon.Sku
import typingsSlinky.gapiClientAndroidpublisher.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsResource extends js.Object {
  def batch(request: PrettyPrint): Request[InappproductsBatchResponse] = js.native
  /** Delete an in-app product for an app. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Returns information about the in-app product specified. */
  def get(request: QuotaUser): Request[InAppProduct] = js.native
  /** Creates a new in-app product for an app. */
  def insert(request: AutoConvertMissingPrices): Request[InAppProduct] = js.native
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: StartIndex): Request[InappproductsListResponse] = js.native
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: Sku): Request[InAppProduct] = js.native
  /** Updates the details of an in-app product. */
  def update(request: Sku): Request[InAppProduct] = js.native
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: PrettyPrint => Request[InappproductsBatchResponse],
    delete: QuotaUser => Request[Unit],
    get: QuotaUser => Request[InAppProduct],
    insert: AutoConvertMissingPrices => Request[InAppProduct],
    list: StartIndex => Request[InappproductsListResponse],
    patch: Sku => Request[InAppProduct],
    update: Sku => Request[InAppProduct]
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
    def withBatch(value: PrettyPrint => Request[InappproductsBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: QuotaUser => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: QuotaUser => Request[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AutoConvertMissingPrices => Request[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: StartIndex => Request[InappproductsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Sku => Request[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Sku => Request[InAppProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

