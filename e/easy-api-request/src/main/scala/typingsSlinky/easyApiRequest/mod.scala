package typingsSlinky.easyApiRequest

import typingsSlinky.bunyan.mod.^
import typingsSlinky.easyApiRequest.anon.Cb
import typingsSlinky.easyApiRequest.anon.Config
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.q.mod.Promise
import typingsSlinky.request.mod.Request
import typingsSlinky.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-api-request", "create")
  @js.native
  def create(opts: Config): Unit = js.native
  
  @js.native
  trait BaseRequest extends StObject {
    
    def _do(args: IArguments): js.Any = js.native
    def _do(args: IArguments, `type`: String): js.Any = js.native
    
    def _parseOptions(args: IArguments, `type`: String): Cb = js.native
    
    def _request(): js.Any = js.native
    def _request(opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def _request(opts: js.Any): js.Any = js.native
    def _request(opts: js.Any, cb: js.Any): js.Any = js.native
    
    var base: Request = js.native
    
    def del(): js.Any = js.native
    def del(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def del(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
    def del(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
    def del(url: js.Any): js.Any = js.native
    def del(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def del(url: js.Any, opts: js.Any): js.Any = js.native
    def del(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    
    def get(): js.Any = js.native
    def get(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def get(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
    def get(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
    def get(url: js.Any): js.Any = js.native
    def get(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def get(url: js.Any, opts: js.Any): js.Any = js.native
    def get(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    
    var jSend: Boolean = js.native
    
    var log: ^ = js.native
    
    def patch(): js.Any = js.native
    def patch(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def patch(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
    def patch(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
    def patch(url: js.Any): js.Any = js.native
    def patch(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def patch(url: js.Any, opts: js.Any): js.Any = js.native
    def patch(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    
    def post(): js.Any = js.native
    def post(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def post(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
    def post(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
    def post(url: js.Any): js.Any = js.native
    def post(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
    def post(url: js.Any, opts: js.Any): js.Any = js.native
    def post(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    
    var replyCookies: js.Array[String] = js.native
    
    var req: Request_[ParamsDictionary, _, _, Query] = js.native
  }
  
  @js.native
  trait CBPromiseRequest extends BaseRequest {
    
    def _request(opts: js.Object): Stream = js.native
    
    def del(opts: js.Object): Promise[Result] = js.native
    def del(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def del(url: String): Promise[Result] = js.native
    def del(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def del(url: String, params: js.Object): Promise[Result] = js.native
    def del(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    
    def get(opts: js.Object): Promise[Result] = js.native
    def get(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def get(url: String): Promise[Result] = js.native
    def get(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def get(url: String, params: js.Object): Promise[Result] = js.native
    def get(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    
    def patch(opts: js.Object): Promise[Result] = js.native
    def patch(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def patch(url: String): Promise[Result] = js.native
    def patch(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def patch(url: String, params: js.Object): Promise[Result] = js.native
    def patch(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    
    def post(opts: js.Object): Promise[Result] = js.native
    def post(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def post(url: String): Promise[Result] = js.native
    def post(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def post(url: String, params: js.Object): Promise[Result] = js.native
    def post(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait RequestMaker extends StObject {
    
    def apply(): CBPromiseRequest = js.native
    def apply(stream: Boolean): StreamRequest | CBPromiseRequest = js.native
  }
  
  @js.native
  trait Result extends StObject {
    
    var body: js.Any = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var err: js.UndefOr[js.Any] = js.native
    
    var response: IncomingMessage = js.native
  }
  object Result {
    
    @scala.inline
    def apply(body: js.Any, response: IncomingMessage): Result = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setErr(value: js.Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setResponse(value: IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamRequest extends BaseRequest {
    
    def _request(opts: js.Object): Stream = js.native
    
    def del(opts: js.Object): Stream = js.native
    def del(url: String): Stream = js.native
    def del(url: String, params: js.Object): Stream = js.native
    
    def get(opts: js.Object): Stream = js.native
    def get(url: String): Stream = js.native
    def get(url: String, params: js.Object): Stream = js.native
    
    def patch(opts: js.Object): Stream = js.native
    def patch(url: String): Stream = js.native
    def patch(url: String, params: js.Object): Stream = js.native
    
    def post(opts: js.Object): Stream = js.native
    def post(url: String): Stream = js.native
    def post(url: String, params: js.Object): Stream = js.native
  }
}
