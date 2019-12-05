package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLFrameElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_frame extends js.Object {
  def apply[E /* <: HTMLFrameElement */](`type`: frame): ElementNode[frame, E] = js.native
  def apply[E /* <: HTMLFrameElement */](`type`: frame, children: Content*): ElementNode[frame, E] = js.native
  def apply[E /* <: HTMLFrameElement */](`type`: frame, props: Props[E], children: Content*): ElementNode[frame, E] = js.native
}

