package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One delta entry for Binding. Each individual change (only one member in
  * each entry) to a binding will be a separate entry.
  */
@js.native
trait SchemaBindingDelta extends js.Object {
  /**
    * The action that was performed on a Binding. Required
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Unimplemented. The condition that is associated with this binding. This
    * field is logged only for Cloud Audit Logging.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  /**
    * A single identity requesting access for a Cloud Platform resource.
    * Follows the same format of Binding.members. Required
    */
  var member: js.UndefOr[String] = js.native
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`. Required
    */
  var role: js.UndefOr[String] = js.native
}

object SchemaBindingDelta {
  @scala.inline
  def apply(): SchemaBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBindingDelta]
  }
  @scala.inline
  implicit class SchemaBindingDeltaOps[Self <: SchemaBindingDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
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
    def withCondition(value: SchemaExpr): Self = {
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

