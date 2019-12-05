package typingsSlinky.reactDashNativeDashSvgDashUri.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageURISource
import typingsSlinky.reactDashNativeDashSvgDashUri.reactDashNativeDashSvgDashUriMod.SvgUriProps
import typingsSlinky.reactDashNativeDashSvgDashUri.reactDashNativeDashSvgDashUriMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashSvgDashUri
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-svg-uri", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: height, width */
  def apply(
    fill: String = null,
    source: ImageURISource = null,
    svgXmlData: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (svgXmlData != null) __obj.updateDynamic("svgXmlData")(svgXmlData.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SvgUriProps
}

