package typingsSlinky.notifyjs

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("notifyjs", JSImport.Namespace)
  @js.native
  class ^ protected () extends Notify {
    def this(title: String) = this()
    def this(title: String, options: NotifyOption) = this()
  }
  @JSImport("notifyjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * return true if the browser supports HTML5 Notification
    * @param true : the browser supports HTML5 Notification, false ; the browser does not supports HTML5 Notification.
    */
  /* static member */
  @JSImport("notifyjs", "isSupported")
  @js.native
  def isSupported(): Boolean = js.native
  
  /**
    * Check is permission is needed for the user to receive notifications.
    * @return true : needs permission, false : does not need
    */
  /* static member */
  @JSImport("notifyjs", "needsPermission")
  @js.native
  def needsPermission: Boolean = js.native
  @scala.inline
  def needsPermission_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsPermission")(x.asInstanceOf[js.Any])
  
  /**
    * shows the user's current permission level (granted, denied or default), returns null if notifications are not supported.
    * @return 'granted' : permission has been given, 'denied' : permission has been denied, 'default' : permission has not yet been set, null : notifications are not supported
    */
  /* static member */
  @JSImport("notifyjs", "permissionLevel")
  @js.native
  def permissionLevel: String = js.native
  @scala.inline
  def permissionLevel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permissionLevel")(x.asInstanceOf[js.Any])
  
  /**
    * Asks the user for permission to display notifications
    * @param onPermissionGrantedCallback A callback for permission is granted.
    * @param onPermissionDeniedCallback  A callback for permission is denied.
    */
  /* static member */
  @JSImport("notifyjs", "requestPermission")
  @js.native
  def requestPermission(): Unit = js.native
  @JSImport("notifyjs", "requestPermission")
  @js.native
  def requestPermission(
    onPermissionGrantedCallback: js.UndefOr[scala.Nothing],
    onPermissionDeniedCallback: js.Function0[_]
  ): Unit = js.native
  @JSImport("notifyjs", "requestPermission")
  @js.native
  def requestPermission(onPermissionGrantedCallback: js.Function0[_]): Unit = js.native
  @JSImport("notifyjs", "requestPermission")
  @js.native
  def requestPermission(onPermissionGrantedCallback: js.Function0[_], onPermissionDeniedCallback: js.Function0[_]): Unit = js.native
  
  @js.native
  trait Notify extends StObject {
    
    /**
      * Close the notification.
      */
    def close(): Unit = js.native
    
    /**
      * Remove all event listener.
      */
    def destroy(): Unit = js.native
    
    def handleEvent(e: Event): Unit = js.native
    
    def onClickNotification(): Unit = js.native
    
    def onCloseNotification(): Unit = js.native
    
    def onErrorNotification(): Unit = js.native
    
    def onShowNotification(e: Event): Unit = js.native
    
    /**
      * Show the notification.
      */
    def show(): Unit = js.native
  }
  object Notify {
    
    @scala.inline
    def apply(
      close: () => Unit,
      destroy: () => Unit,
      handleEvent: Event => Unit,
      onClickNotification: () => Unit,
      onCloseNotification: () => Unit,
      onErrorNotification: () => Unit,
      onShowNotification: Event => Unit,
      show: () => Unit
    ): Notify = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), handleEvent = js.Any.fromFunction1(handleEvent), onClickNotification = js.Any.fromFunction0(onClickNotification), onCloseNotification = js.Any.fromFunction0(onCloseNotification), onErrorNotification = js.Any.fromFunction0(onErrorNotification), onShowNotification = js.Any.fromFunction1(onShowNotification), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Notify]
    }
    
    @scala.inline
    implicit class NotifyMutableBuilder[Self <: Notify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleEvent(value: Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickNotification(value: () => Unit): Self = StObject.set(x, "onClickNotification", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseNotification(value: () => Unit): Self = StObject.set(x, "onCloseNotification", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorNotification(value: () => Unit): Self = StObject.set(x, "onErrorNotification", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowNotification(value: Event => Unit): Self = StObject.set(x, "onShowNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for the Notify's optional parameter.
    */
  @js.native
  trait NotifyOption extends StObject {
    
    /**
      * notification message body
      */
    var body: js.UndefOr[String] = js.native
    
    /**
      * path for icon to display in notification
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * callback when notification is clicked
      */
    var notifyClick: js.UndefOr[js.Function] = js.native
    
    /**
      * callback when notification is closed
      */
    var notifyClose: js.UndefOr[js.Function] = js.native
    
    /**
      * callback when notification throws an error
      */
    var notifyError: js.UndefOr[js.Function] = js.native
    
    /**
      * callback when notification is shown
      */
    var notifyShow: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    /**
      * callback when user has denied permission
      */
    var permissionDenied: js.UndefOr[js.Function] = js.native
    
    /**
      *  callback when user has granted permission
      */
    var permissionGranted: js.UndefOr[js.Function] = js.native
    
    /**
      * whether we expect for user interaction or not
      * in case value is true the timeout for closing the notification won't be set
      */
    var requireInteraction: js.UndefOr[Boolean] = js.native
    
    /**
      * whether this notification should be silent or not
      */
    var silent: js.UndefOr[Boolean] = js.native
    
    /**
      * unique identifier to stop duplicate notifications
      */
    var tag: js.UndefOr[String] = js.native
    
    /**
      * number of seconds to close the notification automatically
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object NotifyOption {
    
    @scala.inline
    def apply(): NotifyOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyOption]
    }
    
    @scala.inline
    implicit class NotifyOptionMutableBuilder[Self <: NotifyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setNotifyClick(value: js.Function): Self = StObject.set(x, "notifyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyClickUndefined: Self = StObject.set(x, "notifyClick", js.undefined)
      
      @scala.inline
      def setNotifyClose(value: js.Function): Self = StObject.set(x, "notifyClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyCloseUndefined: Self = StObject.set(x, "notifyClose", js.undefined)
      
      @scala.inline
      def setNotifyError(value: js.Function): Self = StObject.set(x, "notifyError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyErrorUndefined: Self = StObject.set(x, "notifyError", js.undefined)
      
      @scala.inline
      def setNotifyShow(value: /* e */ Event => _): Self = StObject.set(x, "notifyShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyShowUndefined: Self = StObject.set(x, "notifyShow", js.undefined)
      
      @scala.inline
      def setPermissionDenied(value: js.Function): Self = StObject.set(x, "permissionDenied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionDeniedUndefined: Self = StObject.set(x, "permissionDenied", js.undefined)
      
      @scala.inline
      def setPermissionGranted(value: js.Function): Self = StObject.set(x, "permissionGranted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionGrantedUndefined: Self = StObject.set(x, "permissionGranted", js.undefined)
      
      @scala.inline
      def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
