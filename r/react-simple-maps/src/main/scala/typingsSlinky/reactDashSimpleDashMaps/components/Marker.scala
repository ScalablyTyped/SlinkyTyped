package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGGElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSimpleDashMaps.Anon_Default
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.MarkerProps
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.MarkerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Marker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Marker] {
  @JSImport("react-simple-maps", "Marker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    marker: MarkerType = null,
    onBlur: (/* marker */ MarkerType, /* evt */ SyntheticFocusEvent[SVGGElement]) => Unit = null,
    onClick: (/* marker */ MarkerType, /* evt */ SyntheticMouseEvent[SVGGElement]) => Unit = null,
    onFocus: (/* marker */ MarkerType, /* evt */ SyntheticFocusEvent[SVGGElement]) => Unit = null,
    onMouseDown: (/* marker */ MarkerType, /* evt */ SyntheticMouseEvent[SVGGElement]) => Unit = null,
    onMouseEnter: (/* marker */ MarkerType, /* evt */ SyntheticMouseEvent[SVGGElement]) => Unit = null,
    onMouseLeave: (/* marker */ MarkerType, /* evt */ SyntheticMouseEvent[SVGGElement]) => Unit = null,
    onMouseMove: (/* marker */ MarkerType, /* evt */ SyntheticMouseEvent[SVGGElement]) => Unit = null,
    onMouseUp: (/* marker */ MarkerType, /* evt */ SyntheticMouseEvent[SVGGElement]) => Unit = null,
    preserveMarkerAspect: js.UndefOr[Boolean] = js.undefined,
    style: Anon_Default = null,
    tabable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Marker] = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (!js.isUndefined(preserveMarkerAspect)) __obj.updateDynamic("preserveMarkerAspect")(preserveMarkerAspect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabable)) __obj.updateDynamic("tabable")(tabable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MarkerProps
}

