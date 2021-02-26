package typingsSlinky.reactDaumPostcode

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.E
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.J
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.K
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.N
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.R
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-daum-postcode", JSImport.Default)
  @js.native
  class default protected () extends DaumPostcode {
    def this(props: DaumPostcodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DaumPostcodeProps, context: js.Any) = this()
  }
  
  @JSImport("react-daum-postcode", "DaumPostcode")
  @js.native
  class DaumPostcode protected ()
    extends Component[DaumPostcodeProps, js.Any, js.Any] {
    def this(props: DaumPostcodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DaumPostcodeProps, context: js.Any) = this()
  }
  
  @js.native
  trait AddressData extends StObject {
    
    var address: String = js.native
    
    var addressEnglish: String = js.native
    
    var addressType: R | J = js.native
    
    var apartment: Y | N = js.native
    
    var autoJibunAddress: String = js.native
    
    var autoJibunAddressEnglish: String = js.native
    
    var autoRoadAddress: String = js.native
    
    var autoRoadAddressEnglish: String = js.native
    
    var bcode: String = js.native
    
    var bname: String = js.native
    
    var bname1: String = js.native
    
    var bname2: String = js.native
    
    var buildingCode: String = js.native
    
    var buildingName: String = js.native
    
    var hname: String = js.native
    
    var jibunAddress: String = js.native
    
    var jibunAddressEnglish: String = js.native
    
    var noSelected: Y | N = js.native
    
    var query: String = js.native
    
    var roadAddress: String = js.native
    
    var roadAddressEnglish: String = js.native
    
    var roadname: String = js.native
    
    var roadnameCode: String = js.native
    
    var sido: String = js.native
    
    var sigungu: String = js.native
    
    var sigunguCode: String = js.native
    
    var userLanguageType: K | E = js.native
    
    var userSelectedType: R | J = js.native
    
    var zonecode: String = js.native
  }
  object AddressData {
    
    @scala.inline
    def apply(
      address: String,
      addressEnglish: String,
      addressType: R | J,
      apartment: Y | N,
      autoJibunAddress: String,
      autoJibunAddressEnglish: String,
      autoRoadAddress: String,
      autoRoadAddressEnglish: String,
      bcode: String,
      bname: String,
      bname1: String,
      bname2: String,
      buildingCode: String,
      buildingName: String,
      hname: String,
      jibunAddress: String,
      jibunAddressEnglish: String,
      noSelected: Y | N,
      query: String,
      roadAddress: String,
      roadAddressEnglish: String,
      roadname: String,
      roadnameCode: String,
      sido: String,
      sigungu: String,
      sigunguCode: String,
      userLanguageType: K | E,
      userSelectedType: R | J,
      zonecode: String
    ): AddressData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressEnglish = addressEnglish.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], apartment = apartment.asInstanceOf[js.Any], autoJibunAddress = autoJibunAddress.asInstanceOf[js.Any], autoJibunAddressEnglish = autoJibunAddressEnglish.asInstanceOf[js.Any], autoRoadAddress = autoRoadAddress.asInstanceOf[js.Any], autoRoadAddressEnglish = autoRoadAddressEnglish.asInstanceOf[js.Any], bcode = bcode.asInstanceOf[js.Any], bname = bname.asInstanceOf[js.Any], bname1 = bname1.asInstanceOf[js.Any], bname2 = bname2.asInstanceOf[js.Any], buildingCode = buildingCode.asInstanceOf[js.Any], buildingName = buildingName.asInstanceOf[js.Any], hname = hname.asInstanceOf[js.Any], jibunAddress = jibunAddress.asInstanceOf[js.Any], jibunAddressEnglish = jibunAddressEnglish.asInstanceOf[js.Any], noSelected = noSelected.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any], roadAddressEnglish = roadAddressEnglish.asInstanceOf[js.Any], roadname = roadname.asInstanceOf[js.Any], roadnameCode = roadnameCode.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigungu = sigungu.asInstanceOf[js.Any], sigunguCode = sigunguCode.asInstanceOf[js.Any], userLanguageType = userLanguageType.asInstanceOf[js.Any], userSelectedType = userSelectedType.asInstanceOf[js.Any], zonecode = zonecode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressData]
    }
    
    @scala.inline
    implicit class AddressDataMutableBuilder[Self <: AddressData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressEnglish(value: String): Self = StObject.set(x, "addressEnglish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressType(value: R | J): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApartment(value: Y | N): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoJibunAddress(value: String): Self = StObject.set(x, "autoJibunAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoJibunAddressEnglish(value: String): Self = StObject.set(x, "autoJibunAddressEnglish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRoadAddress(value: String): Self = StObject.set(x, "autoRoadAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRoadAddressEnglish(value: String): Self = StObject.set(x, "autoRoadAddressEnglish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBcode(value: String): Self = StObject.set(x, "bcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBname(value: String): Self = StObject.set(x, "bname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBname1(value: String): Self = StObject.set(x, "bname1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBname2(value: String): Self = StObject.set(x, "bname2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildingCode(value: String): Self = StObject.set(x, "buildingCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildingName(value: String): Self = StObject.set(x, "buildingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHname(value: String): Self = StObject.set(x, "hname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJibunAddress(value: String): Self = StObject.set(x, "jibunAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJibunAddressEnglish(value: String): Self = StObject.set(x, "jibunAddressEnglish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSelected(value: Y | N): Self = StObject.set(x, "noSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoadAddress(value: String): Self = StObject.set(x, "roadAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoadAddressEnglish(value: String): Self = StObject.set(x, "roadAddressEnglish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoadname(value: String): Self = StObject.set(x, "roadname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoadnameCode(value: String): Self = StObject.set(x, "roadnameCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigungu(value: String): Self = StObject.set(x, "sigungu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigunguCode(value: String): Self = StObject.set(x, "sigunguCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserLanguageType(value: K | E): Self = StObject.set(x, "userLanguageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserSelectedType(value: R | J): Self = StObject.set(x, "userSelectedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZonecode(value: String): Self = StObject.set(x, "zonecode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DaumPostcodeProps extends StObject {
    
    var alwaysShowEngAddr: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[Boolean] = js.native
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var autoMapping: js.UndefOr[Boolean] = js.native
    
    var autoResize: js.UndefOr[Boolean] = js.native
    
    var defaultQuery: js.UndefOr[String] = js.native
    
    var errorMessage: js.UndefOr[ReactElement] = js.native
    
    var focusContent: js.UndefOr[Boolean] = js.native
    
    var focusInput: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hideEngBtn: js.UndefOr[Boolean] = js.native
    
    var hideMapBtn: js.UndefOr[Boolean] = js.native
    
    var maxSuggestItems: js.UndefOr[Double] = js.native
    
    def onComplete(data: AddressData): Unit = js.native
    
    var onSearch: js.UndefOr[js.Function1[/* data */ SearchData, Unit]] = js.native
    
    var pleaseReadGuide: js.UndefOr[Double] = js.native
    
    var pleaseReadGuideTimer: js.UndefOr[Double] = js.native
    
    var scriptUrl: js.UndefOr[String] = js.native
    
    var shorthand: js.UndefOr[Boolean] = js.native
    
    var showMoreHName: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var submitMode: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[js.Object] = js.native
    
    var useSuggest: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object DaumPostcodeProps {
    
    @scala.inline
    def apply(onComplete: AddressData => Unit): DaumPostcodeProps = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
      __obj.asInstanceOf[DaumPostcodeProps]
    }
    
    @scala.inline
    implicit class DaumPostcodePropsMutableBuilder[Self <: DaumPostcodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowEngAddr(value: Boolean): Self = StObject.set(x, "alwaysShowEngAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowEngAddrUndefined: Self = StObject.set(x, "alwaysShowEngAddr", js.undefined)
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setAutoMapping(value: Boolean): Self = StObject.set(x, "autoMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMappingUndefined: Self = StObject.set(x, "autoMapping", js.undefined)
      
      @scala.inline
      def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      @scala.inline
      def setDefaultQuery(value: String): Self = StObject.set(x, "defaultQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultQueryUndefined: Self = StObject.set(x, "defaultQuery", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: ReactElement): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setFocusContent(value: Boolean): Self = StObject.set(x, "focusContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusContentUndefined: Self = StObject.set(x, "focusContent", js.undefined)
      
      @scala.inline
      def setFocusInput(value: Boolean): Self = StObject.set(x, "focusInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideEngBtn(value: Boolean): Self = StObject.set(x, "hideEngBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideEngBtnUndefined: Self = StObject.set(x, "hideEngBtn", js.undefined)
      
      @scala.inline
      def setHideMapBtn(value: Boolean): Self = StObject.set(x, "hideMapBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideMapBtnUndefined: Self = StObject.set(x, "hideMapBtn", js.undefined)
      
      @scala.inline
      def setMaxSuggestItems(value: Double): Self = StObject.set(x, "maxSuggestItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSuggestItemsUndefined: Self = StObject.set(x, "maxSuggestItems", js.undefined)
      
      @scala.inline
      def setOnComplete(value: AddressData => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearch(value: /* data */ SearchData => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setPleaseReadGuide(value: Double): Self = StObject.set(x, "pleaseReadGuide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPleaseReadGuideTimer(value: Double): Self = StObject.set(x, "pleaseReadGuideTimer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPleaseReadGuideTimerUndefined: Self = StObject.set(x, "pleaseReadGuideTimer", js.undefined)
      
      @scala.inline
      def setPleaseReadGuideUndefined: Self = StObject.set(x, "pleaseReadGuide", js.undefined)
      
      @scala.inline
      def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      @scala.inline
      def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      @scala.inline
      def setShowMoreHName(value: Boolean): Self = StObject.set(x, "showMoreHName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMoreHNameUndefined: Self = StObject.set(x, "showMoreHName", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubmitMode(value: Boolean): Self = StObject.set(x, "submitMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitModeUndefined: Self = StObject.set(x, "submitMode", js.undefined)
      
      @scala.inline
      def setTheme(value: js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUseSuggest(value: Boolean): Self = StObject.set(x, "useSuggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSuggestUndefined: Self = StObject.set(x, "useSuggest", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SearchData extends StObject {
    
    var count: Double = js.native
    
    var q: String = js.native
  }
  object SearchData {
    
    @scala.inline
    def apply(count: Double, q: String): SearchData = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchData]
    }
    
    @scala.inline
    implicit class SearchDataMutableBuilder[Self <: SearchData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    }
  }
}
