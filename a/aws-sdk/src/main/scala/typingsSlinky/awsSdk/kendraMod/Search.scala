package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  /**
    * Determines whether the field is returned in the query response. The default is true.
    */
  var Displayable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the field can be used to create search facets, a count of results for each value in the field. The default is false .
    */
  var Facetable: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the field is used in the search. If the Searchable field is true, you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is true for string fields and false for number and date fields.
    */
  var Searchable: js.UndefOr[Boolean] = js.native
}

object Search {
  @scala.inline
  def apply(): Search = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Search]
  }
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Displayable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Displayable")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facetable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facetable")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Searchable")(js.undefined)
        ret
    }
  }
  
}

