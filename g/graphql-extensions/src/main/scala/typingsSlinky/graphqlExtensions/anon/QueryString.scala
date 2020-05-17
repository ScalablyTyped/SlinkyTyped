package typingsSlinky.graphqlExtensions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryString extends js.Object {
  var queryString: String = js.native
}

object QueryString {
  @scala.inline
  def apply(queryString: String): QueryString = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryString]
  }
  @scala.inline
  implicit class QueryStringOps[Self <: QueryString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

