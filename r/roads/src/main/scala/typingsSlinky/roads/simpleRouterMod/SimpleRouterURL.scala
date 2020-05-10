package typingsSlinky.roads.simpleRouterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleRouterURL extends UrlWithParsedQuery {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SimpleRouterURL {
  @scala.inline
  def apply(href: String, query: ParsedUrlQuery): SimpleRouterURL = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRouterURL]
  }
  @scala.inline
  implicit class SimpleRouterURLOps[Self <: SimpleRouterURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
  }
  
}

