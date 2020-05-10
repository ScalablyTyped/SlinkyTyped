package typingsSlinky.makeupExpander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expander extends js.Object {
  var collapseOnClickOut: Boolean = js.native
  var collapseOnFocusOut: Boolean = js.native
  var collapseOnMouseOut: Boolean = js.native
  var expandOnClick: Boolean = js.native
  var expandOnFocus: Boolean = js.native
  var expandOnHover: Boolean = js.native
  def collapse(): Unit = js.native
  def expand(isKeyboard: Boolean): Unit = js.native
  def isExpanded(): Boolean = js.native
  def toggle(): Unit = js.native
}

object Expander {
  @scala.inline
  def apply(
    collapse: () => Unit,
    collapseOnClickOut: Boolean,
    collapseOnFocusOut: Boolean,
    collapseOnMouseOut: Boolean,
    expand: Boolean => Unit,
    expandOnClick: Boolean,
    expandOnFocus: Boolean,
    expandOnHover: Boolean,
    isExpanded: () => Boolean,
    toggle: () => Unit
  ): Expander = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), collapseOnClickOut = collapseOnClickOut.asInstanceOf[js.Any], collapseOnFocusOut = collapseOnFocusOut.asInstanceOf[js.Any], collapseOnMouseOut = collapseOnMouseOut.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), expandOnClick = expandOnClick.asInstanceOf[js.Any], expandOnFocus = expandOnFocus.asInstanceOf[js.Any], expandOnHover = expandOnHover.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Expander]
  }
  @scala.inline
  implicit class ExpanderOps[Self <: Expander] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapseOnClickOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnClickOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseOnFocusOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnFocusOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseOnMouseOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpanded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

