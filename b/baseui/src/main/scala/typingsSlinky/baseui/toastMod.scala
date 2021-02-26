package typingsSlinky.baseui

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Dismiss
import typingsSlinky.baseui.anon.Placement
import typingsSlinky.baseui.anon.ReadonlySharedStylePropsA
import typingsSlinky.baseui.anon.ReadonlyToastProps
import typingsSlinky.baseui.anon.ReadonlyToastPropskeyKey
import typingsSlinky.baseui.anon.ReadonlyToasterProps
import typingsSlinky.baseui.anon.ToastPropskeyKey
import typingsSlinky.baseui.baseuiStrings.`inline`
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.info
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.toast
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("baseui/toast", "Body")
  @js.native
  val Body: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/toast", "CloseIconSvg")
  @js.native
  val CloseIconSvg: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait KIND extends StObject {
    
    var info: typingsSlinky.baseui.baseuiStrings.info = js.native
    
    var negative: typingsSlinky.baseui.baseuiStrings.negative = js.native
    
    var positive: typingsSlinky.baseui.baseuiStrings.positive = js.native
    
    var warning: typingsSlinky.baseui.baseuiStrings.warning = js.native
  }
  object KIND {
    
    @JSImport("baseui/toast", "KIND")
    @js.native
    val ^ : KIND = js.native
    
    @scala.inline
    implicit class KINDMutableBuilder[Self <: KIND] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegative(value: negative): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositive(value: positive): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: warning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PLACEMENT extends StObject {
    
    var bottom: typingsSlinky.baseui.baseuiStrings.bottom = js.native
    
    var bottomLeft: typingsSlinky.baseui.baseuiStrings.bottomLeft = js.native
    
    var bottomRight: typingsSlinky.baseui.baseuiStrings.bottomRight = js.native
    
    var top: typingsSlinky.baseui.baseuiStrings.top = js.native
    
    var topLeft: typingsSlinky.baseui.baseuiStrings.topLeft = js.native
    
    var topRight: typingsSlinky.baseui.baseuiStrings.topRight = js.native
  }
  object PLACEMENT {
    
    @JSImport("baseui/toast", "PLACEMENT")
    @js.native
    val ^ : PLACEMENT = js.native
    
    @scala.inline
    implicit class PLACEMENTMutableBuilder[Self <: PLACEMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: bottomLeft): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: bottomRight): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: topLeft): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: topRight): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/toast", "Root")
  @js.native
  val Root: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait TYPE extends StObject {
    
    var `inline`: typingsSlinky.baseui.baseuiStrings.`inline` = js.native
    
    var toast: typingsSlinky.baseui.baseuiStrings.toast = js.native
  }
  object TYPE {
    
    @JSImport("baseui/toast", "TYPE")
    @js.native
    val ^ : TYPE = js.native
    
    @scala.inline
    implicit class TYPEMutableBuilder[Self <: TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: `inline`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast(value: toast): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/toast", "Toast")
  @js.native
  class Toast protected ()
    extends Component[ToastProps, ToastPrivateState, js.Any] {
    def this(props: ToastProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToastProps, context: js.Any) = this()
    
    def animateIn(): Unit = js.native
    
    def animateOut(): Unit = js.native
    
    def clearTimeout(): Unit = js.native
    
    def dismiss(): Unit = js.native
    
    def getSharedProps(): ReadonlySharedStylePropsA = js.native
    
    def onBlur(e: Event): Unit = js.native
    
    def onFocus(e: Event): Unit = js.native
    
    def onMouseEnter(e: Event): Unit = js.native
    
    def onMouseLeave(e: Event): Unit = js.native
    
    def startTimeout(): Unit = js.native
  }
  
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  class ToasterContainer protected ()
    extends Component[ReadonlyToasterProps, ToasterContainerState, js.Any] {
    def this(props: ReadonlyToasterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReadonlyToasterProps, context: js.Any) = this()
    
    def clear(key: Key): Unit = js.native
    
    def clearAll(): Unit = js.native
    
    def dismiss(key: Key): Unit = js.native
    
    def getOnCloseHandler(key: Key): js.Function0[_] = js.native
    def getOnCloseHandler(key: Key, onClose: js.Function0[_]): js.Function0[_] = js.native
    
    def getSharedProps(): Placement = js.native
    
    def getToastProps(props: ToastProps): ReadonlyToastPropskeyKey = js.native
    
    def internalOnClose(key: Key): Unit = js.native
    
    def renderToast(toastProps: ToastPropskeyKey): ReactElement = js.native
    
    def show(props: ToastProps): Key = js.native
    
    def update(key: Key, props: ToastProps): Unit = js.native
  }
  
  @JSImport("baseui/toast", "toaster")
  @js.native
  val toaster: IToaster = js.native
  
  @js.native
  trait IToaster extends StObject {
    
    def clear(key: Key): Unit = js.native
    
    def getRef(): Ref[Instantiable0[ToasterContainer]] = js.native
    
    def info(children: ReactElement, props: ReadonlyToastProps): Key = js.native
    
    def negative(children: ReactElement, props: ReadonlyToastProps): Key = js.native
    
    def positive(children: ReactElement, props: ReadonlyToastProps): Key = js.native
    
    def show(children: ReactElement, props: ReadonlyToastProps): Key = js.native
    
    def update(key: Key, props: ReadonlyToastProps): Unit = js.native
    
    def warning(children: ReactElement, props: ReadonlyToastProps): Key = js.native
  }
  object IToaster {
    
    @scala.inline
    def apply(
      clear: Key => Unit,
      getRef: () => Ref[Instantiable0[ToasterContainer]],
      info: (ReactElement, ReadonlyToastProps) => Key,
      negative: (ReactElement, ReadonlyToastProps) => Key,
      positive: (ReactElement, ReadonlyToastProps) => Key,
      show: (ReactElement, ReadonlyToastProps) => Key,
      update: (Key, ReadonlyToastProps) => Unit,
      warning: (ReactElement, ReadonlyToastProps) => Key
    ): IToaster = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
      __obj.asInstanceOf[IToaster]
    }
    
    @scala.inline
    implicit class IToasterMutableBuilder[Self <: IToaster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: Key => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRef(value: () => Ref[Instantiable0[ToasterContainer]]): Self = StObject.set(x, "getRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInfo(value: (ReactElement, ReadonlyToastProps) => Key): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNegative(value: (ReactElement, ReadonlyToastProps) => Key): Self = StObject.set(x, "negative", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPositive(value: (ReactElement, ReadonlyToastProps) => Key): Self = StObject.set(x, "positive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShow(value: (ReactElement, ReadonlyToastProps) => Key): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: (Key, ReadonlyToastProps) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarning(value: (ReactElement, ReadonlyToastProps) => Key): Self = StObject.set(x, "warning", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$closeable")
    var $closeable: js.UndefOr[Boolean] = js.native
    
    @JSName("$isRendered")
    var $isRendered: js.UndefOr[Boolean] = js.native
    
    @JSName("$isVisible")
    var $isVisible: js.UndefOr[Boolean] = js.native
    
    @JSName("$kind")
    var $kind: js.UndefOr[info | positive | warning | negative] = js.native
    
    @JSName("$type")
    var $type: js.UndefOr[`inline` | toast] = js.native
  }
  object SharedStylePropsArg {
    
    @scala.inline
    def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    @scala.inline
    implicit class SharedStylePropsArgMutableBuilder[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
      
      @scala.inline
      def set$isRendered(value: Boolean): Self = StObject.set(x, "$isRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isRenderedUndefined: Self = StObject.set(x, "$isRendered", js.undefined)
      
      @scala.inline
      def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
      
      @scala.inline
      def set$kind(value: info | positive | warning | negative): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
      
      @scala.inline
      def set$type(value: `inline` | toast): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
    }
  }
  
  @js.native
  trait ToastOverrides extends StObject {
    
    var Body: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var CloseIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var InnerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
  }
  object ToastOverrides {
    
    @scala.inline
    def apply(): ToastOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOverrides]
    }
    
    @scala.inline
    implicit class ToastOverridesMutableBuilder[Self <: ToastOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setCloseIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "CloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "CloseIcon", js.undefined)
      
      @scala.inline
      def setInnerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "InnerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainerUndefined: Self = StObject.set(x, "InnerContainer", js.undefined)
    }
  }
  
  @js.native
  trait ToastPrivateState extends StObject {
    
    var isRendered: Boolean = js.native
    
    var isVisible: Boolean = js.native
  }
  object ToastPrivateState {
    
    @scala.inline
    def apply(isRendered: Boolean, isVisible: Boolean): ToastPrivateState = {
      val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastPrivateState]
    }
    
    @scala.inline
    implicit class ToastPrivateStateMutableBuilder[Self <: ToastPrivateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToastProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoHideDuration: js.UndefOr[Double] = js.native
    
    var children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement] = js.native
    
    var closeable: js.UndefOr[Boolean] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var kind: js.UndefOr[info | positive | warning | negative] = js.native
    
    var notificationType: js.UndefOr[`inline` | toast] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var onClose: js.UndefOr[js.Function0[_]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var overrides: js.UndefOr[ToastOverrides] = js.native
  }
  object ToastProps {
    
    @scala.inline
    def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    @scala.inline
    implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      @scala.inline
      def setChildren(value: (js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* args */ Dismiss => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      @scala.inline
      def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: info | positive | warning | negative): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setNotificationType(value: `inline` | toast): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ Event => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => _): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ Event => _): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* e */ Event => _): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* e */ Event => _): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait ToasterContainerState extends StObject {
    
    var isMounted: Boolean = js.native
    
    var toasts: ReadonlyToastProps = js.native
  }
  object ToasterContainerState {
    
    @scala.inline
    def apply(isMounted: Boolean, toasts: ReadonlyToastProps): ToasterContainerState = {
      val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToasterContainerState]
    }
    
    @scala.inline
    implicit class ToasterContainerStateMutableBuilder[Self <: ToasterContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToasts(value: ReadonlyToastProps): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToasterOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
      ] = js.native
    
    var ToastBody: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var ToastCloseIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
  }
  object ToasterOverrides {
    
    @scala.inline
    def apply(): ToasterOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterOverrides]
    }
    
    @scala.inline
    implicit class ToasterOverridesMutableBuilder[Self <: ToasterOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setToastBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "ToastBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastBodyUndefined: Self = StObject.set(x, "ToastBody", js.undefined)
      
      @scala.inline
      def setToastCloseIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "ToastCloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastCloseIconUndefined: Self = StObject.set(x, "ToastCloseIcon", js.undefined)
    }
  }
  
  @js.native
  trait ToasterProps extends StObject {
    
    var autoHideDuration: js.UndefOr[Double] = js.native
    
    var overrides: js.UndefOr[ToasterOverrides] = js.native
    
    var placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
    
    var usePortal: js.UndefOr[Boolean] = js.native
  }
  object ToasterProps {
    
    @scala.inline
    def apply(): ToasterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterProps]
    }
    
    @scala.inline
    implicit class ToasterPropsMutableBuilder[Self <: ToasterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      @scala.inline
      def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPlacement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  @js.native
  trait ToasterSharedStylePropsArg extends StObject {
    
    @JSName("$placement")
    var $placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
  }
  object ToasterSharedStylePropsArg {
    
    @scala.inline
    def apply(): ToasterSharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToasterSharedStylePropsArg]
    }
    
    @scala.inline
    implicit class ToasterSharedStylePropsArgMutableBuilder[Self <: ToasterSharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
    }
  }
}
