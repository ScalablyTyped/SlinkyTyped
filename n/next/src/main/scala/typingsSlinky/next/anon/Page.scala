package typingsSlinky.next.anon

import typingsSlinky.next.nextBooleans.`false`
import typingsSlinky.next.serverRouterMod.RouteMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  var `match`: RouteMatch = js.native
  var page: String = js.native
}

object Page {
  @scala.inline
  def apply(
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | typingsSlinky.next.serverRouterMod.Params,
    page: String
  ): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatch(
      value: /* pathname */ js.UndefOr[String | Null] => `false` | typingsSlinky.next.serverRouterMod.Params
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

