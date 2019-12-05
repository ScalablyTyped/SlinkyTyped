package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLMarqueeElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.marquee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_marquee extends js.Object {
  def apply[E /* <: HTMLMarqueeElement */](`type`: marquee): ElementNode[marquee, E] = js.native
  def apply[E /* <: HTMLMarqueeElement */](`type`: marquee, children: Content*): ElementNode[marquee, E] = js.native
  def apply[E /* <: HTMLMarqueeElement */](`type`: marquee, props: Props[E], children: Content*): ElementNode[marquee, E] = js.native
}

