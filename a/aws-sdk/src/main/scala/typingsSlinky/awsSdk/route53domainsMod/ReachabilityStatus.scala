package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.DONE
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
trait ReachabilityStatus extends js.Object

object ReachabilityStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def DONE: typingsSlinky.awsSdk.awsSdkStrings.DONE = "DONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DONE]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  implicit def apply(value: java.lang.String): ReachabilityStatus = value.asInstanceOf[ReachabilityStatus]
}

