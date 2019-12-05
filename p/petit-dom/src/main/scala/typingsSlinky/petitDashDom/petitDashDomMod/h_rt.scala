package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.rt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_rt extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: rt): ElementNode[rt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rt, children: Content*): ElementNode[rt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rt, props: Props[E], children: Content*): ElementNode[rt, E] = js.native
}

