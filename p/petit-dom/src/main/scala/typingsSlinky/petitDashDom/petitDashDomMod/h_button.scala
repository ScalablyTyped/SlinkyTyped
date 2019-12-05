package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_button extends js.Object {
  def apply[E /* <: HTMLButtonElement */](`type`: button): ElementNode[button, E] = js.native
  def apply[E /* <: HTMLButtonElement */](`type`: button, children: Content*): ElementNode[button, E] = js.native
  def apply[E /* <: HTMLButtonElement */](`type`: button, props: Props[E], children: Content*): ElementNode[button, E] = js.native
}

