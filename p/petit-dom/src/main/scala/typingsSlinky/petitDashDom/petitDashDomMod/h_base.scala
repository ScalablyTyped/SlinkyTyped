package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLBaseElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_base extends js.Object {
  def apply[E /* <: HTMLBaseElement */](`type`: base): ElementNode[base, E] = js.native
  def apply[E /* <: HTMLBaseElement */](`type`: base, children: Content*): ElementNode[base, E] = js.native
  def apply[E /* <: HTMLBaseElement */](`type`: base, props: Props[E], children: Content*): ElementNode[base, E] = js.native
}

