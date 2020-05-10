package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorGroup extends js.Object {
  /**
    * Group IDs are unique for a given project. If the same kind of error
    * occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The group resource name.
    * Example: <code>projects/my-project-123/groups/my-groupid</code>
    */
  var name: js.UndefOr[String] = js.native
  /** Associated tracking issues. */
  var trackingIssues: js.UndefOr[js.Array[TrackingIssue]] = js.native
}

object ErrorGroup {
  @scala.inline
  def apply(): ErrorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorGroup]
  }
  @scala.inline
  implicit class ErrorGroupOps[Self <: ErrorGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingIssues(value: js.Array[TrackingIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingIssues")(js.undefined)
        ret
    }
  }
  
}

