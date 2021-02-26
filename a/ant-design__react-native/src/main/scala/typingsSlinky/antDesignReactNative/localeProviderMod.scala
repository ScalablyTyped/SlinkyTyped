package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.AntLocale
import typingsSlinky.antDesignReactNative.anon.AntLocaleDatePicker
import typingsSlinky.antDesignReactNative.anon.BackspaceLabel
import typingsSlinky.antDesignReactNative.anon.ButtonText
import typingsSlinky.antDesignReactNative.anon.CancelText
import typingsSlinky.antDesignReactNative.anon.Day
import typingsSlinky.antDesignReactNative.anon.DismissText
import typingsSlinky.antDesignReactNative.anon.Done
import typingsSlinky.antDesignReactNative.anon.Extra
import typingsSlinky.antDesignReactNative.anon.NextText
import typingsSlinky.antDesignReactNative.anon.PartialLocale
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeProviderMod {
  
  @JSImport("@ant-design/react-native/lib/locale-provider", JSImport.Default)
  @js.native
  class default () extends LocaleProvider
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/locale-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/locale-provider", "default.childContextTypes")
    @js.native
    def childContextTypes: AntLocale = js.native
    @scala.inline
    def childContextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/locale-provider", "default.propTypes")
    @js.native
    def propTypes: typingsSlinky.antDesignReactNative.anon.Locale = js.native
    @scala.inline
    def propTypes_=(x: typingsSlinky.antDesignReactNative.anon.Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Locale extends StObject {
    
    var DatePicker: DismissText = js.native
    
    var DatePickerView: Day = js.native
    
    var InputItem: BackspaceLabel = js.native
    
    var ListView: Done = js.native
    
    var Modal: ButtonText = js.native
    
    var Pagination: NextText = js.native
    
    var Picker: Extra = js.native
    
    var SearchBar: CancelText = js.native
    
    /** zh_CN */
    var locale: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      DatePicker: DismissText,
      DatePickerView: Day,
      InputItem: BackspaceLabel,
      ListView: Done,
      Modal: ButtonText,
      Pagination: NextText,
      Picker: Extra,
      SearchBar: CancelText,
      locale: String
    ): Locale = {
      val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], DatePickerView = DatePickerView.asInstanceOf[js.Any], InputItem = InputItem.asInstanceOf[js.Any], ListView = ListView.asInstanceOf[js.Any], Modal = Modal.asInstanceOf[js.Any], Pagination = Pagination.asInstanceOf[js.Any], Picker = Picker.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatePicker(value: DismissText): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerView(value: Day): Self = StObject.set(x, "DatePickerView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputItem(value: BackspaceLabel): Self = StObject.set(x, "InputItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListView(value: Done): Self = StObject.set(x, "ListView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: ButtonText): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagination(value: NextText): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: Extra): Self = StObject.set(x, "Picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchBar(value: CancelText): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocaleProvider
    extends Component[LocaleProviderProps, js.Any, js.Any] {
    
    def getChildContext(): AntLocaleDatePicker = js.native
  }
  
  @js.native
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var locale: js.UndefOr[PartialLocale] = js.native
  }
  object LocaleProviderProps {
    
    @scala.inline
    def apply(): LocaleProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    @scala.inline
    implicit class LocaleProviderPropsMutableBuilder[Self <: LocaleProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
}
