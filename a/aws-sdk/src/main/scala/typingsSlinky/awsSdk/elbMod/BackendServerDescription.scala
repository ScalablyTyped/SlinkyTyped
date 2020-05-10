package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServerDescription extends js.Object {
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[typingsSlinky.awsSdk.elbMod.InstancePort] = js.native
  /**
    * The names of the policies enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyNames] = js.native
}

object BackendServerDescription {
  @scala.inline
  def apply(): BackendServerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServerDescription]
  }
  @scala.inline
  implicit class BackendServerDescriptionOps[Self <: BackendServerDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancePort(value: InstancePort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancePort")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyNames(value: PolicyNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyNames")(js.undefined)
        ret
    }
  }
  
}

