package typingsSlinky.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a resource with issue.
  */
@js.native
trait SchemaResourceIssue extends js.Object {
  /**
    * Describes a blocked resource issue.
    */
  var blockedResource: js.UndefOr[SchemaBlockedResource] = js.native
}

object SchemaResourceIssue {
  @scala.inline
  def apply(): SchemaResourceIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceIssue]
  }
  @scala.inline
  implicit class SchemaResourceIssueOps[Self <: SchemaResourceIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedResource(value: SchemaBlockedResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedResource")(js.undefined)
        ret
    }
  }
  
}

