package typingsSlinky.googleCloudKms.mod.v1.KeyManagementServiceClient

import typingsSlinky.googleCloudKms.PartialKeyRing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeyRingRequest extends js.Object {
  var keyRing: js.UndefOr[PartialKeyRing] = js.native
  var keyRingId: String = js.native
  var parent: String = js.native
}

object CreateKeyRingRequest {
  @scala.inline
  def apply(keyRingId: String, parent: String): CreateKeyRingRequest = {
    val __obj = js.Dynamic.literal(keyRingId = keyRingId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyRingRequest]
  }
  @scala.inline
  implicit class CreateKeyRingRequestOps[Self <: CreateKeyRingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyRingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyRing(value: PartialKeyRing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRing")(js.undefined)
        ret
    }
  }
  
}

