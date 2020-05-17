package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.String_
  - typingsSlinky.awsSdk.awsSdkStrings.StringList
  - typingsSlinky.awsSdk.awsSdkStrings.SecureString
  - java.lang.String
*/
trait ParameterType extends js.Object

object ParameterType {
  @scala.inline
  def String_ : typingsSlinky.awsSdk.awsSdkStrings.String_ = "String".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.String_]
  @scala.inline
  def StringList: typingsSlinky.awsSdk.awsSdkStrings.StringList = "StringList".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.StringList]
  @scala.inline
  def SecureString: typingsSlinky.awsSdk.awsSdkStrings.SecureString = "SecureString".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SecureString]
  @scala.inline
  implicit def apply(value: java.lang.String): ParameterType = value.asInstanceOf[ParameterType]
}

