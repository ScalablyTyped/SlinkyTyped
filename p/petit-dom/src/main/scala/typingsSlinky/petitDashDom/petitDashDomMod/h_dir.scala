package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLDirectoryElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.dir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dir extends js.Object {
  def apply[E /* <: HTMLDirectoryElement */](`type`: dir): ElementNode[dir, E] = js.native
  def apply[E /* <: HTMLDirectoryElement */](`type`: dir, children: Content*): ElementNode[dir, E] = js.native
  def apply[E /* <: HTMLDirectoryElement */](`type`: dir, props: Props[E], children: Content*): ElementNode[dir, E] = js.native
}

