package typingsSlinky.reduxFirstRouter.anon

import typingsSlinky.reduxFirstRouter.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotFoundPath extends js.Object {
  var notFoundPath: js.UndefOr[String] = js.native
  var query: js.UndefOr[Query] = js.native
  var search: js.UndefOr[String] = js.native
}

object NotFoundPath {
  @scala.inline
  def apply(): NotFoundPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotFoundPath]
  }
  @scala.inline
  implicit class NotFoundPathOps[Self <: NotFoundPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotFoundPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundPath")(js.undefined)
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
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}

