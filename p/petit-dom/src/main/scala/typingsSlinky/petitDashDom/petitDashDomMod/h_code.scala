package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_code extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: code): ElementNode[code, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: code, children: Content*): ElementNode[code, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: code, props: Props[E], children: Content*): ElementNode[code, E] = js.native
}

