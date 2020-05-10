package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchResult...
  */
@js.native
trait ISearchResult extends js.Object {
  /**
    * List of search groups.
    * The groups are numbered
    * from
    * the value of SearchPage.qOffset
    * to
    * the value of SearchPage.qOffset + SearchPage.qCount.
    */
  var qSearchGroupArray: ISearchGroup = js.native
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String] = js.native
  /**
    * Total number of groups.
    */
  var qTotalNumberOfGroups: Double = js.native
}

object ISearchResult {
  @scala.inline
  def apply(qSearchGroupArray: ISearchGroup, qSearchTerms: js.Array[String], qTotalNumberOfGroups: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(qSearchGroupArray = qSearchGroupArray.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qTotalNumberOfGroups = qTotalNumberOfGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  @scala.inline
  implicit class ISearchResultOps[Self <: ISearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQSearchGroupArray(value: ISearchGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSearchGroupArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSearchTerms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSearchTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotalNumberOfGroups(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalNumberOfGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

