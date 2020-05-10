package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApi extends js.Object {
  /**
    * The second parameter of `renderItem`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api
    */
  var api: js.UndefOr[AnonBarLayout] = js.native
  /**
    * The first parameter of `renderItem`, including:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments)
    *
    * Difference between `dataIndex` and `dataIndexInside`:
    *
    * + `dataIndex` is the index of a `dataItem` in the original
    * data.
    * + `dataIndexInside` is the index of a `dataItem` in the
    * current data window (see
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * .
    *
    * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
    * uses `dataIndexInside` as the input parameter but not
    * `dataIndex`, because conversion from `dataIndex` to `dataIndexInside`
    * is time-consuming.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.params
    */
  var params: js.UndefOr[js.Object] = js.native
}

object AnonApi {
  @scala.inline
  def apply(): AnonApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApi]
  }
  @scala.inline
  implicit class AnonApiOps[Self <: AnonApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: AnonBarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

