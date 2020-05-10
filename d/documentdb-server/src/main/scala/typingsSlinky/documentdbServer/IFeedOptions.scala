package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read feed or query operation. */
@js.native
trait IFeedOptions extends js.Object {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.native
  /** Allow order by with low precision (only for queryDocuments(), sortBy() and sortByDescending()) */
  var enableLowPrecisionOrderBy: js.UndefOr[Boolean] = js.native
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths (only for queryDocuments() and queryAttachments()) */
  var enableScan: js.UndefOr[Boolean] = js.native
  /**
  	 * Max number of items to be returned in the enumeration operation.
  	 * Value is 100 by default
  	 */
  var pageSize: js.UndefOr[Double] = js.native
}

object IFeedOptions {
  @scala.inline
  def apply(): IFeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeedOptions]
  }
  @scala.inline
  implicit class IFeedOptionsOps[Self <: IFeedOptions] (val x: Self) extends AnyVal {
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
    def withEnableLowPrecisionOrderBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLowPrecisionOrderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLowPrecisionOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLowPrecisionOrderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableScan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScan")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
  }
  
}

