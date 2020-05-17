package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.RAW
  - typingsSlinky.awsSdk.awsSdkStrings.DIGEST
  - java.lang.String
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def RAW: typingsSlinky.awsSdk.awsSdkStrings.RAW = "RAW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RAW]
  @scala.inline
  def DIGEST: typingsSlinky.awsSdk.awsSdkStrings.DIGEST = "DIGEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DIGEST]
  @scala.inline
  implicit def apply(value: String): MessageType = value.asInstanceOf[MessageType]
}

