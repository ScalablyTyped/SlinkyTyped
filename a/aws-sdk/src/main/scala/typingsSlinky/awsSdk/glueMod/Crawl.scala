package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crawl extends js.Object {
  /**
    * The date and time on which the crawl completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * The error message associated with the crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  /**
    * The log group associated with the crawl.
    */
  var LogGroup: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogGroup] = js.native
  /**
    * The log stream associated with the crawl.
    */
  var LogStream: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogStream] = js.native
  /**
    * The date and time on which the crawl started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The state of the crawler.
    */
  var State: js.UndefOr[CrawlState] = js.native
}

object Crawl {
  @scala.inline
  def apply(): Crawl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawl]
  }
  @scala.inline
  implicit class CrawlOps[Self <: Crawl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(js.undefined)
        ret
    }
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
    def withStartedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CrawlState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

