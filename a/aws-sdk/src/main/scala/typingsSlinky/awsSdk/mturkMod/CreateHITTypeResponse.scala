package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITTypeResponse extends js.Object {
  /**
    *  The ID of the newly registered HIT type.
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
}

object CreateHITTypeResponse {
  @scala.inline
  def apply(): CreateHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITTypeResponse]
  }
  @scala.inline
  implicit class CreateHITTypeResponseOps[Self <: CreateHITTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(js.undefined)
        ret
    }
  }
  
}

