package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableZonesResponse extends js.Object {
  /**
    * The list of Availability Zones that have available AWS CloudHSM capacity.
    */
  var AZList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.AZList] = js.native
}

object ListAvailableZonesResponse {
  @scala.inline
  def apply(): ListAvailableZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableZonesResponse]
  }
  @scala.inline
  implicit class ListAvailableZonesResponseOps[Self <: ListAvailableZonesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAZList(value: AZList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AZList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAZList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AZList")(js.undefined)
        ret
    }
  }
  
}

