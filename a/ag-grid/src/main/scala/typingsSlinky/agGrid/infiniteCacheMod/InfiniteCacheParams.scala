package typingsSlinky.agGrid.infiniteCacheMod

import typingsSlinky.agGrid.iDatasourceMod.IDatasource
import typingsSlinky.agGrid.rowNodeBlockLoaderMod.RowNodeBlockLoader
import typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCacheParams
import typingsSlinky.agGrid.utilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteCacheParams extends RowNodeCacheParams {
  var datasource: IDatasource = js.native
}

object InfiniteCacheParams {
  @scala.inline
  def apply(
    blockSize: Double,
    datasource: IDatasource,
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
  ): InfiniteCacheParams = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any], dynamicRowHeight = dynamicRowHeight.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], initialRowCount = initialRowCount.asInstanceOf[js.Any], lastAccessedSequence = lastAccessedSequence.asInstanceOf[js.Any], maxBlocksInCache = maxBlocksInCache.asInstanceOf[js.Any], maxConcurrentRequests = maxConcurrentRequests.asInstanceOf[js.Any], overflowSize = overflowSize.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowNodeBlockLoader = rowNodeBlockLoader.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteCacheParams]
  }
  @scala.inline
  implicit class InfiniteCacheParamsOps[Self <: InfiniteCacheParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasource(value: IDatasource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

