package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetedManagedAppProtection extends ManagedAppProtection {
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.native
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.native
}

object TargetedManagedAppProtection {
  @scala.inline
  def apply(): TargetedManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppProtection]
  }
  @scala.inline
  implicit class TargetedManagedAppProtectionOps[Self <: TargetedManagedAppProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[TargetedManagedAppPolicyAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAssigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAssigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssigned")(js.undefined)
        ret
    }
  }
  
}

