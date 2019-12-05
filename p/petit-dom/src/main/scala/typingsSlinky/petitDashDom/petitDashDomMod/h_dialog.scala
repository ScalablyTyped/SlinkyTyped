package typingsSlinky.petitDashDom.petitDashDomMod

import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.dialog
import typingsSlinky.std.HTMLDialogElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dialog extends js.Object {
  def apply[E /* <: HTMLDialogElement */](`type`: dialog): ElementNode[dialog, E] = js.native
  def apply[E /* <: HTMLDialogElement */](`type`: dialog, children: Content*): ElementNode[dialog, E] = js.native
  def apply[E /* <: HTMLDialogElement */](`type`: dialog, props: Props[E], children: Content*): ElementNode[dialog, E] = js.native
}

