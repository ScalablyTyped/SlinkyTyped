package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.git
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.transportInterfacesMod.ICommitToGitTeamServerOptions
  - typingsSlinky.mendixmodelsdk.transportInterfacesMod.ICommitToSVNTeamServerOptions
*/
trait ICommitToTeamServerOptions extends StObject
object ICommitToTeamServerOptions {
  
  @scala.inline
  def ICommitToGitTeamServerOptions(
    authorEmail: String,
    authorName: String,
    commitMessage: String,
    repositoryType: git,
    targetBranch: String,
    targetCommitId: String,
    teamServerGitUrl: String
  ): typingsSlinky.mendixmodelsdk.transportInterfacesMod.ICommitToGitTeamServerOptions = {
    val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetCommitId = targetCommitId.asInstanceOf[js.Any], teamServerGitUrl = teamServerGitUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.transportInterfacesMod.ICommitToGitTeamServerOptions]
  }
  
  @scala.inline
  def ICommitToSVNTeamServerOptions(
    commitMessage: String,
    targetBranch: String,
    targetRevision: Double,
    teamServerPassword: String,
    teamServerUsername: String
  ): typingsSlinky.mendixmodelsdk.transportInterfacesMod.ICommitToSVNTeamServerOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetRevision = targetRevision.asInstanceOf[js.Any], teamServerPassword = teamServerPassword.asInstanceOf[js.Any], teamServerUsername = teamServerUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.transportInterfacesMod.ICommitToSVNTeamServerOptions]
  }
}
