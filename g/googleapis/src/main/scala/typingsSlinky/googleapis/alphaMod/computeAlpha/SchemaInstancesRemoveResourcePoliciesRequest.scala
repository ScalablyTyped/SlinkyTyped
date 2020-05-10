package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesRemoveResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be removed from this instance.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object SchemaInstancesRemoveResourcePoliciesRequest {
  @scala.inline
  def apply(): SchemaInstancesRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRemoveResourcePoliciesRequest]
  }
  @scala.inline
  implicit class SchemaInstancesRemoveResourcePoliciesRequestOps[Self <: SchemaInstancesRemoveResourcePoliciesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourcePolicies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePolicies")(js.undefined)
        ret
    }
  }
  
}

