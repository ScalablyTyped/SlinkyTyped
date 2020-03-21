package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings._empty
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-referrer`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.origin
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`strict-origin`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin`
  - typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def _empty: typingsSlinky.apolloServerEnv.apolloServerEnvStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typingsSlinky.apolloServerEnv.apolloServerEnvStrings.`unsafe-url` = this.cast("unsafe-url")
}

