package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLStyleElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_style extends js.Object {
  def apply[E /* <: HTMLStyleElement */](`type`: style): ElementNode[style, E] = js.native
  def apply[E /* <: HTMLStyleElement */](`type`: style, children: Content*): ElementNode[style, E] = js.native
  def apply[E /* <: HTMLStyleElement */](`type`: style, props: Props[E], children: Content*): ElementNode[style, E] = js.native
}

