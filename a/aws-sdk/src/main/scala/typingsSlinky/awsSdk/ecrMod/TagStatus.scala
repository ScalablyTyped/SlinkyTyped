package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TAGGED
  - typingsSlinky.awsSdk.awsSdkStrings.UNTAGGED
  - typingsSlinky.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
trait TagStatus extends js.Object

object TagStatus {
  @scala.inline
  def TAGGED: typingsSlinky.awsSdk.awsSdkStrings.TAGGED = "TAGGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TAGGED]
  @scala.inline
  def UNTAGGED: typingsSlinky.awsSdk.awsSdkStrings.UNTAGGED = "UNTAGGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNTAGGED]
  @scala.inline
  def ANY: typingsSlinky.awsSdk.awsSdkStrings.ANY = "ANY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ANY]
  @scala.inline
  implicit def apply(value: String): TagStatus = value.asInstanceOf[TagStatus]
}

