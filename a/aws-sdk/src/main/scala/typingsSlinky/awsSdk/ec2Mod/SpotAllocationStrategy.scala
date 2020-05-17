package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`lowest-price`
  - typingsSlinky.awsSdk.awsSdkStrings.diversified
  - typingsSlinky.awsSdk.awsSdkStrings.`capacity-optimized`
  - java.lang.String
*/
trait SpotAllocationStrategy extends js.Object

object SpotAllocationStrategy {
  @scala.inline
  def `lowest-price`: typingsSlinky.awsSdk.awsSdkStrings.`lowest-price` = "lowest-price".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`lowest-price`]
  @scala.inline
  def diversified: typingsSlinky.awsSdk.awsSdkStrings.diversified = "diversified".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.diversified]
  @scala.inline
  def `capacity-optimized`: typingsSlinky.awsSdk.awsSdkStrings.`capacity-optimized` = "capacity-optimized".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`capacity-optimized`]
  @scala.inline
  implicit def apply(value: java.lang.String): SpotAllocationStrategy = value.asInstanceOf[SpotAllocationStrategy]
}

