package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpression extends StObject {
  
  /** Determines if the filter is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** Filter expression value */
  var expressionValue: js.UndefOr[String] = js.native
  
  /**
    * Field to filter. Possible values:
    * - Content and Traffic
    * - PAGE_REQUEST_URI,
    * - PAGE_HOSTNAME,
    * - PAGE_TITLE,
    * - REFERRAL,
    * - COST_DATA_URI (Campaign target URL),
    * - HIT_TYPE,
    * - INTERNAL_SEARCH_TERM,
    * - INTERNAL_SEARCH_TYPE,
    * - SOURCE_PROPERTY_TRACKING_ID,
    * - Campaign or AdGroup
    * - CAMPAIGN_SOURCE,
    * - CAMPAIGN_MEDIUM,
    * - CAMPAIGN_NAME,
    * - CAMPAIGN_AD_GROUP,
    * - CAMPAIGN_TERM,
    * - CAMPAIGN_CONTENT,
    * - CAMPAIGN_CODE,
    * - CAMPAIGN_REFERRAL_PATH,
    * - E-Commerce
    * - TRANSACTION_COUNTRY,
    * - TRANSACTION_REGION,
    * - TRANSACTION_CITY,
    * - TRANSACTION_AFFILIATION (Store or order location),
    * - ITEM_NAME,
    * - ITEM_CODE,
    * - ITEM_VARIATION,
    * - TRANSACTION_ID,
    * - TRANSACTION_CURRENCY_CODE,
    * - PRODUCT_ACTION_TYPE,
    * - Audience/Users
    * - BROWSER,
    * - BROWSER_VERSION,
    * - BROWSER_SIZE,
    * - PLATFORM,
    * - PLATFORM_VERSION,
    * - LANGUAGE,
    * - SCREEN_RESOLUTION,
    * - SCREEN_COLORS,
    * - JAVA_ENABLED (Boolean Field),
    * - FLASH_VERSION,
    * - GEO_SPEED (Connection speed),
    * - VISITOR_TYPE,
    * - GEO_ORGANIZATION (ISP organization),
    * - GEO_DOMAIN,
    * - GEO_IP_ADDRESS,
    * - GEO_IP_VERSION,
    * - Location
    * - GEO_COUNTRY,
    * - GEO_REGION,
    * - GEO_CITY,
    * - Event
    * - EVENT_CATEGORY,
    * - EVENT_ACTION,
    * - EVENT_LABEL,
    * - Other
    * - CUSTOM_FIELD_1,
    * - CUSTOM_FIELD_2,
    * - USER_DEFINED_VALUE,
    * - Application
    * - APP_ID,
    * - APP_INSTALLER_ID,
    * - APP_NAME,
    * - APP_VERSION,
    * - SCREEN,
    * - IS_APP (Boolean Field),
    * - IS_FATAL_EXCEPTION (Boolean Field),
    * - EXCEPTION_DESCRIPTION,
    * - Mobile device
    * - IS_MOBILE (Boolean Field, Deprecated. Use DEVICE_CATEGORY=mobile),
    * - IS_TABLET (Boolean Field, Deprecated. Use DEVICE_CATEGORY=tablet),
    * - DEVICE_CATEGORY,
    * - MOBILE_HAS_QWERTY_KEYBOARD (Boolean Field),
    * - MOBILE_HAS_NFC_SUPPORT (Boolean Field),
    * - MOBILE_HAS_CELLULAR_RADIO (Boolean Field),
    * - MOBILE_HAS_WIFI_SUPPORT (Boolean Field),
    * - MOBILE_BRAND_NAME,
    * - MOBILE_MODEL_NAME,
    * - MOBILE_MARKETING_NAME,
    * - MOBILE_POINTING_METHOD,
    * - Social
    * - SOCIAL_NETWORK,
    * - SOCIAL_ACTION,
    * - SOCIAL_ACTION_TARGET,
    * - Custom dimension
    * - CUSTOM_DIMENSION (See accompanying field index),
    */
  var field: js.UndefOr[String] = js.native
  
  /** The Index of the custom dimension. Set only if the field is a is CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[Double] = js.native
  
  /** Kind value for filter expression */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Match type for this filter. Possible values are BEGINS_WITH, EQUAL, ENDS_WITH, CONTAINS, or MATCHES. GEO_DOMAIN, GEO_IP_ADDRESS, PAGE_REQUEST_URI, or PAGE_HOSTNAME filters can use
    * any match type; all other filters must use MATCHES.
    */
  var matchType: js.UndefOr[String] = js.native
}
object FilterExpression {
  
  @scala.inline
  def apply(): FilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit class FilterExpressionMutableBuilder[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setExpressionValue(value: String): Self = StObject.set(x, "expressionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionValueUndefined: Self = StObject.set(x, "expressionValue", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIndex(value: Double): Self = StObject.set(x, "fieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIndexUndefined: Self = StObject.set(x, "fieldIndex", js.undefined)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
  }
}
