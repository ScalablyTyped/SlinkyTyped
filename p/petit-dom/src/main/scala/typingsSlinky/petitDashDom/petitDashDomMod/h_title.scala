package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLTitleElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_title extends js.Object {
  def apply[E /* <: HTMLTitleElement */](`type`: title): ElementNode[title, E] = js.native
  def apply[E /* <: HTMLTitleElement */](`type`: title, children: Content*): ElementNode[title, E] = js.native
  def apply[E /* <: HTMLTitleElement */](`type`: title, props: Props[E], children: Content*): ElementNode[title, E] = js.native
}

