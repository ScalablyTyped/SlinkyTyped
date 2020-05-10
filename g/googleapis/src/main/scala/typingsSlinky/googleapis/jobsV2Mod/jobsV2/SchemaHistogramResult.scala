package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Result of a histogram call. The response contains the
  * histogram map for the search type specified by HistogramResult.field. The
  * response is a map of each filter value to the corresponding count of jobs
  * for that filter.
  */
@js.native
trait SchemaHistogramResult extends js.Object {
  /**
    * The Histogram search filters.
    */
  var searchType: js.UndefOr[String] = js.native
  /**
    * A map from the values of field to the number of jobs with that value in
    * this search result.  Key: search type (filter names, such as the
    * companyName).  Values: the count of jobs that match the filter for this
    * search.
    */
  var values: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaHistogramResult {
  @scala.inline
  def apply(): SchemaHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResult]
  }
  @scala.inline
  implicit class SchemaHistogramResultOps[Self <: SchemaHistogramResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

