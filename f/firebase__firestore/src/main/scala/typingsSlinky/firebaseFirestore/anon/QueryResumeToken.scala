package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResumeToken extends js.Object {
  var query: typingsSlinky.firebaseFirestore.coreQueryMod.Query = js.native
  var resumeToken: String = js.native
}

object QueryResumeToken {
  @scala.inline
  def apply(query: typingsSlinky.firebaseFirestore.coreQueryMod.Query, resumeToken: String): QueryResumeToken = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResumeToken]
  }
  @scala.inline
  implicit class QueryResumeTokenOps[Self <: QueryResumeToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: typingsSlinky.firebaseFirestore.coreQueryMod.Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

