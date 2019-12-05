package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.kbd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_kbd extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: kbd): ElementNode[kbd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: kbd, children: Content*): ElementNode[kbd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: kbd, props: Props[E], children: Content*): ElementNode[kbd, E] = js.native
}

