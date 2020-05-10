package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseHostsResult extends js.Object {
  /**
    * The IDs of the Dedicated Hosts that were successfully released.
    */
  var Successful: js.UndefOr[ResponseHostIdList] = js.native
  /**
    * The IDs of the Dedicated Hosts that could not be released, including an error message.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.native
}

object ReleaseHostsResult {
  @scala.inline
  def apply(): ReleaseHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseHostsResult]
  }
  @scala.inline
  implicit class ReleaseHostsResultOps[Self <: ReleaseHostsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccessful(value: ResponseHostIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessful(value: UnsuccessfulItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuccessful")(js.undefined)
        ret
    }
  }
  
}

