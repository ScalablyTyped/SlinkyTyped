package typingsSlinky.materialUi.MaterialUI.Utils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.materialUi.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom extends js.Object {
  def addClass(el: Element, className: String): Unit = js.native
  def forceRedraw(el: HTMLElement): Unit = js.native
  def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double = js.native
  def hasClass(el: Element, className: String): Boolean = js.native
  def isDescendant(parent: Node, child: Node): Boolean = js.native
  def offset(el: Element): Left = js.native
  def removeClass(el: Element, className: String): Unit = js.native
  def toggleClass(el: Element, className: String): Unit = js.native
  def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
}

object Dom {
  @scala.inline
  def apply(
    addClass: (Element, String) => Unit,
    forceRedraw: HTMLElement => Unit,
    getStyleAttributeAsNumber: (HTMLElement, String) => Double,
    hasClass: (Element, String) => Boolean,
    isDescendant: (Node, Node) => Boolean,
    offset: Element => Left,
    removeClass: (Element, String) => Unit,
    toggleClass: (Element, String) => Unit,
    withoutTransition: (HTMLElement, js.Function0[Unit]) => Unit
  ): Dom = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), forceRedraw = js.Any.fromFunction1(forceRedraw), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2(removeClass), toggleClass = js.Any.fromFunction2(toggleClass), withoutTransition = js.Any.fromFunction2(withoutTransition))
    __obj.asInstanceOf[Dom]
  }
  @scala.inline
  implicit class DomOps[Self <: Dom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: (Element, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForceRedraw(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRedraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStyleAttributeAsNumber(value: (HTMLElement, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleAttributeAsNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasClass(value: (Element, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsDescendant(value: (Node, Node) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDescendant")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOffset(value: Element => Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: (Element, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToggleClass(value: (Element, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWithoutTransition(value: (HTMLElement, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTransition")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

