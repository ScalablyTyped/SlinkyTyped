package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_textarea extends js.Object {
  def apply[E /* <: HTMLTextAreaElement */](`type`: textarea): ElementNode[textarea, E] = js.native
  def apply[E /* <: HTMLTextAreaElement */](`type`: textarea, children: Content*): ElementNode[textarea, E] = js.native
  def apply[E /* <: HTMLTextAreaElement */](`type`: textarea, props: Props[E], children: Content*): ElementNode[textarea, E] = js.native
}

