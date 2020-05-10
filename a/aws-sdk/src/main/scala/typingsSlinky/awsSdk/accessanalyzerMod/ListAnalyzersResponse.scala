package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnalyzersResponse extends js.Object {
  /**
    * The analyzers retrieved.
    */
  var analyzers: AnalyzersList = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}

object ListAnalyzersResponse {
  @scala.inline
  def apply(analyzers: AnalyzersList): ListAnalyzersResponse = {
    val __obj = js.Dynamic.literal(analyzers = analyzers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzersResponse]
  }
  @scala.inline
  implicit class ListAnalyzersResponseOps[Self <: ListAnalyzersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzers(value: AnalyzersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

