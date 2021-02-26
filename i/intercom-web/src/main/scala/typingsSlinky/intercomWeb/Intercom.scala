package typingsSlinky.intercomWeb

import typingsSlinky.intercomWeb.anon.Createdat
import typingsSlinky.intercomWeb.intercomWebStrings.boot
import typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId
import typingsSlinky.intercomWeb.intercomWebStrings.hide
import typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick
import typingsSlinky.intercomWeb.intercomWebStrings.onHide
import typingsSlinky.intercomWeb.intercomWebStrings.onShow
import typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange
import typingsSlinky.intercomWeb.intercomWebStrings.show
import typingsSlinky.intercomWeb.intercomWebStrings.showMessages
import typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage
import typingsSlinky.intercomWeb.intercomWebStrings.shutdown
import typingsSlinky.intercomWeb.intercomWebStrings.startTour
import typingsSlinky.intercomWeb.intercomWebStrings.trackEvent
import typingsSlinky.intercomWeb.intercomWebStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Intercom {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intercomWeb.intercomWebStrings.boot
    - typingsSlinky.intercomWeb.intercomWebStrings.shutdown
    - typingsSlinky.intercomWeb.intercomWebStrings.update
    - typingsSlinky.intercomWeb.intercomWebStrings.hide
    - typingsSlinky.intercomWeb.intercomWebStrings.show
    - typingsSlinky.intercomWeb.intercomWebStrings.showMessages
    - typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage
    - typingsSlinky.intercomWeb.intercomWebStrings.onHide
    - typingsSlinky.intercomWeb.intercomWebStrings.onShow
    - typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange
    - typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick
    - typingsSlinky.intercomWeb.intercomWebStrings.trackEvent
    - typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId
    - typingsSlinky.intercomWeb.intercomWebStrings.startTour
  */
  trait IntercomCommand extends StObject
  object IntercomCommand {
    
    @scala.inline
    def boot: typingsSlinky.intercomWeb.intercomWebStrings.boot = "boot".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.boot]
    
    @scala.inline
    def getVisitorId: typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId = "getVisitorId".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.getVisitorId]
    
    @scala.inline
    def hide: typingsSlinky.intercomWeb.intercomWebStrings.hide = "hide".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.hide]
    
    @scala.inline
    def onActivatorClick: typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick = "onActivatorClick".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.onActivatorClick]
    
    @scala.inline
    def onHide: typingsSlinky.intercomWeb.intercomWebStrings.onHide = "onHide".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.onHide]
    
    @scala.inline
    def onShow: typingsSlinky.intercomWeb.intercomWebStrings.onShow = "onShow".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.onShow]
    
    @scala.inline
    def onUnreadCountChange: typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange = "onUnreadCountChange".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.onUnreadCountChange]
    
    @scala.inline
    def show: typingsSlinky.intercomWeb.intercomWebStrings.show = "show".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.show]
    
    @scala.inline
    def showMessages: typingsSlinky.intercomWeb.intercomWebStrings.showMessages = "showMessages".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.showMessages]
    
    @scala.inline
    def showNewMessage: typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage = "showNewMessage".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.showNewMessage]
    
    @scala.inline
    def shutdown: typingsSlinky.intercomWeb.intercomWebStrings.shutdown = "shutdown".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.shutdown]
    
    @scala.inline
    def startTour: typingsSlinky.intercomWeb.intercomWebStrings.startTour = "startTour".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.startTour]
    
    @scala.inline
    def trackEvent: typingsSlinky.intercomWeb.intercomWebStrings.trackEvent = "trackEvent".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.trackEvent]
    
    @scala.inline
    def update: typingsSlinky.intercomWeb.intercomWebStrings.update = "update".asInstanceOf[typingsSlinky.intercomWeb.intercomWebStrings.update]
  }
  
  @js.native
  trait IntercomSettings extends StObject {
    
    var action_color: js.UndefOr[String] = js.native
    
    var alignment: js.UndefOr[String] = js.native
    
    // Messenger attributes
    var app_id: js.UndefOr[String] = js.native
    
    var background_color: js.UndefOr[String] = js.native
    
    var company: js.UndefOr[Createdat] = js.native
    
    var created_at: js.UndefOr[Double] = js.native
    
    var custom_launcher_selector: js.UndefOr[String] = js.native
    
    // Data attributes
    var email: js.UndefOr[String] = js.native
    
    var hide_default_launcher: js.UndefOr[Boolean] = js.native
    
    var horizontal_padding: js.UndefOr[Double] = js.native
    
    var language_override: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var phone: js.UndefOr[String] = js.native
    
    var session_duration: js.UndefOr[Double] = js.native
    
    var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
    
    var user_hash: js.UndefOr[String] = js.native
    
    var user_id: js.UndefOr[String] = js.native
    
    var utm_campaign: js.UndefOr[String] = js.native
    
    var utm_content: js.UndefOr[String] = js.native
    
    var utm_medium: js.UndefOr[String] = js.native
    
    var utm_source: js.UndefOr[String] = js.native
    
    var utm_term: js.UndefOr[String] = js.native
    
    var vertical_padding: js.UndefOr[Double] = js.native
  }
  object IntercomSettings {
    
    @scala.inline
    def apply(): IntercomSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntercomSettings]
    }
    
    @scala.inline
    implicit class IntercomSettingsMutableBuilder[Self <: IntercomSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_color(value: String): Self = StObject.set(x, "action_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAction_colorUndefined: Self = StObject.set(x, "action_color", js.undefined)
      
      @scala.inline
      def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      @scala.inline
      def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackground_colorUndefined: Self = StObject.set(x, "background_color", js.undefined)
      
      @scala.inline
      def setCompany(value: Createdat): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      @scala.inline
      def setCustom_launcher_selector(value: String): Self = StObject.set(x, "custom_launcher_selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_launcher_selectorUndefined: Self = StObject.set(x, "custom_launcher_selector", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHide_default_launcher(value: Boolean): Self = StObject.set(x, "hide_default_launcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide_default_launcherUndefined: Self = StObject.set(x, "hide_default_launcher", js.undefined)
      
      @scala.inline
      def setHorizontal_padding(value: Double): Self = StObject.set(x, "horizontal_padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal_paddingUndefined: Self = StObject.set(x, "horizontal_padding", js.undefined)
      
      @scala.inline
      def setLanguage_override(value: String): Self = StObject.set(x, "language_override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage_overrideUndefined: Self = StObject.set(x, "language_override", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setSession_duration(value: Double): Self = StObject.set(x, "session_duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_durationUndefined: Self = StObject.set(x, "session_duration", js.undefined)
      
      @scala.inline
      def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribed_from_emailsUndefined: Self = StObject.set(x, "unsubscribed_from_emails", js.undefined)
      
      @scala.inline
      def setUser_hash(value: String): Self = StObject.set(x, "user_hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_hashUndefined: Self = StObject.set(x, "user_hash", js.undefined)
      
      @scala.inline
      def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
      
      @scala.inline
      def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_campaignUndefined: Self = StObject.set(x, "utm_campaign", js.undefined)
      
      @scala.inline
      def setUtm_content(value: String): Self = StObject.set(x, "utm_content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_contentUndefined: Self = StObject.set(x, "utm_content", js.undefined)
      
      @scala.inline
      def setUtm_medium(value: String): Self = StObject.set(x, "utm_medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_mediumUndefined: Self = StObject.set(x, "utm_medium", js.undefined)
      
      @scala.inline
      def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_sourceUndefined: Self = StObject.set(x, "utm_source", js.undefined)
      
      @scala.inline
      def setUtm_term(value: String): Self = StObject.set(x, "utm_term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtm_termUndefined: Self = StObject.set(x, "utm_term", js.undefined)
      
      @scala.inline
      def setVertical_padding(value: Double): Self = StObject.set(x, "vertical_padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical_paddingUndefined: Self = StObject.set(x, "vertical_padding", js.undefined)
    }
  }
  
  @js.native
  trait IntercomStatic extends StObject {
    
    def apply(command: IntercomCommand): Unit = js.native
    def apply(command: IntercomCommand, param1: js.UndefOr[scala.Nothing], param2: js.Any): Unit = js.native
    def apply(command: IntercomCommand, param1: js.Any): Unit = js.native
    def apply(command: IntercomCommand, param1: js.Any, param2: js.Any): Unit = js.native
    def apply(command: boot, param: IntercomSettings): Unit = js.native
    def apply(command: getVisitorId): String = js.native
    def apply(command: hide): Unit = js.native
    def apply(command: onActivatorClick): Unit = js.native
    def apply(command: onActivatorClick, param: js.Function0[Unit]): Unit = js.native
    def apply(command: onHide): Unit = js.native
    def apply(command: onHide, param: js.Function0[Unit]): Unit = js.native
    def apply(command: onShow): Unit = js.native
    def apply(command: onShow, param: js.Function0[Unit]): Unit = js.native
    def apply(command: onUnreadCountChange, cb: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
    def apply(command: show): Unit = js.native
    def apply(command: showMessages): Unit = js.native
    def apply(command: showNewMessage): Unit = js.native
    def apply(command: showNewMessage, param: String): Unit = js.native
    def apply(command: shutdown): Unit = js.native
    def apply(command: startTour, tourId: Double): Unit = js.native
    def apply(command: trackEvent): Unit = js.native
    def apply(command: trackEvent, tag: js.UndefOr[scala.Nothing], metadata: js.Any): Unit = js.native
    def apply(command: trackEvent, tag: String): Unit = js.native
    def apply(command: trackEvent, tag: String, metadata: js.Any): Unit = js.native
    def apply(command: update): Unit = js.native
    def apply(command: update, param: IntercomSettings): Unit = js.native
    
    var booted: Boolean = js.native
  }
}
