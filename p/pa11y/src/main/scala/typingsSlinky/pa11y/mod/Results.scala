package typingsSlinky.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  var documentTitle: String = js.native
  var issues: js.Array[ResultIssue] = js.native
  var pageUrl: String = js.native
}

object Results {
  @scala.inline
  def apply(documentTitle: String, issues: js.Array[ResultIssue], pageUrl: String): Results = {
    val __obj = js.Dynamic.literal(documentTitle = documentTitle.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: js.Array[ResultIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

