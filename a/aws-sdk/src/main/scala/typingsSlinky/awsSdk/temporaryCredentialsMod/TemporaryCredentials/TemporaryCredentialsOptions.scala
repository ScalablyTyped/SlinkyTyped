package typingsSlinky.awsSdk.temporaryCredentialsMod.TemporaryCredentials

import typingsSlinky.awsSdk.stsMod.AssumeRoleRequest
import typingsSlinky.awsSdk.stsMod.GetSessionTokenRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.stsMod.AssumeRoleRequest
  - typingsSlinky.awsSdk.stsMod.GetSessionTokenRequest
*/
trait TemporaryCredentialsOptions extends js.Object

object TemporaryCredentialsOptions {
  @scala.inline
  implicit def apply(value: AssumeRoleRequest): TemporaryCredentialsOptions = value.asInstanceOf[TemporaryCredentialsOptions]
  @scala.inline
  implicit def apply(value: GetSessionTokenRequest): TemporaryCredentialsOptions = value.asInstanceOf[TemporaryCredentialsOptions]
}

