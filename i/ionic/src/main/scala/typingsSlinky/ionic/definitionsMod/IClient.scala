package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.anon.Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClient extends js.Object {
  var config: IConfig = js.native
  def `do`(req: SuperAgentRequest): js.Promise[APIResponseSuccess] = js.native
  def make(method: HttpMethod, path: String): js.Promise[Req] = js.native
  def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState] = js.native
}

object IClient {
  @scala.inline
  def apply(
    config: IConfig,
    `do`: SuperAgentRequest => js.Promise[APIResponseSuccess],
    make: (HttpMethod, String) => js.Promise[Req],
    paginate: PaginateArgs[js.Any] => IPaginator[js.Any, PaginatorState]
  ): IClient = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], make = js.Any.fromFunction2(make), paginate = js.Any.fromFunction1(paginate))
    __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
    __obj.asInstanceOf[IClient]
  }
  @scala.inline
  implicit class IClientOps[Self <: IClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: IConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDo(value: SuperAgentRequest => js.Promise[APIResponseSuccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("do")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMake(value: (HttpMethod, String) => js.Promise[Req]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPaginate(value: PaginateArgs[js.Any] => IPaginator[js.Any, PaginatorState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

