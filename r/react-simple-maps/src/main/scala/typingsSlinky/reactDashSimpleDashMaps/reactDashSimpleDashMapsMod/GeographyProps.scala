package typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import org.scalajs.dom.raw.SVGPathElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactDashSimpleDashMaps.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGPathElement>, 'style'> ]: react.react.SVGProps<std.SVGPathElement>[P]} */ trait GeographyProps extends js.Object {
  var geography: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[SVGPathElement], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[SVGPathElement], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[SVGPathElement], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[SVGPathElement], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[SVGPathElement], Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[SVGPathElement], Unit]] = js.undefined
  var style: js.UndefOr[Anon_Default] = js.undefined
}

object GeographyProps {
  @scala.inline
  def apply(
    geography: js.Object = null,
    onBlur: /* event */ SyntheticFocusEvent[SVGPathElement] => Unit = null,
    onFocus: /* event */ SyntheticFocusEvent[SVGPathElement] => Unit = null,
    onMouseDown: /* event */ SyntheticMouseEvent[SVGPathElement] => Unit = null,
    onMouseEnter: /* event */ SyntheticMouseEvent[SVGPathElement] => Unit = null,
    onMouseLeave: /* event */ SyntheticMouseEvent[SVGPathElement] => Unit = null,
    onMouseUp: /* event */ SyntheticMouseEvent[SVGPathElement] => Unit = null,
    style: Anon_Default = null
  ): GeographyProps = {
    val __obj = js.Dynamic.literal()
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographyProps]
  }
}

