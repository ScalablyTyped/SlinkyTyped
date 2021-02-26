package typingsSlinky.reactEasyCrop

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.VideoHTMLAttributes
import typingsSlinky.reactEasyCrop.anon.ContainerClassName
import typingsSlinky.reactEasyCrop.anon.ContainerStyle
import typingsSlinky.reactEasyCrop.anon.CroppedAreaPercentages
import typingsSlinky.reactEasyCrop.anon.X
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.rect
import typingsSlinky.reactEasyCrop.reactEasyCropStrings.round
import typingsSlinky.reactEasyCrop.typesMod.Area
import typingsSlinky.reactEasyCrop.typesMod.MediaSize
import typingsSlinky.reactEasyCrop.typesMod.Point
import typingsSlinky.reactEasyCrop.typesMod.Size
import typingsSlinky.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  class default () extends Cropper
  object default {
    
    @JSImport("react-easy-crop", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-easy-crop", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-easy-crop", "default.defaultProps.aspect")
      @js.native
      def aspect: Double = js.native
      @scala.inline
      def aspect_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspect")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.cropShape")
      @js.native
      def cropShape: String = js.native
      @scala.inline
      def cropShape_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cropShape")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.maxZoom")
      @js.native
      def maxZoom: Double = js.native
      @scala.inline
      def maxZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.minZoom")
      @js.native
      def minZoom: Double = js.native
      @scala.inline
      def minZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.restrictPosition")
      @js.native
      def restrictPosition: Boolean = js.native
      @scala.inline
      def restrictPosition_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.rotation")
      @js.native
      def rotation: Double = js.native
      @scala.inline
      def rotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotation")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.showGrid")
      @js.native
      def showGrid: Boolean = js.native
      @scala.inline
      def showGrid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.zoom")
      @js.native
      def zoom: Double = js.native
      
      @JSImport("react-easy-crop", "default.defaultProps.zoomSpeed")
      @js.native
      def zoomSpeed: Double = js.native
      @scala.inline
      def zoomSpeed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.zoomWithScroll")
      @js.native
      def zoomWithScroll: Boolean = js.native
      @scala.inline
      def zoomWithScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomWithScroll")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def zoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-easy-crop", "default.getMousePoint")
    @js.native
    def getMousePoint: js.Function1[/* e */ MouseEvent | SyntheticMouseEvent[Element], X] = js.native
    @scala.inline
    def getMousePoint_=(x: js.Function1[/* e */ MouseEvent | SyntheticMouseEvent[Element], X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMousePoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("react-easy-crop", "default.getTouchPoint")
    @js.native
    def getTouchPoint: js.Function1[/* touch */ Touch | typingsSlinky.react.mod.Touch, X] = js.native
    @scala.inline
    def getTouchPoint_=(x: js.Function1[/* touch */ Touch | typingsSlinky.react.mod.Touch, X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTouchPoint")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Cropper
    extends Component[CropperProps, State, js.Any] {
    
    def cleanEvents(): Unit = js.native
    
    def clearScrollEvent(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCropper(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCropper(prevProps: CropperProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCropper(): Unit = js.native
    
    def computeSizes(): Unit = js.native
    
    var containerRect: DOMRect | Null = js.native
    
    var containerRef: HTMLDivElement | Null = js.native
    
    var dragStartCrop: Point = js.native
    
    var dragStartPosition: Point = js.native
    
    def emitCropAreaChange(): Unit = js.native
    
    def emitCropData(): Unit = js.native
    
    def getAspect(): Double = js.native
    
    def getCropData(): CroppedAreaPercentages | Null = js.native
    
    def getPointOnContainer(hasXY: Point): X = js.native
    
    def getPointOnMedia(hasXY: Point): X = js.native
    
    var imageRef: HTMLImageElement | Null = js.native
    
    var lastPinchDistance: Double = js.native
    
    var lastPinchRotation: Double = js.native
    
    var mediaSize: MediaSize = js.native
    
    def onDrag(hasXY: Point): Unit = js.native
    
    def onDragStart(hasXY: Point): Unit = js.native
    
    def onDragStopped(): Unit = js.native
    
    def onMediaLoad(): Unit = js.native
    
    def onMouseDown(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onPinchMove(e: TouchEvent): Unit = js.native
    
    def onPinchStart(e: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onTouchStart(e: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
    
    def onWheel(e: WheelEvent): Unit = js.native
    
    def preventZoomSafari(e: Event): Unit = js.native
    
    var rafDragTimeout: Double | Null = js.native
    
    var rafPinchTimeout: Double | Null = js.native
    
    def recomputeCropPosition(): Unit = js.native
    
    def setInitialCrop(): Unit = js.native
    
    def setNewZoom(zoom: Double, point: Point): Unit = js.native
    
    var styleRef: HTMLStyleElement | Null = js.native
    
    var videoRef: HTMLVideoElement | Null = js.native
    
    var wheelTimer: Double | Null = js.native
  }
  
  @js.native
  trait CropperProps extends StObject {
    
    var aspect: Double = js.native
    
    var classes: ContainerClassName = js.native
    
    var crop: Point = js.native
    
    var cropShape: rect | round = js.native
    
    var cropSize: js.UndefOr[Size] = js.native
    
    var disableAutomaticStylesInjection: js.UndefOr[Boolean] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var initialCroppedAreaPixels: js.UndefOr[Area] = js.native
    
    var maxZoom: Double = js.native
    
    var mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement] = js.native
    
    var minZoom: Double = js.native
    
    var onCropAreaChange: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.native
    
    def onCropChange(location: Point): Unit = js.native
    
    var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.native
    
    var onCropSizeChange: js.UndefOr[js.Function1[/* cropSize */ Size, Unit]] = js.native
    
    var onInteractionEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onInteractionStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onMediaLoaded: js.UndefOr[js.Function1[/* mediaSize */ MediaSize, Unit]] = js.native
    
    var onRotationChange: js.UndefOr[js.Function1[/* rotation */ Double, Unit]] = js.native
    
    var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.native
    
    var restrictPosition: Boolean = js.native
    
    var rotation: Double = js.native
    
    var showGrid: js.UndefOr[Boolean] = js.native
    
    var style: ContainerStyle = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var video: js.UndefOr[String] = js.native
    
    var zoom: Double = js.native
    
    var zoomSpeed: Double = js.native
    
    var zoomWithScroll: js.UndefOr[Boolean] = js.native
  }
  object CropperProps {
    
    @scala.inline
    def apply(
      aspect: Double,
      classes: ContainerClassName,
      crop: Point,
      cropShape: rect | round,
      maxZoom: Double,
      mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement],
      minZoom: Double,
      onCropChange: Point => Unit,
      restrictPosition: Boolean,
      rotation: Double,
      style: ContainerStyle,
      zoom: Double,
      zoomSpeed: Double
    ): CropperProps = {
      val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], cropShape = cropShape.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], mediaProps = mediaProps.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange), restrictPosition = restrictPosition.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropperProps]
    }
    
    @scala.inline
    implicit class CropperPropsMutableBuilder[Self <: CropperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClasses(value: ContainerClassName): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrop(value: Point): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropShape(value: rect | round): Self = StObject.set(x, "cropShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropSize(value: Size): Self = StObject.set(x, "cropSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropSizeUndefined: Self = StObject.set(x, "cropSize", js.undefined)
      
      @scala.inline
      def setDisableAutomaticStylesInjection(value: Boolean): Self = StObject.set(x, "disableAutomaticStylesInjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutomaticStylesInjectionUndefined: Self = StObject.set(x, "disableAutomaticStylesInjection", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setInitialCroppedAreaPixels(value: Area): Self = StObject.set(x, "initialCroppedAreaPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialCroppedAreaPixelsUndefined: Self = StObject.set(x, "initialCroppedAreaPixels", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaProps(value: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement]): Self = StObject.set(x, "mediaProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCropAreaChange(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): Self = StObject.set(x, "onCropAreaChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCropAreaChangeUndefined: Self = StObject.set(x, "onCropAreaChange", js.undefined)
      
      @scala.inline
      def setOnCropChange(value: Point => Unit): Self = StObject.set(x, "onCropChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): Self = StObject.set(x, "onCropComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCropCompleteUndefined: Self = StObject.set(x, "onCropComplete", js.undefined)
      
      @scala.inline
      def setOnCropSizeChange(value: /* cropSize */ Size => Unit): Self = StObject.set(x, "onCropSizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCropSizeChangeUndefined: Self = StObject.set(x, "onCropSizeChange", js.undefined)
      
      @scala.inline
      def setOnInteractionEnd(value: () => Unit): Self = StObject.set(x, "onInteractionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInteractionEndUndefined: Self = StObject.set(x, "onInteractionEnd", js.undefined)
      
      @scala.inline
      def setOnInteractionStart(value: () => Unit): Self = StObject.set(x, "onInteractionStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInteractionStartUndefined: Self = StObject.set(x, "onInteractionStart", js.undefined)
      
      @scala.inline
      def setOnMediaLoaded(value: /* mediaSize */ MediaSize => Unit): Self = StObject.set(x, "onMediaLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMediaLoadedUndefined: Self = StObject.set(x, "onMediaLoaded", js.undefined)
      
      @scala.inline
      def setOnRotationChange(value: /* rotation */ Double => Unit): Self = StObject.set(x, "onRotationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotationChangeUndefined: Self = StObject.set(x, "onRotationChange", js.undefined)
      
      @scala.inline
      def setOnZoomChange(value: /* zoom */ Double => Unit): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoomChangeUndefined: Self = StObject.set(x, "onZoomChange", js.undefined)
      
      @scala.inline
      def setRestrictPosition(value: Boolean): Self = StObject.set(x, "restrictPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      @scala.inline
      def setStyle(value: ContainerStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWithScroll(value: Boolean): Self = StObject.set(x, "zoomWithScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWithScrollUndefined: Self = StObject.set(x, "zoomWithScroll", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var cropSize: Size | Null = js.native
    
    var hasWheelJustStarted: Boolean = js.native
  }
  object State {
    
    @scala.inline
    def apply(hasWheelJustStarted: Boolean): State = {
      val __obj = js.Dynamic.literal(hasWheelJustStarted = hasWheelJustStarted.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropSize(value: Size): Self = StObject.set(x, "cropSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropSizeNull: Self = StObject.set(x, "cropSize", null)
      
      @scala.inline
      def setHasWheelJustStarted(value: Boolean): Self = StObject.set(x, "hasWheelJustStarted", value.asInstanceOf[js.Any])
    }
  }
}
