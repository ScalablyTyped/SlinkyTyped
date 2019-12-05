package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLTableDataCellElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.td
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_td extends js.Object {
  def apply[E /* <: HTMLTableDataCellElement */](`type`: td): ElementNode[td, E] = js.native
  def apply[E /* <: HTMLTableDataCellElement */](`type`: td, children: Content*): ElementNode[td, E] = js.native
  def apply[E /* <: HTMLTableDataCellElement */](`type`: td, props: Props[E], children: Content*): ElementNode[td, E] = js.native
}

