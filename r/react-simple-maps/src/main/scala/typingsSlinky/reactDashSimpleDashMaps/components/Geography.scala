package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGPathElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoProjection
import typingsSlinky.reactDashSimpleDashMaps.Anon_Default
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.GeographyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Geography
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Geography
    ] {
  @JSImport("react-simple-maps", "Geography")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    cacheId: Double | String = null,
    geography: js.Object = null,
    onBlur: (/* geography */ js.Object, /* evt */ SyntheticFocusEvent[SVGPathElement]) => Unit = null,
    onClick: (/* geography */ js.Object, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onFocus: (/* geography */ js.Object, /* evt */ SyntheticFocusEvent[SVGPathElement]) => Unit = null,
    onMouseDown: (/* geography */ js.Object, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseEnter: (/* geography */ js.Object, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseLeave: (/* geography */ js.Object, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseMove: (/* geography */ js.Object, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseUp: (/* geography */ js.Object, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    precision: Int | Double = null,
    projection: GeoProjection = null,
    round: js.UndefOr[Boolean] = js.undefined,
    style: Anon_Default = null,
    tabable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Geography
  ] = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GeographyProps
}

