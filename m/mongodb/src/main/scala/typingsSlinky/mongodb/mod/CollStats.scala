package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Dictindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollStats extends js.Object {
  /**
    * Average object size in bytes.
    */
  var avgObjSize: scala.Double = js.native
  /**
    * `true` if the collection is capped.
    */
  var capped: Boolean = js.native
  /**
    * Number of documents.
    */
  var count: scala.Double = js.native
  var indexDetails: js.UndefOr[js.Any] = js.native
  /**
    * Size of specific indexes in bytes.
    */
  var indexSizes: Dictindex = js.native
  /**
    * Size of the most recently created extent in bytes.
    */
  var lastExtentSize: scala.Double = js.native
  /**
    * The maximum number of documents that may be present in a capped collection.
    */
  var max: scala.Double = js.native
  /**
    * The maximum size of a capped collection.
    */
  var maxSize: scala.Double = js.native
  /**
    * Number of indexes.
    */
  var nindexes: scala.Double = js.native
  /**
    * Namespace.
    */
  var ns: String = js.native
  /**
    * Number of extents (contiguously allocated chunks of datafile space).
    */
  var numExtents: scala.Double = js.native
  var ok: scala.Double = js.native
  /**
    * Padding can speed up updates if documents grow.
    */
  var paddingFactor: scala.Double = js.native
  /**
    * Collection size in bytes.
    */
  var size: scala.Double = js.native
  /**
    * (Pre)allocated space for the collection in bytes.
    */
  var storageSize: scala.Double = js.native
  /**
    * Total index size in bytes.
    */
  var totalIndexSize: scala.Double = js.native
  /**
    * A number that indicates the user-set flags on the collection. userFlags only appears when using the mmapv1 storage engine.
    */
  var userFlags: js.UndefOr[scala.Double] = js.native
  var wiredTiger: js.UndefOr[WiredTigerData] = js.native
}

object CollStats {
  @scala.inline
  def apply(
    avgObjSize: scala.Double,
    capped: Boolean,
    count: scala.Double,
    indexSizes: Dictindex,
    lastExtentSize: scala.Double,
    max: scala.Double,
    maxSize: scala.Double,
    nindexes: scala.Double,
    ns: String,
    numExtents: scala.Double,
    ok: scala.Double,
    paddingFactor: scala.Double,
    size: scala.Double,
    storageSize: scala.Double,
    totalIndexSize: scala.Double
  ): CollStats = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize.asInstanceOf[js.Any], capped = capped.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], indexSizes = indexSizes.asInstanceOf[js.Any], lastExtentSize = lastExtentSize.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], nindexes = nindexes.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], numExtents = numExtents.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], paddingFactor = paddingFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageSize = storageSize.asInstanceOf[js.Any], totalIndexSize = totalIndexSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollStats]
  }
  @scala.inline
  implicit class CollStatsOps[Self <: CollStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvgObjSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgObjSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexSizes(value: Dictindex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastExtentSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastExtentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNindexes(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nindexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumExtents(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numExtents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingFactor(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalIndexSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalIndexSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withUserFlags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withWiredTiger(value: WiredTigerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiredTiger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiredTiger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiredTiger")(js.undefined)
        ret
    }
  }
  
}

