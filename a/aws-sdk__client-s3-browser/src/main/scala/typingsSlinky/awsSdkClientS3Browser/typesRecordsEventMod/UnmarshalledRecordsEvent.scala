package typingsSlinky.awsSdkClientS3Browser.typesRecordsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRecordsEvent extends RecordsEvent {
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  @JSName("Payload")
  var Payload_UnmarshalledRecordsEvent: js.UndefOr[js.typedarray.Uint8Array] = js.native
}

object UnmarshalledRecordsEvent {
  @scala.inline
  def apply(): UnmarshalledRecordsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRecordsEvent]
  }
  @scala.inline
  implicit class UnmarshalledRecordsEventOps[Self <: UnmarshalledRecordsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(js.undefined)
        ret
    }
  }
  
}

