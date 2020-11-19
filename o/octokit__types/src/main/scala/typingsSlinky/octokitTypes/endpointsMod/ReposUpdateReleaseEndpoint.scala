package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateReleaseEndpoint extends js.Object {
  
  /**
    * Text describing the contents of the tag.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * `true` makes the release a draft, and `false` publishes the release.
    */
  var draft: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the release.
    */
  var name: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  /**
    * `true` to identify the release as a prerelease, `false` to identify the release as a full release.
    */
  var prerelease: js.UndefOr[Boolean] = js.native
  
  var release_id: Double = js.native
  
  var repo: String = js.native
  
  /**
    * The name of the tag.
    */
  var tag_name: js.UndefOr[String] = js.native
  
  /**
    * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`).
    */
  var target_commitish: js.UndefOr[String] = js.native
}
object ReposUpdateReleaseEndpoint {
  
  @scala.inline
  def apply(owner: String, release_id: Double, repo: String): ReposUpdateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateReleaseEndpointOps[Self <: ReposUpdateReleaseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_id(value: Double): Self = this.set("release_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setDraft(value: Boolean): Self = this.set("draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraft: Self = this.set("draft", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrerelease(value: Boolean): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
    
    @scala.inline
    def setTag_name(value: String): Self = this.set("tag_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag_name: Self = this.set("tag_name", js.undefined)
    
    @scala.inline
    def setTarget_commitish(value: String): Self = this.set("target_commitish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_commitish: Self = this.set("target_commitish", js.undefined)
  }
}
