package typingsSlinky.googleCloudPubsub.srcPubsubMod

import typingsSlinky.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.native
  var gaxOpts: js.UndefOr[CallOptions] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
}

object PageOptions {
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  @scala.inline
  implicit class PageOptionsOps[Self <: PageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(js.undefined)
        ret
    }
    @scala.inline
    def withGaxOpts(value: CallOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaxOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(js.undefined)
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
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

