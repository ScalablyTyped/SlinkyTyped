package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.lowestPrice
  - typingsSlinky.awsSdk.awsSdkStrings.diversified
  - typingsSlinky.awsSdk.awsSdkStrings.capacityOptimized
  - java.lang.String
*/
trait AllocationStrategy extends js.Object

object AllocationStrategy {
  @scala.inline
  def lowestPrice: typingsSlinky.awsSdk.awsSdkStrings.lowestPrice = "lowestPrice".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.lowestPrice]
  @scala.inline
  def diversified: typingsSlinky.awsSdk.awsSdkStrings.diversified = "diversified".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.diversified]
  @scala.inline
  def capacityOptimized: typingsSlinky.awsSdk.awsSdkStrings.capacityOptimized = "capacityOptimized".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.capacityOptimized]
  @scala.inline
  implicit def apply(value: java.lang.String): AllocationStrategy = value.asInstanceOf[AllocationStrategy]
}

