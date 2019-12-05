package typingsSlinky.petitDashDom.petitDashDomMod

import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.template
import typingsSlinky.std.HTMLTemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_template extends js.Object {
  def apply[E /* <: HTMLTemplateElement */](`type`: template): ElementNode[template, E] = js.native
  def apply[E /* <: HTMLTemplateElement */](`type`: template, children: Content*): ElementNode[template, E] = js.native
  def apply[E /* <: HTMLTemplateElement */](`type`: template, props: Props[E], children: Content*): ElementNode[template, E] = js.native
}

