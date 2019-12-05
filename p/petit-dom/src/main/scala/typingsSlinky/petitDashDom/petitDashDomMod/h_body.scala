package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLBodyElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_body extends js.Object {
  def apply[E /* <: HTMLBodyElement */](`type`: body): ElementNode[body, E] = js.native
  def apply[E /* <: HTMLBodyElement */](`type`: body, children: Content*): ElementNode[body, E] = js.native
  def apply[E /* <: HTMLBodyElement */](`type`: body, props: Props[E], children: Content*): ElementNode[body, E] = js.native
}

