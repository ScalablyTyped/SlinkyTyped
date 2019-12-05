package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.i
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_i extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: i): ElementNode[i, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: i, children: Content*): ElementNode[i, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: i, props: Props[E], children: Content*): ElementNode[i, E] = js.native
}

