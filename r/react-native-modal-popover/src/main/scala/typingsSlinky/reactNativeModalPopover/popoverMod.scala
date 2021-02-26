package typingsSlinky.reactNativeModalPopover

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.anon.ArrowSize
import typingsSlinky.reactNativeModalPopover.anon.PartialPopoverProps
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Geometry
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Point
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Rect
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Size
import typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("react-native-modal-popover/lib/Popover", "Popover")
  @js.native
  class Popover protected ()
    extends PureComponent[PopoverProps, PopoverState, js.Any] {
    def this(props: PopoverProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPopover(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MPopover(nextProps: PopoverProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopover(): Unit = js.native
    
    var computeGeometry: js.Any = js.native
    
    var computeStyles: js.Any = js.native
    
    var defaultDisplayArea: js.Any = js.native
    
    var getTranslateOrigin: js.Any = js.native
    
    var measureContent: js.Any = js.native
    
    var onHidden: js.Any = js.native
    
    var onOrientationChange: js.Any = js.native
    
    var startAnimation: js.Any = js.native
    
    var updateState: js.Any = js.native
  }
  /* static members */
  object Popover {
    
    @JSImport("react-native-modal-popover/lib/Popover", "Popover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover/lib/Popover", "Popover.defaultProps")
    @js.native
    def defaultProps: PartialPopoverProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover/lib/Popover", "Popover.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover/lib/Popover", "Popover.propTypes")
    @js.native
    def propTypes: ArrowSize = js.native
    @scala.inline
    def propTypes_=(x: ArrowSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.portrait
    - typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`portrait-upside-down`
    - typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.landscape
    - typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`landscape-left`
    - typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`landscape-right`
  */
  trait Orientation extends StObject
  object Orientation {
    
    @scala.inline
    def landscape: typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.landscape = "landscape".asInstanceOf[typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.landscape]
    
    @scala.inline
    def `landscape-left`: typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`landscape-left` = "landscape-left".asInstanceOf[typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`landscape-left`]
    
    @scala.inline
    def `landscape-right`: typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`landscape-right` = "landscape-right".asInstanceOf[typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`landscape-right`]
    
    @scala.inline
    def portrait: typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.portrait = "portrait".asInstanceOf[typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.portrait]
    
    @scala.inline
    def `portrait-upside-down`: typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`portrait-upside-down` = "portrait-upside-down".asInstanceOf[typingsSlinky.reactNativeModalPopover.reactNativeModalPopoverStrings.`portrait-upside-down`]
  }
  
  @js.native
  trait PopoverProps extends StObject {
    
    var arrowSize: js.UndefOr[Size] = js.native
    
    var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var displayArea: js.UndefOr[Rect] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.native
    
    var fromRect: Rect = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placement: js.UndefOr[Placement | auto] = js.native
    
    var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(fromRect: Rect): PopoverProps = {
      val __obj = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowSize(value: Size): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
      
      @scala.inline
      def setArrowStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowStyleNull: Self = StObject.set(x, "arrowStyle", null)
      
      @scala.inline
      def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      @scala.inline
      def setBackgroundStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyleNull: Self = StObject.set(x, "backgroundStyle", null)
      
      @scala.inline
      def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      @scala.inline
      def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDisplayArea(value: Rect): Self = StObject.set(x, "displayArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayAreaUndefined: Self = StObject.set(x, "displayArea", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFromRect(value: Rect): Self = StObject.set(x, "fromRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopoverStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "popoverStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverStyleNull: Self = StObject.set(x, "popoverStyle", null)
      
      @scala.inline
      def setPopoverStyleUndefined: Self = StObject.set(x, "popoverStyle", js.undefined)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PopoverState extends Geometry {
    
    var animation: Value = js.native
    
    var contentSize: Size = js.native
    
    var isAwaitingShow: Boolean = js.native
    
    var visible: Boolean = js.native
  }
  object PopoverState {
    
    @scala.inline
    def apply(
      anchor: Point,
      animation: Value,
      contentSize: Size,
      isAwaitingShow: Boolean,
      origin: Point,
      placement: Placement,
      visible: Boolean
    ): PopoverState = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], isAwaitingShow = isAwaitingShow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverState]
    }
    
    @scala.inline
    implicit class PopoverStateMutableBuilder[Self <: PopoverState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Value): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentSize(value: Size): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAwaitingShow(value: Boolean): Self = StObject.set(x, "isAwaitingShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
