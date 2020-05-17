package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteHitsProvided[THit] extends js.Object {
  /** indicates if there are more pages to load */
  var hasMore: Boolean = js.native
  var hasPrevious: Boolean = js.native
  /** the records that matched the search */
  var hits: js.Array[THit] = js.native
  def refineNext(args: js.Any*): js.Any = js.native
  def refinePrevious(args: js.Any*): js.Any = js.native
}

object InfiniteHitsProvided {
  @scala.inline
  def apply[THit](
    hasMore: Boolean,
    hasPrevious: Boolean,
    hits: js.Array[THit],
    refineNext: /* repeated */ js.Any => js.Any,
    refinePrevious: /* repeated */ js.Any => js.Any
  ): InfiniteHitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], refineNext = js.Any.fromFunction1(refineNext), refinePrevious = js.Any.fromFunction1(refinePrevious))
    __obj.asInstanceOf[InfiniteHitsProvided[THit]]
  }
  @scala.inline
  implicit class InfiniteHitsProvidedOps[Self[thit] <: InfiniteHitsProvided[thit], THit] (val x: Self[THit]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THit] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THit]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[THit] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[THit] with Other]
    @scala.inline
    def withHasMore(value: Boolean): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPrevious(value: Boolean): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: js.Array[THit]): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefineNext(value: /* repeated */ js.Any => js.Any): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refineNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefinePrevious(value: /* repeated */ js.Any => js.Any): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refinePrevious")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

