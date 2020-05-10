package typingsSlinky.arangodb

import typingsSlinky.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSegmentThreshold extends js.Object {
  var segmentThreshold: Double = js.native
  var threshold: Double = js.native
  var `type`: ArangoSearchViewConsolidationType = js.native
}

object AnonSegmentThreshold {
  @scala.inline
  def apply(segmentThreshold: Double, threshold: Double, `type`: ArangoSearchViewConsolidationType): AnonSegmentThreshold = {
    val __obj = js.Dynamic.literal(segmentThreshold = segmentThreshold.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSegmentThreshold]
  }
  @scala.inline
  implicit class AnonSegmentThresholdOps[Self <: AnonSegmentThreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ArangoSearchViewConsolidationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

