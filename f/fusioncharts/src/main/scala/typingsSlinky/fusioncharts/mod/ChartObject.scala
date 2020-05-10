package typingsSlinky.fusioncharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartObject extends js.Object {
  var baseChartMessageColor: js.UndefOr[String] = js.native
  var baseChartMessageFont: js.UndefOr[String] = js.native
  var baseChartMessageFontSize: js.UndefOr[String] = js.native
  var baseChartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var containerBackgroundColor: js.UndefOr[String] = js.native
  var containerBackgroundOpacity: js.UndefOr[Double] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var dataEmptyMessage: js.UndefOr[String] = js.native
  var dataEmptyMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataEmptyMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var dataEmptyMessageImageScale: js.UndefOr[Double] = js.native
  var dataEmptyMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataFormat: js.UndefOr[ChartDataFormats] = js.native
  var dataInvalidMessage: js.UndefOr[String] = js.native
  var dataInvalidMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataInvalidMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var dataInvalidMessageImageScale: js.UndefOr[Double] = js.native
  var dataInvalidMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataLoadErrorMessage: js.UndefOr[String] = js.native
  var dataLoadErrorMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataLoadErrorMessageImageScale: js.UndefOr[Double] = js.native
  var dataLoadErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataLoadStartMessage: js.UndefOr[String] = js.native
  var dataLoadStartMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataLoadStartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var dataLoadStartMessageImageScale: js.UndefOr[Double] = js.native
  var dataLoadStartMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataSource: js.UndefOr[String | js.Object] = js.native
  var events: js.UndefOr[js.Object] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var id: js.UndefOr[String] = js.native
  var link: js.UndefOr[js.Object] = js.native
  var loadMessage: js.UndefOr[String] = js.native
  var loadMessageImageAlpha: js.UndefOr[Double] = js.native
  var loadMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var loadMessageImageScale: js.UndefOr[Double] = js.native
  var loadMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var renderAt: js.UndefOr[String] = js.native
  var renderErrorMessage: js.UndefOr[String] = js.native
  var renderErrorMessageImageAlpha: js.UndefOr[Double] = js.native
  var renderErrorMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var renderErrorMessageImageScale: js.UndefOr[Double] = js.native
  var renderErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var showChartLoadingMessage: js.UndefOr[Boolean] = js.native
  var showDataLoadingMessage: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeNotSupportedMessage: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ChartObject {
  @scala.inline
  def apply(): ChartObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartObject]
  }
  @scala.inline
  implicit class ChartObjectOps[Self <: ChartObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseChartMessageColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseChartMessageColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseChartMessageFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseChartMessageFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageFont")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseChartMessageFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseChartMessageFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseChartMessageImageHAlign(value: ImageHAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageImageHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseChartMessageImageHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChartMessageImageHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerBackgroundOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerBackgroundOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEmptyMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEmptyMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEmptyMessageImageAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEmptyMessageImageAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEmptyMessageImageHAlign(value: ImageHAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEmptyMessageImageHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEmptyMessageImageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEmptyMessageImageScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEmptyMessageImageVAlign(value: ImageVAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEmptyMessageImageVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEmptyMessageImageVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFormat(value: ChartDataFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDataInvalidMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataInvalidMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDataInvalidMessageImageAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataInvalidMessageImageAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDataInvalidMessageImageHAlign(value: ImageHAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataInvalidMessageImageHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataInvalidMessageImageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataInvalidMessageImageScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDataInvalidMessageImageVAlign(value: ImageVAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataInvalidMessageImageVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInvalidMessageImageVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadErrorMessageImageAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessageImageAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadErrorMessageImageAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessageImageAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadErrorMessageImageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessageImageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadErrorMessageImageScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessageImageScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadErrorMessageImageVAlign(value: ImageVAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessageImageVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadErrorMessageImageVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadErrorMessageImageVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadStartMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadStartMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadStartMessageImageAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadStartMessageImageAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadStartMessageImageHAlign(value: ImageHAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadStartMessageImageHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadStartMessageImageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadStartMessageImageScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoadStartMessageImageVAlign(value: ImageVAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLoadStartMessageImageVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoadStartMessageImageVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMessageImageAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMessageImageAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMessageImageHAlign(value: ImageHAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMessageImageHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMessageImageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMessageImageScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageScale")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMessageImageVAlign(value: ImageVAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMessageImageVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMessageImageVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderErrorMessageImageAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderErrorMessageImageAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderErrorMessageImageHAlign(value: ImageHAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageHAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderErrorMessageImageHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageHAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderErrorMessageImageScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderErrorMessageImageScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageScale")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderErrorMessageImageVAlign(value: ImageVAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageVAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderErrorMessageImageVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderErrorMessageImageVAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withShowChartLoadingMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showChartLoadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowChartLoadingMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showChartLoadingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDataLoadingMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataLoadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDataLoadingMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataLoadingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
    @scala.inline
    def withTypeNotSupportedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeNotSupportedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeNotSupportedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeNotSupportedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

