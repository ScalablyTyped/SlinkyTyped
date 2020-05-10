package typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `AccessPolicy` is a container for `AccessLevels` (which define the
  * necessary attributes to use GCP services) and `ServicePerimeters` (which
  * define regions of services able to freely pass data within a perimeter). An
  * access policy is globally visible within an organization, and the
  * restrictions it specifies apply to all projects within an organization.
  */
@js.native
trait SchemaAccessPolicy extends js.Object {
  /**
    * Output only. Time the `AccessPolicy` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Resource name of the `AccessPolicy`. Format:
    * `accessPolicies/{policy_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The parent of this `AccessPolicy` in the Cloud Resource
    * Hierarchy. Currently immutable once created. Format:
    * `organizations/{organization_id}`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Required. Human readable title. Does not affect behavior.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. Time the `AccessPolicy` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAccessPolicy {
  @scala.inline
  def apply(): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
  @scala.inline
  implicit class SchemaAccessPolicyOps[Self <: SchemaAccessPolicy] (val x: Self) extends AnyVal {
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
    def withParent(value: String): Self = {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

