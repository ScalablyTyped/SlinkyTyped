package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmResponse extends js.Object {
  /**
    * The identifier (ID) of the HSM that was deleted.
    */
  var HsmId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}

object DeleteHsmResponse {
  @scala.inline
  def apply(): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteHsmResponse]
  }
  @scala.inline
  implicit class DeleteHsmResponseOps[Self <: DeleteHsmResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmId(value: HsmId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmId")(js.undefined)
        ret
    }
  }
  
}

