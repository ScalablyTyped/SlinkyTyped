package typingsSlinky.materialUi.MaterialUI.Utils

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.materialUi.AnonLeft
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
  def offset(el: Element): AnonLeft = js.native
  def removeClass(el: Element, className: String): Unit = js.native
  def toggleClass(el: Element, className: String): Unit = js.native
  def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
}

@JSGlobal("__MaterialUI.Utils.Dom")
@js.native
object Dom extends TopLevel[Dom]

