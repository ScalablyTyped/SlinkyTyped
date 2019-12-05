package typingsSlinky.reactDashSvgDashPanDashZoom

import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod.ToolbarPosition
import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.bottom
import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.center
import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.left
import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.right
import typingsSlinky.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var SVGAlignX: js.UndefOr[center | left | right] = js.undefined
  var SVGAlignY: js.UndefOr[center | top | bottom] = js.undefined
  var position: js.UndefOr[ToolbarPosition] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    SVGAlignX: center | left | right = null,
    SVGAlignY: center | top | bottom = null,
    position: ToolbarPosition = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (SVGAlignX != null) __obj.updateDynamic("SVGAlignX")(SVGAlignX.asInstanceOf[js.Any])
    if (SVGAlignY != null) __obj.updateDynamic("SVGAlignY")(SVGAlignY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

