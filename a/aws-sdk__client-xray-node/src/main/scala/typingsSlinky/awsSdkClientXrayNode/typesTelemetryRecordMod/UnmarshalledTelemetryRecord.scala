package typingsSlinky.awsSdkClientXrayNode.typesTelemetryRecordMod

import typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.UnmarshalledBackendConnectionErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTelemetryRecord extends TelemetryRecord {
  /**
    * <p/>
    */
  @JSName("BackendConnectionErrors")
  var BackendConnectionErrors_UnmarshalledTelemetryRecord: js.UndefOr[UnmarshalledBackendConnectionErrors] = js.native
  /**
    * <p/>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledTelemetryRecord: js.Date = js.native
}

object UnmarshalledTelemetryRecord {
  @scala.inline
  def apply(Timestamp: js.Date): UnmarshalledTelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTelemetryRecord]
  }
  @scala.inline
  implicit class UnmarshalledTelemetryRecordOps[Self <: UnmarshalledTelemetryRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackendConnectionErrors(value: UnmarshalledBackendConnectionErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackendConnectionErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendConnectionErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackendConnectionErrors")(js.undefined)
        ret
    }
  }
  
}

