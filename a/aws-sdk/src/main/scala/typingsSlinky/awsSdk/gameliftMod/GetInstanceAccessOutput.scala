package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessOutput extends js.Object {
  /**
    * The connection information for a fleet instance, including IP address and access credentials.
    */
  var InstanceAccess: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.InstanceAccess] = js.native
}

object GetInstanceAccessOutput {
  @scala.inline
  def apply(): GetInstanceAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessOutput]
  }
  @scala.inline
  implicit class GetInstanceAccessOutputOps[Self <: GetInstanceAccessOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceAccess(value: InstanceAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceAccess")(js.undefined)
        ret
    }
  }
  
}

