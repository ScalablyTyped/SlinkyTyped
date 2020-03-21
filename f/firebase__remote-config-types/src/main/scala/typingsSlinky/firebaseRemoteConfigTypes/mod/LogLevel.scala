package typingsSlinky.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent = this.cast("silent")
}

