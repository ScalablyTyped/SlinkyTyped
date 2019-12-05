package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLMenuElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_menu extends js.Object {
  def apply[E /* <: HTMLMenuElement */](`type`: menu): ElementNode[menu, E] = js.native
  def apply[E /* <: HTMLMenuElement */](`type`: menu, children: Content*): ElementNode[menu, E] = js.native
  def apply[E /* <: HTMLMenuElement */](`type`: menu, props: Props[E], children: Content*): ElementNode[menu, E] = js.native
}

