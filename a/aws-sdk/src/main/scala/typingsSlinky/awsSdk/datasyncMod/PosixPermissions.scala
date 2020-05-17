package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
trait PosixPermissions extends js.Object

object PosixPermissions {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def PRESERVE: typingsSlinky.awsSdk.awsSdkStrings.PRESERVE = "PRESERVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRESERVE]
  @scala.inline
  implicit def apply(value: String): PosixPermissions = value.asInstanceOf[PosixPermissions]
}

