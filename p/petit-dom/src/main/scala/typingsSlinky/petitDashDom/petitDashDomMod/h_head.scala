package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLHeadElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_head extends js.Object {
  def apply[E /* <: HTMLHeadElement */](`type`: head): ElementNode[head, E] = js.native
  def apply[E /* <: HTMLHeadElement */](`type`: head, children: Content*): ElementNode[head, E] = js.native
  def apply[E /* <: HTMLHeadElement */](`type`: head, props: Props[E], children: Content*): ElementNode[head, E] = js.native
}

