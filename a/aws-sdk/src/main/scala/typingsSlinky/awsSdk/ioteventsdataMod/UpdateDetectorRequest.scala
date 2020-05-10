package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorRequest extends js.Object {
  /**
    * The name of the detector model that created the detectors (instances).
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * The value of the input key attribute (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
  /**
    * The ID to assign to the detector update "message". Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId = js.native
  /**
    * The new state, variable values, and timer settings of the detector (instance).
    */
  var state: DetectorStateDefinition = js.native
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, messageId: MessageId, state: DetectorStateDefinition): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
  @scala.inline
  implicit class UpdateDetectorRequestOps[Self <: UpdateDetectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorModelName(value: DetectorModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: MessageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: DetectorStateDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyValue(value: KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(js.undefined)
        ret
    }
  }
  
}

