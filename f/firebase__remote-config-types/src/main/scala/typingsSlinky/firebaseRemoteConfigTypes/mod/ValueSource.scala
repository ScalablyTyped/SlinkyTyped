package typingsSlinky.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote
*/
trait ValueSource extends js.Object

object ValueSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default = this.cast("default")
  @scala.inline
  def remote: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote = this.cast("remote")
  @scala.inline
  def static: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static = this.cast("static")
}

