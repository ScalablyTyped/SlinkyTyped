package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0.mod.ImportUsersJob
  - typingsSlinky.auth0.mod.ExportUsersJob
  - typingsSlinky.auth0.mod.VerificationEmailJob
*/
trait Job extends js.Object

object Job {
  @scala.inline
  implicit def apply(value: ExportUsersJob): Job = value.asInstanceOf[Job]
  @scala.inline
  implicit def apply(value: ImportUsersJob): Job = value.asInstanceOf[Job]
  @scala.inline
  implicit def apply(value: VerificationEmailJob): Job = value.asInstanceOf[Job]
}

