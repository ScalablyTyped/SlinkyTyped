package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_sub extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: sub): ElementNode[sub, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: sub, children: Content*): ElementNode[sub, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: sub, props: Props[E], children: Content*): ElementNode[sub, E] = js.native
}

