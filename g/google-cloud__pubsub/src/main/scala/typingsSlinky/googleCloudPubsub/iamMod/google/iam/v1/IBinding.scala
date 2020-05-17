package typingsSlinky.googleCloudPubsub.iamMod.google.iam.v1

import typingsSlinky.googleCloudPubsub.iamMod.google.`type`.IExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Binding. */
@js.native
trait IBinding extends js.Object {
  /** Binding condition */
  var condition: js.UndefOr[IExpr | Null] = js.native
  /** Binding members */
  var members: js.UndefOr[js.Array[String] | Null] = js.native
  /** Binding role */
  var role: js.UndefOr[String | Null] = js.native
}

object IBinding {
  @scala.inline
  def apply(): IBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBinding]
  }
  @scala.inline
  implicit class IBindingOps[Self <: IBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: IExpr): Self = {
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
    def withConditionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(null)
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
    def withMembersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(null)
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
    def withRoleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(null)
        ret
    }
  }
  
}

