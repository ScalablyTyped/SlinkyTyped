package typingsSlinky.algoliasearchHelper.mod.SearchResults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetValue extends js.Object {
  var count: Double = js.native
  var isExcluded: Boolean = js.native
  var isRefined: Boolean = js.native
  var name: String = js.native
}

object FacetValue {
  @scala.inline
  def apply(count: Double, isExcluded: Boolean, isRefined: Boolean, name: String): FacetValue = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], isExcluded = isExcluded.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetValue]
  }
  @scala.inline
  implicit class FacetValueOps[Self <: FacetValue] (val x: Self) extends AnyVal {
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
    def withIsExcluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExcluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

