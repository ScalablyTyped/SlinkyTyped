package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmResponse extends js.Object {
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Hsm] = js.native
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
    def withHsm(value: Hsm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hsm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hsm")(js.undefined)
        ret
    }
  }
  
}

