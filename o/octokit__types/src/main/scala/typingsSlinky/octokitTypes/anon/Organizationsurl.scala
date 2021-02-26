package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Organizationsurl extends StObject {
  
  var avatar_url: String = js.native
  
  var followers_url: String = js.native
  
  var gravatar_id: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var login: String = js.native
  
  var node_id: String = js.native
  
  var organizations_url: String = js.native
  
  var received_events_url: String = js.native
  
  var repos_url: String = js.native
  
  var score: Double = js.native
  
  var subscriptions_url: String = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object Organizationsurl {
  
  @scala.inline
  def apply(
    avatar_url: String,
    followers_url: String,
    gravatar_id: String,
    html_url: String,
    id: Double,
    login: String,
    node_id: String,
    organizations_url: String,
    received_events_url: String,
    repos_url: String,
    score: Double,
    subscriptions_url: String,
    `type`: String,
    url: String
  ): Organizationsurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationsurl]
  }
  
  @scala.inline
  implicit class OrganizationsurlMutableBuilder[Self <: Organizationsurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_url(value: String): Self = StObject.set(x, "followers_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived_events_url(value: String): Self = StObject.set(x, "received_events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions_url(value: String): Self = StObject.set(x, "subscriptions_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
