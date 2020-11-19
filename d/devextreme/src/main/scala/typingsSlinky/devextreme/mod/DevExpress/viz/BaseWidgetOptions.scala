package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.CancelComponentData
import typingsSlinky.devextreme.anon.FormatModel
import typingsSlinky.devextreme.anon.`16`
import typingsSlinky.devextreme.anon.`17`
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWidgetOptions[T] extends DOMComponentOptions[T] {
  
  /** @name BaseWidget.Options.disabled */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** @name BaseWidget.Options.export */
  var export: js.UndefOr[BaseWidgetExport] = js.native
  
  /** @name BaseWidget.Options.loadingIndicator */
  var loadingIndicator: js.UndefOr[BaseWidgetLoadingIndicator] = js.native
  
  /** @name BaseWidget.Options.margin */
  var margin: js.UndefOr[BaseWidgetMargin] = js.native
  
  /** @name BaseWidget.Options.onDrawn */
  var onDrawn: js.UndefOr[js.Function1[/* e */ `16`[T], _]] = js.native
  
  /** @name BaseWidget.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ `16`[T], _]] = js.native
  
  /** @name BaseWidget.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ FormatModel[T], _]] = js.native
  
  /** @name BaseWidget.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ CancelComponentData[T], _]] = js.native
  
  /** @name BaseWidget.Options.onIncidentOccurred */
  var onIncidentOccurred: js.UndefOr[js.Function1[/* e */ `17`[T], _]] = js.native
  
  /** @name BaseWidget.Options.pathModified */
  var pathModified: js.UndefOr[Boolean] = js.native
  
  /** @name BaseWidget.Options.redrawOnResize */
  var redrawOnResize: js.UndefOr[Boolean] = js.native
  
  /** @name BaseWidget.Options.size */
  var size: js.UndefOr[BaseWidgetSize] = js.native
  
  /** @name BaseWidget.Options.theme */
  var theme: js.UndefOr[
    genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
  ] = js.native
  
  /** @name BaseWidget.Options.title */
  var title: js.UndefOr[BaseWidgetTitle | String] = js.native
  
  /** @name BaseWidget.Options.tooltip */
  var tooltip: js.UndefOr[BaseWidgetTooltip] = js.native
}
object BaseWidgetOptions {
  
  @scala.inline
  def apply[T](): BaseWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetOptions[T]]
  }
  
  @scala.inline
  implicit class BaseWidgetOptionsOps[Self <: BaseWidgetOptions[_], T] (val x: Self with BaseWidgetOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExport(value: BaseWidgetExport): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    
    @scala.inline
    def setLoadingIndicator(value: BaseWidgetLoadingIndicator): Self = this.set("loadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("loadingIndicator", js.undefined)
    
    @scala.inline
    def setMargin(value: BaseWidgetMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnDrawn(value: /* e */ `16`[T] => _): Self = this.set("onDrawn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrawn: Self = this.set("onDrawn", js.undefined)
    
    @scala.inline
    def setOnExported(value: /* e */ `16`[T] => _): Self = this.set("onExported", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExported: Self = this.set("onExported", js.undefined)
    
    @scala.inline
    def setOnExporting(value: /* e */ FormatModel[T] => _): Self = this.set("onExporting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExporting: Self = this.set("onExporting", js.undefined)
    
    @scala.inline
    def setOnFileSaving(value: /* e */ CancelComponentData[T] => _): Self = this.set("onFileSaving", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFileSaving: Self = this.set("onFileSaving", js.undefined)
    
    @scala.inline
    def setOnIncidentOccurred(value: /* e */ `17`[T] => _): Self = this.set("onIncidentOccurred", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIncidentOccurred: Self = this.set("onIncidentOccurred", js.undefined)
    
    @scala.inline
    def setPathModified(value: Boolean): Self = this.set("pathModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathModified: Self = this.set("pathModified", js.undefined)
    
    @scala.inline
    def setRedrawOnResize(value: Boolean): Self = this.set("redrawOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedrawOnResize: Self = this.set("redrawOnResize", js.undefined)
    
    @scala.inline
    def setSize(value: BaseWidgetSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTheme(
      value: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
    ): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: BaseWidgetTitle | String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTooltip(value: BaseWidgetTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
