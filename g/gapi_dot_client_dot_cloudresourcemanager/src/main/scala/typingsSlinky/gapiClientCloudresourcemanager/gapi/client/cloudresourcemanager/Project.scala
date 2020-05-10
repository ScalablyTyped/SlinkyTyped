package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /**
    * Creation time.
    *
    * Read-only.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The labels associated with this Project.
    *
    * Label keys must be between 1 and 63 characters long and must conform
    * to the following regular expression: \[a-z\](\[-a-z0-9\]&#42;\[a-z0-9\])?.
    *
    * Label values must be between 0 and 63 characters long and must conform
    * to the regular expression (\[a-z\](\[-a-z0-9\]&#42;\[a-z0-9\])?)?.
    *
    * No more than 256 labels can be associated with a given resource.
    *
    * Clients should store labels in a representation such as JSON that does not
    * depend on specific characters being disallowed.
    *
    * Example: <code>"environment" : "dev"</code>
    * Read-write.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * The Project lifecycle state.
    *
    * Read-only.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * The user-assigned display name of the Project.
    * It must be 4 to 30 characters.
    * Allowed characters are: lowercase and uppercase letters, numbers,
    * hyphen, single-quote, double-quote, space, and exclamation point.
    *
    * Example: <code>My Project</code>
    * Read-write.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An optional reference to a parent Resource.
    *
    * The only supported parent type is "organization". Once set, the parent
    * cannot be modified. The `parent` can be set on creation or using the
    * `UpdateProject` method; the end user must have the
    * `resourcemanager.projects.create` permission on the parent.
    *
    * Read-write.
    */
  var parent: js.UndefOr[ResourceId] = js.native
  /**
    * The unique, user-assigned ID of the Project.
    * It must be 6 to 30 lowercase letters, digits, or hyphens.
    * It must start with a letter.
    * Trailing hyphens are prohibited.
    *
    * Example: <code>tokyo-rain-123</code>
    * Read-only after creation.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The number uniquely identifying the project.
    *
    * Example: <code>415104041262</code>
    * Read-only.
    */
  var projectNumber: js.UndefOr[String] = js.native
}

object Project {
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleState")(js.undefined)
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
    def withParent(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(js.undefined)
        ret
    }
  }
  
}

