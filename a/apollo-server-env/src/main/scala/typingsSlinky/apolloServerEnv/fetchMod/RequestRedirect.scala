package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.follow
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.error
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.error = this.cast("error")
  @scala.inline
  def follow: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.manual = this.cast("manual")
}

