package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.START
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
  - java.lang.String
*/
trait ContainerCondition extends js.Object

object ContainerCondition {
  @scala.inline
  def START: typingsSlinky.awsSdk.awsSdkStrings.START = "START".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.START]
  @scala.inline
  def COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.COMPLETE = "COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETE]
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  def HEALTHY: typingsSlinky.awsSdk.awsSdkStrings.HEALTHY = "HEALTHY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEALTHY]
  @scala.inline
  implicit def apply(value: java.lang.String): ContainerCondition = value.asInstanceOf[ContainerCondition]
}

