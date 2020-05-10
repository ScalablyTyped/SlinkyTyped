package typingsSlinky.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionKeyDescription extends js.Object {
  /**
    * A map of name-value pairs for the dimensions in the group.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.native
  /**
    * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
    */
  var Partitions: js.UndefOr[MetricValuesList] = js.native
  /**
    * The aggregated metric value for the dimension(s), over the requested time range.
    */
  var Total: js.UndefOr[Double] = js.native
}

object DimensionKeyDescription {
  @scala.inline
  def apply(): DimensionKeyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionKeyDescription]
  }
  @scala.inline
  implicit class DimensionKeyDescriptionOps[Self <: DimensionKeyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: DimensionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitions(value: MetricValuesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
  }
  
}

