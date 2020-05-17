package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
  - typingsSlinky.awsSdk.awsSdkStrings.TCP
  - typingsSlinky.awsSdk.awsSdkStrings.TLS
  - typingsSlinky.awsSdk.awsSdkStrings.UDP
  - typingsSlinky.awsSdk.awsSdkStrings.TCP_UDP
  - java.lang.String
*/
trait ProtocolEnum extends js.Object

object ProtocolEnum {
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  def HTTPS: typingsSlinky.awsSdk.awsSdkStrings.HTTPS = "HTTPS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTPS]
  @scala.inline
  def TCP: typingsSlinky.awsSdk.awsSdkStrings.TCP = "TCP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP]
  @scala.inline
  def TLS: typingsSlinky.awsSdk.awsSdkStrings.TLS = "TLS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TLS]
  @scala.inline
  def UDP: typingsSlinky.awsSdk.awsSdkStrings.UDP = "UDP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UDP]
  @scala.inline
  def TCP_UDP: typingsSlinky.awsSdk.awsSdkStrings.TCP_UDP = "TCP_UDP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP_UDP]
  @scala.inline
  implicit def apply(value: java.lang.String): ProtocolEnum = value.asInstanceOf[ProtocolEnum]
}

