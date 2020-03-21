package typingsSlinky.libraCore.eventsPbMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject] = js.undefined
  var eventData: scala.scalajs.js.typedarray.Uint8Array | String
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(
    eventData: scala.scalajs.js.typedarray.Uint8Array | String,
    sequenceNumber: String,
    accessPath: typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    if (accessPath != null) __obj.updateDynamic("accessPath")(accessPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

