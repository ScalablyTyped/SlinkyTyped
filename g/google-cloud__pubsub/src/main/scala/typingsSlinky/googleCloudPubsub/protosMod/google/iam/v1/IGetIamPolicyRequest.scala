package typingsSlinky.googleCloudPubsub.protosMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetIamPolicyRequest. */
@js.native
trait IGetIamPolicyRequest extends js.Object {
  /** GetIamPolicyRequest options */
  var options: js.UndefOr[IGetPolicyOptions | Null] = js.native
  /** GetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.native
}

object IGetIamPolicyRequest {
  @scala.inline
  def apply(): IGetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIamPolicyRequest]
  }
  @scala.inline
  implicit class IGetIamPolicyRequestOps[Self <: IGetIamPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: IGetPolicyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(null)
        ret
    }
  }
  
}

