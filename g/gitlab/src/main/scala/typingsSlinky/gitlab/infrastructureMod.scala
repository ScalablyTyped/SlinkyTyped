package typingsSlinky.gitlab

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.DelResponse
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.PostResponse
import typingsSlinky.gitlab.requestHelperMod.PutResponse
import typingsSlinky.gitlab.utilsMod.Bundle
import typingsSlinky.gitlab.utilsMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
@js.native
object infrastructureMod extends js.Object {
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = js.native
  
  @js.native
  class BaseService ()
    extends typingsSlinky.gitlab.baseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  @js.native
  object RequestHelper extends js.Object {
    
    def del(service: typingsSlinky.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = js.native
    def del(
      service: typingsSlinky.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[DelResponse] = js.native
    @JSName("del")
    var del_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    
    def get(service: typingsSlinky.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = js.native
    def get(
      service: typingsSlinky.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    @JSName("get")
    var get_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    
    def post(service: typingsSlinky.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = js.native
    def post(
      service: typingsSlinky.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PostResponse] = js.native
    @JSName("post")
    var post_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    
    def put(service: typingsSlinky.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = js.native
    def put(
      service: typingsSlinky.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PutResponse] = js.native
    @JSName("put")
    var put_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    
    def stream(service: typingsSlinky.gitlab.baseServiceMod.BaseService, endpoint: String): js.Any = js.native
    def stream(
      service: typingsSlinky.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Any = js.native
    @JSName("stream")
    var stream_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        _
      ] = js.native
  }
}
