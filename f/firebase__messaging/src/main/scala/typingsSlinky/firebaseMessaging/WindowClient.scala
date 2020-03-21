package typingsSlinky.firebaseMessaging

import org.scalajs.dom.raw.VisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowClient extends Client {
  val focused: Boolean = js.native
  val visibilityState: VisibilityState = js.native
  def focus(): js.Promise[WindowClient] = js.native
  def navigate(url: String): js.Promise[WindowClient] = js.native
}

