package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
  - typingsSlinky.awsSdk.awsSdkStrings.TCP
  - java.lang.String
*/
trait HealthCheckType extends js.Object

object HealthCheckType {
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  def HTTPS: typingsSlinky.awsSdk.awsSdkStrings.HTTPS = "HTTPS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTPS]
  @scala.inline
  def TCP: typingsSlinky.awsSdk.awsSdkStrings.TCP = "TCP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP]
  @scala.inline
  implicit def apply(value: String): HealthCheckType = value.asInstanceOf[HealthCheckType]
}

