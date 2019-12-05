package typingsSlinky.reactDashMediumDashImageDashZoom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod.ImageZoomDefaultStyles
import typingsSlinky.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod.ImageZoomProps
import typingsSlinky.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod.ImageZoom_Image
import typingsSlinky.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod.ImageZoom_ZoomImage
import typingsSlinky.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashMediumDashImageDashZoom
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-medium-image-zoom", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    image: ImageZoom_Image,
    defaultStyles: ImageZoomDefaultStyles = null,
    isZoomed: js.UndefOr[Boolean] = js.undefined,
    onUnzoom: () => js.Object = null,
    onZoom: () => js.Object = null,
    shouldHandleZoom: () => Boolean = null,
    shouldReplaceImage: js.UndefOr[Boolean] = js.undefined,
    shouldRespectMaxDimension: js.UndefOr[Boolean] = js.undefined,
    zoomImage: ImageZoom_ZoomImage = null,
    zoomMargin: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isZoomed)) __obj.updateDynamic("isZoomed")(isZoomed.asInstanceOf[js.Any])
    if (onUnzoom != null) __obj.updateDynamic("onUnzoom")(js.Any.fromFunction0(onUnzoom))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction0(onZoom))
    if (shouldHandleZoom != null) __obj.updateDynamic("shouldHandleZoom")(js.Any.fromFunction0(shouldHandleZoom))
    if (!js.isUndefined(shouldReplaceImage)) __obj.updateDynamic("shouldReplaceImage")(shouldReplaceImage.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectMaxDimension)) __obj.updateDynamic("shouldRespectMaxDimension")(shouldRespectMaxDimension.asInstanceOf[js.Any])
    if (zoomImage != null) __obj.updateDynamic("zoomImage")(zoomImage.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ImageZoomProps
}

