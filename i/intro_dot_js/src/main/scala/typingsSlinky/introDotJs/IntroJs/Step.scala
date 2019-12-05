package typingsSlinky.introDotJs.IntroJs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.introDotJs.introDotJsStrings.`bottom-left-aligned`
import typingsSlinky.introDotJs.introDotJsStrings.`bottom-middle-aligned`
import typingsSlinky.introDotJs.introDotJsStrings.`bottom-right-aligned`
import typingsSlinky.introDotJs.introDotJsStrings.auto
import typingsSlinky.introDotJs.introDotJsStrings.bottom
import typingsSlinky.introDotJs.introDotJsStrings.element
import typingsSlinky.introDotJs.introDotJsStrings.left
import typingsSlinky.introDotJs.introDotJsStrings.off
import typingsSlinky.introDotJs.introDotJsStrings.right
import typingsSlinky.introDotJs.introDotJsStrings.tooltip
import typingsSlinky.introDotJs.introDotJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var disableInteraction: js.UndefOr[Boolean] = js.undefined
  var element: js.UndefOr[String | HTMLElement | Element] = js.undefined
  var highlightClass: js.UndefOr[String] = js.undefined
  var intro: String
  var position: js.UndefOr[
    top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
  ] = js.undefined
  var scrollTo: js.UndefOr[off | tooltip | element] = js.undefined
  var tooltipClass: js.UndefOr[String] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    intro: String,
    disableInteraction: js.UndefOr[Boolean] = js.undefined,
    element: String | HTMLElement | Element = null,
    highlightClass: String = null,
    position: top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto = null,
    scrollTo: off | tooltip | element = null,
    tooltipClass: String = null
  ): Step = {
    val __obj = js.Dynamic.literal(intro = intro.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (highlightClass != null) __obj.updateDynamic("highlightClass")(highlightClass.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

