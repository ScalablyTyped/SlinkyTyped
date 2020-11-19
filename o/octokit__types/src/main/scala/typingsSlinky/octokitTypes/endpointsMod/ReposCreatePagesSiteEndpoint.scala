package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`13`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   source :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ReposCreatePagesSiteParamsSource | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'switcheroo'> */
@js.native
trait ReposCreatePagesSiteEndpoint extends js.Object {
  
  var mediaType: `13` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var source: js.UndefOr[ReposCreatePagesSiteParamsSource] = js.native
}
object ReposCreatePagesSiteEndpoint {
  
  @scala.inline
  def apply(mediaType: `13`, owner: String, repo: String): ReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreatePagesSiteEndpointOps[Self <: ReposCreatePagesSiteEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: `13`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ReposCreatePagesSiteParamsSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
