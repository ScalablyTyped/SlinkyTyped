package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Project is a high-level Google Cloud Platform entity.  It is a container
  * for ACLs, APIs, App Engine Apps, VMs, and other Google Cloud Platform
  * resources.
  */
@js.native
trait SchemaProject extends js.Object {
  /**
    * Creation time.  Read-only.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The labels associated with this Project.  Label keys must be between 1
    * and 63 characters long and must conform to the following regular
    * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.  Label values must be
    * between 0 and 63 characters long and must conform to the regular
    * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. A label value can be
    * empty.  No more than 256 labels can be associated with a given resource.
    * Clients should store labels in a representation such as JSON that does
    * not depend on specific characters being disallowed.  Example:
    * &lt;code&gt;&quot;environment&quot; : &quot;dev&quot;&lt;/code&gt;
    * Read-write.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The Project lifecycle state.  Read-only.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * The optional user-assigned display name of the Project. When present it
    * must be between 4 to 30 characters. Allowed characters are: lowercase and
    * uppercase letters, numbers, hyphen, single-quote, double-quote, space,
    * and exclamation point.  Example: &lt;code&gt;My Project&lt;/code&gt;
    * Read-write.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An optional reference to a parent Resource.  Supported parent types
    * include &quot;organization&quot; and &quot;folder&quot;. Once set, the
    * parent cannot be cleared. The `parent` can be set on creation or using
    * the `UpdateProject` method; the end user must have the
    * `resourcemanager.projects.create` permission on the parent.  Read-write.
    */
  var parent: js.UndefOr[SchemaResourceId] = js.native
  /**
    * The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase
    * letters, digits, or hyphens. It must start with a letter. Trailing
    * hyphens are prohibited.  Example: &lt;code&gt;tokyo-rain-123&lt;/code&gt;
    * Read-only after creation.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The number uniquely identifying the project.  Example:
    * &lt;code&gt;415104041262&lt;/code&gt; Read-only.
    */
  var projectNumber: js.UndefOr[String] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  @scala.inline
  implicit class SchemaProjectOps[Self <: SchemaProject] (val x: Self) extends AnyVal {
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
    def withLabels(value: StringDictionary[String]): Self = {
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
    def withParent(value: SchemaResourceId): Self = {
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

