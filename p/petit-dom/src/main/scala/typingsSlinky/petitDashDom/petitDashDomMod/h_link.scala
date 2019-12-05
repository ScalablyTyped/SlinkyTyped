package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLLinkElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_link extends js.Object {
  def apply[E /* <: HTMLLinkElement */](`type`: link): ElementNode[link, E] = js.native
  def apply[E /* <: HTMLLinkElement */](`type`: link, children: Content*): ElementNode[link, E] = js.native
  def apply[E /* <: HTMLLinkElement */](`type`: link, props: Props[E], children: Content*): ElementNode[link, E] = js.native
}

