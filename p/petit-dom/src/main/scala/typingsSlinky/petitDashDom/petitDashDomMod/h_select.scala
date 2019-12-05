package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLSelectElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_select extends js.Object {
  def apply[E /* <: HTMLSelectElement */](`type`: select): ElementNode[select, E] = js.native
  def apply[E /* <: HTMLSelectElement */](`type`: select, children: Content*): ElementNode[select, E] = js.native
  def apply[E /* <: HTMLSelectElement */](`type`: select, props: Props[E], children: Content*): ElementNode[select, E] = js.native
}

