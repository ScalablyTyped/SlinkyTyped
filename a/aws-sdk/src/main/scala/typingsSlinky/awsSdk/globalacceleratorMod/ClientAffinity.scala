package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_IP
  - java.lang.String
*/
trait ClientAffinity extends js.Object

object ClientAffinity {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def SOURCE_IP: typingsSlinky.awsSdk.awsSdkStrings.SOURCE_IP = "SOURCE_IP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SOURCE_IP]
  @scala.inline
  implicit def apply(value: String): ClientAffinity = value.asInstanceOf[ClientAffinity]
}

