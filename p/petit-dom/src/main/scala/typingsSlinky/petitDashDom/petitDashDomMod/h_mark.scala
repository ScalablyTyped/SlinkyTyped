package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_mark extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: mark): ElementNode[mark, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: mark, children: Content*): ElementNode[mark, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: mark, props: Props[E], children: Content*): ElementNode[mark, E] = js.native
}

