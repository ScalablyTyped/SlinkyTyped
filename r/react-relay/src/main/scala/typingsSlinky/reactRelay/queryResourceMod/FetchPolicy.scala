package typingsSlinky.reactRelay.queryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRelay.reactRelayStrings.`store-only`
  - typingsSlinky.reactRelay.reactRelayStrings.`store-or-network`
  - typingsSlinky.reactRelay.reactRelayStrings.`store-and-network`
  - typingsSlinky.reactRelay.reactRelayStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsSlinky.reactRelay.reactRelayStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typingsSlinky.reactRelay.reactRelayStrings.`store-and-network` = this.cast("store-and-network")
  @scala.inline
  def `store-only`: typingsSlinky.reactRelay.reactRelayStrings.`store-only` = this.cast("store-only")
  @scala.inline
  def `store-or-network`: typingsSlinky.reactRelay.reactRelayStrings.`store-or-network` = this.cast("store-or-network")
}

