package typingsSlinky.rcNotification

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcNotification.anon.HolderCallback
import typingsSlinky.rcNotification.anon.Left
import typingsSlinky.rcNotification.anon.NoticePropskeyKey
import typingsSlinky.rcNotification.anon.NotificationPropsgetConta
import typingsSlinky.rcNotification.anon.Props
import typingsSlinky.rcNotification.noticeMod.DivProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("rc-notification/es/Notification", JSImport.Default)
  @js.native
  class default () extends Notification
  object default {
    
    @JSImport("rc-notification/es/Notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps.animation")
      @js.native
      def animation: String = js.native
      @scala.inline
      def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps.style")
      @js.native
      def style: Left = js.native
      @scala.inline
      def style_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-notification/es/Notification", "default.newInstance")
    @js.native
    def newInstance: js.Function2[
        /* properties */ NotificationPropsgetConta, 
        /* callback */ js.Function1[/* instance */ NotificationInstance, Unit], 
        Unit
      ] = js.native
    @scala.inline
    def newInstance_=(
      x: js.Function2[
          /* properties */ NotificationPropsgetConta, 
          /* callback */ js.Function1[/* instance */ NotificationInstance, Unit], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(x.asInstanceOf[js.Any])
  }
  
  type HolderReadyCallback = js.Function2[/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey, Unit]
  
  /* Inlined parent std.Omit<rc-notification.rc-notification/es/Notice.NoticeProps, 'prefixCls' | 'children' | 'noticeKey' | 'onClose'> */
  @js.native
  trait NoticeContent extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var holder: js.UndefOr[HTMLDivElement] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var props: js.UndefOr[DivProps] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var updateMark: js.UndefOr[String] = js.native
  }
  object NoticeContent {
    
    @scala.inline
    def apply(): NoticeContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeContent]
    }
    
    @scala.inline
    implicit class NoticeContentMutableBuilder[Self <: NoticeContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
    }
  }
  
  type NoticeFunc = js.Function1[/* noticeProps */ NoticeContent, Unit]
  
  @js.native
  trait Notification
    extends Component[NotificationProps, NotificationState, js.Any] {
    
    def add(originNotice: NoticeContent): Unit = js.native
    def add(originNotice: NoticeContent, holderCallback: HolderReadyCallback): Unit = js.native
    
    def getTransitionName(): String = js.native
    
    var hookRefs: js.Any = js.native
    
    var noticePropsMap: Record[Key, Props] = js.native
    
    def remove(removeKey: Key): Unit = js.native
  }
  
  @js.native
  trait NotificationInstance extends StObject {
    
    var component: Notification = js.native
    
    def destroy(): Unit = js.native
    
    var notice: NoticeFunc = js.native
    
    def removeNotice(key: Key): Unit = js.native
    
    def useNotification(): js.Tuple2[NoticeFunc, ReactElement] = js.native
  }
  object NotificationInstance {
    
    @scala.inline
    def apply(
      component: Notification,
      destroy: () => Unit,
      notice: /* noticeProps */ NoticeContent => Unit,
      removeNotice: Key => Unit,
      useNotification: () => js.Tuple2[NoticeFunc, ReactElement]
    ): NotificationInstance = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), notice = js.Any.fromFunction1(notice), removeNotice = js.Any.fromFunction1(removeNotice), useNotification = js.Any.fromFunction0(useNotification))
      __obj.asInstanceOf[NotificationInstance]
    }
    
    @scala.inline
    implicit class NotificationInstanceMutableBuilder[Self <: NotificationInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: Notification): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotice(value: /* noticeProps */ NoticeContent => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveNotice(value: Key => Unit): Self = StObject.set(x, "removeNotice", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseNotification(value: () => js.Tuple2[NoticeFunc, ReactElement]): Self = StObject.set(x, "useNotification", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait NotificationProps extends StObject {
    
    var animation: js.UndefOr[String | js.Object] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
  }
  object NotificationProps {
    
    @scala.inline
    def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    @scala.inline
    implicit class NotificationPropsMutableBuilder[Self <: NotificationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String | js.Object): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  @js.native
  trait NotificationState extends StObject {
    
    var notices: js.Array[HolderCallback] = js.native
  }
  object NotificationState {
    
    @scala.inline
    def apply(notices: js.Array[HolderCallback]): NotificationState = {
      val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationState]
    }
    
    @scala.inline
    implicit class NotificationStateMutableBuilder[Self <: NotificationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotices(value: js.Array[HolderCallback]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticesVarargs(value: HolderCallback*): Self = StObject.set(x, "notices", js.Array(value :_*))
    }
  }
}
