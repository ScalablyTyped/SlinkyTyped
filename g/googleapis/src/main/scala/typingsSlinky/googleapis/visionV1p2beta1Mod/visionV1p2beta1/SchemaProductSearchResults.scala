package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results for a product search request.
  */
@js.native
trait SchemaProductSearchResults extends js.Object {
  /**
    * Timestamp of the index which provided these results. Changes made after
    * this time are not reflected in the current results.
    */
  var indexTime: js.UndefOr[String] = js.native
  /**
    * List of results grouped by products detected in the query image. Each
    * entry corresponds to one bounding polygon in the query image, and
    * contains the matching products specific to that region. There may be
    * duplicate product matches in the union of all the per-product results.
    */
  var productGroupedResults: js.UndefOr[js.Array[SchemaGroupedResult]] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaResult]] = js.native
}

object SchemaProductSearchResults {
  @scala.inline
  def apply(): SchemaProductSearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSearchResults]
  }
  @scala.inline
  implicit class SchemaProductSearchResultsOps[Self <: SchemaProductSearchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProductGroupedResults(value: js.Array[SchemaGroupedResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productGroupedResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductGroupedResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productGroupedResults")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SchemaResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

