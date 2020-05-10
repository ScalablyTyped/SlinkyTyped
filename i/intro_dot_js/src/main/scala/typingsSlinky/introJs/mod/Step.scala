package typingsSlinky.introJs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.introJs.introJsStrings.`bottom-left-aligned`
import typingsSlinky.introJs.introJsStrings.`bottom-middle-aligned`
import typingsSlinky.introJs.introJsStrings.`bottom-right-aligned`
import typingsSlinky.introJs.introJsStrings.auto
import typingsSlinky.introJs.introJsStrings.bottom
import typingsSlinky.introJs.introJsStrings.element
import typingsSlinky.introJs.introJsStrings.left
import typingsSlinky.introJs.introJsStrings.off
import typingsSlinky.introJs.introJsStrings.right
import typingsSlinky.introJs.introJsStrings.tooltip
import typingsSlinky.introJs.introJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  var disableInteraction: js.UndefOr[Boolean] = js.native
  var element: js.UndefOr[String | HTMLElement | Element] = js.native
  var highlightClass: js.UndefOr[String] = js.native
  var intro: String = js.native
  var position: js.UndefOr[
    top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
  ] = js.native
  var scrollTo: js.UndefOr[off | tooltip | element] = js.native
  var tooltipClass: js.UndefOr[String] = js.native
}

object Step {
  @scala.inline
  def apply(intro: String): Step = {
    val __obj = js.Dynamic.literal(intro = intro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: String | HTMLElement | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(
      value: top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: off | tooltip | element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(js.undefined)
        ret
    }
  }
  
}

