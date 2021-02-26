package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawer extends Widget_ {
  
  /** To close the navigation drawer control
    * @returns {void}
    */
  def close(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To load AJAX content into NavigationDrawer container.
    * @returns {void}
    */
  def loadContent(): Unit = js.native
  
  @JSName("model")
  var model_NavigationDrawer: Model = js.native
  
  /** To open the navigation drawer control
    * @returns {void}
    */
  def open(): Unit = js.native
  
  /** To Toggle the navigation drawer control
    * @returns {void}
    */
  def toggle(): Unit = js.native
}
object NavigationDrawer {
  
  @js.native
  trait AjaxCompleteEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Response content.
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the navigation drawer model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxCompleteEventArgs {
    
    @scala.inline
    def apply(): AjaxCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxCompleteEventArgs]
    }
    
    @scala.inline
    implicit class AjaxCompleteEventArgsMutableBuilder[Self <: AjaxCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait AjaxErrorEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the navigation drawer model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Error page content.
      */
    var responseText: js.UndefOr[String] = js.native
    
    /** Error code.
      */
    var status: js.UndefOr[Double] = js.native
    
    /** The corresponding error description.
      */
    var statusText: js.UndefOr[String] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxErrorEventArgs {
    
    @scala.inline
    def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    @scala.inline
    implicit class AjaxErrorEventArgsMutableBuilder[Self <: AjaxErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSettings extends StObject {
    
    /** It specifies, whether to enable or disable asynchronous request.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** It specifies the page will be cached in the web browser.
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** It specifies the type of data is send in the query string.
      */
    var contentType: js.UndefOr[String] = js.native
    
    /** It specifies the data as an object, will be passed in the query string.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** It specifies the type of data that you're expecting back from the response.
      */
    var dataType: js.UndefOr[String] = js.native
    
    /** It specifies the HTTP request type.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSettings {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.NavigationDrawer.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.NavigationDrawer.AjaxSettings]
    }
    
    @scala.inline
    implicit class AjaxSettingsMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.NavigationDrawer.AjaxSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSuccessEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Response content.
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the navigation drawer model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSuccessEventArgs {
    
    @scala.inline
    def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    @scala.inline
    implicit class AjaxSuccessEventArgsMutableBuilder[Self <: AjaxSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait BeforeCloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Navigation Drawer model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeCloseEventArgs {
    
    @scala.inline
    def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCloseEventArgsMutableBuilder[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Event triggers after the AJAX content loaded completely.
      */
    var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.native
    
    /** Event triggers when the AJAX request failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
    
    /** Specifies the ajaxSettings option to load the content to the NavigationDrawer control.
      * @Default {null}
      */
    var ajaxSettings: js.UndefOr[typingsSlinky.ejWebAll.ej.NavigationDrawer.AjaxSettings] = js.native
    
    /** Event triggers after the AJAX content loaded successfully.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
    
    /** Event triggers before the control gets closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
    
    /** Specifies the contentId for navigation drawer, where the AJAX content need to updated
      * @Default {null}
      */
    var contentId: js.UndefOr[String] = js.native
    
    /** Sets the root class for NavigationDrawer theme. This cssClass API helps to use custom skinning option for NavigationDrawer control. By defining the root class using this API, we
      * need to include this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the Direction for the control. See Direction
      * @Default {left}
      */
    var direction: js.UndefOr[Direction | String] = js.native
    
    /** Sets the listview to be enabled or not
      * @Default {false}
      */
    var enableListView: js.UndefOr[Boolean] = js.native
    
    /** Navigation pane opened initially when isPaneOpen property is true.
      * @Default {false}
      */
    var isPaneOpen: js.UndefOr[Boolean] = js.native
    
    /** Specifies the listview items as an array of object.
      * @Default {[]}
      */
    var items: js.UndefOr[js.Array[_]] = js.native
    
    /** Sets all the properties of listview to render in navigation drawer
      */
    var listViewSettings: js.UndefOr[js.Any] = js.native
    
    /** Event triggers when the control open.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Specifies position whether it is in fixed or relative to the page. See Position
      * @Default {normal}
      */
    var position: js.UndefOr[String] = js.native
    
    /** Event triggers when the Swipe happens.
      */
    var swipe: js.UndefOr[js.Function1[/* e */ SwipeEventArgs, Unit]] = js.native
    
    /** Specifies the targetId for navigation drawer
      */
    var targetId: js.UndefOr[String] = js.native
    
    /** Sets the rendering type of the control. See Type
      * @Default {overlay}
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Specifies the width of the control
      * @Default {auto}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.NavigationDrawer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.NavigationDrawer.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.NavigationDrawer.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxComplete(value: /* e */ AjaxCompleteEventArgs => Unit): Self = StObject.set(x, "ajaxComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxCompleteUndefined: Self = StObject.set(x, "ajaxComplete", js.undefined)
      
      @scala.inline
      def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxSettings(value: typingsSlinky.ejWebAll.ej.NavigationDrawer.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEnableListView(value: Boolean): Self = StObject.set(x, "enableListView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableListViewUndefined: Self = StObject.set(x, "enableListView", js.undefined)
      
      @scala.inline
      def setIsPaneOpen(value: Boolean): Self = StObject.set(x, "isPaneOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPaneOpenUndefined: Self = StObject.set(x, "isPaneOpen", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setListViewSettings(value: js.Any): Self = StObject.set(x, "listViewSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListViewSettingsUndefined: Self = StObject.set(x, "listViewSettings", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSwipe(value: /* e */ SwipeEventArgs => Unit): Self = StObject.set(x, "swipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      @scala.inline
      def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Navigation Drawer model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SwipeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Navigation Drawer model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SwipeEventArgs {
    
    @scala.inline
    def apply(): SwipeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeEventArgs]
    }
    
    @scala.inline
    implicit class SwipeEventArgsMutableBuilder[Self <: SwipeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
