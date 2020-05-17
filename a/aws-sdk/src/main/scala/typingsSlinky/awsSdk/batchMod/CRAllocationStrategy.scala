package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT
  - typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE
  - typingsSlinky.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED
  - java.lang.String
*/
trait CRAllocationStrategy extends js.Object

object CRAllocationStrategy {
  @scala.inline
  def BEST_FIT: typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT = "BEST_FIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT]
  @scala.inline
  def BEST_FIT_PROGRESSIVE: typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE = "BEST_FIT_PROGRESSIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE]
  @scala.inline
  def SPOT_CAPACITY_OPTIMIZED: typingsSlinky.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED = "SPOT_CAPACITY_OPTIMIZED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED]
  @scala.inline
  implicit def apply(value: java.lang.String): CRAllocationStrategy = value.asInstanceOf[CRAllocationStrategy]
}

