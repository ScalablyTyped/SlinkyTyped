package typingsSlinky.rcPicker

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcPicker.interfaceMod.CustomFormat
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import typingsSlinky.react.mod.FocusEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BlurToCancel extends StObject {
    
    var blurToCancel: js.UndefOr[Boolean] = js.native
    
    def forwardKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Boolean = js.native
    
    def isClickOutside(): Boolean = js.native
    def isClickOutside(clickElement: EventTarget): Boolean = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    def onCancel(): Unit = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    def onSubmit(): Unit | Boolean = js.native
    
    var open: Boolean = js.native
    
    def triggerOpen(open: Boolean): Unit = js.native
    
    var value: String = js.native
  }
  
  @js.native
  trait CellPrefixCls[DateType] extends StObject {
    
    var cellPrefixCls: String = js.native
    
    var generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType] = js.native
    
    var hoverRangedValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    def isInView(date: DateType): Boolean = js.native
    
    def isSameCell(current: NullableDateType[DateType], target: NullableDateType[DateType]): Boolean = js.native
    
    def offsetCell(date: DateType, offset: Double): DateType = js.native
    
    var rangedValue: js.UndefOr[RangeValue[DateType]] = js.native
    
    var today: js.UndefOr[NullableDateType[DateType]] = js.native
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.native
  }
  object CellPrefixCls {
    
    @scala.inline
    def apply[DateType](
      cellPrefixCls: String,
      generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType],
      isInView: DateType => Boolean,
      isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
      offsetCell: (DateType, Double) => DateType
    ): CellPrefixCls[DateType] = {
      val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
      __obj.asInstanceOf[CellPrefixCls[DateType]]
    }
    
    @scala.inline
    implicit class CellPrefixClsMutableBuilder[Self <: CellPrefixCls[_], DateType] (val x: Self with CellPrefixCls[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellPrefixCls(value: String): Self = StObject.set(x, "cellPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverRangedValue(value: RangeValue[DateType]): Self = StObject.set(x, "hoverRangedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverRangedValueNull: Self = StObject.set(x, "hoverRangedValue", null)
      
      @scala.inline
      def setHoverRangedValueUndefined: Self = StObject.set(x, "hoverRangedValue", js.undefined)
      
      @scala.inline
      def setIsInView(value: DateType => Boolean): Self = StObject.set(x, "isInView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSameCell(value: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean): Self = StObject.set(x, "isSameCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffsetCell(value: (DateType, Double) => DateType): Self = StObject.set(x, "offsetCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRangedValue(value: RangeValue[DateType]): Self = StObject.set(x, "rangedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangedValueNull: Self = StObject.set(x, "rangedValue", null)
      
      @scala.inline
      def setRangedValueUndefined: Self = StObject.set(x, "rangedValue", js.undefined)
      
      @scala.inline
      def setToday(value: NullableDateType[DateType]): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayNull: Self = StObject.set(x, "today", null)
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DefaultDates[DateType] extends StObject {
    
    var defaultDates: js.UndefOr[RangeValue[DateType]] = js.native
    
    var generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType] = js.native
    
    var picker: PickerMode = js.native
    
    var values: RangeValue[DateType] = js.native
  }
  object DefaultDates {
    
    @scala.inline
    def apply[DateType](generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType], picker: PickerMode): DefaultDates[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultDates[DateType]]
    }
    
    @scala.inline
    implicit class DefaultDatesMutableBuilder[Self <: DefaultDates[_], DateType] (val x: Self with DefaultDates[DateType]) extends AnyVal {
      
      @scala.inline
      def setDefaultDates(value: RangeValue[DateType]): Self = StObject.set(x, "defaultDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDatesNull: Self = StObject.set(x, "defaultDates", null)
      
      @scala.inline
      def setDefaultDatesUndefined: Self = StObject.set(x, "defaultDates", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: RangeValue[DateType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesNull: Self = StObject.set(x, "values", null)
    }
  }
  
  @js.native
  trait Disabled[DateType] extends StObject {
    
    var disabled: js.Tuple2[Boolean, Boolean] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var picker: PickerMode = js.native
    
    var selectedValue: RangeValue[DateType] = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply[DateType](
      disabled: js.Tuple2[Boolean, Boolean],
      generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType],
      locale: Locale,
      picker: PickerMode
    ): Disabled[DateType] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled[DateType]]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled[_], DateType] (val x: Self with Disabled[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValue(value: RangeValue[DateType]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueNull: Self = StObject.set(x, "selectedValue", null)
    }
  }
  
  @js.native
  trait Focused extends StObject {
    
    var focused: Boolean = js.native
    
    var typing: Boolean = js.native
  }
  object Focused {
    
    @scala.inline
    def apply(focused: Boolean, typing: Boolean): Focused = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused]
    }
    
    @scala.inline
    implicit class FocusedMutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Format[DateType] extends StObject {
    
    def format(locale: String, date: DateType, format: String): String = js.native
    
    /** A proxy for getting locale with moment or other locale library */
    var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
    
    /** A proxy for getting locale with moment or other locale library */
    var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
    
    def getWeek(locale: String, value: DateType): Double = js.native
    
    def getWeekFirstDay(locale: String): Double = js.native
    
    /** Should only return validate date instance */
    def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null = js.native
  }
  object Format {
    
    @scala.inline
    def apply[DateType](
      format: (String, DateType, String) => String,
      getWeek: (String, DateType) => Double,
      getWeekFirstDay: String => Double,
      parse: (String, String, js.Array[String]) => DateType | Null
    ): Format[DateType] = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), getWeek = js.Any.fromFunction2(getWeek), getWeekFirstDay = js.Any.fromFunction1(getWeekFirstDay), parse = js.Any.fromFunction3(parse))
      __obj.asInstanceOf[Format[DateType]]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format[_], DateType] (val x: Self with Format[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (String, DateType, String) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetShortMonths(value: /* locale */ String => js.Array[String]): Self = StObject.set(x, "getShortMonths", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetShortMonthsUndefined: Self = StObject.set(x, "getShortMonths", js.undefined)
      
      @scala.inline
      def setGetShortWeekDays(value: /* locale */ String => js.Array[String]): Self = StObject.set(x, "getShortWeekDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetShortWeekDaysUndefined: Self = StObject.set(x, "getShortWeekDays", js.undefined)
      
      @scala.inline
      def setGetWeek(value: (String, DateType) => Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetWeekFirstDay(value: String => Double): Self = StObject.set(x, "getWeekFirstDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParse(value: (String, String, js.Array[String]) => DateType | Null): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait FormatList[DateType] extends StObject {
    
    var formatList: js.Array[String | CustomFormat[DateType]] = js.native
    
    var generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
  }
  object FormatList {
    
    @scala.inline
    def apply[DateType](
      formatList: js.Array[String | CustomFormat[DateType]],
      generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType],
      locale: Locale
    ): FormatList[DateType] = {
      val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatList[DateType]]
    }
    
    @scala.inline
    implicit class FormatListMutableBuilder[Self <: FormatList[_], DateType] (val x: Self with FormatList[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormatList(value: js.Array[String | CustomFormat[DateType]]): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatListVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "formatList", js.Array(value :_*))
      
      @scala.inline
      def setGenerateConfig(value: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenerateConfig[DateType] extends StObject {
    
    var format: String | CustomFormat[DateType] = js.native
    
    var generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
  }
  object GenerateConfig {
    
    @scala.inline
    def apply[DateType](
      format: String | CustomFormat[DateType],
      generateConfig: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType],
      locale: Locale
    ): GenerateConfig[DateType] = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateConfig[DateType]]
    }
    
    @scala.inline
    implicit class GenerateConfigMutableBuilder[Self <: GenerateConfig[_], DateType] (val x: Self with GenerateConfig[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String | CustomFormat[DateType]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateConfig(value: typingsSlinky.rcPicker.generateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    def onClick(): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String, onClick: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave))
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnTextChange extends StObject {
    
    def onTextChange(text: String): Unit = js.native
    
    /** Must useMemo, to assume that `valueTexts` only match on the first change */
    var valueTexts: js.Array[String] = js.native
  }
  object OnTextChange {
    
    @scala.inline
    def apply(onTextChange: String => Unit, valueTexts: js.Array[String]): OnTextChange = {
      val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction1(onTextChange), valueTexts = valueTexts.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTextChange]
    }
    
    @scala.inline
    implicit class OnTextChangeMutableBuilder[Self <: OnTextChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTextChange(value: String => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueTexts(value: js.Array[String]): Self = StObject.set(x, "valueTexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTextsVarargs(value: String*): Self = StObject.set(x, "valueTexts", js.Array(value :_*))
    }
  }
}
