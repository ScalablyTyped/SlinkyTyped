package typingsSlinky.jqueryToastmessagePlugin

import typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.removeToast
import typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** jQuery Toastmessage (http://akquinet.github.io/jquery-toastmessage-plugin/) */
object JQueryToastmessage {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast
  */
  trait ShowToastCommand extends StObject
  object ShowToastCommand {
    
    @scala.inline
    def showErrorToast: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast = "showErrorToast".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast]
    
    @scala.inline
    def showNoticeToast: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast = "showNoticeToast".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast]
    
    @scala.inline
    def showSuccessToast: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast = "showSuccessToast".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast]
    
    @scala.inline
    def showWarningToast: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast = "showWarningToast".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast]
  }
  
  @js.native
  trait ToastOptions extends StObject {
    
    /** callback function when the toastmessage is closed @default null */
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * text which will be shown as close button,
      * set to '' when you want to introduce an image via css
      * @default ''
      */
    var closeText: js.UndefOr[String] = js.native
    
    /** in effect duration in miliseconds @default 600 */
    var inEffectDuration: js.UndefOr[Double] = js.native
    
    /**
      * Position of the toast container holding different toast.
      * Position can be set only once at the very first call,
      * changing the position after the first call does nothing
      * @default 'top-right'
      */
    var position: js.UndefOr[ToastPosition] = js.native
    
    /**
      * time in miliseconds before the item has to disappear @default 3000
      */
    var stayTime: js.UndefOr[Double] = js.native
    
    /** should the toast item sticky or not? @default false */
    var sticky: js.UndefOr[Boolean] = js.native
    
    /** content of the item @default '' */
    var text: js.UndefOr[String] = js.native
    
    /** the type of toast @default 'notice' */
    var `type`: js.UndefOr[ToastType] = js.native
  }
  object ToastOptions {
    
    @scala.inline
    def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    @scala.inline
    implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setInEffectDuration(value: Double): Self = StObject.set(x, "inEffectDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInEffectDurationUndefined: Self = StObject.set(x, "inEffectDuration", js.undefined)
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStayTime(value: Double): Self = StObject.set(x, "stayTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStayTimeUndefined: Self = StObject.set(x, "stayTime", js.undefined)
      
      @scala.inline
      def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: ToastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-left`
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-center`
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-right`
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-left`
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-center`
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-right`
  */
  trait ToastPosition extends StObject
  object ToastPosition {
    
    @scala.inline
    def `middle-center`: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-center` = "middle-center".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-center`]
    
    @scala.inline
    def `middle-left`: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-left` = "middle-left".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-left`]
    
    @scala.inline
    def `middle-right`: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-right` = "middle-right".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-right`]
    
    @scala.inline
    def `top-center`: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-center` = "top-center".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error
    - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success
  */
  trait ToastType extends StObject
  object ToastType {
    
    @scala.inline
    def error: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error = "error".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error]
    
    @scala.inline
    def notice: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice = "notice".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice]
    
    @scala.inline
    def success: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success = "success".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success]
    
    @scala.inline
    def warning: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning = "warning".asInstanceOf[typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning]
  }
  
  @js.native
  trait ToastmessageStatic extends StObject {
    
    /* shows a toast message of the specified type */
    def apply(command: ShowToastCommand, message: String): JQuery = js.native
    /** removes the specified toast and returns it */
    def apply(command: removeToast, toast: JQuery): Unit = js.native
    def apply(command: removeToast, toast: JQuery, closeOpts: ToastOptions): Unit = js.native
    /** shows a custom toast */
    def apply(command: showToast, toastOpts: ToastOptions): JQuery = js.native
    /** configures the default toast options */
    def apply(toastOpts: ToastOptions): Unit = js.native
  }
}
