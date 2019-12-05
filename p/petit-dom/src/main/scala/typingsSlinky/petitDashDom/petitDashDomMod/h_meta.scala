package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLMetaElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.meta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_meta extends js.Object {
  def apply[E /* <: HTMLMetaElement */](`type`: meta): ElementNode[meta, E] = js.native
  def apply[E /* <: HTMLMetaElement */](`type`: meta, children: Content*): ElementNode[meta, E] = js.native
  def apply[E /* <: HTMLMetaElement */](`type`: meta, props: Props[E], children: Content*): ElementNode[meta, E] = js.native
}

