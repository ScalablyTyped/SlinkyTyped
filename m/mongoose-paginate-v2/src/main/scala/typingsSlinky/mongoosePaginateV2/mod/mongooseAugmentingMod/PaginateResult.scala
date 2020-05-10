package typingsSlinky.mongoosePaginateV2.mod.mongooseAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateResult[T]
  extends /* customLabel */ StringDictionary[js.UndefOr[js.Array[T] | Double | Boolean]] {
  var docs: js.Array[T] = js.native
  var hasNextPage: Boolean = js.native
  var hasPrevPage: Boolean = js.native
  var limit: Double = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var nextPage: js.UndefOr[Double | Null] = js.native
  var page: js.UndefOr[Double] = js.native
  var pagingCounter: Double = js.native
  var prevPage: js.UndefOr[Double | Null] = js.native
  var totalDocs: Double = js.native
  var totalPages: Double = js.native
}

object PaginateResult {
  @scala.inline
  def apply[T](
    docs: js.Array[T],
    hasNextPage: Boolean,
    hasPrevPage: Boolean,
    limit: Double,
    pagingCounter: Double,
    totalDocs: Double,
    totalPages: Double
  ): PaginateResult[T] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], pagingCounter = pagingCounter.asInstanceOf[js.Any], totalDocs = totalDocs.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
  @scala.inline
  implicit class PaginateResultOps[Self[t] <: PaginateResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDocs(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNextPage(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPrevPage(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrevPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagingCounter(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDocs(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPages(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(null)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPage")(null)
        ret
    }
  }
  
}

