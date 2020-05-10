package typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var eventsWithProofList: js.Array[typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject] = js.native
  var proofOfLatestEvent: js.UndefOr[typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(eventsWithProofList: js.Array[typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(eventsWithProofList = eventsWithProofList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsWithProofList(value: js.Array[typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsWithProofList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProofOfLatestEvent(value: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfLatestEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfLatestEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfLatestEvent")(js.undefined)
        ret
    }
  }
  
}

