package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmResponse extends js.Object {
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HsmArn] = js.native
}

object CreateHsmResponse {
  @scala.inline
  def apply(): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmResponse]
  }
  @scala.inline
  implicit class CreateHsmResponseOps[Self <: CreateHsmResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmArn(value: HsmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(js.undefined)
        ret
    }
  }
  
}

