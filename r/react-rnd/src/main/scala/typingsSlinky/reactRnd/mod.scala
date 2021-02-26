package typingsSlinky.reactRnd

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.reResizable.mod.Resizable
import typingsSlinky.reResizable.mod.ResizeDirection
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.mod.DraggableEventHandler
import typingsSlinky.reactRnd.anon.Bottom
import typingsSlinky.reactRnd.anon.BottomLeft
import typingsSlinky.reactRnd.anon.Current
import typingsSlinky.reactRnd.anon.Height
import typingsSlinky.reactRnd.anon.HeightWidth
import typingsSlinky.reactRnd.anon.Left
import typingsSlinky.reactRnd.anon.Top
import typingsSlinky.reactRnd.anon.Width
import typingsSlinky.reactRnd.anon.X
import typingsSlinky.reactRnd.anon.xnumberynumberSize
import typingsSlinky.reactRnd.reactRndBooleans.`false`
import typingsSlinky.reactRnd.reactRndStrings.both
import typingsSlinky.reactRnd.reactRndStrings.none
import typingsSlinky.reactRnd.reactRndStrings.x
import typingsSlinky.reactRnd.reactRndStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-rnd", "Rnd")
  @js.native
  class Rnd protected ()
    extends PureComponent[Props, State, js.Any] {
    def this(props: Props) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MRnd(): Unit = js.native
    
    var draggable: TODO = js.native
    
    def getDraggablePosition(): X = js.native
    
    def getMaxSizesFromProps(): MaxSize = js.native
    
    def getOffsetHeight(boundary: HTMLElement): Double = js.native
    
    def getOffsetWidth(boundary: HTMLElement): Double = js.native
    
    def getParent(): js.Any = js.native
    
    def getParentSize(): Height = js.native
    
    def getSelfElement(): HTMLElement | Null = js.native
    
    var offsetFromParent: Left = js.native
    
    def onDrag(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
    
    def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
    
    def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
    
    def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    
    def onResizeStart(e: SyntheticMouseEvent[HTMLElement], dir: ResizeDirection, elementRef: HTMLElement): Unit = js.native
    def onResizeStart(e: SyntheticTouchEvent[HTMLElement], dir: ResizeDirection, elementRef: HTMLElement): Unit = js.native
    
    def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    
    def refDraggable(c: js.Any): Unit = js.native
    
    def refResizable(): Unit = js.native
    def refResizable(c: Resizable): Unit = js.native
    
    var resizable: Resizable = js.native
    
    var resizableElement: Current = js.native
    
    var resizing: Boolean = js.native
    
    var resizingPosition: X = js.native
    
    def updateOffsetFromParent(): js.UndefOr[Top] = js.native
    
    def updatePosition(position: Position): Unit = js.native
    
    def updateSize(size: HeightWidth): Unit = js.native
  }
  /* static members */
  object Rnd {
    
    @JSImport("react-rnd", "Rnd")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-rnd", "Rnd.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    @scala.inline
    def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DefaultProps extends StObject {
    
    var maxHeight: Double = js.native
    
    var maxWidth: Double = js.native
    
    var onDrag: RndDragCallback = js.native
    
    var onDragStart: RndDragCallback = js.native
    
    var onDragStop: RndDragCallback = js.native
    
    var onResize: RndResizeCallback = js.native
    
    var onResizeStart: RndResizeStartCallback = js.native
    
    var onResizeStop: RndResizeCallback = js.native
    
    var scale: Double = js.native
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      maxHeight: Double,
      maxWidth: Double,
      onDrag: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`,
      onDragStart: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`,
      onDragStop: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`,
      onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
      onResizeStart: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean,
      onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
      scale: Double
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onDragStart = js.Any.fromFunction2(onDragStart), onDragStop = js.Any.fromFunction2(onDragStop), onResize = js.Any.fromFunction5(onResize), onResizeStart = js.Any.fromFunction3(onResizeStart), onResizeStop = js.Any.fromFunction5(onResizeStop), scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDrag(
        value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragStart(
        value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragStop(
        value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResize(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnResizeStart(
        value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResizeStop(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction5(value))
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  node :std.HTMLElement,   deltaX :number,   deltaY :number,   lastX :number,   lastY :number} & react-rnd.react-rnd.Position */
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
  
  type Grid = js.Tuple2[Double, Double]
  
  @js.native
  trait HandleClasses extends StObject {
    
    var bottom: js.UndefOr[String] = js.native
    
    var bottomLeft: js.UndefOr[String] = js.native
    
    var bottomRight: js.UndefOr[String] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[String] = js.native
    
    var topLeft: js.UndefOr[String] = js.native
    
    var topRight: js.UndefOr[String] = js.native
  }
  object HandleClasses {
    
    @scala.inline
    def apply(): HandleClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleClasses]
    }
    
    @scala.inline
    implicit class HandleClassesMutableBuilder[Self <: HandleClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait HandleComponent extends StObject {
    
    var bottom: js.UndefOr[ReactElement] = js.native
    
    var bottomLeft: js.UndefOr[ReactElement] = js.native
    
    var bottomRight: js.UndefOr[ReactElement] = js.native
    
    var left: js.UndefOr[ReactElement] = js.native
    
    var right: js.UndefOr[ReactElement] = js.native
    
    var top: js.UndefOr[ReactElement] = js.native
    
    var topLeft: js.UndefOr[ReactElement] = js.native
    
    var topRight: js.UndefOr[ReactElement] = js.native
  }
  object HandleComponent {
    
    @scala.inline
    def apply(): HandleComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleComponent]
    }
    
    @scala.inline
    implicit class HandleComponentMutableBuilder[Self <: HandleComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: ReactElement): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: ReactElement): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: ReactElement): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: ReactElement): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: ReactElement): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: ReactElement): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait HandleStyles extends StObject {
    
    var bottom: js.UndefOr[CSSProperties] = js.native
    
    var bottomLeft: js.UndefOr[CSSProperties] = js.native
    
    var bottomRight: js.UndefOr[CSSProperties] = js.native
    
    var left: js.UndefOr[CSSProperties] = js.native
    
    var right: js.UndefOr[CSSProperties] = js.native
    
    var top: js.UndefOr[CSSProperties] = js.native
    
    var topLeft: js.UndefOr[CSSProperties] = js.native
    
    var topRight: js.UndefOr[CSSProperties] = js.native
  }
  object HandleStyles {
    
    @scala.inline
    def apply(): HandleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleStyles]
    }
    
    @scala.inline
    implicit class HandleStylesMutableBuilder[Self <: HandleStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: CSSProperties): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: CSSProperties): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: CSSProperties): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: CSSProperties): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: CSSProperties): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: CSSProperties): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: CSSProperties): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: CSSProperties): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait MaxSize extends StObject {
    
    var maxHeight: Double | String = js.native
    
    var maxWidth: Double | String = js.native
  }
  object MaxSize {
    
    @scala.inline
    def apply(maxHeight: Double | String, maxWidth: Double | String): MaxSize = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxSize]
    }
    
    @scala.inline
    implicit class MaxSizeMutableBuilder[Self <: MaxSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props
    extends /* key */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[xnumberynumberSize] = js.native
    
    var allowAnyClick: js.UndefOr[Boolean] = js.native
    
    var bounds: js.UndefOr[String] = js.native
    
    var cancel: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disableDragging: js.UndefOr[Boolean] = js.native
    
    var dragAxis: js.UndefOr[x | y | both | none] = js.native
    
    var dragGrid: js.UndefOr[Grid] = js.native
    
    var dragHandleClassName: js.UndefOr[String] = js.native
    
    var enableResizing: js.UndefOr[ResizeEnable] = js.native
    
    var enableUserSelectHack: js.UndefOr[Boolean] = js.native
    
    var lockAspectRatio: js.UndefOr[Boolean | Double] = js.native
    
    var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.native
    
    var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.native
    
    var maxHeight: js.UndefOr[Double | String] = js.native
    
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    var minHeight: js.UndefOr[Double | String] = js.native
    
    var minWidth: js.UndefOr[Double | String] = js.native
    
    var onDrag: js.UndefOr[RndDragCallback] = js.native
    
    var onDragStart: js.UndefOr[RndDragCallback] = js.native
    
    var onDragStop: js.UndefOr[RndDragCallback] = js.native
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
    
    var onMouseUp: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
    
    var onResize: js.UndefOr[RndResizeCallback] = js.native
    
    var onResizeStart: js.UndefOr[RndResizeStartCallback] = js.native
    
    var onResizeStop: js.UndefOr[RndResizeCallback] = js.native
    
    var position: js.UndefOr[X] = js.native
    
    var resizeGrid: js.UndefOr[Grid] = js.native
    
    var resizeHandleClasses: js.UndefOr[HandleClasses] = js.native
    
    var resizeHandleComponent: js.UndefOr[HandleComponent] = js.native
    
    var resizeHandleStyles: js.UndefOr[HandleStyles] = js.native
    
    var resizeHandleWrapperClass: js.UndefOr[String] = js.native
    
    var resizeHandleWrapperStyle: js.UndefOr[CSSProperties] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAnyClickUndefined: Self = StObject.set(x, "allowAnyClick", js.undefined)
      
      @scala.inline
      def setBounds(value: String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
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
      def setDefault(value: xnumberynumberSize): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDisableDragging(value: Boolean): Self = StObject.set(x, "disableDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDraggingUndefined: Self = StObject.set(x, "disableDragging", js.undefined)
      
      @scala.inline
      def setDragAxis(value: typingsSlinky.reactRnd.reactRndStrings.x | y | both | none): Self = StObject.set(x, "dragAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragAxisUndefined: Self = StObject.set(x, "dragAxis", js.undefined)
      
      @scala.inline
      def setDragGrid(value: Grid): Self = StObject.set(x, "dragGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragGridUndefined: Self = StObject.set(x, "dragGrid", js.undefined)
      
      @scala.inline
      def setDragHandleClassName(value: String): Self = StObject.set(x, "dragHandleClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleClassNameUndefined: Self = StObject.set(x, "dragHandleClassName", js.undefined)
      
      @scala.inline
      def setEnableResizing(value: ResizeEnable): Self = StObject.set(x, "enableResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizingUndefined: Self = StObject.set(x, "enableResizing", js.undefined)
      
      @scala.inline
      def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUserSelectHackUndefined: Self = StObject.set(x, "enableUserSelectHack", js.undefined)
      
      @scala.inline
      def setLockAspectRatio(value: Boolean | Double): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatioExtraHeight(value: Double): Self = StObject.set(x, "lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatioExtraHeightUndefined: Self = StObject.set(x, "lockAspectRatioExtraHeight", js.undefined)
      
      @scala.inline
      def setLockAspectRatioExtraWidth(value: Double): Self = StObject.set(x, "lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatioExtraWidthUndefined: Self = StObject.set(x, "lockAspectRatioExtraWidth", js.undefined)
      
      @scala.inline
      def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnDrag(
        value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragStart(
        value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragStop(
        value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnResize(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnResizeStart(
        value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      @scala.inline
      def setOnResizeStop(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setResizeGrid(value: Grid): Self = StObject.set(x, "resizeGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeGridUndefined: Self = StObject.set(x, "resizeGrid", js.undefined)
      
      @scala.inline
      def setResizeHandleClasses(value: HandleClasses): Self = StObject.set(x, "resizeHandleClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleClassesUndefined: Self = StObject.set(x, "resizeHandleClasses", js.undefined)
      
      @scala.inline
      def setResizeHandleComponent(value: HandleComponent): Self = StObject.set(x, "resizeHandleComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleComponentUndefined: Self = StObject.set(x, "resizeHandleComponent", js.undefined)
      
      @scala.inline
      def setResizeHandleStyles(value: HandleStyles): Self = StObject.set(x, "resizeHandleStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleStylesUndefined: Self = StObject.set(x, "resizeHandleStyles", js.undefined)
      
      @scala.inline
      def setResizeHandleWrapperClass(value: String): Self = StObject.set(x, "resizeHandleWrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleWrapperClassUndefined: Self = StObject.set(x, "resizeHandleWrapperClass", js.undefined)
      
      @scala.inline
      def setResizeHandleWrapperStyle(value: CSSProperties): Self = StObject.set(x, "resizeHandleWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleWrapperStyleUndefined: Self = StObject.set(x, "resizeHandleWrapperStyle", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ResizableDelta extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object ResizableDelta {
    
    @scala.inline
    def apply(height: Double, width: Double): ResizableDelta = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableDelta]
    }
    
    @scala.inline
    implicit class ResizableDeltaMutableBuilder[Self <: ResizableDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizeEnable = BottomLeft | Boolean
  
  type RndDragCallback = DraggableEventHandler
  
  type RndDragEvent = (SyntheticMouseEvent[HTMLElement | SVGElement]) | (SyntheticTouchEvent[HTMLElement | SVGElement]) | MouseEvent | TouchEvent
  
  type RndResizeCallback = js.Function5[
    /* e */ MouseEvent | TouchEvent, 
    /* dir */ ResizeDirection, 
    /* elementRef */ HTMLElement, 
    /* delta */ ResizableDelta, 
    /* position */ Position, 
    Unit
  ]
  
  type RndResizeStartCallback = js.Function3[
    /* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], 
    /* dir */ ResizeDirection, 
    /* elementRef */ HTMLElement, 
    Unit | Boolean
  ]
  
  @js.native
  trait Size extends StObject {
    
    var height: String | Double = js.native
    
    var width: String | Double = js.native
  }
  object Size {
    
    @scala.inline
    def apply(height: String | Double, width: String | Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var bounds: Bottom = js.native
    
    var maxHeight: js.UndefOr[Double | String] = js.native
    
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    var original: Position = js.native
  }
  object State {
    
    @scala.inline
    def apply(bounds: Bottom, original: Position): State = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bottom): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setOriginal(value: Position): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    }
  }
  
  type TODO = js.Any
}
