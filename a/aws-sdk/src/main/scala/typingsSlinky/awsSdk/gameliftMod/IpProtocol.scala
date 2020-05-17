package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TCP
  - typingsSlinky.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
trait IpProtocol extends js.Object

object IpProtocol {
  @scala.inline
  def TCP: typingsSlinky.awsSdk.awsSdkStrings.TCP = "TCP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP]
  @scala.inline
  def UDP: typingsSlinky.awsSdk.awsSdkStrings.UDP = "UDP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UDP]
  @scala.inline
  implicit def apply(value: String): IpProtocol = value.asInstanceOf[IpProtocol]
}

