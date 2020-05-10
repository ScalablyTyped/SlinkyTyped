package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics filter expression.
  */
@js.native
trait SchemaFilterExpression extends js.Object {
  /**
    * Determines if the filter is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Filter expression value
    */
  var expressionValue: js.UndefOr[String] = js.native
  /**
    * Field to filter. Possible values:   - Content and Traffic   -
    * PAGE_REQUEST_URI,  - PAGE_HOSTNAME,  - PAGE_TITLE,  - REFERRAL,  -
    * COST_DATA_URI (Campaign target URL),  - HIT_TYPE,  -
    * INTERNAL_SEARCH_TERM,  - INTERNAL_SEARCH_TYPE,  -
    * SOURCE_PROPERTY_TRACKING_ID,    - Campaign or AdGroup   -
    * CAMPAIGN_SOURCE,  - CAMPAIGN_MEDIUM,  - CAMPAIGN_NAME,  -
    * CAMPAIGN_AD_GROUP,  - CAMPAIGN_TERM,  - CAMPAIGN_CONTENT,  -
    * CAMPAIGN_CODE,  - CAMPAIGN_REFERRAL_PATH,    - E-Commerce   -
    * TRANSACTION_COUNTRY,  - TRANSACTION_REGION,  - TRANSACTION_CITY,  -
    * TRANSACTION_AFFILIATION (Store or order location),  - ITEM_NAME,  -
    * ITEM_CODE,  - ITEM_VARIATION,  - TRANSACTION_ID,  -
    * TRANSACTION_CURRENCY_CODE,  - PRODUCT_ACTION_TYPE,    - Audience/Users -
    * BROWSER,  - BROWSER_VERSION,  - BROWSER_SIZE,  - PLATFORM,  -
    * PLATFORM_VERSION,  - LANGUAGE,  - SCREEN_RESOLUTION,  - SCREEN_COLORS,  -
    * JAVA_ENABLED (Boolean Field),  - FLASH_VERSION,  - GEO_SPEED (Connection
    * speed),  - VISITOR_TYPE,  - GEO_ORGANIZATION (ISP organization),  -
    * GEO_DOMAIN,  - GEO_IP_ADDRESS,  - GEO_IP_VERSION,    - Location   -
    * GEO_COUNTRY,  - GEO_REGION,  - GEO_CITY,    - Event   - EVENT_CATEGORY,
    * - EVENT_ACTION,  - EVENT_LABEL,    - Other   - CUSTOM_FIELD_1,  -
    * CUSTOM_FIELD_2,  - USER_DEFINED_VALUE,    - Application   - APP_ID,  -
    * APP_INSTALLER_ID,  - APP_NAME,  - APP_VERSION,  - SCREEN,  - IS_APP
    * (Boolean Field),  - IS_FATAL_EXCEPTION (Boolean Field),  -
    * EXCEPTION_DESCRIPTION,    - Mobile device   - IS_MOBILE (Boolean Field,
    * Deprecated. Use DEVICE_CATEGORY=mobile),  - IS_TABLET (Boolean Field,
    * Deprecated. Use DEVICE_CATEGORY=tablet),  - DEVICE_CATEGORY,  -
    * MOBILE_HAS_QWERTY_KEYBOARD (Boolean Field),  - MOBILE_HAS_NFC_SUPPORT
    * (Boolean Field),  - MOBILE_HAS_CELLULAR_RADIO (Boolean Field),  -
    * MOBILE_HAS_WIFI_SUPPORT (Boolean Field),  - MOBILE_BRAND_NAME,  -
    * MOBILE_MODEL_NAME,  - MOBILE_MARKETING_NAME,  - MOBILE_POINTING_METHOD,
    * - Social   - SOCIAL_NETWORK,  - SOCIAL_ACTION,  - SOCIAL_ACTION_TARGET,
    * - Custom dimension   - CUSTOM_DIMENSION (See accompanying field index),
    */
  var field: js.UndefOr[String] = js.native
  /**
    * The Index of the custom dimension. Set only if the field is a is
    * CUSTOM_DIMENSION.
    */
  var fieldIndex: js.UndefOr[Double] = js.native
  /**
    * Kind value for filter expression
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Match type for this filter. Possible values are BEGINS_WITH, EQUAL,
    * ENDS_WITH, CONTAINS, or MATCHES. GEO_DOMAIN, GEO_IP_ADDRESS,
    * PAGE_REQUEST_URI, or PAGE_HOSTNAME filters can use any match type; all
    * other filters must use MATCHES.
    */
  var matchType: js.UndefOr[String] = js.native
}

object SchemaFilterExpression {
  @scala.inline
  def apply(): SchemaFilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterExpression]
  }
  @scala.inline
  implicit class SchemaFilterExpressionOps[Self <: SchemaFilterExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(js.undefined)
        ret
    }
  }
  
}

