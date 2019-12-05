package typingsSlinky.petitDashDom.petitDashDomMod

import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.data
import typingsSlinky.std.HTMLDataElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_data extends js.Object {
  def apply[E /* <: HTMLDataElement */](`type`: data): ElementNode[data, E] = js.native
  def apply[E /* <: HTMLDataElement */](`type`: data, children: Content*): ElementNode[data, E] = js.native
  def apply[E /* <: HTMLDataElement */](`type`: data, props: Props[E], children: Content*): ElementNode[data, E] = js.native
}

