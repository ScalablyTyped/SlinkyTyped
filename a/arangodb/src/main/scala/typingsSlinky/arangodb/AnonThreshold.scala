package typingsSlinky.arangodb

import typingsSlinky.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThreshold extends js.Object {
  var segmentThreshold: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[ArangoSearchViewConsolidationType] = js.native
}

object AnonThreshold {
  @scala.inline
  def apply(): AnonThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonThreshold]
  }
  @scala.inline
  implicit class AnonThresholdOps[Self <: AnonThreshold] (val x: Self) extends AnyVal {
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
    def withoutSegmentThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ArangoSearchViewConsolidationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

