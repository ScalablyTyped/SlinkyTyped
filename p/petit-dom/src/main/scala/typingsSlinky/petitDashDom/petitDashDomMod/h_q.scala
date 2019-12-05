package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLQuoteElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_q extends js.Object {
  def apply[E /* <: HTMLQuoteElement */](`type`: q): ElementNode[q, E] = js.native
  def apply[E /* <: HTMLQuoteElement */](`type`: q, children: Content*): ElementNode[q, E] = js.native
  def apply[E /* <: HTMLQuoteElement */](`type`: q, props: Props[E], children: Content*): ElementNode[q, E] = js.native
}

