package typingsSlinky.libraCore.eventsPbMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
  var eventData: js.typedarray.Uint8Array | String = js.native
  var sequenceNumber: String = js.native
}

object AsObject {
  @scala.inline
  def apply(eventData: js.typedarray.Uint8Array | String, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventData(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessPath(value: typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPath")(js.undefined)
        ret
    }
  }
  
}

