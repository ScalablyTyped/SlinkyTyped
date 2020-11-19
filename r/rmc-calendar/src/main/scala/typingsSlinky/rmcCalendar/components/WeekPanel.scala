package typingsSlinky.rmcCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.weekPanelMod.PropsType
import typingsSlinky.rmcCalendar.weekPanelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WeekPanel {
  
  @JSImport("rmc-calendar/lib/date/WeekPanel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsType): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(locale: Locale): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
}
