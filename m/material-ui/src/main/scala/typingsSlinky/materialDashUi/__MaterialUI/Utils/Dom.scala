package typingsSlinky.materialDashUi.__MaterialUI.Utils

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.materialDashUi.Anon_Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: Element, className: String): Unit
  def forceRedraw(el: HTMLElement): Unit
  def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double
  def hasClass(el: Element, className: String): Boolean
  def isDescendant(parent: Node, child: Node): Boolean
  def offset(el: Element): Anon_Left
  def removeClass(el: Element, className: String): Unit
  def toggleClass(el: Element, className: String): Unit
  def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit
}

@JSGlobal("__MaterialUI.Utils.Dom")
@js.native
object Dom extends TopLevel[Dom]

