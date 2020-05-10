package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchedLogStream extends js.Object {
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  /**
    * Indicates whether all the events in this log stream were searched.
    */
  var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.native
}

object SearchedLogStream {
  @scala.inline
  def apply(): SearchedLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchedLogStream]
  }
  @scala.inline
  implicit class SearchedLogStreamOps[Self <: SearchedLogStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogStreamName(value: LogStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchedCompletely(value: LogStreamSearchedCompletely): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchedCompletely")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchedCompletely: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchedCompletely")(js.undefined)
        ret
    }
  }
  
}

