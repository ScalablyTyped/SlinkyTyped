package typingsSlinky.next.libUtilsMod

import slinky.core.ReactComponentClass
import typingsSlinky.next.anon.AppInitialPropsnamestring
import typingsSlinky.next.anon.ErrorstatusCodenumberunde
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/next-server/lib/utils.NextPageContext & {  renderPage :next.next/dist/next-server/lib/utils.RenderPage} */
@js.native
trait DocumentContext extends js.Object {
  
  /**
    * `Component` the tree of the App to use if needing to render separately
    */
  var AppTree: AppTreeType = js.native
  
  /**
    * `String` of the actual path including query.
    */
  var asPath: js.UndefOr[String] = js.native
  
  /**
    * Error object if encountered during rendering
    */
  var err: js.UndefOr[ErrorstatusCodenumberunde | Null] = js.native
  
  /**
    * Path section of `URL`.
    */
  var pathname: String = js.native
  
  /**
    * Query string section of `URL` parsed as an object.
    */
  var query: ParsedUrlQuery = js.native
  
  var renderPage: RenderPage = js.native
  
  /**
    * `HTTP` request object.
    */
  var req: js.UndefOr[IncomingMessage] = js.native
  
  /**
    * `HTTP` response object.
    */
  var res: js.UndefOr[ServerResponse] = js.native
}
object DocumentContext {
  
  @scala.inline
  def apply(
    AppTree: AppTreeType,
    pathname: String,
    query: ParsedUrlQuery,
    renderPage: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
  ): DocumentContext = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], renderPage = js.Any.fromFunction1(renderPage))
    __obj.asInstanceOf[DocumentContext]
  }
  
  @scala.inline
  implicit class DocumentContextOps[Self <: DocumentContext] (val x: Self) extends AnyVal {
    
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
    def setAppTreeFunctionComponent(value: ReactComponentClass[AppInitialPropsnamestring]): Self = this.set("AppTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTreeComponentClass(value: ReactComponentClass[AppInitialPropsnamestring]): Self = this.set("AppTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTree(value: AppTreeType): Self = this.set("AppTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPage(
      value: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
    ): Self = this.set("renderPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsPath(value: String): Self = this.set("asPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsPath: Self = this.set("asPath", js.undefined)
    
    @scala.inline
    def setErr(value: ErrorstatusCodenumberunde): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setErrNull: Self = this.set("err", null)
    
    @scala.inline
    def setReq(value: IncomingMessage): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setRes(value: ServerResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
  }
}
