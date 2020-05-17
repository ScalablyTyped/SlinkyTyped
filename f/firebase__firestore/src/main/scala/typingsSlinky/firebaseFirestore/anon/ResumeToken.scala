package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeToken extends js.Object {
  var queries: js.Array[SpecQuery] = js.native
  var resumeToken: String = js.native
}

object ResumeToken {
  @scala.inline
  def apply(queries: js.Array[SpecQuery], resumeToken: String): ResumeToken = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeToken]
  }
  @scala.inline
  implicit class ResumeTokenOps[Self <: ResumeToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueries(value: js.Array[SpecQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
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

