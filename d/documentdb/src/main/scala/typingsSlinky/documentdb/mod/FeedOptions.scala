package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedOptions extends RequestOptions {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.native
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths. */
  var enableScanInQuery: js.UndefOr[Boolean] = js.native
  /** Max number of items to be returned in the enumeration operation. */
  var maxItemCount: js.UndefOr[Double] = js.native
}

object FeedOptions {
  @scala.inline
  def apply(): FeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedOptions]
  }
  @scala.inline
  implicit class FeedOptionsOps[Self <: FeedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableScanInQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScanInQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScanInQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScanInQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(js.undefined)
        ret
    }
  }
  
}

