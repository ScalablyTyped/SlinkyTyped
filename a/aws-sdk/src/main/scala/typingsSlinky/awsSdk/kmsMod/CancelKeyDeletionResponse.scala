package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelKeyDeletionResponse extends js.Object {
  /**
    * The unique identifier of the master key for which deletion is canceled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object CancelKeyDeletionResponse {
  @scala.inline
  def apply(): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
  @scala.inline
  implicit class CancelKeyDeletionResponseOps[Self <: CancelKeyDeletionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
  }
  
}

