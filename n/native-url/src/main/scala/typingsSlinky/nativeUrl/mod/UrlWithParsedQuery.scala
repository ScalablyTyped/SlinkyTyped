package typingsSlinky.nativeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlWithParsedQuery extends Url

object UrlWithParsedQuery {
  @scala.inline
  def apply(href: String): UrlWithParsedQuery = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlWithParsedQuery]
  }
}

