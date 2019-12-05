package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLFrameSetElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.frameset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_frameset extends js.Object {
  def apply[E /* <: HTMLFrameSetElement */](`type`: frameset): ElementNode[frameset, E] = js.native
  def apply[E /* <: HTMLFrameSetElement */](`type`: frameset, children: Content*): ElementNode[frameset, E] = js.native
  def apply[E /* <: HTMLFrameSetElement */](`type`: frameset, props: Props[E], children: Content*): ElementNode[frameset, E] = js.native
}

