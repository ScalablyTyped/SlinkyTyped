package typingsSlinky.feathersjsFeathers.mod

import typingsSlinky.feathersjsFeathers.anon.PickPaginationOptionsmax
import typingsSlinky.feathersjsFeathers.feathersjsFeathersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.Params, 'query' | 'paginate'> */
@js.native
trait ClientSideParams extends js.Object {
  var paginate: js.UndefOr[`false` | PickPaginationOptionsmax] = js.native
  var query: js.UndefOr[Query] = js.native
}

object ClientSideParams {
  @scala.inline
  def apply(): ClientSideParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideParams]
  }
  @scala.inline
  implicit class ClientSideParamsOps[Self <: ClientSideParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginate(value: `false` | PickPaginationOptionsmax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

