package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStatefulPolicy extends js.Object {
  var preservedResources: js.UndefOr[SchemaStatefulPolicyPreservedResources] = js.native
  var preservedState: js.UndefOr[SchemaStatefulPolicyPreservedState] = js.native
}

object SchemaStatefulPolicy {
  @scala.inline
  def apply(): SchemaStatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicy]
  }
  @scala.inline
  implicit class SchemaStatefulPolicyOps[Self <: SchemaStatefulPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreservedResources(value: SchemaStatefulPolicyPreservedResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedResources")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservedState(value: SchemaStatefulPolicyPreservedState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservedState")(js.undefined)
        ret
    }
  }
  
}

