package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.omit
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
}

