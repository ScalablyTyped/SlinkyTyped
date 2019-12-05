package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.li
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_li extends js.Object {
  def apply[E /* <: HTMLLIElement */](`type`: li): ElementNode[li, E] = js.native
  def apply[E /* <: HTMLLIElement */](`type`: li, children: Content*): ElementNode[li, E] = js.native
  def apply[E /* <: HTMLLIElement */](`type`: li, props: Props[E], children: Content*): ElementNode[li, E] = js.native
}

