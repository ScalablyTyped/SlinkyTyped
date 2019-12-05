package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_s extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: s): ElementNode[s, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: s, children: Content*): ElementNode[s, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: s, props: Props[E], children: Content*): ElementNode[s, E] = js.native
}

