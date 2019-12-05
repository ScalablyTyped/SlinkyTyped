package typingsSlinky.reactDashContentDashLoader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderMod.IContentLoaderProps
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMax meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMax slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMid meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMid slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMin meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMaxYMin slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMax meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMax slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMid meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMid slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMin meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMidYMin slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMax meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMax slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMid meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMid slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMin meet`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.`xMinYMin slice`
import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IContentLoaderProps_565519551 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    baseUrl: String = null,
    gradientRatio: Int | Double = null,
    height: Int | Double = null,
    interval: Int | Double = null,
    preserveAspectRatio: none | (`xMinYMin meet`) | (`xMidYMin meet`) | (`xMaxYMin meet`) | (`xMinYMid meet`) | (`xMidYMid meet`) | (`xMaxYMid meet`) | (`xMinYMax meet`) | (`xMidYMax meet`) | (`xMaxYMax meet`) | (`xMinYMin slice`) | (`xMidYMin slice`) | (`xMaxYMin slice`) | (`xMinYMid slice`) | (`xMidYMid slice`) | (`xMaxYMid slice`) | (`xMinYMax slice`) | (`xMidYMax slice`) | (`xMaxYMax slice`) = null,
    primaryColor: String = null,
    primaryOpacity: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null,
    secondaryOpacity: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
    uniquekey: String = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (gradientRatio != null) __obj.updateDynamic("gradientRatio")(gradientRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (primaryOpacity != null) __obj.updateDynamic("primaryOpacity")(primaryOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryOpacity != null) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IContentLoaderProps
}

