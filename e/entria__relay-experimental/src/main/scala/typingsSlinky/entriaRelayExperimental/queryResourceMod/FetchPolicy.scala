package typingsSlinky.entriaRelayExperimental.queryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only`
  - typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network`
  - typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network`
  - typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network` = this.cast("store-and-network")
  @scala.inline
  def `store-only`: typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only` = this.cast("store-only")
  @scala.inline
  def `store-or-network`: typingsSlinky.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network` = this.cast("store-or-network")
}

