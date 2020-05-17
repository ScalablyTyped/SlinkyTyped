package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.specTestRunnerMod.SpecQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queries extends js.Object {
  var queries: js.Array[SpecQuery] = js.native
  var resumeToken: String = js.native
}

object Queries {
  @scala.inline
  def apply(queries: js.Array[SpecQuery], resumeToken: String): Queries = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queries]
  }
  @scala.inline
  implicit class QueriesOps[Self <: Queries] (val x: Self) extends AnyVal {
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

