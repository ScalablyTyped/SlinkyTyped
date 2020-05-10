package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaData extends js.Object {
  var _chart: Chart = js.native
  var _datasetIndex: Double = js.native
  var _index: Double = js.native
  var _model: Model = js.native
  var _start: js.UndefOr[js.Any] = js.native
  var _view: Model = js.native
  var _xScale: ChartScales = js.native
  var _yScale: ChartScales = js.native
  var hidden: js.UndefOr[Boolean] = js.native
}

object MetaData {
  @scala.inline
  def apply(
    _chart: Chart,
    _datasetIndex: Double,
    _index: Double,
    _model: Model,
    _view: Model,
    _xScale: ChartScales,
    _yScale: ChartScales
  ): MetaData = {
    val __obj = js.Dynamic.literal(_chart = _chart.asInstanceOf[js.Any], _datasetIndex = _datasetIndex.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _model = _model.asInstanceOf[js.Any], _view = _view.asInstanceOf[js.Any], _xScale = _xScale.asInstanceOf[js.Any], _yScale = _yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaData]
  }
  @scala.inline
  implicit class MetaDataOps[Self <: MetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_chart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_datasetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_datasetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_model(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_view(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_xScale(value: ChartScales): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_xScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_yScale(value: ChartScales): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_yScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_start(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
  }
  
}

