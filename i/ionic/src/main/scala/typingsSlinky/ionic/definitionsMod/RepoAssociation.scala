package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.bitbucket_cloud
import typingsSlinky.ionic.ionicStrings.bitbucket_server
import typingsSlinky.ionic.ionicStrings.github
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.GithubRepoAssociation
  - typingsSlinky.ionic.definitionsMod.BitbucketCloudRepoAssociation
  - typingsSlinky.ionic.definitionsMod.BitbucketServerRepoAssociation
*/
trait RepoAssociation extends StObject
object RepoAssociation {
  
  @scala.inline
  def BitbucketCloudRepoAssociation(clone_url: String, full_name: String, html_url: String, id: String, `type`: bitbucket_cloud): typingsSlinky.ionic.definitionsMod.BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.BitbucketCloudRepoAssociation]
  }
  
  @scala.inline
  def BitbucketServerRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double, `type`: bitbucket_server): typingsSlinky.ionic.definitionsMod.BitbucketServerRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.BitbucketServerRepoAssociation]
  }
  
  @scala.inline
  def GithubRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double, `type`: github): typingsSlinky.ionic.definitionsMod.GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.GithubRepoAssociation]
  }
}
