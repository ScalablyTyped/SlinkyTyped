package typingsSlinky.reactResizeDetector

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Props
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactResizeDetector.anon.Leading
import typingsSlinky.reactResizeDetector.anon.PartialReactResizeDetecto
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.debounce
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.height
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.throttle
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.width
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ReactResizeDetectorProps, js.Object, js.Any]
  
  @JSImport("react-resize-detector", "withResizeDetector")
  @js.native
  def withResizeDetector[T /* <: PartialReactResizeDetecto */](WrappedComponent: ReactComponentClass[T]): ReactComponentClass[Omit[T, height | width]] = js.native
  @JSImport("react-resize-detector", "withResizeDetector")
  @js.native
  def withResizeDetector[T /* <: PartialReactResizeDetecto */](WrappedComponent: ReactComponentClass[T], props: ReactResizeDetectorProps): ReactComponentClass[Omit[T, height | width]] = js.native
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait ReactResizeDetector
    extends PureComponent[ReactResizeDetectorProps, js.Object, js.Any]
  
  @js.native
  trait ReactResizeDetectorDimensions extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object ReactResizeDetectorDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): ReactResizeDetectorDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactResizeDetectorDimensions]
    }
    
    @scala.inline
    implicit class ReactResizeDetectorDimensionsMutableBuilder[Self <: ReactResizeDetectorDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactResizeDetectorProps extends Props[ReactResizeDetector] {
    
    /**
      * Trigger onResize on height change.
      * Default: false
      */
    var handleHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * Trigger onResize on width change.
      * Default: false
      */
    var handleWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * Valid only for a callback-pattern.
      * Ignored for other render types.
      * Set resize-detector's node type.
      * You can pass any valid React node: string with node's name or element.
      * Can be useful when you need to handle table's or paragraph's resizes.
      * Default: "div"
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var nodeType: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
      ] = js.native
    
    /**
      * Function that will be invoked with width and height arguments.
      * Default: undefined
      */
    var onResize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.native
    
    /**
      * A selector of an element to observe.
      * You can use this property to attach resize-observer to any DOM element.
      * Please refer to the querySelector docs.
      * Default: undefined
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var querySelector: js.UndefOr[String] = js.native
    
    /**
      * Possible values: "throttle" and "debounce".
      * See lodash docs for more information.
      * undefined - callback will be fired for every frame.
      * Default: undefined
      */
    var refreshMode: js.UndefOr[throttle | debounce] = js.native
    
    /**
      * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
      * Please refer to lodash's docs for more info.
      * Default: undefined
      */
    var refreshOptions: js.UndefOr[Leading] = js.native
    
    /**
      * Use this in conjunction with refreshMode.
      * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
      * efault: 1000.
      */
    var refreshRate: js.UndefOr[Double] = js.native
    
    var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, ReactElement]] = js.native
    
    /**
      * Do not trigger onResize when a component mounts.
      * Default: false
      */
    var skipOnMount: js.UndefOr[Boolean] = js.native
    
    // will be passed to React.createElement()
    /**
      * A DOM element to observe.
      * By default it's a parent element in relation to the ReactResizeDetector component.
      * But you can pass any DOM element to observe.
      * This property is omitted when you pass querySelector.
      * Default: undefined
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var targetDomEl: js.UndefOr[HTMLElement] = js.native
    
    /**
      * A React reference of the element to observe.
      * Pass a reference to the element you want to attach resize handlers to.
      * It must be an instance of React.useRef or React.createRef functions
      * Default: undefined
      */
    var targetRef: js.UndefOr[Ref[HTMLElement]] = js.native
  }
  object ReactResizeDetectorProps {
    
    @scala.inline
    def apply(): ReactResizeDetectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactResizeDetectorProps]
    }
    
    @scala.inline
    implicit class ReactResizeDetectorPropsMutableBuilder[Self <: ReactResizeDetectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleHeight(value: Boolean): Self = StObject.set(x, "handleHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleHeightUndefined: Self = StObject.set(x, "handleHeight", js.undefined)
      
      @scala.inline
      def setHandleWidth(value: Boolean): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      @scala.inline
      def setNodeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setOnResize(value: (/* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setQuerySelector(value: String): Self = StObject.set(x, "querySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerySelectorUndefined: Self = StObject.set(x, "querySelector", js.undefined)
      
      @scala.inline
      def setRefreshMode(value: throttle | debounce): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
      
      @scala.inline
      def setRefreshOptions(value: Leading): Self = StObject.set(x, "refreshOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshOptionsUndefined: Self = StObject.set(x, "refreshOptions", js.undefined)
      
      @scala.inline
      def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
      
      @scala.inline
      def setRender(value: /* props */ ReactResizeDetectorDimensions => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSkipOnMount(value: Boolean): Self = StObject.set(x, "skipOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOnMountUndefined: Self = StObject.set(x, "skipOnMount", js.undefined)
      
      @scala.inline
      def setTargetDomEl(value: HTMLElement): Self = StObject.set(x, "targetDomEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDomElUndefined: Self = StObject.set(x, "targetDomEl", js.undefined)
      
      @scala.inline
      def setTargetRef(value: Ref[HTMLElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "targetRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetRefNull: Self = StObject.set(x, "targetRef", null)
      
      @scala.inline
      def setTargetRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
}
