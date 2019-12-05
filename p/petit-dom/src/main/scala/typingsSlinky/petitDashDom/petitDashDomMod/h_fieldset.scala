package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLFieldSetElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.fieldset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_fieldset extends js.Object {
  def apply[E /* <: HTMLFieldSetElement */](`type`: fieldset): ElementNode[fieldset, E] = js.native
  def apply[E /* <: HTMLFieldSetElement */](`type`: fieldset, children: Content*): ElementNode[fieldset, E] = js.native
  def apply[E /* <: HTMLFieldSetElement */](`type`: fieldset, props: Props[E], children: Content*): ElementNode[fieldset, E] = js.native
}

