package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.imageItemMod.ImageItemProps
import typingsSlinky.antDesignReactNative.imageItemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImageItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: selected */
  def apply(
    imageMargin: Double,
    imagesPerRow: Double,
    containerWidth: Int | Double = null,
    item: js.Any = null,
    onPress: /* repeated */ js.Any => _ = null,
    selectedMarker: ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ImageItemProps
}

