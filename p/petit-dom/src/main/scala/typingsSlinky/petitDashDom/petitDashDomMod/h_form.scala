package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_form extends js.Object {
  def apply[E /* <: HTMLFormElement */](`type`: form): ElementNode[form, E] = js.native
  def apply[E /* <: HTMLFormElement */](`type`: form, children: Content*): ElementNode[form, E] = js.native
  def apply[E /* <: HTMLFormElement */](`type`: form, props: Props[E], children: Content*): ElementNode[form, E] = js.native
}

