package typingsSlinky.onesignalCordovaPlugin.anon

import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSDisplayType
import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotificationPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<onesignal-cordova-plugin.OneSignalCordovaPlugin.OSNotification> */
@js.native
trait PartialOSNotification extends js.Object {
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
  var contents: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var delayed_option: js.UndefOr[String] = js.native
  var delivery_time_of_day: js.UndefOr[String] = js.native
  var displayType: js.UndefOr[OSDisplayType] = js.native
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
  var isAppInFocus: js.UndefOr[Boolean] = js.native
  var isChrome: js.UndefOr[Boolean] = js.native
  var isChromeWeb: js.UndefOr[Boolean] = js.native
  var isIos: js.UndefOr[Boolean] = js.native
  var isSafari: js.UndefOr[Boolean] = js.native
  var isWP: js.UndefOr[Boolean] = js.native
  var isWP_WNS: js.UndefOr[Boolean] = js.native
  var large_icon: js.UndefOr[String] = js.native
  var payload: js.UndefOr[OSNotificationPayload] = js.native
  var priority: js.UndefOr[Double] = js.native
  var send_after: js.UndefOr[String] = js.native
  var shown: js.UndefOr[Boolean] = js.native
  var small_icon: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[_]] = js.native
  var template_id: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var wp_sound: js.UndefOr[String] = js.native
  var wp_wns_sound: js.UndefOr[String] = js.native
}

object PartialOSNotification {
  @scala.inline
  def apply(): PartialOSNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOSNotification]
  }
  @scala.inline
  implicit class PartialOSNotificationOps[Self <: PartialOSNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdm_big_picture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_big_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm_big_picture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_big_picture")(js.undefined)
        ret
    }
    @scala.inline
    def withAdm_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_group")(js.undefined)
        ret
    }
    @scala.inline
    def withAdm_group_message(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_group_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm_group_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_group_message")(js.undefined)
        ret
    }
    @scala.inline
    def withAdm_large_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_large_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm_large_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_large_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withAdm_small_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_small_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm_small_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_small_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withAdm_sound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm_sound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm_sound")(js.undefined)
        ret
    }
    @scala.inline
    def withAmazon_background_data(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazon_background_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazon_background_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazon_background_data")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidNotificationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNotificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidNotificationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNotificationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_accent_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_accent_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_accent_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_accent_color")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_group")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_group_message(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_group_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_group_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_group_message")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_led_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_led_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_led_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_led_color")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_sound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_sound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_sound")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid_visibility(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid_visibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withBig_picture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBig_picture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big_picture")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_big_picture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_big_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_big_picture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_big_picture")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_web_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_web_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_web_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_web_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_available: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_available")(js.undefined)
        ret
    }
    @scala.inline
    def withContents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayed_option(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed_option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayed_option: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed_option")(js.undefined)
        ret
    }
    @scala.inline
    def withDelivery_time_of_day(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delivery_time_of_day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelivery_time_of_day: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delivery_time_of_day")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayType(value: OSDisplayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
        ret
    }
    @scala.inline
    def withExcluded_segments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcluded_segments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_segments")(js.undefined)
        ret
    }
    @scala.inline
    def withFirefox_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefox_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedNotifications(value: js.Array[OSNotificationPayload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headings")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_amazon_reg_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_amazon_reg_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_amazon_reg_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_amazon_reg_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_android_reg_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_android_reg_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_android_reg_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_android_reg_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_chrome_reg_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_chrome_reg_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_chrome_reg_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_chrome_reg_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_chrome_web_reg_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_chrome_web_reg_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_chrome_web_reg_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_chrome_web_reg_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_ios_tokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_ios_tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_ios_tokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_ios_tokens")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_player_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_player_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_player_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_player_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_wp_uris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_wp_uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_wp_uris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_wp_uris")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_wp_wns_uris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_wp_wns_uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_wp_wns_uris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_wp_wns_uris")(js.undefined)
        ret
    }
    @scala.inline
    def withIncluded_segments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included_segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluded_segments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included_segments")(js.undefined)
        ret
    }
    @scala.inline
    def withIos_badgeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_badgeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos_badgeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_badgeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIos_badgeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_badgeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos_badgeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_badgeType")(js.undefined)
        ret
    }
    @scala.inline
    def withIos_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_category")(js.undefined)
        ret
    }
    @scala.inline
    def withIos_sound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos_sound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios_sound")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAdm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAdm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdm")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAnyWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnyWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAnyWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnyWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAppInFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppInFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAppInFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppInFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChromeWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChromeWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChromeWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChromeWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIos")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSafari: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWP")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWP_WNS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWP_WNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWP_WNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWP_WNS")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: OSNotificationPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_after(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_after: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_after")(js.undefined)
        ret
    }
    @scala.inline
    def withShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWp_sound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp_sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWp_sound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp_sound")(js.undefined)
        ret
    }
    @scala.inline
    def withWp_wns_sound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp_wns_sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWp_wns_sound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp_wns_sound")(js.undefined)
        ret
    }
  }
  
}

