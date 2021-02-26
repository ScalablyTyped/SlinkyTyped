package typingsSlinky.auth0.mod

import typingsSlinky.auth0.auth0Strings.users_export
import typingsSlinky.auth0.auth0Strings.users_import
import typingsSlinky.auth0.auth0Strings.verification_email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0.mod.ImportUsersJob
  - typingsSlinky.auth0.mod.ExportUsersJob
  - typingsSlinky.auth0.mod.VerificationEmailJob
*/
trait Job extends StObject
object Job {
  
  @scala.inline
  def ExportUsersJob(id: String, status: JobStatus, `type`: users_export): typingsSlinky.auth0.mod.ExportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0.mod.ExportUsersJob]
  }
  
  @scala.inline
  def ImportUsersJob(id: String, status: JobStatus, `type`: users_import): typingsSlinky.auth0.mod.ImportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0.mod.ImportUsersJob]
  }
  
  @scala.inline
  def VerificationEmailJob(id: String, status: JobStatus, `type`: verification_email): typingsSlinky.auth0.mod.VerificationEmailJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.auth0.mod.VerificationEmailJob]
  }
}
