package typingsSlinky.gitlab.requestHelperMod

import typingsSlinky.gitlab.baseServiceMod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper")
@js.native
object RequestHelper extends js.Object {
  
  def del(service: BaseService, endpoint: String): js.Promise[DelResponse] = js.native
  def del(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = js.native
  @JSName("del")
  var del_Original: js.Function3[
    /* service */ BaseService, 
    /* endpoint */ String, 
    /* options */ js.UndefOr[BaseRequestOptions], 
    js.Promise[DelResponse]
  ] = js.native
  
  def get(service: BaseService, endpoint: String): js.Promise[GetResponse] = js.native
  def get(service: BaseService, endpoint: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  @JSName("get")
  var get_Original: js.Function3[
    /* service */ BaseService, 
    /* endpoint */ String, 
    /* options */ js.UndefOr[PaginatedRequestOptions], 
    js.Promise[GetResponse]
  ] = js.native
  
  def post(service: BaseService, endpoint: String): js.Promise[PostResponse] = js.native
  def post(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = js.native
  @JSName("post")
  var post_Original: js.Function3[
    /* service */ BaseService, 
    /* endpoint */ String, 
    /* options */ js.UndefOr[BaseRequestOptions], 
    js.Promise[PostResponse]
  ] = js.native
  
  def put(service: BaseService, endpoint: String): js.Promise[PutResponse] = js.native
  def put(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = js.native
  @JSName("put")
  var put_Original: js.Function3[
    /* service */ BaseService, 
    /* endpoint */ String, 
    /* options */ js.UndefOr[BaseRequestOptions], 
    js.Promise[PutResponse]
  ] = js.native
  
  def stream(service: BaseService, endpoint: String): js.Any = js.native
  def stream(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Any = js.native
  @JSName("stream")
  var stream_Original: js.Function3[
    /* service */ BaseService, 
    /* endpoint */ String, 
    /* options */ js.UndefOr[BaseRequestOptions], 
    _
  ] = js.native
}
