package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a user, group, or domain.
  */
@js.native
trait SchemaPrincipal extends js.Object {
  /**
    * This principal is a group identified using an external identity. The name
    * field must specify the group resource name with this format:
    * identitysources/{source_id}/groups/{ID}
    */
  var groupResourceName: js.UndefOr[String] = js.native
  /**
    * This principal is a GSuite user, group or domain.
    */
  var gsuitePrincipal: js.UndefOr[SchemaGSuitePrincipal] = js.native
  /**
    * This principal is a user identified using an external identity. The name
    * field must specify the user resource name with this format:
    * identitysources/{source_id}/users/{ID}
    */
  var userResourceName: js.UndefOr[String] = js.native
}

object SchemaPrincipal {
  @scala.inline
  def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  @scala.inline
  implicit class SchemaPrincipalOps[Self <: SchemaPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withGsuitePrincipal(value: SchemaGSuitePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuitePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGsuitePrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuitePrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withUserResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userResourceName")(js.undefined)
        ret
    }
  }
  
}

