package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenPaginatorState extends PaginatorState {
  var page_token: js.UndefOr[String] = js.native
}

object TokenPaginatorState {
  @scala.inline
  def apply(done: Boolean, loaded: Double): TokenPaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPaginatorState]
  }
  @scala.inline
  implicit class TokenPaginatorStateOps[Self <: TokenPaginatorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_token")(js.undefined)
        ret
    }
  }
  
}

