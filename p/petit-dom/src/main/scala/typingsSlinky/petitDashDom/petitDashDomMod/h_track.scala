package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLTrackElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_track extends js.Object {
  def apply[E /* <: HTMLTrackElement */](`type`: track): ElementNode[track, E] = js.native
  def apply[E /* <: HTMLTrackElement */](`type`: track, children: Content*): ElementNode[track, E] = js.native
  def apply[E /* <: HTMLTrackElement */](`type`: track, props: Props[E], children: Content*): ElementNode[track, E] = js.native
}

