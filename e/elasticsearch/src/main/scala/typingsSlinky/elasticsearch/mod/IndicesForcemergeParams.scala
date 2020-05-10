package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesForcemergeParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var flush: js.UndefOr[Boolean] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: NameList = js.native
  var maxNumSegments: js.UndefOr[Double] = js.native
  var onlyExpungeDeletes: js.UndefOr[Boolean] = js.native
  var operationThreading: js.UndefOr[js.Any] = js.native
     // even the docs don't know what this does
  var waitForMerge: js.UndefOr[Boolean] = js.native
}

object IndicesForcemergeParams {
  @scala.inline
  def apply(index: NameList): IndicesForcemergeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesForcemergeParams]
  }
  @scala.inline
  implicit class IndicesForcemergeParamsOps[Self <: IndicesForcemergeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowNoIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNoIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandWildcards(value: ExpandWildcards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandWildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWildcards")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnavailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyExpungeDeletes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExpungeDeletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyExpungeDeletes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExpungeDeletes")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationThreading(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationThreading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationThreading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationThreading")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForMerge")(js.undefined)
        ret
    }
  }
  
}

