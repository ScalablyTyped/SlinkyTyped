package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTelemetryRecordsRequest extends js.Object {
  /**
    * 
    */
  var EC2InstanceId: js.UndefOr[typingsSlinky.awsSdk.xrayMod.EC2InstanceId] = js.native
  /**
    * 
    */
  var Hostname: js.UndefOr[typingsSlinky.awsSdk.xrayMod.Hostname] = js.native
  /**
    * 
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ResourceARN] = js.native
  /**
    * 
    */
  var TelemetryRecords: TelemetryRecordList = js.native
}

object PutTelemetryRecordsRequest {
  @scala.inline
  def apply(TelemetryRecords: TelemetryRecordList): PutTelemetryRecordsRequest = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTelemetryRecordsRequest]
  }
  @scala.inline
  implicit class PutTelemetryRecordsRequestOps[Self <: PutTelemetryRecordsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTelemetryRecords(value: TelemetryRecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TelemetryRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEC2InstanceId(value: EC2InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2InstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: Hostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
  }
  
}

