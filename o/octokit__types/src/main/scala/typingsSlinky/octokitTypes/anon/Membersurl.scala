package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Membersurl extends js.Object {
  
  var description: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var members_url: String = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var parent: StringDictionary[js.Any] = js.native
  
  var permission: String = js.native
  
  var privacy: String = js.native
  
  var repositories_url: String = js.native
  
  var slug: String = js.native
  
  var url: String = js.native
}
object Membersurl {
  
  @scala.inline
  def apply(
    description: String,
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    parent: StringDictionary[js.Any],
    permission: String,
    privacy: String,
    repositories_url: String,
    slug: String,
    url: String
  ): Membersurl = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Membersurl]
  }
  
  @scala.inline
  implicit class MembersurlOps[Self <: Membersurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = this.set("members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: StringDictionary[js.Any]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy(value: String): Self = this.set("privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositories_url(value: String): Self = this.set("repositories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
