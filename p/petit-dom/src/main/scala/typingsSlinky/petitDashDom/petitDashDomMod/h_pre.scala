package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLPreElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.pre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_pre extends js.Object {
  def apply[E /* <: HTMLPreElement */](`type`: pre): ElementNode[pre, E] = js.native
  def apply[E /* <: HTMLPreElement */](`type`: pre, children: Content*): ElementNode[pre, E] = js.native
  def apply[E /* <: HTMLPreElement */](`type`: pre, props: Props[E], children: Content*): ElementNode[pre, E] = js.native
}

