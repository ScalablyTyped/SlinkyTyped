package typingsSlinky.materialRipple

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.materialRipple.anon.Passive
import typingsSlinky.materialRipple.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def applyPassive(): Boolean | Passive = js.native
  def applyPassive(globalObj: Window): Boolean | Passive = js.native
  def applyPassive(globalObj: Window, forceRefresh: Boolean): Boolean | Passive = js.native
  def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
  def getNormalizedEventCoords(ev: Event, pageOffset: X, clientRect: ClientRect): X = js.native
  def supportsCssVariables(windowObj: Window): js.UndefOr[Boolean] = js.native
  def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
}

