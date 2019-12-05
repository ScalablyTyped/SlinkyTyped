package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_canvas extends js.Object {
  def apply[E /* <: HTMLCanvasElement */](`type`: canvas): ElementNode[canvas, E] = js.native
  def apply[E /* <: HTMLCanvasElement */](`type`: canvas, children: Content*): ElementNode[canvas, E] = js.native
  def apply[E /* <: HTMLCanvasElement */](`type`: canvas, props: Props[E], children: Content*): ElementNode[canvas, E] = js.native
}

