package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TCP
  - typingsSlinky.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  def TCP: typingsSlinky.awsSdk.awsSdkStrings.TCP = "TCP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP]
  @scala.inline
  def UDP: typingsSlinky.awsSdk.awsSdkStrings.UDP = "UDP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UDP]
  @scala.inline
  implicit def apply(value: String): Protocol = value.asInstanceOf[Protocol]
}

