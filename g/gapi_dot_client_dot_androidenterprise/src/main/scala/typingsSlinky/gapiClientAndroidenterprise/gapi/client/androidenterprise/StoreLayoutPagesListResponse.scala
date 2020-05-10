package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreLayoutPagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutPagesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A store page of an enterprise. */
  var page: js.UndefOr[js.Array[StorePage]] = js.native
}

object StoreLayoutPagesListResponse {
  @scala.inline
  def apply(): StoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutPagesListResponse]
  }
  @scala.inline
  implicit class StoreLayoutPagesListResponseOps[Self <: StoreLayoutPagesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: js.Array[StorePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
  }
  
}

