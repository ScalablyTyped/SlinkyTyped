package typingsSlinky.reactContentLoader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.reactContentLoader.mod.IContentLoaderProps
import typingsSlinky.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IContentLoaderProps_734572896 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    SVGAttributes: SVGAttributes[SVGElement] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    baseUrl: String = null,
    gradientRatio: Int | Double = null,
    interval: Int | Double = null,
    primaryColor: String = null,
    primaryOpacity: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null,
    secondaryOpacity: Int | Double = null,
    speed: Int | Double = null,
    uniquekey: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (gradientRatio != null) __obj.updateDynamic("gradientRatio")(gradientRatio.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (primaryOpacity != null) __obj.updateDynamic("primaryOpacity")(primaryOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryOpacity != null) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IContentLoaderProps
}

