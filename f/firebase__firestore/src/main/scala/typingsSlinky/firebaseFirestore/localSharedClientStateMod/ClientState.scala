package typingsSlinky.firebaseFirestore.localSharedClientStateMod

import typingsSlinky.firebaseFirestore.modelCollectionsMod.TargetIdSet_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientState extends js.Object {
  val activeTargetIds: TargetIdSet_ = js.native
}

object ClientState {
  @scala.inline
  def apply(activeTargetIds: TargetIdSet_): ClientState = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientState]
  }
  @scala.inline
  implicit class ClientStateOps[Self <: ClientState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTargetIds(value: TargetIdSet_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTargetIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

