package typingsSlinky.next.anon

import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewUrl extends js.Object {
  var newUrl: String = js.native
  var parsedDestination: UrlWithParsedQuery = js.native
}

object NewUrl {
  @scala.inline
  def apply(newUrl: String, parsedDestination: UrlWithParsedQuery): NewUrl = {
    val __obj = js.Dynamic.literal(newUrl = newUrl.asInstanceOf[js.Any], parsedDestination = parsedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUrl]
  }
  @scala.inline
  implicit class NewUrlOps[Self <: NewUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsedDestination(value: UrlWithParsedQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedDestination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

