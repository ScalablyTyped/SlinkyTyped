package typingsSlinky.dom4

import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends ParentNode {
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  def closest(selectors: String): Element | Null = js.native
  /**
    * Returns true if matching selectors against element’s root yields element, and false otherwise.
    */
  def matches(selectors: String): Boolean = js.native
}

object Element {
  @scala.inline
  def apply(
    append: /* repeated */ Node | String => Unit,
    children: HTMLCollection,
    closest: String => Element | Null,
    matches: String => Boolean,
    prepend: /* repeated */ Node | String => Unit
  ): Element = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), children = children.asInstanceOf[js.Any], closest = js.Any.fromFunction1(closest), matches = js.Any.fromFunction1(matches), prepend = js.Any.fromFunction1(prepend))
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosest(value: String => Element | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatches(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

