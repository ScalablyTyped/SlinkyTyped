package typingsSlinky.reactImageCrop.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.img.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageCrop.mod.Crop
import typingsSlinky.reactImageCrop.mod.PercentCrop
import typingsSlinky.reactImageCrop.mod.ReactCropProps
import typingsSlinky.reactImageCrop.mod.^
import typingsSlinky.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsSlinky.reactImageCrop.reactImageCropStrings.anonymous
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageCrop
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    onChange: (Crop, PercentCrop) => Unit,
    src: String,
    circularCrop: js.UndefOr[Boolean] = js.undefined,
    crop: Crop = null,
    crossorigin: anonymous | `use-credentials` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    imageAlt: String = null,
    imageStyle: CSSProperties = null,
    keepSelection: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onComplete: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Unit = null,
    onDragEnd: () => Unit = null,
    onDragStart: () => Unit = null,
    onImageError: /* event */ SyntheticEvent[Event_, HTMLImageElement] => Unit = null,
    onImageLoaded: /* target */ HTMLImageElement => Unit = null,
    renderComponent: TagMod[Any] = null,
    renderSelectionAddon: /* state */ js.Any => TagMod[Any] = null,
    ruleOfThirds: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(circularCrop)) __obj.updateDynamic("circularCrop")(circularCrop.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSelection)) __obj.updateDynamic("keepSelection")(keepSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2(onComplete))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onImageError != null) __obj.updateDynamic("onImageError")(js.Any.fromFunction1(onImageError))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1(onImageLoaded))
    if (renderComponent != null) __obj.updateDynamic("renderComponent")(renderComponent.asInstanceOf[js.Any])
    if (renderSelectionAddon != null) __obj.updateDynamic("renderSelectionAddon")(js.Any.fromFunction1(renderSelectionAddon))
    if (!js.isUndefined(ruleOfThirds)) __obj.updateDynamic("ruleOfThirds")(ruleOfThirds.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactCropProps
}

