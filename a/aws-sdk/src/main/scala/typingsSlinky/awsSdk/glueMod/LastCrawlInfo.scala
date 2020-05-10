package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastCrawlInfo extends js.Object {
  /**
    * If an error occurred, the error information about the last crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  /**
    * The log group for the last crawl.
    */
  var LogGroup: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogGroup] = js.native
  /**
    * The log stream for the last crawl.
    */
  var LogStream: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogStream] = js.native
  /**
    * The prefix for a message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typingsSlinky.awsSdk.glueMod.MessagePrefix] = js.native
  /**
    * The time at which the crawl started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * Status of the last crawl.
    */
  var Status: js.UndefOr[LastCrawlStatus] = js.native
}

object LastCrawlInfo {
  @scala.inline
  def apply(): LastCrawlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastCrawlInfo]
  }
  @scala.inline
  implicit class LastCrawlInfoOps[Self <: LastCrawlInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroup(value: LogGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStream(value: LogStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStream")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagePrefix(value: MessagePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: LastCrawlStatus): Self = {
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

