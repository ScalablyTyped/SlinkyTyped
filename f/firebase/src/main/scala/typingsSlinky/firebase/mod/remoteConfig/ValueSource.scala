package typingsSlinky.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.static
  - typingsSlinky.firebase.firebaseStrings.default
  - typingsSlinky.firebase.firebaseStrings.remote
*/
trait ValueSource extends js.Object

object ValueSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.firebase.firebaseStrings.default = this.cast("default")
  @scala.inline
  def remote: typingsSlinky.firebase.firebaseStrings.remote = this.cast("remote")
  @scala.inline
  def static: typingsSlinky.firebase.firebaseStrings.static = this.cast("static")
}

