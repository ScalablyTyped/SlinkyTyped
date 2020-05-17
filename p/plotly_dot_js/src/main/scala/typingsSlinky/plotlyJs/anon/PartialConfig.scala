package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.ModeBarButton
import typingsSlinky.plotlyJs.mod.ModeBarDefaultButtons
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsNumbers.`0`
import typingsSlinky.plotlyJs.plotlyJsNumbers.`1`
import typingsSlinky.plotlyJs.plotlyJsNumbers.`2`
import typingsSlinky.plotlyJs.plotlyJsStrings.autosize
import typingsSlinky.plotlyJs.plotlyJsStrings.hover
import typingsSlinky.plotlyJs.plotlyJsStrings.opaque
import typingsSlinky.plotlyJs.plotlyJsStrings.reset
import typingsSlinky.plotlyJs.plotlyJsStrings.resetPlussignautosize
import typingsSlinky.plotlyJs.plotlyJsStrings.transparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Config> */
@js.native
trait PartialConfig extends js.Object {
  var autosizable: js.UndefOr[Boolean] = js.native
  var displayModeBar: js.UndefOr[hover | Boolean] = js.native
  var displaylogo: js.UndefOr[Boolean] = js.native
  var doubleClick: js.UndefOr[resetPlussignautosize | reset | autosize | `false`] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var edits: js.UndefOr[PartialEdits] = js.native
  var fillFrame: js.UndefOr[Boolean] = js.native
  var frameMargins: js.UndefOr[Double] = js.native
  var globalTransforms: js.UndefOr[js.Array[_]] = js.native
  var linkText: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var logging: js.UndefOr[Boolean | `0` | `1` | `2`] = js.native
  var mapboxAccessToken: js.UndefOr[String] = js.native
  var modeBarButtons: js.UndefOr[(js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`] = js.native
  var modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButton | ModeBarDefaultButtons]] = js.native
  var modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarDefaultButtons]] = js.native
  var plotGlPixelRatio: js.UndefOr[Double] = js.native
  var plotlyServerURL: js.UndefOr[String] = js.native
  var queueLength: js.UndefOr[Double] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var scrollZoom: js.UndefOr[Boolean] = js.native
  var sendData: js.UndefOr[Boolean] = js.native
  var setBackground: js.UndefOr[js.Function0[String | opaque | transparent]] = js.native
  var showAxisDragHandles: js.UndefOr[Boolean] = js.native
  var showAxisRangeEntryBoxes: js.UndefOr[Boolean] = js.native
  var showEditInChartStudio: js.UndefOr[Boolean] = js.native
  var showLink: js.UndefOr[Boolean] = js.native
  var showSendToCloud: js.UndefOr[Boolean] = js.native
  var showSources: js.UndefOr[Boolean] = js.native
  var showTips: js.UndefOr[Boolean] = js.native
  var staticPlot: js.UndefOr[Boolean] = js.native
  var toImageButtonOptions: js.UndefOr[Partialfilenamestringscal] = js.native
  var topojsonURL: js.UndefOr[String] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutosizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosizable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayModeBar(value: hover | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayModeBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayModeBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayModeBar")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplaylogo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaylogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaylogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaylogo")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClick(value: resetPlussignautosize | reset | autosize | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEdits(value: PartialEdits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(js.undefined)
        ret
    }
    @scala.inline
    def withFillFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameMargins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameMargins")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTransforms(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean | `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMapboxAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapboxAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapboxAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapboxAccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withModeBarButtons(value: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modeBarButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModeBarButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modeBarButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withModeBarButtonsToAdd(value: js.Array[ModeBarButton | ModeBarDefaultButtons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modeBarButtonsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModeBarButtonsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modeBarButtonsToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withModeBarButtonsToRemove(value: js.Array[ModeBarDefaultButtons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modeBarButtonsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModeBarButtonsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modeBarButtonsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotGlPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotGlPixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotGlPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotGlPixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotlyServerURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotlyServerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotlyServerURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotlyServerURL")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLength")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSendData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackground(value: () => String | opaque | transparent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAxisDragHandles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisDragHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAxisDragHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisDragHandles")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAxisRangeEntryBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisRangeEntryBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAxisRangeEntryBoxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisRangeEntryBoxes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEditInChartStudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditInChartStudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEditInChartStudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditInChartStudio")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLink")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSendToCloud(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSendToCloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSendToCloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSendToCloud")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSources")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTips")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticPlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticPlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticPlot")(js.undefined)
        ret
    }
    @scala.inline
    def withToImageButtonOptions(value: Partialfilenamestringscal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toImageButtonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToImageButtonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toImageButtonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTopojsonURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topojsonURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopojsonURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topojsonURL")(js.undefined)
        ret
    }
  }
  
}

