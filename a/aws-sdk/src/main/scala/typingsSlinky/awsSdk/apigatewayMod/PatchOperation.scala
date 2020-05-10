package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchOperation extends js.Object {
  /**
    * The copy update operation's source as identified by a JSON-Pointer value referencing the location within the targeted resource to copy the value from. For example, to promote a canary deployment, you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH request on a Stage resource with "op":"copy", "from":"/canarySettings/deploymentId" and "path":"/deploymentId".
    */
  var from: js.UndefOr[String] = js.native
  /**
    *  An update operation to be performed with this PATCH request. The valid value can be add, remove, replace or copy. Not all valid operations are supported for a given resource. Support of the operations depends on specific operational contexts. Attempts to apply an unsupported operation on a resource will return an error message.
    */
  var op: js.UndefOr[Op] = js.native
  /**
    * The op operation's target, as identified by a JSON Pointer value that references a location within the targeted resource. For example, if the target resource has an updateable property of {"name":"value"}, the path for this property is /name. If the name property value is a JSON object (e.g., {"name": {"child/name": "child-value"}}), the path for the child/name property will be /name/child~1name. Any slash ("/") character appearing in path names must be escaped with "~1", as shown in the example above. Each op operation can have only one path associated with it.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The new target value of the update operation. It is applicable for the add or replace operation. When using AWS CLI to update a property of a JSON value, enclose the JSON object with a pair of single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see Using JSON for Parameters.
    */
  var value: js.UndefOr[String] = js.native
}

object PatchOperation {
  @scala.inline
  def apply(): PatchOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchOperation]
  }
  @scala.inline
  implicit class PatchOperationOps[Self <: PatchOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withOp(value: Op): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

