package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_u extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: u): ElementNode[u, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: u, children: Content*): ElementNode[u, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: u, props: Props[E], children: Content*): ElementNode[u, E] = js.native
}

