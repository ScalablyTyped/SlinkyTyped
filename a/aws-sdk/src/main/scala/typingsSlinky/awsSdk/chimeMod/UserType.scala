package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PrivateUser
  - typingsSlinky.awsSdk.awsSdkStrings.SharedDevice
  - java.lang.String
*/
trait UserType extends js.Object

object UserType {
  @scala.inline
  def PrivateUser: typingsSlinky.awsSdk.awsSdkStrings.PrivateUser = "PrivateUser".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PrivateUser]
  @scala.inline
  def SharedDevice: typingsSlinky.awsSdk.awsSdkStrings.SharedDevice = "SharedDevice".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SharedDevice]
  @scala.inline
  implicit def apply(value: java.lang.String): UserType = value.asInstanceOf[UserType]
}

