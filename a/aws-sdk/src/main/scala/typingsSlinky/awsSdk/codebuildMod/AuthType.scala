package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OAUTH
  - typingsSlinky.awsSdk.awsSdkStrings.BASIC_AUTH
  - typingsSlinky.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
  - java.lang.String
*/
trait AuthType extends js.Object

object AuthType {
  @scala.inline
  def OAUTH: typingsSlinky.awsSdk.awsSdkStrings.OAUTH = "OAUTH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OAUTH]
  @scala.inline
  def BASIC_AUTH: typingsSlinky.awsSdk.awsSdkStrings.BASIC_AUTH = "BASIC_AUTH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BASIC_AUTH]
  @scala.inline
  def PERSONAL_ACCESS_TOKEN: typingsSlinky.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN = "PERSONAL_ACCESS_TOKEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN]
  @scala.inline
  implicit def apply(value: java.lang.String): AuthType = value.asInstanceOf[AuthType]
}

