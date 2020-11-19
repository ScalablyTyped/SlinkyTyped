package typingsSlinky.reactToolbox.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToolbox.datePickerDatePickerMod.DatePickerLocale
import typingsSlinky.reactToolbox.datePickerDatePickerMod.DatePickerProps
import typingsSlinky.reactToolbox.datePickerDatePickerMod.DatePickerTheme
import typingsSlinky.reactToolbox.datePickerMod.default
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-cn`
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-hk`
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-tw`
import typingsSlinky.reactToolbox.reactToolboxStrings.af
import typingsSlinky.reactToolbox.reactToolboxStrings.ar
import typingsSlinky.reactToolbox.reactToolboxStrings.be
import typingsSlinky.reactToolbox.reactToolboxStrings.bg
import typingsSlinky.reactToolbox.reactToolboxStrings.bn
import typingsSlinky.reactToolbox.reactToolboxStrings.bo
import typingsSlinky.reactToolbox.reactToolboxStrings.br
import typingsSlinky.reactToolbox.reactToolboxStrings.bs
import typingsSlinky.reactToolbox.reactToolboxStrings.ca
import typingsSlinky.reactToolbox.reactToolboxStrings.de
import typingsSlinky.reactToolbox.reactToolboxStrings.en
import typingsSlinky.reactToolbox.reactToolboxStrings.es
import typingsSlinky.reactToolbox.reactToolboxStrings.eu
import typingsSlinky.reactToolbox.reactToolboxStrings.fr
import typingsSlinky.reactToolbox.reactToolboxStrings.gl
import typingsSlinky.reactToolbox.reactToolboxStrings.it
import typingsSlinky.reactToolbox.reactToolboxStrings.no
import typingsSlinky.reactToolbox.reactToolboxStrings.pt
import typingsSlinky.reactToolbox.reactToolboxStrings.ru
import typingsSlinky.reactToolbox.reactToolboxStrings.ua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("react-toolbox/components/date_picker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelLabel(value: String): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabledDatesVarargs(value: js.Date*): this.type = set("enabledDates", js.Array(value :_*))
    
    @scala.inline
    def enabledDates(value: js.Array[js.Date]): this.type = set("enabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputFormat(value: js.Function): this.type = set("inputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(
      value: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
    ): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okLabel(value: String): this.type = set("okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: js.Function): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDismiss(value: js.Function): this.type = set("onDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEscKeyDown(value: js.Function): this.type = set("onEscKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyPress(value: js.Function): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOverlayClick(value: js.Function): this.type = set("onOverlayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sundayFirstDayOfWeek(value: Boolean): this.type = set("sundayFirstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: DatePickerTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
