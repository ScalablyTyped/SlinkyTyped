package typingsSlinky.couchbase.mod.Bucket.FtsQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The meta-information available from a search query response.
  */
@js.native
trait Meta extends js.Object {
  /**
    * Any non-fatal errors that occurred during query processing.
    */
  var errors: js.Any = js.native
  /**
    * The resulting facet information for any facets that were specified
    * in the search query.
    */
  var facets: js.Any = js.native
  /**
    * The maximum score out of all the results in this query.
    */
  var maxScore: Double = js.native
  /**
    * The status information for this query, includes properties
    * such as total, failed, and successful.
    */
  var status: js.Any = js.native
  /**
    * The time spent processing this query.
    */
  var took: Double = js.native
  /**
    * The total number of hits that were available for this search query.
    */
  var totalHits: Double = js.native
}

object Meta {
  @scala.inline
  def apply(errors: js.Any, facets: js.Any, maxScore: Double, status: js.Any, took: Double, totalHits: Double): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], maxScore = maxScore.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], totalHits = totalHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTook(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("took")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalHits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

