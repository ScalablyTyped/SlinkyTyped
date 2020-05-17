package typingsSlinky.ol.targetMod

import typingsSlinky.ol.eventsMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target
  extends typingsSlinky.ol.disposableMod.default
     with EventTargetLike {
  def addEventListener(`type`: String, listener: Listener): Unit = js.native
  def dispatchEvent(event: String): Boolean = js.native
  def dispatchEvent(event: typingsSlinky.ol.eventMod.default): Boolean = js.native
  def getListeners(`type`: String): js.Array[Listener] = js.native
  def hasListener(): Boolean = js.native
  def hasListener(opt_type: String): Boolean = js.native
  def removeEventListener(`type`: String, listener: Listener): Unit = js.native
}

