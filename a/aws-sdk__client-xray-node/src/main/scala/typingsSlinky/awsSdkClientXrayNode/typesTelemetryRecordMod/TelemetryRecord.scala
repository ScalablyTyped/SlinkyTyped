package typingsSlinky.awsSdkClientXrayNode.typesTelemetryRecordMod

import typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryRecord extends js.Object {
  /**
    * <p/>
    */
  var BackendConnectionErrors: js.UndefOr[
    typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
  ] = js.undefined
  /**
    * <p/>
    */
  var SegmentsReceivedCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var SegmentsRejectedCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var SegmentsSentCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var SegmentsSpilloverCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var Timestamp: js.Date | String | Double
}

object TelemetryRecord {
  @scala.inline
  def apply(
    Timestamp: js.Date | String | Double,
    BackendConnectionErrors: BackendConnectionErrors = null,
    SegmentsReceivedCount: js.UndefOr[Double] = js.undefined,
    SegmentsRejectedCount: js.UndefOr[Double] = js.undefined,
    SegmentsSentCount: js.UndefOr[Double] = js.undefined,
    SegmentsSpilloverCount: js.UndefOr[Double] = js.undefined
  ): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsReceivedCount)) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsRejectedCount)) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsSentCount)) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsSpilloverCount)) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
}

