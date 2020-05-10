package typingsSlinky.nookies

import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<next.next.NextPageContext, 'res'> */
@js.native
trait PickNextPageContextres extends js.Object {
  var res: js.UndefOr[ServerResponse] = js.native
}

object PickNextPageContextres {
  @scala.inline
  def apply(): PickNextPageContextres = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNextPageContextres]
  }
  @scala.inline
  implicit class PickNextPageContextresOps[Self <: PickNextPageContextres] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

