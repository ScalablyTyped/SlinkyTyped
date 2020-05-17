package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.USER
  - typingsSlinky.awsSdk.awsSdkStrings.ROLE
  - typingsSlinky.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
trait PrincipalType extends js.Object

object PrincipalType {
  @scala.inline
  def USER: typingsSlinky.awsSdk.awsSdkStrings.USER = "USER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USER]
  @scala.inline
  def ROLE: typingsSlinky.awsSdk.awsSdkStrings.ROLE = "ROLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROLE]
  @scala.inline
  def GROUP: typingsSlinky.awsSdk.awsSdkStrings.GROUP = "GROUP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GROUP]
  @scala.inline
  implicit def apply(value: String): PrincipalType = value.asInstanceOf[PrincipalType]
}

