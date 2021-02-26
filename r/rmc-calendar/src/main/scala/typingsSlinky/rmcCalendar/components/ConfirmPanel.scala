package typingsSlinky.rmcCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcCalendar.confirmPanelMod.ConfirmPanelPropsType
import typingsSlinky.rmcCalendar.confirmPanelMod.default
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfirmPanel {
  
  @scala.inline
  def apply(locale: Locale, onConfirm: () => Unit): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = js.Any.fromFunction0(onConfirm))
    new Builder(js.Array(this.component, __props.asInstanceOf[ConfirmPanelPropsType]))
  }
  
  @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def disableBtn(value: Boolean): this.type = set("disableBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDateTime(value: js.Date): this.type = set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatStr(value: String): this.type = set("formatStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onlyConfirm(value: Boolean): this.type = set("onlyConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDateTime(value: js.Date): this.type = set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: one | range): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConfirmPanelPropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
