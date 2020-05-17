package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
  - typingsSlinky.awsSdk.awsSdkStrings.SPOT
  - java.lang.String
*/
trait FleetType extends js.Object

object FleetType {
  @scala.inline
  def ON_DEMAND: typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND = "ON_DEMAND".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND]
  @scala.inline
  def SPOT: typingsSlinky.awsSdk.awsSdkStrings.SPOT = "SPOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SPOT]
  @scala.inline
  implicit def apply(value: String): FleetType = value.asInstanceOf[FleetType]
}

