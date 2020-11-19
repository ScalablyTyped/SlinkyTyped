package typingsSlinky.nock.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scope extends EventEmitter {
  
  def activeMocks(): js.Array[String] = js.native
  
  def defaultReplyHeaders(headers: ReplyHeaders): this.type = js.native
  
  def delete(uri: String): Interceptor = js.native
  def delete(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def delete(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def delete(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def delete(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: js.RegExp): Interceptor = js.native
  def delete(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def delete(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("delete")
  var delete_Original: InterceptFunction = js.native
  
  def done(): Unit = js.native
  
  def filteringPath(fn: js.Function1[/* path */ String, String]): this.type = js.native
  def filteringPath(regex: js.RegExp, replace: String): this.type = js.native
  
  def filteringRequestBody(fn: js.Function1[/* body */ String, String]): this.type = js.native
  def filteringRequestBody(regex: js.RegExp, replace: String): this.type = js.native
  
  def get(uri: String): Interceptor = js.native
  def get(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def get(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def get(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def get(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: js.RegExp): Interceptor = js.native
  def get(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def get(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("get")
  var get_Original: InterceptFunction = js.native
  
  def head(uri: String): Interceptor = js.native
  def head(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def head(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def head(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def head(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: js.RegExp): Interceptor = js.native
  def head(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def head(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("head")
  var head_Original: InterceptFunction = js.native
  
  def intercept(uri: String, method: String): Interceptor = js.native
  def intercept(uri: String, method: String, requestBody: js.UndefOr[RequestBodyMatcher], options: Options): Interceptor = js.native
  def intercept(uri: String, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String): Interceptor = js.native
  def intercept(
    uri: js.Function1[/* uri */ String, Boolean],
    method: String,
    requestBody: js.UndefOr[RequestBodyMatcher],
    options: Options
  ): Interceptor = js.native
  def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: js.RegExp, method: String): Interceptor = js.native
  def intercept(uri: js.RegExp, method: String, requestBody: js.UndefOr[RequestBodyMatcher], options: Options): Interceptor = js.native
  def intercept(uri: js.RegExp, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  
  def isDone(): Boolean = js.native
  
  def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
  
  def merge(uri: String): Interceptor = js.native
  def merge(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def merge(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def merge(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def merge(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: js.RegExp): Interceptor = js.native
  def merge(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def merge(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("merge")
  var merge_Original: InterceptFunction = js.native
  
  def options(uri: String): Interceptor = js.native
  def options(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def options(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def options(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def options(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: js.RegExp): Interceptor = js.native
  def options(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def options(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("options")
  var options_Original: InterceptFunction = js.native
  
  def patch(uri: String): Interceptor = js.native
  def patch(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def patch(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def patch(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def patch(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: js.RegExp): Interceptor = js.native
  def patch(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def patch(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("patch")
  var patch_Original: InterceptFunction = js.native
  
  def pendingMocks(): js.Array[String] = js.native
  
  def persist(): this.type = js.native
  def persist(flag: Boolean): this.type = js.native
  
  def post(uri: String): Interceptor = js.native
  def post(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def post(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def post(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def post(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: js.RegExp): Interceptor = js.native
  def post(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def post(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("post")
  var post_Original: InterceptFunction = js.native
  
  def put(uri: String): Interceptor = js.native
  def put(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def put(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def put(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def put(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: js.RegExp): Interceptor = js.native
  def put(uri: js.RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def put(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  @JSName("put")
  var put_Original: InterceptFunction = js.native
  
  def replyContentLength(): this.type = js.native
  
  def replyDate(): this.type = js.native
  def replyDate(d: js.Date): this.type = js.native
}
