package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLFontElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_font extends js.Object {
  def apply[E /* <: HTMLFontElement */](`type`: font): ElementNode[font, E] = js.native
  def apply[E /* <: HTMLFontElement */](`type`: font, children: Content*): ElementNode[font, E] = js.native
  def apply[E /* <: HTMLFontElement */](`type`: font, props: Props[E], children: Content*): ElementNode[font, E] = js.native
}

