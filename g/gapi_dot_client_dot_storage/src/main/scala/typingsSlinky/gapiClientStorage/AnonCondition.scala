package typingsSlinky.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCondition extends js.Object {
  var condition: js.UndefOr[js.Any] = js.native
  /**
    * A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
    * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
    * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
    * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
    * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
    *
    * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
    * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
    * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
    * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
    * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided
    * by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
    * The new IAM roles are:
    * - roles/storage.admin — Full control of Google Cloud Storage resources.
    * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
    * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
    * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
    * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
    * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
    *
    * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
    * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the
    * WRITER role.
    * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a
    * bucket with the OWNER role.
    */
  var role: js.UndefOr[String] = js.native
}

object AnonCondition {
  @scala.inline
  def apply(): AnonCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCondition]
  }
  @scala.inline
  implicit class AnonConditionOps[Self <: AnonCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

