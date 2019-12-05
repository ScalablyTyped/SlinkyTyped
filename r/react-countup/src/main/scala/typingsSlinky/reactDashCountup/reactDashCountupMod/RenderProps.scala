package typingsSlinky.reactDashCountup.reactDashCountupMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  var countUpRef: ReactRef[_] = js.native
  def pauseResume(): Unit = js.native
  def reset(): Unit = js.native
  def start(): Unit = js.native
  def update(): Unit = js.native
  def update(newEnd: Double): Unit = js.native
}

