package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLAreaElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_area extends js.Object {
  def apply[E /* <: HTMLAreaElement */](`type`: area): ElementNode[area, E] = js.native
  def apply[E /* <: HTMLAreaElement */](`type`: area, children: Content*): ElementNode[area, E] = js.native
  def apply[E /* <: HTMLAreaElement */](`type`: area, props: Props[E], children: Content*): ElementNode[area, E] = js.native
}

