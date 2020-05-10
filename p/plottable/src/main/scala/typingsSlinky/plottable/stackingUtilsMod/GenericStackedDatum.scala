package typingsSlinky.plottable.stackingUtilsMod

import typingsSlinky.plottable.datasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericStackedDatum[D] extends js.Object {
  var axisValue: D = js.native
  var offset: Double = js.native
  var originalDataset: Dataset = js.native
  var originalDatum: js.Any = js.native
  var originalIndex: Double = js.native
  var value: Double = js.native
}

object GenericStackedDatum {
  @scala.inline
  def apply[D](
    axisValue: D,
    offset: Double,
    originalDataset: Dataset,
    originalDatum: js.Any,
    originalIndex: Double,
    value: Double
  ): GenericStackedDatum[D] = {
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalDataset = originalDataset.asInstanceOf[js.Any], originalDatum = originalDatum.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericStackedDatum[D]]
  }
  @scala.inline
  implicit class GenericStackedDatumOps[Self[d] <: GenericStackedDatum[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAxisValue(value: D): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalDataset(value: Dataset): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalDatum(value: js.Any): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDatum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalIndex(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

