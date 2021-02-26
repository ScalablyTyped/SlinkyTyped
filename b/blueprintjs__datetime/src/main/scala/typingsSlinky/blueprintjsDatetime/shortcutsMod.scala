package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsDatetime.anon.PartialIShortcutsProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
  @js.native
  class Shortcuts protected ()
    extends PureComponent[IShortcutsProps, js.Object, js.Any] {
    def this(props: IShortcutsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IShortcutsProps, context: js.Any) = this()
    
    var getShorcutClickHandler: js.Any = js.native
    
    var isShortcutInRange: js.Any = js.native
  }
  /* static members */
  object Shortcuts {
    
    @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts.defaultProps")
    @js.native
    def defaultProps: PartialIShortcutsProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIShortcutsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDatePickerShortcut extends IDateShortcutBase {
    
    /**
      * Date represented by this shortcut. Note that time components of a
      * shortcut are ignored by default; set `includeTime: true` to respect them.
      */
    var date: js.Date = js.native
  }
  object IDatePickerShortcut {
    
    @scala.inline
    def apply(date: js.Date, label: String): IDatePickerShortcut = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerShortcut]
    }
    
    @scala.inline
    implicit class IDatePickerShortcutMutableBuilder[Self <: IDatePickerShortcut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDateRangeShortcut extends IDateShortcutBase {
    
    /**
      * Date range represented by this shortcut. Note that time components of a
      * shortcut are ignored by default; set `includeTime: true` to respect them.
      */
    var dateRange: DateRange = js.native
  }
  object IDateRangeShortcut {
    
    @scala.inline
    def apply(dateRange: DateRange, label: String): IDateRangeShortcut = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateRangeShortcut]
    }
    
    @scala.inline
    implicit class IDateRangeShortcutMutableBuilder[Self <: IDateRangeShortcut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDateShortcutBase extends StObject {
    
    /**
      * Set this prop to `true` to allow this shortcut to change the selected
      * times as well as the dates. By default, time components of a shortcut are
      * ignored; clicking a shortcut takes the date components of the `dateRange`
      * and combines them with the currently selected time.
      * @default false
      */
    var includeTime: js.UndefOr[Boolean] = js.native
    
    /** Shortcut label that appears in the list. */
    var label: String = js.native
  }
  object IDateShortcutBase {
    
    @scala.inline
    def apply(label: String): IDateShortcutBase = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateShortcutBase]
    }
    
    @scala.inline
    implicit class IDateShortcutBaseMutableBuilder[Self <: IDateShortcutBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IShortcutsProps extends StObject {
    
    var allowSingleDayRange: Boolean = js.native
    
    var maxDate: js.Date = js.native
    
    var minDate: js.Date = js.native
    
    def onShortcutClick(shortcut: IDateRangeShortcut, index: Double): Unit = js.native
    
    var selectedShortcutIndex: js.UndefOr[Double] = js.native
    
    var shortcuts: js.Array[IDateRangeShortcut] | `true` = js.native
    
    var timePrecision: TimePrecision = js.native
    
    /**
      * The DatePicker component reuses this component for a single date.
      * This changes the default shortcut labels and affects which shortcuts are used.
      * @default false
      */
    var useSingleDateShortcuts: js.UndefOr[Boolean] = js.native
  }
  object IShortcutsProps {
    
    @scala.inline
    def apply(
      allowSingleDayRange: Boolean,
      maxDate: js.Date,
      minDate: js.Date,
      onShortcutClick: (IDateRangeShortcut, Double) => Unit,
      shortcuts: js.Array[IDateRangeShortcut] | `true`,
      timePrecision: TimePrecision
    ): IShortcutsProps = {
      val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutsProps]
    }
    
    @scala.inline
    implicit class IShortcutsPropsMutableBuilder[Self <: IShortcutsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSingleDayRange(value: Boolean): Self = StObject.set(x, "allowSingleDayRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnShortcutClick(value: (IDateRangeShortcut, Double) => Unit): Self = StObject.set(x, "onShortcutClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectedShortcutIndex(value: Double): Self = StObject.set(x, "selectedShortcutIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedShortcutIndexUndefined: Self = StObject.set(x, "selectedShortcutIndex", js.undefined)
      
      @scala.inline
      def setShortcuts(value: js.Array[IDateRangeShortcut] | `true`): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsVarargs(value: IDateRangeShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setTimePrecision(value: TimePrecision): Self = StObject.set(x, "timePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSingleDateShortcuts(value: Boolean): Self = StObject.set(x, "useSingleDateShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSingleDateShortcutsUndefined: Self = StObject.set(x, "useSingleDateShortcuts", js.undefined)
    }
  }
}
