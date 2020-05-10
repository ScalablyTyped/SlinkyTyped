package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesAddResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be added to this instance.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object SchemaInstancesAddResourcePoliciesRequest {
  @scala.inline
  def apply(): SchemaInstancesAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesAddResourcePoliciesRequest]
  }
  @scala.inline
  implicit class SchemaInstancesAddResourcePoliciesRequestOps[Self <: SchemaInstancesAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
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

