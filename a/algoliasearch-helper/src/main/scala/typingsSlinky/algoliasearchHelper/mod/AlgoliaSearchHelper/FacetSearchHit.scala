package typingsSlinky.algoliasearchHelper.mod.AlgoliaSearchHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of each result when using
  * [`searchForFacetValues()`](reference.html#AlgoliaSearchHelper#searchForFacetValues)
  */
@js.native
trait FacetSearchHit extends js.Object {
  var count: Double = js.native
  var highlighted: String = js.native
  var isRefined: Boolean = js.native
  var value: String = js.native
}

object FacetSearchHit {
  @scala.inline
  def apply(count: Double, highlighted: String, isRefined: Boolean, value: String): FacetSearchHit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetSearchHit]
  }
  @scala.inline
  implicit class FacetSearchHitOps[Self <: FacetSearchHit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlighted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

