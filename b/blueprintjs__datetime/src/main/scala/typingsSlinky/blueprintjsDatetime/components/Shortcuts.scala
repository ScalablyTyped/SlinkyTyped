package typingsSlinky.blueprintjsDatetime.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IShortcutsProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shortcuts {
  
  @scala.inline
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onShortcutClick: (IDateRangeShortcut, Double) => Unit,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision
  ): Builder = {
    val __props = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IShortcutsProps]))
  }
  
  @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.shortcutsMod.Shortcuts] {
    
    @scala.inline
    def selectedShortcutIndex(value: Double): this.type = set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useSingleDateShortcuts(value: Boolean): this.type = set("useSingleDateShortcuts", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IShortcutsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
