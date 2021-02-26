package typingsSlinky.reactNativeDatepicker.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNativeDatepicker.mod.DatePickerCustomStylesProps
import typingsSlinky.reactNativeDatepicker.mod.DatePickerProps
import typingsSlinky.reactNativeDatepicker.mod.default
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeDatepicker {
  
  @JSImport("react-native-datepicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def TouchableComponent(value: ReactComponentClass[js.Object]): this.type = set("TouchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def androidMode(
      value: typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
    ): this.type = set("androidMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelBtnTestID(value: String): this.type = set("cancelBtnTestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelBtnText(value: String): this.type = set("cancelBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmBtnTestID(value: String): this.type = set("confirmBtnTestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmBtnText(value: String): this.type = set("confirmBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customStyles(value: DatePickerCustomStylesProps): this.type = set("customStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def date(value: String | js.Date | Moment): this.type = set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateDate(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getDateStr(value: /* date */ js.Date => String): this.type = set("getDateStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideText(value: Boolean): this.type = set("hideText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconComponent(value: ReactElement): this.type = set("iconComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconSource(value: ImageURISource): this.type = set("iconSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is24Hour(value: Boolean): this.type = set("is24Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: String | js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDateDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: String | js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDateDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minuteInterval(value: Double): this.type = set("minuteInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalOnResponderTerminationRequest(value: /* e */ js.Any => Boolean): this.type = set("modalOnResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def mode(value: date | datetime | time): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCloseModal(value: () => Unit): this.type = set("onCloseModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDateChange(value: (/* dateStr */ String, /* date */ js.Date) => Unit): this.type = set("onDateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOpenModal(value: () => Unit): this.type = set("onOpenModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPressMask(value: () => Unit): this.type = set("onPressMask", js.Any.fromFunction0(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[_]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeZoneOffsetInMinutes(value: Double): this.type = set("timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeDatepicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
