package typingsSlinky.reactImageCrop

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactImageCrop.anon.Height
import typingsSlinky.reactImageCrop.reactImageCropStrings.Percentsign
import typingsSlinky.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsSlinky.reactImageCrop.reactImageCropStrings.anonymous
import typingsSlinky.reactImageCrop.reactImageCropStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  class ^ () extends ReactCrop
  
  @JSImport("react-image-crop", "containCrop")
  @js.native
  def containCrop(prevCrop: Crop, crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
  
  @JSImport("react-image-crop", "makeAspectCrop")
  @js.native
  def makeAspectCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
  
  @js.native
  trait Crop extends StObject {
    
    var aspect: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var unit: js.UndefOr[px | Percentsign] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object Crop {
    
    @scala.inline
    def apply(): Crop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Crop]
    }
    
    @scala.inline
    implicit class CropMutableBuilder[Self <: Crop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setUnit(value: px | Percentsign): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait PercentCrop extends Crop {
    
    @JSName("unit")
    var unit_PercentCrop: js.UndefOr[Percentsign] = js.native
  }
  object PercentCrop {
    
    @scala.inline
    def apply(): PercentCrop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PercentCrop]
    }
    
    @scala.inline
    implicit class PercentCropMutableBuilder[Self <: PercentCrop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: Percentsign): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait ReactCrop
    extends Component[ReactCropProps, js.Object, js.Any] {
    
    def createCropSelection(): ReactElement = js.native
    
    def crossOverCheck(): Unit = js.native
    
    def dragCrop(): Crop = js.native
    
    def getCropStyle(): CSSProperties = js.native
    
    def getNewSize(): Height = js.native
    
    def makeNewCrop(): Crop = js.native
    
    def onComponentKeyDown(e: MouseEvent): Unit = js.native
    
    def onComponentMouseTouchDown(e: MouseEvent): Unit = js.native
    
    def onCropMouseTouchDown(e: MouseEvent): Unit = js.native
    
    def onDocMouseTouchEnd(e: MouseEvent): Unit = js.native
    
    def onDocMouseTouchMove(e: MouseEvent): Unit = js.native
    
    def onImageLoad(image: HTMLImageElement): Unit = js.native
    
    def resizeCrop(): Crop = js.native
    
    def resolveCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
    
    def straightenYPath(clientX: Double): Double = js.native
  }
  
  @js.native
  trait ReactCropProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var circularCrop: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var crop: js.UndefOr[Crop] = js.native
    
    var crossorigin: js.UndefOr[anonymous | `use-credentials`] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var imageAlt: js.UndefOr[String] = js.native
    
    var imageStyle: js.UndefOr[CSSProperties] = js.native
    
    var keepSelection: js.UndefOr[Boolean] = js.native
    
    var locked: js.UndefOr[Boolean] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    def onChange(crop: Crop, percentCrop: PercentCrop): Unit = js.native
    
    var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* percentCrop */ PercentCrop, Unit]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onImageError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
    
    var onImageLoaded: js.UndefOr[js.Function1[/* target */ HTMLImageElement, Unit]] = js.native
    
    var renderComponent: js.UndefOr[ReactElement] = js.native
    
    var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ js.Any, ReactElement]] = js.native
    
    var ruleOfThirds: js.UndefOr[Boolean] = js.native
    
    var src: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ReactCropProps {
    
    @scala.inline
    def apply(onChange: (Crop, PercentCrop) => Unit, src: String): ReactCropProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactCropProps]
    }
    
    @scala.inline
    implicit class ReactCropPropsMutableBuilder[Self <: ReactCropProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCircularCrop(value: Boolean): Self = StObject.set(x, "circularCrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularCropUndefined: Self = StObject.set(x, "circularCrop", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCrop(value: Crop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setCrossorigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      @scala.inline
      def setImageStyle(value: CSSProperties): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
      
      @scala.inline
      def setKeepSelection(value: Boolean): Self = StObject.set(x, "keepSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepSelectionUndefined: Self = StObject.set(x, "keepSelection", js.undefined)
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnChange(value: (Crop, PercentCrop) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnComplete(value: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnImageError(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onImageError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageErrorUndefined: Self = StObject.set(x, "onImageError", js.undefined)
      
      @scala.inline
      def setOnImageLoaded(value: /* target */ HTMLImageElement => Unit): Self = StObject.set(x, "onImageLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageLoadedUndefined: Self = StObject.set(x, "onImageLoaded", js.undefined)
      
      @scala.inline
      def setRenderComponent(value: ReactElement): Self = StObject.set(x, "renderComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderComponentReactElement(value: ReactElement): Self = StObject.set(x, "renderComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderComponentUndefined: Self = StObject.set(x, "renderComponent", js.undefined)
      
      @scala.inline
      def setRenderSelectionAddon(value: /* state */ js.Any => ReactElement): Self = StObject.set(x, "renderSelectionAddon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSelectionAddonUndefined: Self = StObject.set(x, "renderSelectionAddon", js.undefined)
      
      @scala.inline
      def setRuleOfThirds(value: Boolean): Self = StObject.set(x, "ruleOfThirds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleOfThirdsUndefined: Self = StObject.set(x, "ruleOfThirds", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
