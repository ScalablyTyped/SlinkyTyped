package typingsSlinky.gapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileFriendlyIssue extends js.Object {
  /** Rule violated. */
  var rule: js.UndefOr[String] = js.native
}

object MobileFriendlyIssue {
  @scala.inline
  def apply(): MobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileFriendlyIssue]
  }
  @scala.inline
  implicit class MobileFriendlyIssueOps[Self <: MobileFriendlyIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

