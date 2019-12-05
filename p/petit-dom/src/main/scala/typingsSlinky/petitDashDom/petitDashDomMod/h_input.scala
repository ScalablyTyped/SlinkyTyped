package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_input extends js.Object {
  def apply[E /* <: HTMLInputElement */](`type`: input): ElementNode[input, E] = js.native
  def apply[E /* <: HTMLInputElement */](`type`: input, children: Content*): ElementNode[input, E] = js.native
  def apply[E /* <: HTMLInputElement */](`type`: input, props: Props[E], children: Content*): ElementNode[input, E] = js.native
}

