package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLScriptElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_script extends js.Object {
  def apply[E /* <: HTMLScriptElement */](`type`: script): ElementNode[script, E] = js.native
  def apply[E /* <: HTMLScriptElement */](`type`: script, children: Content*): ElementNode[script, E] = js.native
  def apply[E /* <: HTMLScriptElement */](`type`: script, props: Props[E], children: Content*): ElementNode[script, E] = js.native
}

