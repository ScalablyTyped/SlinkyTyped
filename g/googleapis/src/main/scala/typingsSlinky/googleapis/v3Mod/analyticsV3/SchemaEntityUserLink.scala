package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.AnonAccountRef
import typingsSlinky.googleapis.AnonLocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics Entity-User Link. Returns permissions that a
  * user has for an entity.
  */
@js.native
trait SchemaEntityUserLink extends js.Object {
  /**
    * Entity for this link. It can be an account, a web property, or a view
    * (profile).
    */
  var entity: js.UndefOr[AnonAccountRef] = js.native
  /**
    * Entity user link ID
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for entity user link.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Permissions the user has for this entity.
    */
  var permissions: js.UndefOr[AnonLocal] = js.native
  /**
    * Self link for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * User reference.
    */
  var userRef: js.UndefOr[SchemaUserRef] = js.native
}

object SchemaEntityUserLink {
  @scala.inline
  def apply(): SchemaEntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityUserLink]
  }
  @scala.inline
  implicit class SchemaEntityUserLinkOps[Self <: SchemaEntityUserLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: AnonAccountRef): Self = {
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
    def withPermissions(value: AnonLocal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
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
    @scala.inline
    def withUserRef(value: SchemaUserRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRef")(js.undefined)
        ret
    }
  }
  
}

