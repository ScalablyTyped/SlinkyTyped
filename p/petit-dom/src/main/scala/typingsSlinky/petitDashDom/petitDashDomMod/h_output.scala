package typingsSlinky.petitDashDom.petitDashDomMod

import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.output
import typingsSlinky.std.HTMLOutputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_output extends js.Object {
  def apply[E /* <: HTMLOutputElement */](`type`: output): ElementNode[output, E] = js.native
  def apply[E /* <: HTMLOutputElement */](`type`: output, children: Content*): ElementNode[output, E] = js.native
  def apply[E /* <: HTMLOutputElement */](`type`: output, props: Props[E], children: Content*): ElementNode[output, E] = js.native
}

