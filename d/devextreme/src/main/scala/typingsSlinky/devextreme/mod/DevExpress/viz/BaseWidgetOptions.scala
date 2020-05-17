package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.CancelComponentData
import typingsSlinky.devextreme.anon.ComponentTElementDxElementModelAny
import typingsSlinky.devextreme.anon.FormatModel
import typingsSlinky.devextreme.anon.TargetAny
import typingsSlinky.devextreme.devextremeStrings.genericDotcarmine
import typingsSlinky.devextreme.devextremeStrings.genericDotcontrast
import typingsSlinky.devextreme.devextremeStrings.genericDotdark
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkmoon
import typingsSlinky.devextreme.devextremeStrings.genericDotdarkviolet
import typingsSlinky.devextreme.devextremeStrings.genericDotgreenmist
import typingsSlinky.devextreme.devextremeStrings.genericDotlight
import typingsSlinky.devextreme.devextremeStrings.genericDotsoftblue
import typingsSlinky.devextreme.devextremeStrings.ios7Dotdefault
import typingsSlinky.devextreme.devextremeStrings.materialDotblueDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsSlinky.devextreme.devextremeStrings.materialDottealDotlight
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWidgetOptions[T] extends DOMComponentOptions[T] {
  /** Specifies whether the widget responds to the user interaction. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Configures the exporting and printing features. */
  var export: js.UndefOr[BaseWidgetExport] = js.native
  /** Configures the loading indicator. */
  var loadingIndicator: js.UndefOr[BaseWidgetLoadingIndicator] = js.native
  /** Generates space around the widget. */
  var margin: js.UndefOr[BaseWidgetMargin] = js.native
  /** A function that is executed when the widget's rendering has finished. */
  var onDrawn: js.UndefOr[js.Function1[/* e */ ComponentTElementDxElementModelAny[T], _]] = js.native
  /** A function that is executed after the widget is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ ComponentTElementDxElementModelAny[T], _]] = js.native
  /** A function that is executed before the widget is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ FormatModel[T], _]] = js.native
  /** A function that is executed before a file with exported widget is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ CancelComponentData[T], _]] = js.native
  /** A function that is executed when an error or warning occurs. */
  var onIncidentOccurred: js.UndefOr[js.Function1[/* e */ TargetAny[T], _]] = js.native
  /** Notifies the widget that it is embedded into an HTML page that uses a tag modifying the path. */
  var pathModified: js.UndefOr[Boolean] = js.native
  /** Specifies whether to redraw the widget when the size of the parent browser window changes or a mobile device rotates. */
  var redrawOnResize: js.UndefOr[Boolean] = js.native
  /** Specifies the widget's size in pixels. */
  var size: js.UndefOr[BaseWidgetSize] = js.native
  /** Sets the name of the theme the widget uses. */
  var theme: js.UndefOr[
    genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
  ] = js.native
  /** Configures the widget's title. */
  var title: js.UndefOr[BaseWidgetTitle | String] = js.native
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  var tooltip: js.UndefOr[BaseWidgetTooltip] = js.native
}

object BaseWidgetOptions {
  @scala.inline
  def apply[T](): BaseWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetOptions[T]]
  }
  @scala.inline
  implicit class BaseWidgetOptionsOps[Self[t] <: BaseWidgetOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExport(value: BaseWidgetExport): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicator(value: BaseWidgetLoadingIndicator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: BaseWidgetMargin): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawn(value: /* e */ ComponentTElementDxElementModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrawn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExported(value: /* e */ ComponentTElementDxElementModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExported")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExported: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExported")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExporting(value: /* e */ FormatModel[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExporting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExporting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileSaving(value: /* e */ CancelComponentData[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileSaving")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFileSaving: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileSaving")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIncidentOccurred(value: /* e */ TargetAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIncidentOccurred: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncidentOccurred")(js.undefined)
        ret
    }
    @scala.inline
    def withPathModified(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathModified: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathModified")(js.undefined)
        ret
    }
    @scala.inline
    def withRedrawOnResize(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redrawOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedrawOnResize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redrawOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: BaseWidgetSize): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(
      value: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: BaseWidgetTitle | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: BaseWidgetTooltip): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

