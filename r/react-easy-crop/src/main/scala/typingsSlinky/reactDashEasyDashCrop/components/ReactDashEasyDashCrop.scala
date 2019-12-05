package typingsSlinky.reactDashEasyDashCrop.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashEasyDashCrop.Anon_ContainerClassName
import typingsSlinky.reactDashEasyDashCrop.Anon_ContainerStyle
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropMod.Area
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropMod.CropperProps
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropMod.ImageSize
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropMod.Location
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropMod.Size
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropMod.default
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropStrings.rect
import typingsSlinky.reactDashEasyDashCrop.reactDashEasyDashCropStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashEasyDashCrop
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    crop: Location,
    image: String,
    onCropChange: Location => Unit,
    aspect: Int | Double = null,
    classes: Anon_ContainerClassName = null,
    cropShape: rect | round = null,
    cropSize: Size = null,
    crossOrigin: String = null,
    initialCroppedAreaPixels: Area = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    onCropComplete: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit = null,
    onImageLoaded: /* imageSize */ ImageSize => Unit = null,
    onImgError: () => Unit = null,
    onInteractionEnd: () => Unit = null,
    onInteractionStart: () => Unit = null,
    onRotationChange: /* rotation */ Double => Unit = null,
    onZoomChange: /* zoom */ Double => Unit = null,
    restrictPosition: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    style: Anon_ContainerStyle = null,
    zoom: Int | Double = null,
    zoomSpeed: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange))
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (cropShape != null) __obj.updateDynamic("cropShape")(cropShape.asInstanceOf[js.Any])
    if (cropSize != null) __obj.updateDynamic("cropSize")(cropSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (initialCroppedAreaPixels != null) __obj.updateDynamic("initialCroppedAreaPixels")(initialCroppedAreaPixels.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onCropComplete != null) __obj.updateDynamic("onCropComplete")(js.Any.fromFunction2(onCropComplete))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1(onImageLoaded))
    if (onImgError != null) __obj.updateDynamic("onImgError")(js.Any.fromFunction0(onImgError))
    if (onInteractionEnd != null) __obj.updateDynamic("onInteractionEnd")(js.Any.fromFunction0(onInteractionEnd))
    if (onInteractionStart != null) __obj.updateDynamic("onInteractionStart")(js.Any.fromFunction0(onInteractionStart))
    if (onRotationChange != null) __obj.updateDynamic("onRotationChange")(js.Any.fromFunction1(onRotationChange))
    if (onZoomChange != null) __obj.updateDynamic("onZoomChange")(js.Any.fromFunction1(onZoomChange))
    if (!js.isUndefined(restrictPosition)) __obj.updateDynamic("restrictPosition")(restrictPosition.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomSpeed != null) __obj.updateDynamic("zoomSpeed")(zoomSpeed.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CropperProps
}

