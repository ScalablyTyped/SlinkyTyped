package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLHtmlElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_html extends js.Object {
  def apply[E /* <: HTMLHtmlElement */](`type`: html): ElementNode[html, E] = js.native
  def apply[E /* <: HTMLHtmlElement */](`type`: html, children: Content*): ElementNode[html, E] = js.native
  def apply[E /* <: HTMLHtmlElement */](`type`: html, props: Props[E], children: Content*): ElementNode[html, E] = js.native
}

