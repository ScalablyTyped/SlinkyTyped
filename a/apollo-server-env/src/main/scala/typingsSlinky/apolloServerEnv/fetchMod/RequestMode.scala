package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.navigate
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-cors`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
}

