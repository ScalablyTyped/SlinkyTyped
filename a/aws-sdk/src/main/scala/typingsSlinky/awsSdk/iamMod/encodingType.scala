package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SSH
  - typingsSlinky.awsSdk.awsSdkStrings.PEM
  - java.lang.String
*/
trait encodingType extends js.Object

object encodingType {
  @scala.inline
  def SSH: typingsSlinky.awsSdk.awsSdkStrings.SSH = "SSH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSH]
  @scala.inline
  def PEM: typingsSlinky.awsSdk.awsSdkStrings.PEM = "PEM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PEM]
  @scala.inline
  implicit def apply(value: String): encodingType = value.asInstanceOf[encodingType]
}

