package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyRotationStatusResponse extends js.Object {
  /**
    * A Boolean value that specifies whether key rotation is enabled.
    */
  var KeyRotationEnabled: js.UndefOr[BooleanType] = js.native
}

object GetKeyRotationStatusResponse {
  @scala.inline
  def apply(): GetKeyRotationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyRotationStatusResponse]
  }
  @scala.inline
  implicit class GetKeyRotationStatusResponseOps[Self <: GetKeyRotationStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyRotationEnabled(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationEnabled")(js.undefined)
        ret
    }
  }
  
}

