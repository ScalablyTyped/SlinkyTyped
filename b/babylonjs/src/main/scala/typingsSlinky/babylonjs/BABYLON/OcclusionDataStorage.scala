package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OcclusionDataStorage extends js.Object {
  /** @hidden */
  var isOccluded: Boolean = js.native
  /** @hidden */
  var isOcclusionQueryInProgress: Boolean = js.native
  /** @hidden */
  var occlusionInternalRetryCounter: Double = js.native
  /** @hidden */
  var occlusionQueryAlgorithmType: Double = js.native
  /** @hidden */
  var occlusionRetryCount: Double = js.native
  /** @hidden */
  var occlusionType: Double = js.native
}

object OcclusionDataStorage {
  @scala.inline
  def apply(
    isOccluded: Boolean,
    isOcclusionQueryInProgress: Boolean,
    occlusionInternalRetryCounter: Double,
    occlusionQueryAlgorithmType: Double,
    occlusionRetryCount: Double,
    occlusionType: Double
  ): OcclusionDataStorage = {
    val __obj = js.Dynamic.literal(isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionInternalRetryCounter = occlusionInternalRetryCounter.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcclusionDataStorage]
  }
  @scala.inline
  implicit class OcclusionDataStorageOps[Self <: OcclusionDataStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOccluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOccluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOcclusionQueryInProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOcclusionQueryInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionInternalRetryCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionInternalRetryCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionQueryAlgorithmType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionQueryAlgorithmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionRetryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionRetryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

