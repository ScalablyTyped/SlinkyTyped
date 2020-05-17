package typingsSlinky.nextServer.libUtilsMod

import typingsSlinky.nextServer.anon.ErrorstatusCodenumber
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextPageContext extends js.Object {
  /**
    * `Component` the tree of the App to use if needing to render separately
    */
  var AppTree: AppType = js.native
  /**
    * `String` of the actual path including query.
    */
  var asPath: js.UndefOr[String] = js.native
  /**
    * Error object if encountered during rendering
    */
  var err: js.UndefOr[ErrorstatusCodenumber | Null] = js.native
  /**
    * Path section of `URL`.
    */
  var pathname: String = js.native
  /**
    * Query string section of `URL` parsed as an object.
    */
  var query: ParsedUrlQuery = js.native
  /**
    * `HTTP` request object.
    */
  var req: js.UndefOr[IncomingMessage] = js.native
  /**
    * `HTTP` response object.
    */
  var res: js.UndefOr[ServerResponse] = js.native
}

object NextPageContext {
  @scala.inline
  def apply(AppTree: AppType, pathname: String, query: ParsedUrlQuery): NextPageContext = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageContext]
  }
  @scala.inline
  implicit class NextPageContextOps[Self <: NextPageContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppTree(value: AppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: ParsedUrlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asPath")(js.undefined)
        ret
    }
    @scala.inline
    def withErr(value: ErrorstatusCodenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
    @scala.inline
    def withErrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(null)
        ret
    }
    @scala.inline
    def withReq(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(js.undefined)
        ret
    }
    @scala.inline
    def withRes(value: ServerResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(js.undefined)
        ret
    }
  }
  
}

