package typingsSlinky.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly issue.
  */
@js.native
trait SchemaMobileFriendlyIssue extends js.Object {
  /**
    * Rule violated.
    */
  var rule: js.UndefOr[String] = js.native
}

object SchemaMobileFriendlyIssue {
  @scala.inline
  def apply(): SchemaMobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileFriendlyIssue]
  }
  @scala.inline
  implicit class SchemaMobileFriendlyIssueOps[Self <: SchemaMobileFriendlyIssue] (val x: Self) extends AnyVal {
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

