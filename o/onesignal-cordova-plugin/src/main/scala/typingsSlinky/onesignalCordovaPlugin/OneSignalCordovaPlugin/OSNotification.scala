package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSNotification extends StObject {
  
  var adm_big_picture: js.UndefOr[String] = js.native
  
  var adm_group: js.UndefOr[String] = js.native
  
  var adm_group_message: js.UndefOr[js.Any] = js.native
  
  var adm_large_icon: js.UndefOr[String] = js.native
  
  var adm_small_icon: js.UndefOr[String] = js.native
  
  var adm_sound: js.UndefOr[String] = js.native
  
  var amazon_background_data: js.UndefOr[Boolean] = js.native
  
  var androidNotificationId: js.UndefOr[Double] = js.native
  
  var android_accent_color: js.UndefOr[String] = js.native
  
  var android_group: js.UndefOr[String] = js.native
  
  var android_group_message: js.UndefOr[js.Any] = js.native
  
  var android_led_color: js.UndefOr[String] = js.native
  
  var android_sound: js.UndefOr[String] = js.native
  
  var android_visibility: js.UndefOr[Double] = js.native
  
  var app_id: js.UndefOr[String] = js.native
  
  var app_ids: js.UndefOr[js.Array[String]] = js.native
  
  var big_picture: js.UndefOr[String] = js.native
  
  var buttons: js.UndefOr[js.Any] = js.native
  
  var chrome_big_picture: js.UndefOr[String] = js.native
  
  var chrome_icon: js.UndefOr[String] = js.native
  
  var chrome_web_icon: js.UndefOr[String] = js.native
  
  var content_available: js.UndefOr[Boolean] = js.native
  
  var contents: js.Any = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var delayed_option: js.UndefOr[String] = js.native
  
  var delivery_time_of_day: js.UndefOr[String] = js.native
  
  var displayType: OSDisplayType = js.native
  
  var excluded_segments: js.UndefOr[js.Array[String]] = js.native
  
  var firefox_icon: js.UndefOr[String] = js.native
  
  var groupedNotifications: js.UndefOr[js.Array[OSNotificationPayload]] = js.native
  
  var headings: js.UndefOr[js.Any] = js.native
  
  var include_amazon_reg_ids: js.UndefOr[js.Array[String]] = js.native
  
  var include_android_reg_ids: js.UndefOr[js.Array[String]] = js.native
  
  var include_chrome_reg_ids: js.UndefOr[js.Array[String]] = js.native
  
  var include_chrome_web_reg_ids: js.UndefOr[js.Array[String]] = js.native
  
  var include_ios_tokens: js.UndefOr[js.Array[String]] = js.native
  
  var include_player_ids: js.UndefOr[js.Array[String]] = js.native
  
  var include_wp_uris: js.UndefOr[js.Array[String]] = js.native
  
  var include_wp_wns_uris: js.UndefOr[js.Array[String]] = js.native
  
  var included_segments: js.UndefOr[js.Array[String]] = js.native
  
  var ios_badgeCount: js.UndefOr[Double] = js.native
  
  var ios_badgeType: js.UndefOr[String] = js.native
  
  var ios_category: js.UndefOr[String] = js.native
  
  var ios_sound: js.UndefOr[String] = js.native
  
  var isAdm: js.UndefOr[Boolean] = js.native
  
  var isAndroid: js.UndefOr[Boolean] = js.native
  
  var isAnyWeb: js.UndefOr[Boolean] = js.native
  
  var isAppInFocus: Boolean = js.native
  
  var isChrome: js.UndefOr[Boolean] = js.native
  
  var isChromeWeb: js.UndefOr[Boolean] = js.native
  
  var isIos: js.UndefOr[Boolean] = js.native
  
  var isSafari: js.UndefOr[Boolean] = js.native
  
  var isWP: js.UndefOr[Boolean] = js.native
  
  var isWP_WNS: js.UndefOr[Boolean] = js.native
  
  var large_icon: js.UndefOr[String] = js.native
  
  var payload: OSNotificationPayload = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var send_after: js.UndefOr[String] = js.native
  
  var shown: Boolean = js.native
  
  var small_icon: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[_]] = js.native
  
  var template_id: js.UndefOr[String] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var wp_sound: js.UndefOr[String] = js.native
  
  var wp_wns_sound: js.UndefOr[String] = js.native
}
object OSNotification {
  
  @scala.inline
  def apply(
    contents: js.Any,
    displayType: OSDisplayType,
    isAppInFocus: Boolean,
    payload: OSNotificationPayload,
    shown: Boolean
  ): OSNotification = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], isAppInFocus = isAppInFocus.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotification]
  }
  
  @scala.inline
  implicit class OSNotificationMutableBuilder[Self <: OSNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdm_big_picture(value: String): Self = StObject.set(x, "adm_big_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdm_big_pictureUndefined: Self = StObject.set(x, "adm_big_picture", js.undefined)
    
    @scala.inline
    def setAdm_group(value: String): Self = StObject.set(x, "adm_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdm_groupUndefined: Self = StObject.set(x, "adm_group", js.undefined)
    
    @scala.inline
    def setAdm_group_message(value: js.Any): Self = StObject.set(x, "adm_group_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdm_group_messageUndefined: Self = StObject.set(x, "adm_group_message", js.undefined)
    
    @scala.inline
    def setAdm_large_icon(value: String): Self = StObject.set(x, "adm_large_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdm_large_iconUndefined: Self = StObject.set(x, "adm_large_icon", js.undefined)
    
    @scala.inline
    def setAdm_small_icon(value: String): Self = StObject.set(x, "adm_small_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdm_small_iconUndefined: Self = StObject.set(x, "adm_small_icon", js.undefined)
    
    @scala.inline
    def setAdm_sound(value: String): Self = StObject.set(x, "adm_sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdm_soundUndefined: Self = StObject.set(x, "adm_sound", js.undefined)
    
    @scala.inline
    def setAmazon_background_data(value: Boolean): Self = StObject.set(x, "amazon_background_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazon_background_dataUndefined: Self = StObject.set(x, "amazon_background_data", js.undefined)
    
    @scala.inline
    def setAndroidNotificationId(value: Double): Self = StObject.set(x, "androidNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidNotificationIdUndefined: Self = StObject.set(x, "androidNotificationId", js.undefined)
    
    @scala.inline
    def setAndroid_accent_color(value: String): Self = StObject.set(x, "android_accent_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_accent_colorUndefined: Self = StObject.set(x, "android_accent_color", js.undefined)
    
    @scala.inline
    def setAndroid_group(value: String): Self = StObject.set(x, "android_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_groupUndefined: Self = StObject.set(x, "android_group", js.undefined)
    
    @scala.inline
    def setAndroid_group_message(value: js.Any): Self = StObject.set(x, "android_group_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_group_messageUndefined: Self = StObject.set(x, "android_group_message", js.undefined)
    
    @scala.inline
    def setAndroid_led_color(value: String): Self = StObject.set(x, "android_led_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_led_colorUndefined: Self = StObject.set(x, "android_led_color", js.undefined)
    
    @scala.inline
    def setAndroid_sound(value: String): Self = StObject.set(x, "android_sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_soundUndefined: Self = StObject.set(x, "android_sound", js.undefined)
    
    @scala.inline
    def setAndroid_visibility(value: Double): Self = StObject.set(x, "android_visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_visibilityUndefined: Self = StObject.set(x, "android_visibility", js.undefined)
    
    @scala.inline
    def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    @scala.inline
    def setApp_ids(value: js.Array[String]): Self = StObject.set(x, "app_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_idsUndefined: Self = StObject.set(x, "app_ids", js.undefined)
    
    @scala.inline
    def setApp_idsVarargs(value: String*): Self = StObject.set(x, "app_ids", js.Array(value :_*))
    
    @scala.inline
    def setBig_picture(value: String): Self = StObject.set(x, "big_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBig_pictureUndefined: Self = StObject.set(x, "big_picture", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setChrome_big_picture(value: String): Self = StObject.set(x, "chrome_big_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_big_pictureUndefined: Self = StObject.set(x, "chrome_big_picture", js.undefined)
    
    @scala.inline
    def setChrome_icon(value: String): Self = StObject.set(x, "chrome_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_iconUndefined: Self = StObject.set(x, "chrome_icon", js.undefined)
    
    @scala.inline
    def setChrome_web_icon(value: String): Self = StObject.set(x, "chrome_web_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_web_iconUndefined: Self = StObject.set(x, "chrome_web_icon", js.undefined)
    
    @scala.inline
    def setContent_available(value: Boolean): Self = StObject.set(x, "content_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_availableUndefined: Self = StObject.set(x, "content_available", js.undefined)
    
    @scala.inline
    def setContents(value: js.Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDelayed_option(value: String): Self = StObject.set(x, "delayed_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayed_optionUndefined: Self = StObject.set(x, "delayed_option", js.undefined)
    
    @scala.inline
    def setDelivery_time_of_day(value: String): Self = StObject.set(x, "delivery_time_of_day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelivery_time_of_dayUndefined: Self = StObject.set(x, "delivery_time_of_day", js.undefined)
    
    @scala.inline
    def setDisplayType(value: OSDisplayType): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcluded_segments(value: js.Array[String]): Self = StObject.set(x, "excluded_segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcluded_segmentsUndefined: Self = StObject.set(x, "excluded_segments", js.undefined)
    
    @scala.inline
    def setExcluded_segmentsVarargs(value: String*): Self = StObject.set(x, "excluded_segments", js.Array(value :_*))
    
    @scala.inline
    def setFirefox_icon(value: String): Self = StObject.set(x, "firefox_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox_iconUndefined: Self = StObject.set(x, "firefox_icon", js.undefined)
    
    @scala.inline
    def setGroupedNotifications(value: js.Array[OSNotificationPayload]): Self = StObject.set(x, "groupedNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedNotificationsUndefined: Self = StObject.set(x, "groupedNotifications", js.undefined)
    
    @scala.inline
    def setGroupedNotificationsVarargs(value: OSNotificationPayload*): Self = StObject.set(x, "groupedNotifications", js.Array(value :_*))
    
    @scala.inline
    def setHeadings(value: js.Any): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingsUndefined: Self = StObject.set(x, "headings", js.undefined)
    
    @scala.inline
    def setInclude_amazon_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_amazon_reg_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_amazon_reg_idsUndefined: Self = StObject.set(x, "include_amazon_reg_ids", js.undefined)
    
    @scala.inline
    def setInclude_amazon_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_amazon_reg_ids", js.Array(value :_*))
    
    @scala.inline
    def setInclude_android_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_android_reg_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_android_reg_idsUndefined: Self = StObject.set(x, "include_android_reg_ids", js.undefined)
    
    @scala.inline
    def setInclude_android_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_android_reg_ids", js.Array(value :_*))
    
    @scala.inline
    def setInclude_chrome_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_chrome_reg_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_chrome_reg_idsUndefined: Self = StObject.set(x, "include_chrome_reg_ids", js.undefined)
    
    @scala.inline
    def setInclude_chrome_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_chrome_reg_ids", js.Array(value :_*))
    
    @scala.inline
    def setInclude_chrome_web_reg_ids(value: js.Array[String]): Self = StObject.set(x, "include_chrome_web_reg_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_chrome_web_reg_idsUndefined: Self = StObject.set(x, "include_chrome_web_reg_ids", js.undefined)
    
    @scala.inline
    def setInclude_chrome_web_reg_idsVarargs(value: String*): Self = StObject.set(x, "include_chrome_web_reg_ids", js.Array(value :_*))
    
    @scala.inline
    def setInclude_ios_tokens(value: js.Array[String]): Self = StObject.set(x, "include_ios_tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_ios_tokensUndefined: Self = StObject.set(x, "include_ios_tokens", js.undefined)
    
    @scala.inline
    def setInclude_ios_tokensVarargs(value: String*): Self = StObject.set(x, "include_ios_tokens", js.Array(value :_*))
    
    @scala.inline
    def setInclude_player_ids(value: js.Array[String]): Self = StObject.set(x, "include_player_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_player_idsUndefined: Self = StObject.set(x, "include_player_ids", js.undefined)
    
    @scala.inline
    def setInclude_player_idsVarargs(value: String*): Self = StObject.set(x, "include_player_ids", js.Array(value :_*))
    
    @scala.inline
    def setInclude_wp_uris(value: js.Array[String]): Self = StObject.set(x, "include_wp_uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_wp_urisUndefined: Self = StObject.set(x, "include_wp_uris", js.undefined)
    
    @scala.inline
    def setInclude_wp_urisVarargs(value: String*): Self = StObject.set(x, "include_wp_uris", js.Array(value :_*))
    
    @scala.inline
    def setInclude_wp_wns_uris(value: js.Array[String]): Self = StObject.set(x, "include_wp_wns_uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_wp_wns_urisUndefined: Self = StObject.set(x, "include_wp_wns_uris", js.undefined)
    
    @scala.inline
    def setInclude_wp_wns_urisVarargs(value: String*): Self = StObject.set(x, "include_wp_wns_uris", js.Array(value :_*))
    
    @scala.inline
    def setIncluded_segments(value: js.Array[String]): Self = StObject.set(x, "included_segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncluded_segmentsUndefined: Self = StObject.set(x, "included_segments", js.undefined)
    
    @scala.inline
    def setIncluded_segmentsVarargs(value: String*): Self = StObject.set(x, "included_segments", js.Array(value :_*))
    
    @scala.inline
    def setIos_badgeCount(value: Double): Self = StObject.set(x, "ios_badgeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos_badgeCountUndefined: Self = StObject.set(x, "ios_badgeCount", js.undefined)
    
    @scala.inline
    def setIos_badgeType(value: String): Self = StObject.set(x, "ios_badgeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos_badgeTypeUndefined: Self = StObject.set(x, "ios_badgeType", js.undefined)
    
    @scala.inline
    def setIos_category(value: String): Self = StObject.set(x, "ios_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos_categoryUndefined: Self = StObject.set(x, "ios_category", js.undefined)
    
    @scala.inline
    def setIos_sound(value: String): Self = StObject.set(x, "ios_sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos_soundUndefined: Self = StObject.set(x, "ios_sound", js.undefined)
    
    @scala.inline
    def setIsAdm(value: Boolean): Self = StObject.set(x, "isAdm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdmUndefined: Self = StObject.set(x, "isAdm", js.undefined)
    
    @scala.inline
    def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAndroidUndefined: Self = StObject.set(x, "isAndroid", js.undefined)
    
    @scala.inline
    def setIsAnyWeb(value: Boolean): Self = StObject.set(x, "isAnyWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnyWebUndefined: Self = StObject.set(x, "isAnyWeb", js.undefined)
    
    @scala.inline
    def setIsAppInFocus(value: Boolean): Self = StObject.set(x, "isAppInFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
    
    @scala.inline
    def setIsChromeWeb(value: Boolean): Self = StObject.set(x, "isChromeWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChromeWebUndefined: Self = StObject.set(x, "isChromeWeb", js.undefined)
    
    @scala.inline
    def setIsIos(value: Boolean): Self = StObject.set(x, "isIos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIosUndefined: Self = StObject.set(x, "isIos", js.undefined)
    
    @scala.inline
    def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSafariUndefined: Self = StObject.set(x, "isSafari", js.undefined)
    
    @scala.inline
    def setIsWP(value: Boolean): Self = StObject.set(x, "isWP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWPUndefined: Self = StObject.set(x, "isWP", js.undefined)
    
    @scala.inline
    def setIsWP_WNS(value: Boolean): Self = StObject.set(x, "isWP_WNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWP_WNSUndefined: Self = StObject.set(x, "isWP_WNS", js.undefined)
    
    @scala.inline
    def setLarge_icon(value: String): Self = StObject.set(x, "large_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_iconUndefined: Self = StObject.set(x, "large_icon", js.undefined)
    
    @scala.inline
    def setPayload(value: OSNotificationPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSend_after(value: String): Self = StObject.set(x, "send_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_afterUndefined: Self = StObject.set(x, "send_after", js.undefined)
    
    @scala.inline
    def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall_icon(value: String): Self = StObject.set(x, "small_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall_iconUndefined: Self = StObject.set(x, "small_icon", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[_]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWp_sound(value: String): Self = StObject.set(x, "wp_sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWp_soundUndefined: Self = StObject.set(x, "wp_sound", js.undefined)
    
    @scala.inline
    def setWp_wns_sound(value: String): Self = StObject.set(x, "wp_wns_sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWp_wns_soundUndefined: Self = StObject.set(x, "wp_wns_sound", js.undefined)
  }
}
