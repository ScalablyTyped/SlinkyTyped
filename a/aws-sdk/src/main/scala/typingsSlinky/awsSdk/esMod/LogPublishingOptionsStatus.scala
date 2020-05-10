package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogPublishingOptionsStatus extends js.Object {
  /**
    * The log publishing options configured for the Elasticsearch domain.
    */
  var Options: js.UndefOr[LogPublishingOptions] = js.native
  /**
    * The status of the log publishing options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: js.UndefOr[OptionStatus] = js.native
}

object LogPublishingOptionsStatus {
  @scala.inline
  def apply(): LogPublishingOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOptionsStatus]
  }
  @scala.inline
  implicit class LogPublishingOptionsStatusOps[Self <: LogPublishingOptionsStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: LogPublishingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: OptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

