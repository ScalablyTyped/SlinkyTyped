package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.b
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_b extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: b): ElementNode[b, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: b, children: Content*): ElementNode[b, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: b, props: Props[E], children: Content*): ElementNode[b, E] = js.native
}

