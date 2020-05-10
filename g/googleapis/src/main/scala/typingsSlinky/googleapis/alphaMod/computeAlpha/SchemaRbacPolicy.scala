package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRbacPolicy extends js.Object {
  /**
    * Name of the RbacPolicy.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of permissions.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  /**
    * The list of principals.
    */
  var principals: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
}

object SchemaRbacPolicy {
  @scala.inline
  def apply(): SchemaRbacPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRbacPolicy]
  }
  @scala.inline
  implicit class SchemaRbacPolicyOps[Self <: SchemaRbacPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPermissions(value: js.Array[SchemaPermission]): Self = {
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
    def withPrincipals(value: js.Array[SchemaPrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principals")(js.undefined)
        ret
    }
  }
  
}

