package typingsSlinky.navigationReact.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.navigationReact.navigationReactStrings.add
import typingsSlinky.navigationReact.navigationReactStrings.none
import typingsSlinky.navigationReact.navigationReactStrings.replace
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps
  extends AnchorHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement] {
  /**
    * Determines the effect on browser history
    */
  var historyAction: js.UndefOr[add | replace | none] = js.native
  /**
    * Handles Link click events
    */
  var navigating: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[HTMLAnchorElement], /* link */ String, Boolean]
  ] = js.native
}

object LinkProps {
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistoryAction(value: add | replace | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyAction")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigating(value: (/* e */ SyntheticMouseEvent[HTMLAnchorElement], /* link */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNavigating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigating")(js.undefined)
        ret
    }
  }
  
}

