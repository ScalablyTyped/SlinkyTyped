package typingsSlinky.googleCloudPubsub.protosMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetPolicyOptions. */
@js.native
trait IGetPolicyOptions extends js.Object {
  /** GetPolicyOptions requestedPolicyVersion */
  var requestedPolicyVersion: js.UndefOr[Double | Null] = js.native
}

object IGetPolicyOptions {
  @scala.inline
  def apply(): IGetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPolicyOptions]
  }
  @scala.inline
  implicit class IGetPolicyOptionsOps[Self <: IGetPolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestedPolicyVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPolicyVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedPolicyVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPolicyVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedPolicyVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPolicyVersion")(null)
        ret
    }
  }
  
}

