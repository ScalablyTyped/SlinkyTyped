package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.dt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dt extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: dt): ElementNode[dt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dt, children: Content*): ElementNode[dt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dt, props: Props[E], children: Content*): ElementNode[dt, E] = js.native
}

