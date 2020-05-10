package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProtectionResponse extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object that is created.
    */
  var ProtectionId: js.UndefOr[typingsSlinky.awsSdk.shieldMod.ProtectionId] = js.native
}

object CreateProtectionResponse {
  @scala.inline
  def apply(): CreateProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProtectionResponse]
  }
  @scala.inline
  implicit class CreateProtectionResponseOps[Self <: CreateProtectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtectionId(value: ProtectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectionId")(js.undefined)
        ret
    }
  }
  
}

