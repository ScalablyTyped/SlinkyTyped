package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.tcp_
  - typingsSlinky.awsSdk.awsSdkStrings.udp_
  - java.lang.String
*/
trait TransportProtocol extends js.Object

object TransportProtocol {
  @scala.inline
  def tcp_ : typingsSlinky.awsSdk.awsSdkStrings.tcp_ = "tcp".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.tcp_]
  @scala.inline
  def udp_ : typingsSlinky.awsSdk.awsSdkStrings.udp_ = "udp".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.udp_]
  @scala.inline
  implicit def apply(value: java.lang.String): TransportProtocol = value.asInstanceOf[TransportProtocol]
}

