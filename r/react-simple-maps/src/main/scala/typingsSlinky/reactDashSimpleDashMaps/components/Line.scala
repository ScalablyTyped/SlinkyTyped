package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGPathElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSimpleDashMaps.Anon_Default
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.LineProps
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Line
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line] {
  @JSImport("react-simple-maps", "Line")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    buildPath: (/* start */ Point, /* end */ Point, /* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line) => String = null,
    line: typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line = null,
    onBlur: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticFocusEvent[SVGPathElement]) => Unit = null,
    onClick: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onFocus: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticFocusEvent[SVGPathElement]) => Unit = null,
    onMouseDown: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseEnter: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseLeave: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseMove: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    onMouseUp: (/* line */ typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line, /* evt */ SyntheticMouseEvent[SVGPathElement]) => Unit = null,
    preserveMarkerAspect: js.UndefOr[Boolean] = js.undefined,
    style: Anon_Default = null,
    tabable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Line] = {
    val __obj = js.Dynamic.literal()
    if (buildPath != null) __obj.updateDynamic("buildPath")(js.Any.fromFunction3(buildPath))
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
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
  type Props = LineProps
}

