package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod extends Shortcut {
  
  @JSImport("antd/lib/notification", JSImport.Default)
  @js.native
  val default: NotificationApi = js.native
  
  @JSImport("antd/lib/notification", "getInstance")
  @js.native
  def getInstance(cacheKey: String): js.Promise[typingsSlinky.rcNotification.notificationMod.NotificationInstance | Null] = js.native
  
  @js.native
  trait ArgsProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var btn: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var message: ReactElement = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placement: js.UndefOr[NotificationPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var top: js.UndefOr[Double] = js.native
    
    val `type`: js.UndefOr[IconType] = js.native
  }
  object ArgsProps {
    
    @scala.inline
    def apply(): ArgsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgsProps]
    }
    
    @scala.inline
    implicit class ArgsPropsMutableBuilder[Self <: ArgsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBtn(value: ReactElement): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnReactElement(value: ReactElement): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
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
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ConfigProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var placement: js.UndefOr[NotificationPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object ConfigProps {
    
    @scala.inline
    def apply(): ConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigProps]
    }
    
    @scala.inline
    implicit class ConfigPropsMutableBuilder[Self <: ConfigProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.success
    - typingsSlinky.antd.antdStrings.info
    - typingsSlinky.antd.antdStrings.error
    - typingsSlinky.antd.antdStrings.warning
  */
  trait IconType extends StObject
  object IconType {
    
    @scala.inline
    def error: typingsSlinky.antd.antdStrings.error = "error".asInstanceOf[typingsSlinky.antd.antdStrings.error]
    
    @scala.inline
    def info: typingsSlinky.antd.antdStrings.info = "info".asInstanceOf[typingsSlinky.antd.antdStrings.info]
    
    @scala.inline
    def success: typingsSlinky.antd.antdStrings.success = "success".asInstanceOf[typingsSlinky.antd.antdStrings.success]
    
    @scala.inline
    def warning: typingsSlinky.antd.antdStrings.warning = "warning".asInstanceOf[typingsSlinky.antd.antdStrings.warning]
  }
  
  @js.native
  trait NotificationApi extends NotificationInstance {
    
    def close(key: String): Unit = js.native
    
    def config(options: ConfigProps): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def useNotification(): js.Tuple2[NotificationInstance, ReactElement] = js.native
    
    def warn(args: ArgsProps): Unit = js.native
  }
  object NotificationApi {
    
    @scala.inline
    def apply(
      close: String => Unit,
      config: ConfigProps => Unit,
      destroy: () => Unit,
      error: ArgsProps => Unit,
      info: ArgsProps => Unit,
      open: ArgsProps => Unit,
      success: ArgsProps => Unit,
      useNotification: () => js.Tuple2[NotificationInstance, ReactElement],
      warn: ArgsProps => Unit,
      warning: ArgsProps => Unit
    ): NotificationApi = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), config = js.Any.fromFunction1(config), destroy = js.Any.fromFunction0(destroy), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), useNotification = js.Any.fromFunction0(useNotification), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[NotificationApi]
    }
    
    @scala.inline
    implicit class NotificationApiMutableBuilder[Self <: NotificationApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfig(value: ConfigProps => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUseNotification(value: () => js.Tuple2[NotificationInstance, ReactElement]): Self = StObject.set(x, "useNotification", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWarn(value: ArgsProps => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NotificationInstance extends StObject {
    
    def error(args: ArgsProps): Unit = js.native
    
    def info(args: ArgsProps): Unit = js.native
    
    def open(args: ArgsProps): Unit = js.native
    
    def success(args: ArgsProps): Unit = js.native
    
    def warning(args: ArgsProps): Unit = js.native
  }
  object NotificationInstance {
    
    @scala.inline
    def apply(
      error: ArgsProps => Unit,
      info: ArgsProps => Unit,
      open: ArgsProps => Unit,
      success: ArgsProps => Unit,
      warning: ArgsProps => Unit
    ): NotificationInstance = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[NotificationInstance]
    }
    
    @scala.inline
    implicit class NotificationInstanceMutableBuilder[Self <: NotificationInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ArgsProps => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: ArgsProps => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: ArgsProps => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccess(value: ArgsProps => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarning(value: ArgsProps => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.topLeft
    - typingsSlinky.antd.antdStrings.topRight
    - typingsSlinky.antd.antdStrings.bottomLeft
    - typingsSlinky.antd.antdStrings.bottomRight
  */
  trait NotificationPlacement extends StObject
  object NotificationPlacement {
    
    @scala.inline
    def bottomLeft: typingsSlinky.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsSlinky.antd.antdStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typingsSlinky.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typingsSlinky.antd.antdStrings.bottomRight]
    
    @scala.inline
    def topLeft: typingsSlinky.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typingsSlinky.antd.antdStrings.topLeft]
    
    @scala.inline
    def topRight: typingsSlinky.antd.antdStrings.topRight = "topRight".asInstanceOf[typingsSlinky.antd.antdStrings.topRight]
  }
  
  type _To = NotificationApi
  
  /* This means you don't have to write `default`, but can instead just say `notificationMod.foo` */
  override def _to: NotificationApi = default
}
