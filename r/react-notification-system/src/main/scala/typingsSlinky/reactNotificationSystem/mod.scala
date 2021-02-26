package typingsSlinky.reactNotificationSystem

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ClassicComponent
import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.bc
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.bl
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.both
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.br
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.button
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.click
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.error
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.hide
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.info
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.none
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.success
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.tc
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.tl
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.tr
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends ClassicComponent[Attributes, js.Object] {
    def this(props: Attributes) = this()
    def this(props: Attributes, context: js.Any) = this()
  }
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  val ^ : ClassicComponentClass[Attributes] = js.native
  
  @js.native
  trait ActionObject extends StObject {
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var label: String = js.native
  }
  object ActionObject {
    
    @scala.inline
    def apply(label: String): ActionObject = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionObject]
    }
    
    @scala.inline
    implicit class ActionObjectMutableBuilder[Self <: ActionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Attributes extends ClassAttributes[System] {
    
    var allowHTML: js.UndefOr[Boolean] = js.native
    
    var noAnimation: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[Style | Boolean] = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      @scala.inline
      def setNoAnimation(value: Boolean): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
      
      @scala.inline
      def setStyle(value: Style | Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CallBackFunction = js.Function1[/* notification */ Notification, Unit]
  
  @js.native
  trait ContainersStyle extends StObject {
    
    var DefaultStyle: CSSProperties = js.native
    
    var bc: js.UndefOr[CSSProperties] = js.native
    
    var bl: js.UndefOr[CSSProperties] = js.native
    
    var br: js.UndefOr[CSSProperties] = js.native
    
    var tc: js.UndefOr[CSSProperties] = js.native
    
    var tl: js.UndefOr[CSSProperties] = js.native
    
    var tr: js.UndefOr[CSSProperties] = js.native
  }
  object ContainersStyle {
    
    @scala.inline
    def apply(DefaultStyle: CSSProperties): ContainersStyle = {
      val __obj = js.Dynamic.literal(DefaultStyle = DefaultStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainersStyle]
    }
    
    @scala.inline
    implicit class ContainersStyleMutableBuilder[Self <: ContainersStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBc(value: CSSProperties): Self = StObject.set(x, "bc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBcUndefined: Self = StObject.set(x, "bc", js.undefined)
      
      @scala.inline
      def setBl(value: CSSProperties): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
      
      @scala.inline
      def setBr(value: CSSProperties): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTc(value: CSSProperties): Self = StObject.set(x, "tc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcUndefined: Self = StObject.set(x, "tc", js.undefined)
      
      @scala.inline
      def setTl(value: CSSProperties): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlUndefined: Self = StObject.set(x, "tl", js.undefined)
      
      @scala.inline
      def setTr(value: CSSProperties): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
    }
  }
  
  @js.native
  trait ItemStyle extends StObject {
    
    var DefaultStyle: js.UndefOr[CSSProperties] = js.native
    
    var error: js.UndefOr[CSSProperties] = js.native
    
    var info: js.UndefOr[CSSProperties] = js.native
    
    var success: js.UndefOr[CSSProperties] = js.native
    
    var warning: js.UndefOr[CSSProperties] = js.native
  }
  object ItemStyle {
    
    @scala.inline
    def apply(): ItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemStyle]
    }
    
    @scala.inline
    implicit class ItemStyleMutableBuilder[Self <: ItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "DefaultStyle", js.undefined)
      
      @scala.inline
      def setError(value: CSSProperties): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: CSSProperties): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSuccess(value: CSSProperties): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: CSSProperties): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait Notification extends StObject {
    
    var action: js.UndefOr[ActionObject] = js.native
    
    var autoDismiss: js.UndefOr[Double] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var dismissible: js.UndefOr[both | button | click | hide | none | Boolean] = js.native
    
    var level: js.UndefOr[error | warning | info | success] = js.native
    
    var message: js.UndefOr[String | ReactElement] = js.native
    
    var onAdd: js.UndefOr[CallBackFunction] = js.native
    
    var onRemove: js.UndefOr[CallBackFunction] = js.native
    
    var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.native
    
    var title: js.UndefOr[String | ReactElement] = js.native
    
    var uid: js.UndefOr[Double | String] = js.native
  }
  object Notification {
    
    @scala.inline
    def apply(): Notification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ActionObject): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAutoDismiss(value: Double): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDismissible(value: both | button | click | hide | none | Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      @scala.inline
      def setLevel(value: error | warning | info | success): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageReactElement(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPosition(value: tr | tl | tc | br | bl | bc): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var notifications: js.Array[Notification] = js.native
  }
  object State {
    
    @scala.inline
    def apply(notifications: js.Array[Notification]): State = {
      val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var Action: js.UndefOr[ItemStyle] = js.native
    
    var ActionWrapper: js.UndefOr[WrapperStyle] = js.native
    
    var Containers: js.UndefOr[ContainersStyle] = js.native
    
    var Dismiss: js.UndefOr[ItemStyle] = js.native
    
    var MessageWrapper: js.UndefOr[WrapperStyle] = js.native
    
    var NotificationItem: js.UndefOr[ItemStyle] = js.native
    
    var Title: js.UndefOr[ItemStyle] = js.native
    
    var Wrapper: js.UndefOr[js.Any] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ItemStyle): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setActionWrapper(value: WrapperStyle): Self = StObject.set(x, "ActionWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionWrapperUndefined: Self = StObject.set(x, "ActionWrapper", js.undefined)
      
      @scala.inline
      def setContainers(value: ContainersStyle): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
      
      @scala.inline
      def setDismiss(value: ItemStyle): Self = StObject.set(x, "Dismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissUndefined: Self = StObject.set(x, "Dismiss", js.undefined)
      
      @scala.inline
      def setMessageWrapper(value: WrapperStyle): Self = StObject.set(x, "MessageWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageWrapperUndefined: Self = StObject.set(x, "MessageWrapper", js.undefined)
      
      @scala.inline
      def setNotificationItem(value: ItemStyle): Self = StObject.set(x, "NotificationItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationItemUndefined: Self = StObject.set(x, "NotificationItem", js.undefined)
      
      @scala.inline
      def setTitle(value: ItemStyle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      @scala.inline
      def setWrapper(value: js.Any): Self = StObject.set(x, "Wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "Wrapper", js.undefined)
    }
  }
  
  @js.native
  trait System
    extends Component[Attributes, State, js.Any] {
    
    def addNotification(notification: Notification): Notification = js.native
    
    def clearNotifications(): Unit = js.native
    
    def editNotification(uidOrNotification: String, newNotification: Notification): Unit = js.native
    def editNotification(uidOrNotification: Double, newNotification: Notification): Unit = js.native
    def editNotification(uidOrNotification: Notification, newNotification: Notification): Unit = js.native
    
    def removeNotification(uidOrNotification: String): Unit = js.native
    def removeNotification(uidOrNotification: Double): Unit = js.native
    def removeNotification(uidOrNotification: Notification): Unit = js.native
  }
  
  @js.native
  trait WrapperStyle extends StObject {
    
    var DefaultStyle: js.UndefOr[CSSProperties] = js.native
  }
  object WrapperStyle {
    
    @scala.inline
    def apply(): WrapperStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperStyle]
    }
    
    @scala.inline
    implicit class WrapperStyleMutableBuilder[Self <: WrapperStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "DefaultStyle", js.undefined)
    }
  }
  
  type _To = ClassicComponentClass[Attributes]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ClassicComponentClass[Attributes] = ^
}
