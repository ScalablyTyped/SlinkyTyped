package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.gitlabStrings.closed
import typingsSlinky.gitlab.gitlabStrings.commented
import typingsSlinky.gitlab.gitlabStrings.created
import typingsSlinky.gitlab.gitlabStrings.destroyed
import typingsSlinky.gitlab.gitlabStrings.expired
import typingsSlinky.gitlab.gitlabStrings.issue
import typingsSlinky.gitlab.gitlabStrings.joined
import typingsSlinky.gitlab.gitlabStrings.left
import typingsSlinky.gitlab.gitlabStrings.merge_request
import typingsSlinky.gitlab.gitlabStrings.merged
import typingsSlinky.gitlab.gitlabStrings.milestone
import typingsSlinky.gitlab.gitlabStrings.note
import typingsSlinky.gitlab.gitlabStrings.project
import typingsSlinky.gitlab.gitlabStrings.pushed
import typingsSlinky.gitlab.gitlabStrings.reopened
import typingsSlinky.gitlab.gitlabStrings.snippet
import typingsSlinky.gitlab.gitlabStrings.updated
import typingsSlinky.gitlab.gitlabStrings.user
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("gitlab/dist/types/core/services/Events", "Events")
  @js.native
  class Events () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait EventOptions extends StObject {
    
    var action: js.UndefOr[
        created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ] = js.native
    
    var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.native
  }
  object EventOptions {
    
    @scala.inline
    def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit class EventOptionsMutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(
        value: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setTargetType(value: issue | milestone | merge_request | note | project | snippet | user): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
}
