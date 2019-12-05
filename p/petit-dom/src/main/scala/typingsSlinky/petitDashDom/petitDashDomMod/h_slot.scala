package typingsSlinky.petitDashDom.petitDashDomMod

import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.slot
import typingsSlinky.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_slot extends js.Object {
  def apply[E /* <: HTMLSlotElement */](`type`: slot): ElementNode[slot, E] = js.native
  def apply[E /* <: HTMLSlotElement */](`type`: slot, children: Content*): ElementNode[slot, E] = js.native
  def apply[E /* <: HTMLSlotElement */](`type`: slot, props: Props[E], children: Content*): ElementNode[slot, E] = js.native
}

