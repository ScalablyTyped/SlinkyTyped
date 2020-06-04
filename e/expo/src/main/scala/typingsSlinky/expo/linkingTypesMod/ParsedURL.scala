package typingsSlinky.expo.linkingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedURL extends js.Object {
  var path: String | Null
  var queryParams: js.Object | Null
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    @scala.inline
    def setQueryParams(value: js.Object): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParamsNull: Self = this.set("queryParams", null)
  }
  
}

