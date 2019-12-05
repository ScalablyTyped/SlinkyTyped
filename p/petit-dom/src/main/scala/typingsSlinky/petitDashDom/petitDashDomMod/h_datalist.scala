package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLDataListElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.datalist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_datalist extends js.Object {
  def apply[E /* <: HTMLDataListElement */](`type`: datalist): ElementNode[datalist, E] = js.native
  def apply[E /* <: HTMLDataListElement */](`type`: datalist, children: Content*): ElementNode[datalist, E] = js.native
  def apply[E /* <: HTMLDataListElement */](`type`: datalist, props: Props[E], children: Content*): ElementNode[datalist, E] = js.native
}

