package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TCP
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
  - java.lang.String
*/
trait HealthCheckProtocol extends js.Object

object HealthCheckProtocol {
  @scala.inline
  def TCP: typingsSlinky.awsSdk.awsSdkStrings.TCP = "TCP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP]
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  def HTTPS: typingsSlinky.awsSdk.awsSdkStrings.HTTPS = "HTTPS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTPS]
  @scala.inline
  implicit def apply(value: String): HealthCheckProtocol = value.asInstanceOf[HealthCheckProtocol]
}

