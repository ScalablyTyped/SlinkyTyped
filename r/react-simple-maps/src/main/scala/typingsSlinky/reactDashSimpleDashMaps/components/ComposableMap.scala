package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGDefsElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ComposableMapProps
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ProjectionConfig
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ProjectionFunction
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComposableMap
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ComposableMap
    ] {
  @JSImport("react-simple-maps", "ComposableMap")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    defs: SVGDefsElement = null,
    height: Int | Double = null,
    preserveAspectRatio: String = null,
    projection: String | ProjectionFunction = null,
    projectionConfig: Partial[ProjectionConfig] = null,
    showCenter: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    viewBox: String = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ComposableMap
  ] = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionConfig != null) __obj.updateDynamic("projectionConfig")(projectionConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(showCenter)) __obj.updateDynamic("showCenter")(showCenter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ComposableMapProps
}

