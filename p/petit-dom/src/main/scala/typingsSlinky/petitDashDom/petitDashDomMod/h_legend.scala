package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLLegendElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.legend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_legend extends js.Object {
  def apply[E /* <: HTMLLegendElement */](`type`: legend): ElementNode[legend, E] = js.native
  def apply[E /* <: HTMLLegendElement */](`type`: legend, children: Content*): ElementNode[legend, E] = js.native
  def apply[E /* <: HTMLLegendElement */](`type`: legend, props: Props[E], children: Content*): ElementNode[legend, E] = js.native
}

