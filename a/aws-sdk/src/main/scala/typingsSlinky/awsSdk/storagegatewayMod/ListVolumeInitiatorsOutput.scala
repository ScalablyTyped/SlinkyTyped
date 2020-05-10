package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVolumeInitiatorsOutput extends js.Object {
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Initiators] = js.native
}

object ListVolumeInitiatorsOutput {
  @scala.inline
  def apply(): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
  @scala.inline
  implicit class ListVolumeInitiatorsOutputOps[Self <: ListVolumeInitiatorsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitiators(value: Initiators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiators")(js.undefined)
        ret
    }
  }
  
}

