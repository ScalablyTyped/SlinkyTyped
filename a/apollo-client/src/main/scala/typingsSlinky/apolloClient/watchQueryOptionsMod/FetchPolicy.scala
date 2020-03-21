package typingsSlinky.apolloClient.watchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloClient.apolloClientStrings.`cache-first`
  - typingsSlinky.apolloClient.apolloClientStrings.`network-only`
  - typingsSlinky.apolloClient.apolloClientStrings.`cache-only`
  - typingsSlinky.apolloClient.apolloClientStrings.`no-cache`
  - typingsSlinky.apolloClient.apolloClientStrings.standby
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  def `cache-first`: typingsSlinky.apolloClient.apolloClientStrings.`cache-first` = this.cast("cache-first")
  @scala.inline
  def `cache-only`: typingsSlinky.apolloClient.apolloClientStrings.`cache-only` = this.cast("cache-only")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsSlinky.apolloClient.apolloClientStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `no-cache`: typingsSlinky.apolloClient.apolloClientStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def standby: typingsSlinky.apolloClient.apolloClientStrings.standby = this.cast("standby")
}

