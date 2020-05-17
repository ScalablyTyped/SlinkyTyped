package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`cloud-watch-logs`
  - typingsSlinky.awsSdk.awsSdkStrings.s3_
  - java.lang.String
*/
trait LogDestinationType extends js.Object

object LogDestinationType {
  @scala.inline
  def `cloud-watch-logs`: typingsSlinky.awsSdk.awsSdkStrings.`cloud-watch-logs` = "cloud-watch-logs".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`cloud-watch-logs`]
  @scala.inline
  def s3_ : typingsSlinky.awsSdk.awsSdkStrings.s3_ = "s3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.s3_]
  @scala.inline
  implicit def apply(value: java.lang.String): LogDestinationType = value.asInstanceOf[LogDestinationType]
}

