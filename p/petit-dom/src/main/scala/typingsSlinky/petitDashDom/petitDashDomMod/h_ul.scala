package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.ul
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_ul extends js.Object {
  def apply[E /* <: HTMLUListElement */](`type`: ul): ElementNode[ul, E] = js.native
  def apply[E /* <: HTMLUListElement */](`type`: ul, children: Content*): ElementNode[ul, E] = js.native
  def apply[E /* <: HTMLUListElement */](`type`: ul, props: Props[E], children: Content*): ElementNode[ul, E] = js.native
}

