package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLOptionElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_option extends js.Object {
  def apply[E /* <: HTMLOptionElement */](`type`: option): ElementNode[option, E] = js.native
  def apply[E /* <: HTMLOptionElement */](`type`: option, children: Content*): ElementNode[option, E] = js.native
  def apply[E /* <: HTMLOptionElement */](`type`: option, props: Props[E], children: Content*): ElementNode[option, E] = js.native
}

