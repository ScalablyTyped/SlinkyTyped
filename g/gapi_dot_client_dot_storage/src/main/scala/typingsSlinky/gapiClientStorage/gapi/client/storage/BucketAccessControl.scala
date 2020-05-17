package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClientStorage.anon.ProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAccessControl extends js.Object {
  /** The name of the bucket. */
  var bucket: js.UndefOr[String] = js.native
  /** The domain associated with the entity, if any. */
  var domain: js.UndefOr[String] = js.native
  /** The email address associated with the entity, if any. */
  var email: js.UndefOr[String] = js.native
  /**
    * The entity holding the permission, in one of the following forms:
    * - user-userId
    * - user-email
    * - group-groupId
    * - group-email
    * - domain-domain
    * - project-team-projectId
    * - allUsers
    * - allAuthenticatedUsers Examples:
    * - The user liz@example.com would be user-liz@example.com.
    * - The group example@googlegroups.com would be group-example@googlegroups.com.
    * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
    */
  var entity: js.UndefOr[String] = js.native
  /** The ID for the entity, if any. */
  var entityId: js.UndefOr[String] = js.native
  /** HTTP 1.1 Entity tag for the access-control entry. */
  var etag: js.UndefOr[String] = js.native
  /** The ID of the access-control entry. */
  var id: js.UndefOr[String] = js.native
  /** The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl. */
  var kind: js.UndefOr[String] = js.native
  /** The project team associated with the entity, if any. */
  var projectTeam: js.UndefOr[ProjectNumber] = js.native
  /** The access permission for the entity. */
  var role: js.UndefOr[String] = js.native
  /** The link to this access-control entry. */
  var selfLink: js.UndefOr[String] = js.native
}

object BucketAccessControl {
  @scala.inline
  def apply(): BucketAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketAccessControl]
  }
  @scala.inline
  implicit class BucketAccessControlOps[Self <: BucketAccessControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectTeam(value: ProjectNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectTeam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectTeam")(js.undefined)
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
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
  }
  
}

