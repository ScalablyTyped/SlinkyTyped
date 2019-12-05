package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.noscript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_noscript extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: noscript): ElementNode[noscript, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: noscript, children: Content*): ElementNode[noscript, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: noscript, props: Props[E], children: Content*): ElementNode[noscript, E] = js.native
}

