package typingsSlinky.apolloReact.testUtilsMod

import typingsSlinky.typedGraphql.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedRequest extends js.Object {
  var debugName: js.UndefOr[String] = js.native
  var query: js.UndefOr[Document] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object ParsedRequest {
  @scala.inline
  def apply(): ParsedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedRequest]
  }
  @scala.inline
  implicit class ParsedRequestOps[Self <: ParsedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugName")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Document): Self = {
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
    def withVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

