package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingIssue extends js.Object {
  /**
    * A URL pointing to a related entry in an issue tracking system.
    * Example: https://github.com/user/project/issues/4
    */
  var url: js.UndefOr[String] = js.native
}

object TrackingIssue {
  @scala.inline
  def apply(): TrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingIssue]
  }
  @scala.inline
  implicit class TrackingIssueOps[Self <: TrackingIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

