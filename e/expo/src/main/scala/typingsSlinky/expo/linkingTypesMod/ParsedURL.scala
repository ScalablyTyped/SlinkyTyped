package typingsSlinky.expo.linkingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedURL extends js.Object {
  var path: String | Null = js.native
  var queryParams: js.Object | Null = js.native
}

object ParsedURL {
  @scala.inline
  def apply(): ParsedURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedURL]
  }
  @scala.inline
  implicit class ParsedURLOps[Self <: ParsedURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(null)
        ret
    }
    @scala.inline
    def withQueryParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryParamsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(null)
        ret
    }
  }
  
}

