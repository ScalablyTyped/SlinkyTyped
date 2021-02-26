package typingsSlinky.rcNotification

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcNotification.anon.Duration
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeMod {
  
  @JSImport("rc-notification/es/Notice", JSImport.Default)
  @js.native
  class default () extends Notice
  /* static members */
  object default {
    
    @JSImport("rc-notification/es/Notice", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-notification/es/Notice", "default.defaultProps")
    @js.native
    def defaultProps: Duration = js.native
    @scala.inline
    def defaultProps_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DivProps extends HTMLProps[HTMLDivElement] {
    
    var `data-testid`: js.UndefOr[String] = js.native
  }
  object DivProps {
    
    @scala.inline
    def apply(): DivProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DivProps]
    }
    
    @scala.inline
    implicit class DivPropsMutableBuilder[Self <: DivProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
    }
  }
  
  @js.native
  trait Notice
    extends Component[NoticeProps, js.Object, js.Any] {
    
    def clearCloseTimer(): Unit = js.native
    
    def close(): Unit = js.native
    def close(e: SyntheticMouseEvent[HTMLAnchorElement]): Unit = js.native
    
    var closeTimer: Double | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MNotice(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNotice(prevProps: NoticeProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNotice(): Unit = js.native
    
    def restartCloseTimer(): Unit = js.native
    
    def startCloseTimer(): Unit = js.native
  }
  
  @js.native
  trait NoticeProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    /** @private Only for internal usage. We don't promise that we will refactor this */
    var holder: js.UndefOr[HTMLDivElement] = js.native
    
    /** Mark as final key since set maxCount may keep the key but user pass key is different */
    var noticeKey: Key = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var props: js.UndefOr[DivProps] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var updateMark: js.UndefOr[String] = js.native
  }
  object NoticeProps {
    
    @scala.inline
    def apply(noticeKey: Key, prefixCls: String): NoticeProps = {
      val __obj = js.Dynamic.literal(noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticeProps]
    }
    
    @scala.inline
    implicit class NoticePropsMutableBuilder[Self <: NoticeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      def setNoticeKey(value: Key): Self = StObject.set(x, "noticeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
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
}
