package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLParagraphElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.p
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_p extends js.Object {
  def apply[E /* <: HTMLParagraphElement */](`type`: p): ElementNode[p, E] = js.native
  def apply[E /* <: HTMLParagraphElement */](`type`: p, children: Content*): ElementNode[p, E] = js.native
  def apply[E /* <: HTMLParagraphElement */](`type`: p, props: Props[E], children: Content*): ElementNode[p, E] = js.native
}

