package typingsSlinky.atPulumiAws.ec2PlacementStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.spread
  - typings.atPulumiAws.atPulumiAwsStrings.cluster
*/
trait PlacementStrategy extends js.Object

object PlacementStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cluster: typingsSlinky.atPulumiAws.atPulumiAwsStrings.cluster = this.cast("cluster")
  @scala.inline
  def spread: typingsSlinky.atPulumiAws.atPulumiAwsStrings.spread = this.cast("spread")
}

