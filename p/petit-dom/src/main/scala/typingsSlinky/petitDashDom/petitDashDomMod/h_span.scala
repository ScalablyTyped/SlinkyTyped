package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_span extends js.Object {
  def apply[E /* <: HTMLSpanElement */](`type`: span): ElementNode[span, E] = js.native
  def apply[E /* <: HTMLSpanElement */](`type`: span, children: Content*): ElementNode[span, E] = js.native
  def apply[E /* <: HTMLSpanElement */](`type`: span, props: Props[E], children: Content*): ElementNode[span, E] = js.native
}

