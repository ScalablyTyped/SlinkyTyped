package typingsSlinky.firebase.mod.firebase.analytics

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.anon.Affiliation
import typingsSlinky.firebase.anon.Appid
import typingsSlinky.firebase.anon.Checkoutoption
import typingsSlinky.firebase.anon.Checkoutstep
import typingsSlinky.firebase.anon.Contentid
import typingsSlinky.firebase.anon.Contenttype
import typingsSlinky.firebase.anon.Coupon
import typingsSlinky.firebase.anon.Description
import typingsSlinky.firebase.anon.Dictkey
import typingsSlinky.firebase.anon.Eventcategory
import typingsSlinky.firebase.anon.Itemlistid
import typingsSlinky.firebase.anon.Items
import typingsSlinky.firebase.anon.Method
import typingsSlinky.firebase.anon.Pagelocation
import typingsSlinky.firebase.anon.Promotionid
import typingsSlinky.firebase.anon.Searchterm
import typingsSlinky.firebase.anon.Transactionid
import typingsSlinky.firebase.anon.Value
import typingsSlinky.firebase.firebaseStrings.add_payment_info
import typingsSlinky.firebase.firebaseStrings.add_shipping_info
import typingsSlinky.firebase.firebaseStrings.add_to_cart
import typingsSlinky.firebase.firebaseStrings.add_to_wishlist
import typingsSlinky.firebase.firebaseStrings.begin_checkout
import typingsSlinky.firebase.firebaseStrings.checkout_progress
import typingsSlinky.firebase.firebaseStrings.exception
import typingsSlinky.firebase.firebaseStrings.generate_lead
import typingsSlinky.firebase.firebaseStrings.login
import typingsSlinky.firebase.firebaseStrings.page_view
import typingsSlinky.firebase.firebaseStrings.purchase
import typingsSlinky.firebase.firebaseStrings.refund
import typingsSlinky.firebase.firebaseStrings.remove_from_cart
import typingsSlinky.firebase.firebaseStrings.screen_view
import typingsSlinky.firebase.firebaseStrings.search
import typingsSlinky.firebase.firebaseStrings.select_content
import typingsSlinky.firebase.firebaseStrings.select_item
import typingsSlinky.firebase.firebaseStrings.select_promotion
import typingsSlinky.firebase.firebaseStrings.set_checkout_option
import typingsSlinky.firebase.firebaseStrings.share
import typingsSlinky.firebase.firebaseStrings.sign_up
import typingsSlinky.firebase.firebaseStrings.timing_complete
import typingsSlinky.firebase.firebaseStrings.view_cart
import typingsSlinky.firebase.firebaseStrings.view_item
import typingsSlinky.firebase.firebaseStrings.view_item_list
import typingsSlinky.firebase.firebaseStrings.view_promotion
import typingsSlinky.firebase.firebaseStrings.view_search_results
import typingsSlinky.firebase.mod.firebase.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics extends js.Object {
  
  /**
    * The {@link firebase.app.App app} associated with the `Analytics` service
    * instance.
    *
    * @example
    * ```javascript
    * var app = analytics.app;
    * ```
    */
  var app: App = js.native
  
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  def logEvent[T /* <: String */](eventName: CustomEventName[T]): Unit = js.native
  def logEvent[T /* <: String */](
    eventName: CustomEventName[T],
    eventParams: js.UndefOr[scala.Nothing],
    options: AnalyticsCallOptions
  ): Unit = js.native
  def logEvent[T /* <: String */](eventName: CustomEventName[T], eventParams: StringDictionary[js.Any]): Unit = js.native
  def logEvent[T /* <: String */](
    eventName: CustomEventName[T],
    eventParams: StringDictionary[js.Any],
    options: AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: js.UndefOr[scala.Nothing], options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: Dictkey): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: Dictkey, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: Coupon): Unit = js.native
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: Coupon, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addtocart(eventName: add_to_cart, eventParams: typingsSlinky.firebase.anon.Currency): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtocart(
    eventName: add_to_cart,
    eventParams: typingsSlinky.firebase.anon.Currency,
    options: AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtowishlist(eventName: add_to_wishlist, eventParams: typingsSlinky.firebase.anon.Currency): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtowishlist(
    eventName: add_to_wishlist,
    eventParams: typingsSlinky.firebase.anon.Currency,
    options: AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: Items): Unit = js.native
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: Items, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Checkoutoption): Unit = js.native
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Checkoutoption, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: Description): Unit = js.native
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: Description, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: Transactionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: Transactionid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: Method): Unit = js.native
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: Method, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: Pagelocation): Unit = js.native
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: Pagelocation, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_purchase(eventName: purchase, eventParams: Affiliation): Unit = js.native
  @JSName("logEvent")
  def logEvent_purchase(eventName: purchase, eventParams: Affiliation, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_refund(eventName: refund, eventParams: Affiliation): Unit = js.native
  @JSName("logEvent")
  def logEvent_refund(eventName: refund, eventParams: Affiliation, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_removefromcart(eventName: remove_from_cart, eventParams: typingsSlinky.firebase.anon.Currency): Unit = js.native
  @JSName("logEvent")
  def logEvent_removefromcart(
    eventName: remove_from_cart,
    eventParams: typingsSlinky.firebase.anon.Currency,
    options: AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: Appid): Unit = js.native
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: Appid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_search(eventName: search, eventParams: Searchterm): Unit = js.native
  @JSName("logEvent")
  def logEvent_search(eventName: search, eventParams: Searchterm, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: Contentid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: Contentid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: Itemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: Itemlistid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectpromotion(eventName: select_promotion, eventParams: Promotionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectpromotion(eventName: select_promotion, eventParams: Promotionid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Checkoutstep): Unit = js.native
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Checkoutstep, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: Contenttype): Unit = js.native
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: Contenttype, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: Method): Unit = js.native
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: Method, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: Eventcategory): Unit = js.native
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: Eventcategory, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewcart(eventName: view_cart, eventParams: Value): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewcart(eventName: view_cart, eventParams: Value, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitem(eventName: view_item, eventParams: Value): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitem(eventName: view_item, eventParams: Value, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: Itemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: Itemlistid, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewpromotion(eventName: view_promotion, eventParams: Promotionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewpromotion(eventName: view_promotion, eventParams: Promotionid, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewsearchresults(eventName: view_search_results, eventParams: Searchterm): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewsearchresults(eventName: view_search_results, eventParams: Searchterm, options: AnalyticsCallOptions): Unit = js.native
  
  /**
    * Sets whether analytics collection is enabled for this app on this device.
    * window['ga-disable-analyticsId'] = true;
    */
  def setAnalyticsCollectionEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Use gtag 'config' command to set 'screen_name'.
    */
  def setCurrentScreen(screenName: String): Unit = js.native
  def setCurrentScreen(screenName: String, options: AnalyticsCallOptions): Unit = js.native
  
  /**
    * Use gtag 'config' command to set 'user_id'.
    */
  def setUserId(id: String): Unit = js.native
  def setUserId(id: String, options: AnalyticsCallOptions): Unit = js.native
  
  /**
    * Use gtag 'config' command to set all params specified.
    */
  def setUserProperties(properties: CustomParams): Unit = js.native
  def setUserProperties(properties: CustomParams, options: AnalyticsCallOptions): Unit = js.native
}
