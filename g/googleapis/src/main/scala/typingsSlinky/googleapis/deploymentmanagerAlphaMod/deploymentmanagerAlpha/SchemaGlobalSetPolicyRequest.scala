package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGlobalSetPolicyRequest extends js.Object {
  /**
    * Flatten Policy to create a backward compatible wire-format. Deprecated.
    * Use &#39;policy&#39; to specify bindings.
    */
  var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.native
  /**
    * Flatten Policy to create a backward compatible wire-format. Deprecated.
    * Use &#39;policy&#39; to specify the etag.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * REQUIRED: The complete policy to be applied to the &#39;resource&#39;.
    * The size of the policy is limited to a few 10s of KB. An empty policy is
    * in general a valid policy but certain services (like Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}

object SchemaGlobalSetPolicyRequest {
  @scala.inline
  def apply(): SchemaGlobalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalSetPolicyRequest]
  }
  @scala.inline
  implicit class SchemaGlobalSetPolicyRequestOps[Self <: SchemaGlobalSetPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: js.Array[SchemaBinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: SchemaPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}

