package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AES256
  - typingsSlinky.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
trait SSEType extends js.Object

object SSEType {
  @scala.inline
  def AES256: typingsSlinky.awsSdk.awsSdkStrings.AES256 = "AES256".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES256]
  @scala.inline
  def KMS: typingsSlinky.awsSdk.awsSdkStrings.KMS = "KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KMS]
  @scala.inline
  implicit def apply(value: java.lang.String): SSEType = value.asInstanceOf[SSEType]
}

