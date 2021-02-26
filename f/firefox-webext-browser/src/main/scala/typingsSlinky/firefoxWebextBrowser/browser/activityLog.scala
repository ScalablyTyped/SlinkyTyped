package typingsSlinky.firefoxWebextBrowser.browser

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitor extension activity
  *
  * Permissions: `activityLog`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object activityLog {
  
  @js.native
  trait ActivityLogOnExtensionActivityEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, id: String): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
  object ActivityLogOnExtensionActivityEvent {
    
    @scala.inline
    def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): ActivityLogOnExtensionActivityEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[ActivityLogOnExtensionActivityEvent[TCallback]]
    }
    
    @scala.inline
    implicit class ActivityLogOnExtensionActivityEventMutableBuilder[Self <: ActivityLogOnExtensionActivityEvent[_], TCallback] (val x: Self with ActivityLogOnExtensionActivityEvent[TCallback]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnExtensionActivityDetails extends StObject {
    
    var data: OnExtensionActivityDetailsData = js.native
    
    /** The name of the api call or event, or the script url if this is a content or user script event. */
    var name: String = js.native
    
    /** The date string when this call is triggered. */
    var timeStamp: Date = js.native
    
    /**
      * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to the extension. content_script is logged when a content script is injected.
      */
    var `type`: OnExtensionActivityDetailsType = js.native
    
    /** The type of view where the activity occurred. Content scripts will not have a viewType. */
    var viewType: js.UndefOr[OnExtensionActivityDetailsViewType] = js.native
  }
  object OnExtensionActivityDetails {
    
    @scala.inline
    def apply(
      data: OnExtensionActivityDetailsData,
      name: String,
      timeStamp: Date,
      `type`: OnExtensionActivityDetailsType
    ): OnExtensionActivityDetails = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnExtensionActivityDetails]
    }
    
    @scala.inline
    implicit class OnExtensionActivityDetailsMutableBuilder[Self <: OnExtensionActivityDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: OnExtensionActivityDetailsData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: OnExtensionActivityDetailsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewType(value: OnExtensionActivityDetailsViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  @js.native
  trait OnExtensionActivityDetailsData extends StObject {
    
    /** A list of arguments passed to the call. */
    var args: js.UndefOr[js.Array[_]] = js.native
    
    /** The result of the call. */
    var result: js.UndefOr[js.Object] = js.native
    
    /** The tab associated with this event if it is a tab or content script. */
    var tabId: js.UndefOr[Double] = js.native
    
    /** If the type is content_script, this is the url of the script that was injected. */
    var url: js.UndefOr[String] = js.native
  }
  object OnExtensionActivityDetailsData {
    
    @scala.inline
    def apply(): OnExtensionActivityDetailsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnExtensionActivityDetailsData]
    }
    
    @scala.inline
    implicit class OnExtensionActivityDetailsDataMutableBuilder[Self <: OnExtensionActivityDetailsData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setResult(value: js.Object): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to the extension. content_script is logged when a content script is injected.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script
  */
  trait OnExtensionActivityDetailsType extends StObject
  object OnExtensionActivityDetailsType {
    
    @scala.inline
    def api_call: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call = "api_call".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call]
    
    @scala.inline
    def api_event: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event = "api_event".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event]
    
    @scala.inline
    def content_script: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script = "content_script".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script]
    
    @scala.inline
    def user_script: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script = "user_script".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script]
  }
  
  /** The type of view where the activity occurred. Content scripts will not have a viewType. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.background
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel
  */
  trait OnExtensionActivityDetailsViewType extends StObject
  object OnExtensionActivityDetailsViewType {
    
    @scala.inline
    def background: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.background = "background".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.background]
    
    @scala.inline
    def devtools_page: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page = "devtools_page".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page]
    
    @scala.inline
    def devtools_panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel = "devtools_panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel]
    
    @scala.inline
    def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
    
    @scala.inline
    def sidebar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = "sidebar".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar]
    
    @scala.inline
    def tab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
  }
}
