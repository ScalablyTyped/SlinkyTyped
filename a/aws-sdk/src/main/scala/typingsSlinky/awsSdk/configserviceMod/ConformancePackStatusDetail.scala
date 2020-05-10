package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackStatusDetail extends js.Object {
  /**
    * Amazon Resource Name (ARN) of comformance pack.
    */
  var ConformancePackArn: typingsSlinky.awsSdk.configserviceMod.ConformancePackArn = js.native
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typingsSlinky.awsSdk.configserviceMod.ConformancePackId = js.native
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * Indicates deployment status of conformance pack. AWS Config sets the state of the conformance pack to:   CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.   CREATE_COMPLETE when a conformance pack has been successfully created in your account.   CREATE_FAILED when a conformance pack creation failed in your account.   DELETE_IN_PROGRESS when a conformance pack deletion is in progress.    DELETE_FAILED when a conformance pack deletion failed in your account.  
    */
  var ConformancePackState: typingsSlinky.awsSdk.configserviceMod.ConformancePackState = js.native
  /**
    * The reason of conformance pack creation failure.
    */
  var ConformancePackStatusReason: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackStatusReason] = js.native
  /**
    * Last time when conformation pack creation and update was successful.
    */
  var LastUpdateCompletedTime: js.UndefOr[js.Date] = js.native
  /**
    * Last time when conformation pack creation and update was requested.
    */
  var LastUpdateRequestedTime: js.Date = js.native
  /**
    * Amazon Resource Name (ARN) of AWS CloudFormation stack. 
    */
  var StackArn: typingsSlinky.awsSdk.configserviceMod.StackArn = js.native
}

object ConformancePackStatusDetail {
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    ConformancePackState: ConformancePackState,
    LastUpdateRequestedTime: js.Date,
    StackArn: StackArn
  ): ConformancePackStatusDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackState = ConformancePackState.asInstanceOf[js.Any], LastUpdateRequestedTime = LastUpdateRequestedTime.asInstanceOf[js.Any], StackArn = StackArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackStatusDetail]
  }
  @scala.inline
  implicit class ConformancePackStatusDetailOps[Self <: ConformancePackStatusDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackArn(value: ConformancePackArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackId(value: ConformancePackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackName(value: ConformancePackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackState(value: ConformancePackState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdateRequestedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateRequestedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackArn(value: StackArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackStatusReason(value: ConformancePackStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConformancePackStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateCompletedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateCompletedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateCompletedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateCompletedTime")(js.undefined)
        ret
    }
  }
  
}

