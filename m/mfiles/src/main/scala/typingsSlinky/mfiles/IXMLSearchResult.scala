package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXMLSearchResult extends js.Object {
  val MoreResults: Boolean = js.native
  val SearchResult: String = js.native
}

object IXMLSearchResult {
  @scala.inline
  def apply(MoreResults: Boolean, SearchResult: String): IXMLSearchResult = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults.asInstanceOf[js.Any], SearchResult = SearchResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLSearchResult]
  }
  @scala.inline
  implicit class IXMLSearchResultOps[Self <: IXMLSearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

