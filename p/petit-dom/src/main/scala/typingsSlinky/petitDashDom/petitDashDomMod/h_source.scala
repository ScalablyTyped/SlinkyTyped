package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLSourceElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_source extends js.Object {
  def apply[E /* <: HTMLSourceElement */](`type`: source): ElementNode[source, E] = js.native
  def apply[E /* <: HTMLSourceElement */](`type`: source, children: Content*): ElementNode[source, E] = js.native
  def apply[E /* <: HTMLSourceElement */](`type`: source, props: Props[E], children: Content*): ElementNode[source, E] = js.native
}

