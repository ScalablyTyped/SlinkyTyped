package typingsSlinky.googleCloudPubsub.iamMod.google.iam.v1

import typingsSlinky.googleCloudPubsub.iamMod.google.`type`.IExpr
import typingsSlinky.googleCloudPubsub.iamMod.google.iam.v1.BindingDelta.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BindingDelta. */
@js.native
trait IBindingDelta extends js.Object {
  /** BindingDelta action */
  var action: js.UndefOr[Action | Null] = js.native
  /** BindingDelta condition */
  var condition: js.UndefOr[IExpr | Null] = js.native
  /** BindingDelta member */
  var member: js.UndefOr[String | Null] = js.native
  /** BindingDelta role */
  var role: js.UndefOr[String | Null] = js.native
}

object IBindingDelta {
  @scala.inline
  def apply(): IBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindingDelta]
  }
  @scala.inline
  implicit class IBindingDeltaOps[Self <: IBindingDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(null)
        ret
    }
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
    def withMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(null)
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

