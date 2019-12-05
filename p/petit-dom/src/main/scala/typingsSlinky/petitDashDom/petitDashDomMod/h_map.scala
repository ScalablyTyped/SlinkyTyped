package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLMapElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_map extends js.Object {
  def apply[E /* <: HTMLMapElement */](`type`: map): ElementNode[map, E] = js.native
  def apply[E /* <: HTMLMapElement */](`type`: map, children: Content*): ElementNode[map, E] = js.native
  def apply[E /* <: HTMLMapElement */](`type`: map, props: Props[E], children: Content*): ElementNode[map, E] = js.native
}

