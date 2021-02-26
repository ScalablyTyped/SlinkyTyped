package typingsSlinky.reactDayPicker

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactDayPicker.dateUtilsMod.DateUtils
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import typingsSlinky.reactDayPicker.modifiersMod.DayModifiers
import typingsSlinky.reactDayPicker.modifiersMod.Modifiers
import typingsSlinky.reactDayPicker.modifiersMod.ModifiersUtils
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerMod {
  
  @JSImport("react-day-picker/types/DayPicker", JSImport.Default)
  @js.native
  class default () extends DayPicker
  /* static members */
  object default {
    
    @JSImport("react-day-picker/types/DayPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-day-picker/types/DayPicker", "default.DateUtils")
    @js.native
    def DateUtils: typingsSlinky.reactDayPicker.dateUtilsMod.DateUtils = js.native
    @scala.inline
    def DateUtils_=(x: DateUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker/types/DayPicker", "default.DayModifiers")
    @js.native
    def DayModifiers: typingsSlinky.reactDayPicker.modifiersMod.DayModifiers = js.native
    @scala.inline
    def DayModifiers_=(x: DayModifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DayModifiers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker/types/DayPicker", "default.LocaleUtils")
    @js.native
    def LocaleUtils: typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    @scala.inline
    def LocaleUtils_=(x: LocaleUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocaleUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker/types/DayPicker", "default.Modifiers")
    @js.native
    def Modifiers: typingsSlinky.reactDayPicker.modifiersMod.Modifiers = js.native
    
    @JSImport("react-day-picker/types/DayPicker", "default.ModifiersUtils")
    @js.native
    def ModifiersUtils: typingsSlinky.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    @scala.inline
    def ModifiersUtils_=(x: ModifiersUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModifiersUtils")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Modifiers_=(x: Modifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Modifiers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker/types/DayPicker", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DayPicker
    extends Component[DayPickerProps, js.Any, js.Any] {
    
    var dayPicker: HTMLDivElement = js.native
    
    def focus(): Unit = js.native
    
    def showMonth(month: js.Date): Unit = js.native
    
    def showNextMonth(): Unit = js.native
    
    def showNextYear(): Unit = js.native
    
    def showPreviousMonth(): Unit = js.native
    
    def showPreviousYear(): Unit = js.native
  }
}
