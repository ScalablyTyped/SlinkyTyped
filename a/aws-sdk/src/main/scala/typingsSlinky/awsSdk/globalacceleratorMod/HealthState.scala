package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INITIAL
  - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
  - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
trait HealthState extends js.Object

object HealthState {
  @scala.inline
  def INITIAL: typingsSlinky.awsSdk.awsSdkStrings.INITIAL = "INITIAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIAL]
  @scala.inline
  def HEALTHY: typingsSlinky.awsSdk.awsSdkStrings.HEALTHY = "HEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEALTHY]
  @scala.inline
  def UNHEALTHY: typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY = "UNHEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY]
  @scala.inline
  implicit def apply(value: String): HealthState = value.asInstanceOf[HealthState]
}

