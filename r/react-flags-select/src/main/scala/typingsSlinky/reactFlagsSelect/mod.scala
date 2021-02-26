package typingsSlinky.reactFlagsSelect

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flags-select", JSImport.Default)
  @js.native
  class default () extends ReactFlagsSelect
  
  @js.native
  trait Props extends StObject {
    
    var alignOptions: js.UndefOr[String] = js.native
    
    var blackList: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var countries: js.UndefOr[js.Array[String]] = js.native
    
    var customLabels: js.UndefOr[StringDictionary[String]] = js.native
    
    var defaultCountry: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* countryCode */ String, Unit]] = js.native
    
    var optionsSize: js.UndefOr[Double] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var searchable: js.UndefOr[Boolean] = js.native
    
    var selectedSize: js.UndefOr[Double] = js.native
    
    var showOptionLabel: js.UndefOr[Boolean] = js.native
    
    var showSelectedLabel: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignOptions(value: String): Self = StObject.set(x, "alignOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignOptionsUndefined: Self = StObject.set(x, "alignOptions", js.undefined)
      
      @scala.inline
      def setBlackList(value: Boolean): Self = StObject.set(x, "blackList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackListUndefined: Self = StObject.set(x, "blackList", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      @scala.inline
      def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      @scala.inline
      def setCustomLabels(value: StringDictionary[String]): Self = StObject.set(x, "customLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLabelsUndefined: Self = StObject.set(x, "customLabels", js.undefined)
      
      @scala.inline
      def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* countryCode */ String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptionsSize(value: Double): Self = StObject.set(x, "optionsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsSizeUndefined: Self = StObject.set(x, "optionsSize", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
      
      @scala.inline
      def setSelectedSize(value: Double): Self = StObject.set(x, "selectedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedSizeUndefined: Self = StObject.set(x, "selectedSize", js.undefined)
      
      @scala.inline
      def setShowOptionLabel(value: Boolean): Self = StObject.set(x, "showOptionLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOptionLabelUndefined: Self = StObject.set(x, "showOptionLabel", js.undefined)
      
      @scala.inline
      def setShowSelectedLabel(value: Boolean): Self = StObject.set(x, "showSelectedLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSelectedLabelUndefined: Self = StObject.set(x, "showSelectedLabel", js.undefined)
    }
  }
  
  @js.native
  trait ReactFlagsSelect
    extends Component[Props, js.Object, js.Any] {
    
    def updateSelected(countryCode: String): Unit = js.native
  }
}
