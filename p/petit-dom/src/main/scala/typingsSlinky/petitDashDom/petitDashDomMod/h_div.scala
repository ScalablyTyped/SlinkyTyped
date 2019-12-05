package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_div extends js.Object {
  def apply[E /* <: HTMLDivElement */](`type`: div): ElementNode[div, E] = js.native
  def apply[E /* <: HTMLDivElement */](`type`: div, children: Content*): ElementNode[div, E] = js.native
  def apply[E /* <: HTMLDivElement */](`type`: div, props: Props[E], children: Content*): ElementNode[div, E] = js.native
}

