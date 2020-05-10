package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Lien represents an encumbrance on the actions that can be performed on a
  * resource.
  */
@js.native
trait SchemaLien extends js.Object {
  /**
    * The creation time of this Lien.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * A system-generated unique identifier for this Lien.  Example:
    * `liens/1234abcd`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A stable, user-visible/meaningful string identifying the origin of the
    * Lien, intended to be inspected programmatically. Maximum length of 200
    * characters.  Example: &#39;compute.googleapis.com&#39;
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * A reference to the resource this Lien is attached to. The server will
    * validate the parent against those for which Liens are supported. Example:
    * `projects/1234`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Concise user-visible strings indicating why an action cannot be performed
    * on a resource. Maximum length of 200 characters.  Example: &#39;Holds
    * production API key&#39;
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The types of operations which should be blocked as a result of this Lien.
    * Each value should correspond to an IAM permission. The server will
    * validate the permissions against those for which Liens are supported.  An
    * empty list is meaningless and will be rejected.  Example:
    * [&#39;resourcemanager.projects.delete&#39;]
    */
  var restrictions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaLien {
  @scala.inline
  def apply(): SchemaLien = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLien]
  }
  @scala.inline
  implicit class SchemaLienOps[Self <: SchemaLien] (val x: Self) extends AnyVal {
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
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
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
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
  }
  
}

