package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.APIResponse
import typingsSlinky.ionic.definitionsMod.APIResponseSuccess
import typingsSlinky.ionic.definitionsMod.HttpMethod
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.IPaginator
import typingsSlinky.ionic.definitionsMod.PagePaginatorState
import typingsSlinky.ionic.definitionsMod.PaginateArgs
import typingsSlinky.ionic.definitionsMod.PaginatorDeps
import typingsSlinky.ionic.definitionsMod.PaginatorGuard
import typingsSlinky.ionic.definitionsMod.PaginatorRequestGenerator
import typingsSlinky.ionic.definitionsMod.PaginatorState
import typingsSlinky.ionic.definitionsMod.ResourceClientRequestModifiers
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.definitionsMod.SuperAgentError
import typingsSlinky.ionic.definitionsMod.TokenPaginatorState
import typingsSlinky.ionic.ionicStrings.UNKNOWN_CONTENT_TYPE
import typingsSlinky.ionic.ionicStrings.UNKNOWN_RESPONSE_FORMAT
import typingsSlinky.ionic.ionicStrings.applicationSlashjson
import typingsSlinky.ionic.libErrorsMod.FatalException
import typingsSlinky.std.IteratorResult
import typingsSlinky.superagent.superagentMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", JSImport.Namespace)
@js.native
object libHttpMod extends js.Object {
  @js.native
  class Client protected () extends IClient {
    def this(config: IConfig) = this()
    /* CompleteClass */
    override var config: IConfig = js.native
    /* CompleteClass */
    override def `do`(req: typingsSlinky.ionic.definitionsMod.SuperAgentRequest): js.Promise[APIResponseSuccess] = js.native
    /* CompleteClass */
    override def make(method: HttpMethod, path: String): js.Promise[Anon_Req] = js.native
    /* CompleteClass */
    override def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState] = js.native
  }
  
  @js.native
  class Paginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, PagePaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, PagePaginatorState]) = this()
    var client: IClient = js.native
    @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_Paginator: js.Function0[this.type] = js.native
    var max: js.UndefOr[Double] = js.native
    @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    def next(): IteratorResult[js.Promise[T], _] = js.native
    /* protected */ def reqgen(): js.Promise[Anon_Req] = js.native
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
    @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_TokenPaginator: js.Function0[this.type] = js.native
    var max: js.UndefOr[Double] = js.native
    @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    def isPageTokenResponseMeta(meta: js.Any): /* is ionic.ionic/definitions.APIResponsePageTokenMeta */ Boolean = js.native
    def next(): IteratorResult[js.Promise[T], _] = js.native
    /* protected */ def reqgen(): js.Promise[Anon_Req] = js.native
  }
  
  val CONTENT_TYPE_JSON: applicationSlashjson = js.native
  val ERROR_UNKNOWN_CONTENT_TYPE: UNKNOWN_CONTENT_TYPE = js.native
  val ERROR_UNKNOWN_RESPONSE_FORMAT: UNKNOWN_RESPONSE_FORMAT = js.native
  def createFatalAPIFormat(req: SuperAgentRequest, res: APIResponse): FatalException = js.native
  def formatResponseError(req: SuperAgentRequest): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: String): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: js.Object): String = js.native
  def formatSuperAgentError(e: SuperAgentError): String = js.native
  def transformAPIResponse(r: SuperAgentResponse): APIResponse = js.native
  type SuperAgentRequest = typingsSlinky.superagent.superagentMod.SuperAgentRequest
  type SuperAgentResponse = typingsSlinky.superagent.superagentMod.Response
}

