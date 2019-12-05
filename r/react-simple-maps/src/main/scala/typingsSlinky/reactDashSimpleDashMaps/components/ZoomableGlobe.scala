package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Point
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ZoomableGlobeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ZoomableGlobe
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ZoomableGlobe
    ] {
  @JSImport("react-simple-maps", "ZoomableGlobe")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    center: Point = null,
    disablePanning: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onMoveEnd: /* newCenter */ Point => Unit = null,
    onMoveStart: /* currentCenter */ Point => Unit = null,
    sensitivity: Int | Double = null,
    style: CSSProperties = null,
    width: Int | Double = null,
    zoom: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.ZoomableGlobe
  ] = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction1(onMoveEnd))
    if (onMoveStart != null) __obj.updateDynamic("onMoveStart")(js.Any.fromFunction1(onMoveStart))
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ZoomableGlobeProps
}

