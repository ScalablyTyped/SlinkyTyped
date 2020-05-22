package typingsSlinky.awsSdkClientS3Browser.typesRecordsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRecordsEvent extends RecordsEvent {
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  @JSName("Payload")
  var Payload_UnmarshalledRecordsEvent: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}

object UnmarshalledRecordsEvent {
  @scala.inline
  def apply(Payload: js.typedarray.Uint8Array = null): UnmarshalledRecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRecordsEvent]
  }
}

