package typingsSlinky.ionic

import typingsSlinky.ionic.anon.Req
import typingsSlinky.ionic.definitionsMod.APIResponse
import typingsSlinky.ionic.definitionsMod.APIResponseSuccess
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.IPaginator
import typingsSlinky.ionic.definitionsMod.PagePaginatorState
import typingsSlinky.ionic.definitionsMod.PaginatorDeps
import typingsSlinky.ionic.definitionsMod.PaginatorGuard
import typingsSlinky.ionic.definitionsMod.PaginatorRequestGenerator
import typingsSlinky.ionic.definitionsMod.ResourceClientRequestModifiers
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.definitionsMod.SuperAgentError
import typingsSlinky.ionic.definitionsMod.TokenPaginatorState
import typingsSlinky.ionic.errorsMod.FatalException
import typingsSlinky.std.IteratorResult
import typingsSlinky.superagent.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  
  val CONTENT_TYPE_JSON: /* "application/json" */ String = js.native
  
  val ERROR_UNKNOWN_CONTENT_TYPE: /* "UNKNOWN_CONTENT_TYPE" */ String = js.native
  
  val ERROR_UNKNOWN_RESPONSE_FORMAT: /* "UNKNOWN_RESPONSE_FORMAT" */ String = js.native
  
  def createFatalAPIFormat(req: SuperAgentRequest, res: APIResponse): FatalException = js.native
  
  def formatResponseError(req: SuperAgentRequest): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: js.UndefOr[scala.Nothing], body: String): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: js.UndefOr[scala.Nothing], body: js.Object): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: String): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: js.Object): String = js.native
  
  def formatSuperAgentError(e: SuperAgentError): String = js.native
  
  def transformAPIResponse(r: SuperAgentResponse): APIResponse = js.native
  
  @js.native
  class Client protected () extends IClient {
    def this(config: IConfig) = this()
  }
  
  @js.native
  class Paginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, PagePaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, PagePaginatorState]) = this()
    
    var client: IClient = js.native
    
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Paginator: js.Function0[this.type] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    def next(): IteratorResult[js.Promise[T], _] = js.native
    
    /* protected */ def reqgen(): js.Promise[Req] = js.native
    @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
  }
  
  @js.native
  abstract class ResourceClient () extends js.Object {
    
    /* protected */ def applyAuthentication(req: Request, token: String): Unit = js.native
    
    /* protected */ def applyModifiers(req: Request): Unit = js.native
    /* protected */ def applyModifiers(req: Request, modifiers: ResourceClientRequestModifiers): Unit = js.native
  }
  
  @js.native
  class TokenPaginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, TokenPaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, TokenPaginatorState]) = this()
    
    var client: IClient = js.native
    
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    
    def isPageTokenResponseMeta(meta: js.Any): /* is ionic.ionic/definitions.APIResponsePageTokenMeta */ Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_TokenPaginator: js.Function0[this.type] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    def next(): IteratorResult[js.Promise[T], _] = js.native
    
    /* protected */ def reqgen(): js.Promise[Req] = js.native
    @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
  }
  
  type SuperAgentRequest = typingsSlinky.superagent.mod.SuperAgentRequest
  
  type SuperAgentResponse = typingsSlinky.superagent.mod.Response
}
