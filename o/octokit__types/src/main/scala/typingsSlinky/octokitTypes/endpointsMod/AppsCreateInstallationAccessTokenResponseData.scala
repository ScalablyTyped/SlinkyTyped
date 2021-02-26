package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Allowmergecommit
import typingsSlinky.octokitTypes.anon.Contents
import typingsSlinky.octokitTypes.octokitTypesStrings.all
import typingsSlinky.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsCreateInstallationAccessTokenResponseData extends StObject {
  
  var expires_at: String = js.native
  
  var permissions: Contents = js.native
  
  var repositories: js.Array[Allowmergecommit] = js.native
  
  var repository_selection: all | selected = js.native
  
  var token: String = js.native
}
object AppsCreateInstallationAccessTokenResponseData {
  
  @scala.inline
  def apply(
    expires_at: String,
    permissions: Contents,
    repositories: js.Array[Allowmergecommit],
    repository_selection: all | selected,
    token: String
  ): AppsCreateInstallationAccessTokenResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationAccessTokenResponseData]
  }
  
  @scala.inline
  implicit class AppsCreateInstallationAccessTokenResponseDataMutableBuilder[Self <: AppsCreateInstallationAccessTokenResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Contents): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositories(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesVarargs(value: Allowmergecommit*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
