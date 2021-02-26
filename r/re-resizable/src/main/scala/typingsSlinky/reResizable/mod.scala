package typingsSlinky.reResizable

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.reResizable.anon.As
import typingsSlinky.reResizable.anon.Height
import typingsSlinky.reResizable.anon.HeightWidth
import typingsSlinky.reResizable.anon.MaxHeight
import typingsSlinky.reResizable.anon.NewHeight
import typingsSlinky.reResizable.anon.Width
import typingsSlinky.reResizable.anon.X
import typingsSlinky.reResizable.anon.Y
import typingsSlinky.reResizable.mod.global.Window
import typingsSlinky.reResizable.reResizableStrings.column
import typingsSlinky.reResizable.reResizableStrings.height
import typingsSlinky.reResizable.reResizableStrings.parent
import typingsSlinky.reResizable.reResizableStrings.row
import typingsSlinky.reResizable.reResizableStrings.width
import typingsSlinky.reResizable.reResizableStrings.window
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("re-resizable", "Resizable")
  @js.native
  class Resizable protected ()
    extends PureComponent[ResizableProps, State, js.Any] {
    def this(props: ResizableProps) = this()
    
    def appendBase(): HTMLDivElement | Null = js.native
    
    def bindEvents(): Unit = js.native
    
    def calculateNewMaxFromBoundary(): MaxHeight = js.native
    def calculateNewMaxFromBoundary(maxWidth: js.UndefOr[scala.Nothing], maxHeight: Double): MaxHeight = js.native
    def calculateNewMaxFromBoundary(maxWidth: Double): MaxHeight = js.native
    def calculateNewMaxFromBoundary(maxWidth: Double, maxHeight: Double): MaxHeight = js.native
    
    def calculateNewSizeFromAspectRatio(newWidth: Double, newHeight: Double, max: HeightWidth, min: HeightWidth): NewHeight = js.native
    
    def calculateNewSizeFromDirection(clientX: Double, clientY: Double): NewHeight = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MResizable(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizable(): Unit = js.native
    
    @JSName("createSizeForCssProperty")
    def createSizeForCssProperty_height(newSize: String, kind: height): Double | String = js.native
    @JSName("createSizeForCssProperty")
    def createSizeForCssProperty_height(newSize: Double, kind: height): Double | String = js.native
    @JSName("createSizeForCssProperty")
    def createSizeForCssProperty_width(newSize: String, kind: width): Double | String = js.native
    @JSName("createSizeForCssProperty")
    def createSizeForCssProperty_width(newSize: Double, kind: width): Double | String = js.native
    
    var flexDir: js.UndefOr[row | column] = js.native
    
    def getParentSize(): Width = js.native
    
    def onMouseMove(event: MouseEvent): Unit = js.native
    def onMouseMove(event: TouchEvent): Unit = js.native
    
    def onMouseUp(event: MouseEvent): Unit = js.native
    def onMouseUp(event: TouchEvent): Unit = js.native
    
    def onResizeStart(event: SyntheticMouseEvent[HTMLElement], direction: Direction): Unit = js.native
    def onResizeStart(event: SyntheticTouchEvent[HTMLElement], direction: Direction): Unit = js.native
    
    var parentLeft: Double = js.native
    
    def parentNode: HTMLElement | Null = js.native
    
    var parentTop: Double = js.native
    
    def propsSize: Size = js.native
    
    var ratio: Double = js.native
    
    def ref(): Unit = js.native
    def ref(c: HTMLElement): Unit = js.native
    
    def removeBase(base: HTMLElement): Unit = js.native
    
    def renderResizer(): ReactElement | Null = js.native
    
    var resizable: HTMLElement | Null = js.native
    
    var resizableLeft: Double = js.native
    
    var resizableTop: Double = js.native
    
    def setBoundingClientRect(): Unit = js.native
    
    def size: NumberSize = js.native
    
    def sizeStyle: Height = js.native
    
    var targetLeft: Double = js.native
    
    var targetTop: Double = js.native
    
    def unbindEvents(): Unit = js.native
    
    def updateSize(size: Size): Unit = js.native
    
    def window: Window | Null = js.native
  }
  /* static members */
  object Resizable {
    
    @JSImport("re-resizable", "Resizable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("re-resizable", "Resizable.defaultProps")
    @js.native
    def defaultProps: As = js.native
    @scala.inline
    def defaultProps_=(x: As): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Enable extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.native
    
    var bottomLeft: js.UndefOr[Boolean] = js.native
    
    var bottomRight: js.UndefOr[Boolean] = js.native
    
    var left: js.UndefOr[Boolean] = js.native
    
    var right: js.UndefOr[Boolean] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
    
    var topLeft: js.UndefOr[Boolean] = js.native
    
    var topRight: js.UndefOr[Boolean] = js.native
  }
  object Enable {
    
    @scala.inline
    def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: Boolean): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: Boolean): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: Boolean): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: Boolean): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait HandleClassName extends StObject {
    
    var bottom: js.UndefOr[String] = js.native
    
    var bottomLeft: js.UndefOr[String] = js.native
    
    var bottomRight: js.UndefOr[String] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[String] = js.native
    
    var topLeft: js.UndefOr[String] = js.native
    
    var topRight: js.UndefOr[String] = js.native
  }
  object HandleClassName {
    
    @scala.inline
    def apply(): HandleClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleClassName]
    }
    
    @scala.inline
    implicit class HandleClassNameMutableBuilder[Self <: HandleClassName] (val x: Self) extends AnyVal {
      
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
  trait NumberSize extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object NumberSize {
    
    @scala.inline
    def apply(height: Double, width: Double): NumberSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberSize]
    }
    
    @scala.inline
    implicit class NumberSizeMutableBuilder[Self <: NumberSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizableProps extends StObject {
    
    var as: js.UndefOr[String | ReactComponentClass[_]] = js.native
    
    var bounds: js.UndefOr[parent | window | HTMLElement] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultSize: js.UndefOr[Size] = js.native
    
    var enable: js.UndefOr[Enable] = js.native
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var handleClasses: js.UndefOr[HandleClassName] = js.native
    
    var handleComponent: js.UndefOr[HandleComponent] = js.native
    
    var handleStyles: js.UndefOr[HandleStyles] = js.native
    
    var handleWrapperClass: js.UndefOr[String] = js.native
    
    var handleWrapperStyle: js.UndefOr[CSSProperties] = js.native
    
    var lockAspectRatio: js.UndefOr[Boolean | Double] = js.native
    
    var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.native
    
    var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.native
    
    var maxHeight: js.UndefOr[String | Double] = js.native
    
    var maxWidth: js.UndefOr[String | Double] = js.native
    
    var minHeight: js.UndefOr[String | Double] = js.native
    
    var minWidth: js.UndefOr[String | Double] = js.native
    
    var onResize: js.UndefOr[ResizeCallback] = js.native
    
    var onResizeStart: js.UndefOr[ResizeStartCallback] = js.native
    
    var onResizeStop: js.UndefOr[ResizeCallback] = js.native
    
    var resizeRatio: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
    
    var snap: js.UndefOr[X] = js.native
    
    var snapGap: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ResizableProps {
    
    @scala.inline
    def apply(): ResizableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizableProps]
    }
    
    @scala.inline
    implicit class ResizablePropsMutableBuilder[Self <: ResizableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String | ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBounds(value: parent | window | HTMLElement): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsHTMLElement(value: HTMLElement): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
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
      def setDefaultSize(value: Size): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setEnable(value: Enable): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHandleClasses(value: HandleClassName): Self = StObject.set(x, "handleClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleClassesUndefined: Self = StObject.set(x, "handleClasses", js.undefined)
      
      @scala.inline
      def setHandleComponent(value: HandleComponent): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleComponentUndefined: Self = StObject.set(x, "handleComponent", js.undefined)
      
      @scala.inline
      def setHandleStyles(value: HandleStyles): Self = StObject.set(x, "handleStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStylesUndefined: Self = StObject.set(x, "handleStyles", js.undefined)
      
      @scala.inline
      def setHandleWrapperClass(value: String): Self = StObject.set(x, "handleWrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWrapperClassUndefined: Self = StObject.set(x, "handleWrapperClass", js.undefined)
      
      @scala.inline
      def setHandleWrapperStyle(value: CSSProperties): Self = StObject.set(x, "handleWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWrapperStyleUndefined: Self = StObject.set(x, "handleWrapperStyle", js.undefined)
      
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
      def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnResize(
        value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLElement, /* delta */ NumberSize) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnResizeStart(
        value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* dir */ Direction, /* elementRef */ HTMLElement) => Unit | Boolean
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      @scala.inline
      def setOnResizeStop(
        value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLElement, /* delta */ NumberSize) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setResizeRatio(value: Double): Self = StObject.set(x, "resizeRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeRatioUndefined: Self = StObject.set(x, "resizeRatio", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSnap(value: X): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapGap(value: Double): Self = StObject.set(x, "snapGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapGapUndefined: Self = StObject.set(x, "snapGap", js.undefined)
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type ResizeCallback = js.Function4[
    /* event */ MouseEvent | TouchEvent, 
    /* direction */ Direction, 
    /* elementRef */ HTMLElement, 
    /* delta */ NumberSize, 
    Unit
  ]
  
  type ResizeDirection = Direction
  
  type ResizeStartCallback = js.Function3[
    /* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], 
    /* dir */ Direction, 
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
    
    var backgroundStyle: CSSProperties = js.native
    
    var direction: Direction = js.native
    
    var flexBasis: js.UndefOr[String | Double] = js.native
    
    var height: Double | String = js.native
    
    var isResizing: Boolean = js.native
    
    var original: Y = js.native
    
    var width: Double | String = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      backgroundStyle: CSSProperties,
      direction: Direction,
      height: Double | String,
      isResizing: Boolean,
      original: Y,
      width: Double | String
    ): State = {
      val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundStyle(value: CSSProperties): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasis(value: String | Double): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal(value: Y): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var MouseEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MouseEvent */ js.Any = js.native
      
      var TouchEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TouchEvent */ js.Any = js.native
    }
    object Window {
      
      @scala.inline
      def apply(
        MouseEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MouseEvent */ js.Any,
        TouchEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TouchEvent */ js.Any
      ): Window = {
        val __obj = js.Dynamic.literal(MouseEvent = MouseEvent.asInstanceOf[js.Any], TouchEvent = TouchEvent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMouseEvent(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MouseEvent */ js.Any): Self = StObject.set(x, "MouseEvent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTouchEvent(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TouchEvent */ js.Any): Self = StObject.set(x, "TouchEvent", value.asInstanceOf[js.Any])
      }
    }
  }
}
