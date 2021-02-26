package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.publicbooleanPaginatedReq
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snippetsMod {
  
  @JSImport("gitlab/dist/types/core/services/Snippets", "Snippets")
  @js.native
  class Snippets () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasPublicOptions: publicbooleanPaginatedReq): js.Promise[GetResponse] = js.native
    
    def content(snippetId: Double): js.Promise[GetResponse] = js.native
    def content(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      title: String,
      fileName: String,
      content: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(snippetId: Double): js.Promise[js.Object] = js.native
    def edit(snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(snippetId: Double): js.Promise[js.Object] = js.native
    def remove(snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(snippetId: Double): js.Promise[GetResponse] = js.native
    def show(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def userAgentDetails(snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gitlab.gitlabStrings.`private`
    - typingsSlinky.gitlab.gitlabStrings.public
    - typingsSlinky.gitlab.gitlabStrings.internal
  */
  trait SnippetVisibility extends StObject
  object SnippetVisibility {
    
    @scala.inline
    def internal: typingsSlinky.gitlab.gitlabStrings.internal = "internal".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.internal]
    
    @scala.inline
    def `private`: typingsSlinky.gitlab.gitlabStrings.`private` = "private".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.`private`]
    
    @scala.inline
    def public: typingsSlinky.gitlab.gitlabStrings.public = "public".asInstanceOf[typingsSlinky.gitlab.gitlabStrings.public]
  }
}
