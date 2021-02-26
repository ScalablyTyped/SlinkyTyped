package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitTypes.anon.Blog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateResponseData extends StObject {
  
  var created_at: String = js.native
  
  var description: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var members_count: Double = js.native
  
  var members_url: String = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var organization: Blog = js.native
  
  var parent: StringDictionary[js.Any] = js.native
  
  var permission: String = js.native
  
  var privacy: String = js.native
  
  var repos_count: Double = js.native
  
  var repositories_url: String = js.native
  
  var slug: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object TeamsCreateResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    description: String,
    html_url: String,
    id: Double,
    members_count: Double,
    members_url: String,
    name: String,
    node_id: String,
    organization: Blog,
    parent: StringDictionary[js.Any],
    permission: String,
    privacy: String,
    repos_count: Double,
    repositories_url: String,
    slug: String,
    updated_at: String,
    url: String
  ): TeamsCreateResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repos_count = repos_count.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateResponseData]
  }
  
  @scala.inline
  implicit class TeamsCreateResponseDataMutableBuilder[Self <: TeamsCreateResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: Blog): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: StringDictionary[js.Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos_count(value: Double): Self = StObject.set(x, "repos_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
