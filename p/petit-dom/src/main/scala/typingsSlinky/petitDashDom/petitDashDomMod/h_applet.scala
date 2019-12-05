package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLAppletElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.applet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_applet extends js.Object {
  def apply[E /* <: HTMLAppletElement */](`type`: applet): ElementNode[applet, E] = js.native
  def apply[E /* <: HTMLAppletElement */](`type`: applet, children: Content*): ElementNode[applet, E] = js.native
  def apply[E /* <: HTMLAppletElement */](`type`: applet, props: Props[E], children: Content*): ElementNode[applet, E] = js.native
}

