package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostsResult extends js.Object {
  /**
    * The ID of the allocated Dedicated Host. This is used to launch an instance onto a specific host.
    */
  var HostIds: js.UndefOr[ResponseHostIdList] = js.native
}

object AllocateHostsResult {
  @scala.inline
  def apply(): AllocateHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateHostsResult]
  }
  @scala.inline
  implicit class AllocateHostsResultOps[Self <: AllocateHostsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostIds(value: ResponseHostIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIds")(js.undefined)
        ret
    }
  }
  
}

