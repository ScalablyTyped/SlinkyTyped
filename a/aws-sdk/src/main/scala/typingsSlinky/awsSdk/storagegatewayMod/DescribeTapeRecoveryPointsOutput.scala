package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapeRecoveryPointsOutput extends js.Object {
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * An opaque string that indicates the position at which the virtual tape recovery points that were listed for description ended. Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there are no more recovery points to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of TapeRecoveryPointInfos that are available for the specified gateway.
    */
  var TapeRecoveryPointInfos: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeRecoveryPointInfos] = js.native
}

object DescribeTapeRecoveryPointsOutput {
  @scala.inline
  def apply(): DescribeTapeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeRecoveryPointsOutput]
  }
  @scala.inline
  implicit class DescribeTapeRecoveryPointsOutputOps[Self <: DescribeTapeRecoveryPointsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeRecoveryPointInfos(value: TapeRecoveryPointInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeRecoveryPointInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeRecoveryPointInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeRecoveryPointInfos")(js.undefined)
        ret
    }
  }
  
}

