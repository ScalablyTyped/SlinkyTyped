package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VIEWER
  - typingsSlinky.awsSdk.awsSdkStrings.CONTRIBUTOR
  - typingsSlinky.awsSdk.awsSdkStrings.OWNER
  - typingsSlinky.awsSdk.awsSdkStrings.COOWNER
  - java.lang.String
*/
trait RoleType extends js.Object

object RoleType {
  @scala.inline
  def VIEWER: typingsSlinky.awsSdk.awsSdkStrings.VIEWER = "VIEWER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VIEWER]
  @scala.inline
  def CONTRIBUTOR: typingsSlinky.awsSdk.awsSdkStrings.CONTRIBUTOR = "CONTRIBUTOR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONTRIBUTOR]
  @scala.inline
  def OWNER: typingsSlinky.awsSdk.awsSdkStrings.OWNER = "OWNER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OWNER]
  @scala.inline
  def COOWNER: typingsSlinky.awsSdk.awsSdkStrings.COOWNER = "COOWNER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COOWNER]
  @scala.inline
  implicit def apply(value: String): RoleType = value.asInstanceOf[RoleType]
}

