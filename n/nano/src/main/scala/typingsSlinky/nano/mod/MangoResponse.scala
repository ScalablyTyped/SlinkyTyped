package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.IdRev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangoResponse[D] extends js.Object {
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[String] = js.native
  // Array of documents matching the search. In each matching document, the fields specified in
  // the fields part of the request body are listed, along with their values.
  var docs: js.Array[D with IdRev] = js.native
  // Basic execution statistics for a specific request.
  var execution_stats: js.UndefOr[MangoExecutionStats] = js.native
  // Execution warnings
  var warning: js.UndefOr[String] = js.native
}

object MangoResponse {
  @scala.inline
  def apply[D](docs: js.Array[D with IdRev]): MangoResponse[D] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoResponse[D]]
  }
  @scala.inline
  implicit class MangoResponseOps[Self[d] <: MangoResponse[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDocs(value: js.Array[D with IdRev]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBookmark(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmark: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(js.undefined)
        ret
    }
    @scala.inline
    def withExecution_stats(value: MangoExecutionStats): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution_stats: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_stats")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

