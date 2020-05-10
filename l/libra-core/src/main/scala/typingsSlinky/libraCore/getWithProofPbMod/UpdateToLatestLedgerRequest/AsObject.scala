package typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var clientKnownVersion: String = js.native
  var requestedItemsList: js.Array[typingsSlinky.libraCore.getWithProofPbMod.RequestItem.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    clientKnownVersion: String,
    requestedItemsList: js.Array[typingsSlinky.libraCore.getWithProofPbMod.RequestItem.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(clientKnownVersion = clientKnownVersion.asInstanceOf[js.Any], requestedItemsList = requestedItemsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientKnownVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKnownVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedItemsList(value: js.Array[typingsSlinky.libraCore.getWithProofPbMod.RequestItem.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedItemsList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

