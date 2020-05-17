package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.USER
  - typingsSlinky.awsSdk.awsSdkStrings.GROUP
  - typingsSlinky.awsSdk.awsSdkStrings.INVITE
  - typingsSlinky.awsSdk.awsSdkStrings.ANONYMOUS
  - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
trait PrincipalType extends js.Object

object PrincipalType {
  @scala.inline
  def USER: typingsSlinky.awsSdk.awsSdkStrings.USER = "USER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USER]
  @scala.inline
  def GROUP: typingsSlinky.awsSdk.awsSdkStrings.GROUP = "GROUP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GROUP]
  @scala.inline
  def INVITE: typingsSlinky.awsSdk.awsSdkStrings.INVITE = "INVITE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INVITE]
  @scala.inline
  def ANONYMOUS: typingsSlinky.awsSdk.awsSdkStrings.ANONYMOUS = "ANONYMOUS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ANONYMOUS]
  @scala.inline
  def ORGANIZATION: typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION = "ORGANIZATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION]
  @scala.inline
  implicit def apply(value: String): PrincipalType = value.asInstanceOf[PrincipalType]
}

