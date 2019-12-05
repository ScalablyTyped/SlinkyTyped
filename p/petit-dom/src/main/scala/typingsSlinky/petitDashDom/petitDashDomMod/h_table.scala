package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLTableElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_table extends js.Object {
  def apply[E /* <: HTMLTableElement */](`type`: table): ElementNode[table, E] = js.native
  def apply[E /* <: HTMLTableElement */](`type`: table, children: Content*): ElementNode[table, E] = js.native
  def apply[E /* <: HTMLTableElement */](`type`: table, props: Props[E], children: Content*): ElementNode[table, E] = js.native
}

