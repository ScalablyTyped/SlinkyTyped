package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLEmbedElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.embed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_embed extends js.Object {
  def apply[E /* <: HTMLEmbedElement */](`type`: embed): ElementNode[embed, E] = js.native
  def apply[E /* <: HTMLEmbedElement */](`type`: embed, children: Content*): ElementNode[embed, E] = js.native
  def apply[E /* <: HTMLEmbedElement */](`type`: embed, props: Props[E], children: Content*): ElementNode[embed, E] = js.native
}

