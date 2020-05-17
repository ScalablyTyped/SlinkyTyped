package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def PREPARING: typingsSlinky.awsSdk.awsSdkStrings.PREPARING = "PREPARING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PREPARING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  implicit def apply(value: String): Status = value.asInstanceOf[Status]
}

