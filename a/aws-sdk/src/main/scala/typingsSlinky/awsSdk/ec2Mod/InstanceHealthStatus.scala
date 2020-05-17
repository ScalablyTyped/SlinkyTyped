package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.healthy__
  - typingsSlinky.awsSdk.awsSdkStrings.unhealthy__
  - java.lang.String
*/
trait InstanceHealthStatus extends js.Object

object InstanceHealthStatus {
  @scala.inline
  def healthy__ : typingsSlinky.awsSdk.awsSdkStrings.healthy__ = "healthy".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.healthy__]
  @scala.inline
  def unhealthy__ : typingsSlinky.awsSdk.awsSdkStrings.unhealthy__ = "unhealthy".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.unhealthy__]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceHealthStatus = value.asInstanceOf[InstanceHealthStatus]
}

