package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.default
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-store`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.reload
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-cache`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`force-cache`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.reload = this.cast("reload")
}

