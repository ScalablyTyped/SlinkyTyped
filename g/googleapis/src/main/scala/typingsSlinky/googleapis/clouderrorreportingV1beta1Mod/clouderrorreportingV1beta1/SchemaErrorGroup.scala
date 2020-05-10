package typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a group of similar error events.
  */
@js.native
trait SchemaErrorGroup extends js.Object {
  /**
    * Group IDs are unique for a given project. If the same kind of error
    * occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The group resource name. Example:
    * &lt;code&gt;projects/my-project-123/groups/my-groupid&lt;/code&gt;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Associated tracking issues.
    */
  var trackingIssues: js.UndefOr[js.Array[SchemaTrackingIssue]] = js.native
}

object SchemaErrorGroup {
  @scala.inline
  def apply(): SchemaErrorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorGroup]
  }
  @scala.inline
  implicit class SchemaErrorGroupOps[Self <: SchemaErrorGroup] (val x: Self) extends AnyVal {
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
    def withTrackingIssues(value: js.Array[SchemaTrackingIssue]): Self = {
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

