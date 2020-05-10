package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchAssociationResult...
  */
@js.native
trait ISearchAssociationResult extends js.Object {
  /**
    * Information about the fields containing search hits.
    */
  var qFieldDictionaries: js.Array[ISearchFieldDictionary] = js.native
  /**
    * List of the fields that contains search associations.
    */
  var qFieldNames: js.Array[String] = js.native
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String] = js.native
  /**
    * List of search results.
    * The maximum number of search results in this list is set by qPage/qCount.
    */
  var qSearchTermsMatched: js.Array[ISearchMatchCombinations] = js.native
  /**
    * Total number of search results.
    * This number is not limited by qPage/qCount.
    */
  var qTotalSearchResults: Double = js.native
}

object ISearchAssociationResult {
  @scala.inline
  def apply(
    qFieldDictionaries: js.Array[ISearchFieldDictionary],
    qFieldNames: js.Array[String],
    qSearchTerms: js.Array[String],
    qSearchTermsMatched: js.Array[ISearchMatchCombinations],
    qTotalSearchResults: Double
  ): ISearchAssociationResult = {
    val __obj = js.Dynamic.literal(qFieldDictionaries = qFieldDictionaries.asInstanceOf[js.Any], qFieldNames = qFieldNames.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qSearchTermsMatched = qSearchTermsMatched.asInstanceOf[js.Any], qTotalSearchResults = qTotalSearchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAssociationResult]
  }
  @scala.inline
  implicit class ISearchAssociationResultOps[Self <: ISearchAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFieldDictionaries(value: js.Array[ISearchFieldDictionary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldDictionaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFieldNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSearchTerms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSearchTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSearchTermsMatched(value: js.Array[ISearchMatchCombinations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSearchTermsMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotalSearchResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

