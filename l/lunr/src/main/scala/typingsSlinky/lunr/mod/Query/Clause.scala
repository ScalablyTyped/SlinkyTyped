package typingsSlinky.lunr.mod.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single clause in a {@link lunr.Query} contains a term and details on how to
  * match that term against a {@link lunr.Index}.
  */
@js.native
trait Clause extends js.Object {
  /** Any boost that should be applied when matching this clause. */
  var boost: Double = js.native
  /** Whether the term should have fuzzy matching applied, and how fuzzy the match should be. */
  var editDistance: Double = js.native
  /** The fields in an index this clause should be matched against. */
  var fields: js.Array[String] = js.native
  var term: String = js.native
  /** Whether the term should be passed through the search pipeline. */
  var usePipeline: Boolean = js.native
  /** Whether the term should have wildcards appended or prepended. */
  var wildcard: Double = js.native
}

object Clause {
  @scala.inline
  def apply(
    boost: Double,
    editDistance: Double,
    fields: js.Array[String],
    term: String,
    usePipeline: Boolean,
    wildcard: Double
  ): Clause = {
    val __obj = js.Dynamic.literal(boost = boost.asInstanceOf[js.Any], editDistance = editDistance.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], usePipeline = usePipeline.asInstanceOf[js.Any], wildcard = wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clause]
  }
  @scala.inline
  implicit class ClauseOps[Self <: Clause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePipeline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWildcard(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

