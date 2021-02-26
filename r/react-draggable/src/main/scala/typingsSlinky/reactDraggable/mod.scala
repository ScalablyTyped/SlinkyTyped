package typingsSlinky.reactDraggable

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.TouchEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactDraggable.anon.PartialDraggableCoreProps
import typingsSlinky.reactDraggable.anon.PartialDraggableProps
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactDraggable.reactDraggableStrings.both
import typingsSlinky.reactDraggable.reactDraggableStrings.none
import typingsSlinky.reactDraggable.reactDraggableStrings.x
import typingsSlinky.reactDraggable.reactDraggableStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  class default ()
    extends Component[PartialDraggableProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-draggable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-draggable", "default.defaultProps")
    @js.native
    def defaultProps: DraggableProps = js.native
    @scala.inline
    def defaultProps_=(x: DraggableProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-draggable", "DraggableCore")
  @js.native
  class DraggableCore protected ()
    extends Component[PartialDraggableCoreProps, js.Object, js.Any] {
    def this(props: PartialDraggableCoreProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PartialDraggableCoreProps, context: js.Any) = this()
  }
  /* static members */
  object DraggableCore {
    
    @JSImport("react-draggable", "DraggableCore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-draggable", "DraggableCore.defaultProps")
    @js.native
    def defaultProps: DraggableCoreProps = js.native
    @scala.inline
    def defaultProps_=(x: DraggableCoreProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ControlPosition extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ControlPosition {
    
    @scala.inline
    def apply(x: Double, y: Double): ControlPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPosition]
    }
    
    @scala.inline
    implicit class ControlPositionMutableBuilder[Self <: ControlPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Draggable = ReactComponentClass[PartialDraggableProps]
  
  @js.native
  trait DraggableBounds extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object DraggableBounds {
    
    @scala.inline
    def apply(): DraggableBounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableBounds]
    }
    
    @scala.inline
    implicit class DraggableBoundsMutableBuilder[Self <: DraggableBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait DraggableCoreProps extends StObject {
    
    var allowAnyClick: Boolean = js.native
    
    var cancel: String = js.native
    
    var disabled: Boolean = js.native
    
    var enableUserSelectHack: Boolean = js.native
    
    var grid: js.Tuple2[Double, Double] = js.native
    
    var handle: String = js.native
    
    var nodeRef: js.UndefOr[ReactRef[HTMLElement]] = js.native
    
    var offsetParent: HTMLElement = js.native
    
    var onDrag: DraggableEventHandler = js.native
    
    def onMouseDown(e: MouseEvent): Unit = js.native
    
    var onStart: DraggableEventHandler = js.native
    
    var onStop: DraggableEventHandler = js.native
    
    var scale: Double = js.native
  }
  object DraggableCoreProps {
    
    @scala.inline
    def apply(
      allowAnyClick: Boolean,
      cancel: String,
      disabled: Boolean,
      enableUserSelectHack: Boolean,
      grid: js.Tuple2[Double, Double],
      handle: String,
      offsetParent: HTMLElement,
      onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onMouseDown: MouseEvent => Unit,
      onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      scale: Double
    ): DraggableCoreProps = {
      val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableCoreProps]
    }
    
    @scala.inline
    implicit class DraggableCorePropsMutableBuilder[Self <: DraggableCoreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeRef(value: ReactRef[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      @scala.inline
      def setOffsetParent(value: HTMLElement): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DraggableData extends StObject {
    
    var deltaX: Double = js.native
    
    var deltaY: Double = js.native
    
    var lastX: Double = js.native
    
    var lastY: Double = js.native
    
    var node: HTMLElement = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object DraggableData {
    
    @scala.inline
    def apply(
      deltaX: Double,
      deltaY: Double,
      lastX: Double,
      lastY: Double,
      node: HTMLElement,
      x: Double,
      y: Double
    ): DraggableData = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableData]
    }
    
    @scala.inline
    implicit class DraggableDataMutableBuilder[Self <: DraggableData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type DraggableEvent = (SyntheticMouseEvent[HTMLElement | SVGElement]) | (SyntheticTouchEvent[HTMLElement | SVGElement]) | MouseEvent | TouchEvent
  
  type DraggableEventHandler = js.Function2[/* e */ DraggableEvent, /* data */ DraggableData, Unit | `false`]
  
  @js.native
  trait DraggableProps extends DraggableCoreProps {
    
    var axis: both | x | y | none = js.native
    
    var bounds: DraggableBounds | String | `false` = js.native
    
    var defaultClassName: String = js.native
    
    var defaultClassNameDragged: String = js.native
    
    var defaultClassNameDragging: String = js.native
    
    var defaultPosition: ControlPosition = js.native
    
    var position: ControlPosition = js.native
    
    var positionOffset: PositionOffsetControlPosition = js.native
  }
  object DraggableProps {
    
    @scala.inline
    def apply(
      allowAnyClick: Boolean,
      axis: both | x | y | none,
      bounds: DraggableBounds | String | `false`,
      cancel: String,
      defaultClassName: String,
      defaultClassNameDragged: String,
      defaultClassNameDragging: String,
      defaultPosition: ControlPosition,
      disabled: Boolean,
      enableUserSelectHack: Boolean,
      grid: js.Tuple2[Double, Double],
      handle: String,
      offsetParent: HTMLElement,
      onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onMouseDown: MouseEvent => Unit,
      onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      position: ControlPosition,
      positionOffset: PositionOffsetControlPosition,
      scale: Double
    ): DraggableProps = {
      val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], defaultClassName = defaultClassName.asInstanceOf[js.Any], defaultClassNameDragged = defaultClassNameDragged.asInstanceOf[js.Any], defaultClassNameDragging = defaultClassNameDragging.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), position = position.asInstanceOf[js.Any], positionOffset = positionOffset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableProps]
    }
    
    @scala.inline
    implicit class DraggablePropsMutableBuilder[Self <: DraggableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: both | typingsSlinky.reactDraggable.reactDraggableStrings.x | y | none): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounds(value: DraggableBounds | String | `false`): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameDragged(value: String): Self = StObject.set(x, "defaultClassNameDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameDragging(value: String): Self = StObject.set(x, "defaultClassNameDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPosition(value: ControlPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOffset(value: PositionOffsetControlPosition): Self = StObject.set(x, "positionOffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PositionOffsetControlPosition extends StObject {
    
    var x: Double | String = js.native
    
    var y: Double | String = js.native
  }
  object PositionOffsetControlPosition {
    
    @scala.inline
    def apply(x: Double | String, y: Double | String): PositionOffsetControlPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionOffsetControlPosition]
    }
    
    @scala.inline
    implicit class PositionOffsetControlPositionMutableBuilder[Self <: PositionOffsetControlPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
