package typingsSlinky.antDesignReactNative.datePickerPropsTypeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.DatePickerLocale
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.date
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.datetime
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.month
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.time
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.year
import typingsSlinky.antDesignReactNative.datePickerPropsMod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerPropsType extends DatePickerProps {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  @JSName("defaultDate")
  var defaultDate_DatePickerPropsType: js.UndefOr[js.Date] = js.native
  
  var dismissText: js.UndefOr[ReactElement] = js.native
  
  var extra: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String | (js.Function1[/* value */ js.Date, String])] = js.native
  
  @JSName("locale")
  var locale_DatePickerPropsType: js.UndefOr[DatePickerLocale] = js.native
  
  @JSName("maxDate")
  var maxDate_DatePickerPropsType: js.UndefOr[js.Date] = js.native
  
  @JSName("minDate")
  var minDate_DatePickerPropsType: js.UndefOr[js.Date] = js.native
  
  @JSName("mode")
  var mode_DatePickerPropsType: js.UndefOr[datetime | date | year | month | time] = js.native
  
  var okText: js.UndefOr[ReactElement] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Date, Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var value: js.UndefOr[js.Date] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object DatePickerPropsType {
  
  @scala.inline
  def apply(): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerPropsType]
  }
  
  @scala.inline
  implicit class DatePickerPropsTypeOps[Self <: DatePickerPropsType] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: js.Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDismissTextReactElement(value: ReactElement): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissText(value: ReactElement): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissText: Self = this.set("dismissText", js.undefined)
    
    @scala.inline
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setFormatFunction1(value: /* value */ js.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: String | (js.Function1[/* value */ js.Date, String])): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLocale(value: DatePickerLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMode(value: datetime | date | year | month | time): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOkTextReactElement(value: ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Date => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
