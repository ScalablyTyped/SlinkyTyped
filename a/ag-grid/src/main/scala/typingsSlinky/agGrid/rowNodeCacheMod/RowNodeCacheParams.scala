package typingsSlinky.agGrid.rowNodeCacheMod

import typingsSlinky.agGrid.rowNodeBlockLoaderMod.RowNodeBlockLoader
import typingsSlinky.agGrid.utilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowNodeCacheParams extends js.Object {
  var blockSize: Double = js.native
  var dynamicRowHeight: Boolean = js.native
  var filterModel: js.Any = js.native
  var initialRowCount: Double = js.native
  var lastAccessedSequence: NumberSequence = js.native
  var maxBlocksInCache: Double = js.native
  var maxConcurrentRequests: Double = js.native
  var overflowSize: Double = js.native
  var rowHeight: Double = js.native
  var rowNodeBlockLoader: RowNodeBlockLoader = js.native
  var sortModel: js.Any = js.native
}

object RowNodeCacheParams {
  @scala.inline
  def apply(
    blockSize: Double,
    dynamicRowHeight: Boolean,
    filterModel: js.Any,
    initialRowCount: Double,
    lastAccessedSequence: NumberSequence,
    maxBlocksInCache: Double,
    maxConcurrentRequests: Double,
    overflowSize: Double,
    rowHeight: Double,
    rowNodeBlockLoader: RowNodeBlockLoader,
    sortModel: js.Any
  ): RowNodeCacheParams = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], dynamicRowHeight = dynamicRowHeight.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], initialRowCount = initialRowCount.asInstanceOf[js.Any], lastAccessedSequence = lastAccessedSequence.asInstanceOf[js.Any], maxBlocksInCache = maxBlocksInCache.asInstanceOf[js.Any], maxConcurrentRequests = maxConcurrentRequests.asInstanceOf[js.Any], overflowSize = overflowSize.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowNodeBlockLoader = rowNodeBlockLoader.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowNodeCacheParams]
  }
  @scala.inline
  implicit class RowNodeCacheParamsOps[Self <: RowNodeCacheParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicRowHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAccessedSequence(value: NumberSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxBlocksInCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBlocksInCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrentRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowNodeBlockLoader(value: RowNodeBlockLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeBlockLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

