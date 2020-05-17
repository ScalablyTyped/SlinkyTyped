package typingsSlinky.next.anon

import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsParsedUrlQuery extends js.Object {
  var params: ParsedUrlQuery = js.native
}

object ParamsParsedUrlQuery {
  @scala.inline
  def apply(params: ParsedUrlQuery): ParamsParsedUrlQuery = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsParsedUrlQuery]
  }
  @scala.inline
  implicit class ParamsParsedUrlQueryOps[Self <: ParamsParsedUrlQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: ParsedUrlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

