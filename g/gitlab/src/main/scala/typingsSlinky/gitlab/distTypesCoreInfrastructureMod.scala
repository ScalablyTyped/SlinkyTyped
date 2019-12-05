package typingsSlinky.gitlab

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.DelResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PostResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PutResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureUtilsMod.Bundle
import typingsSlinky.gitlab.distTypesCoreInfrastructureUtilsMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
@js.native
object distTypesCoreInfrastructureMod extends js.Object {
  @js.native
  class BaseService ()
    extends typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: String */](services: T): Bundle[T, P] = js.native
  @js.native
  object RequestHelper extends js.Object {
    @JSName("del")
    var del_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    @JSName("get")
    var get_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    @JSName("post")
    var post_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    @JSName("put")
    var put_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    @JSName("stream")
    var stream_Original: js.Function3[
        /* service */ typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        _
      ] = js.native
    def del(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[DelResponse] = js.native
    def del(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[DelResponse] = js.native
    def get(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[GetResponse] = js.native
    def get(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def post(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[PostResponse] = js.native
    def post(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PostResponse] = js.native
    def put(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[PutResponse] = js.native
    def put(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PutResponse] = js.native
    def stream(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Any = js.native
    def stream(
      service: typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Any = js.native
  }
  
}

