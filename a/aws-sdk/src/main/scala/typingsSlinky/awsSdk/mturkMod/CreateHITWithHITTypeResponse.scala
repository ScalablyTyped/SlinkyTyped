package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITWithHITTypeResponse extends js.Object {
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[typingsSlinky.awsSdk.mturkMod.HIT] = js.native
}

object CreateHITWithHITTypeResponse {
  @scala.inline
  def apply(): CreateHITWithHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITWithHITTypeResponse]
  }
  @scala.inline
  implicit class CreateHITWithHITTypeResponseOps[Self <: CreateHITWithHITTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHIT(value: HIT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIT")(js.undefined)
        ret
    }
  }
  
}

