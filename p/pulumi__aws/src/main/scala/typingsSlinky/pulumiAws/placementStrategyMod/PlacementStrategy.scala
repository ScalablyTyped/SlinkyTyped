package typingsSlinky.pulumiAws.placementStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.spread
  - typingsSlinky.pulumiAws.pulumiAwsStrings.cluster
*/
trait PlacementStrategy extends js.Object

object PlacementStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cluster: typingsSlinky.pulumiAws.pulumiAwsStrings.cluster = this.cast("cluster")
  @scala.inline
  def spread: typingsSlinky.pulumiAws.pulumiAwsStrings.spread = this.cast("spread")
}

