package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HapgArn] = js.native
}

object ModifyHapgResponse {
  @scala.inline
  def apply(): ModifyHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHapgResponse]
  }
  @scala.inline
  implicit class ModifyHapgResponseOps[Self <: ModifyHapgResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHapgArn(value: HapgArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HapgArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHapgArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HapgArn")(js.undefined)
        ret
    }
  }
  
}

