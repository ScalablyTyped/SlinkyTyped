package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLLabelElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_label extends js.Object {
  def apply[E /* <: HTMLLabelElement */](`type`: label): ElementNode[label, E] = js.native
  def apply[E /* <: HTMLLabelElement */](`type`: label, children: Content*): ElementNode[label, E] = js.native
  def apply[E /* <: HTMLLabelElement */](`type`: label, props: Props[E], children: Content*): ElementNode[label, E] = js.native
}

