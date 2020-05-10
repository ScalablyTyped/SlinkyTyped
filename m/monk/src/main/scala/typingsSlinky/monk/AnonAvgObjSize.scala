package typingsSlinky.monk

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.monk.monkNumbers.`0`
import typingsSlinky.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvgObjSize extends js.Object {
  var avgObjSize: Double = js.native
  var capped: Boolean = js.native
  var count: Double = js.native
  var indexDetails: StringDictionary[js.Any] = js.native
  var indexSizes: StringDictionary[Double] = js.native
  var nindexes: Double = js.native
  var ns: String = js.native
  var ok: `1` | `0` = js.native
  var size: Double = js.native
  var storageSize: Double = js.native
  var totalIndexSize: Double = js.native
  var wiredTiger: js.Any = js.native
}

object AnonAvgObjSize {
  @scala.inline
  def apply(
    avgObjSize: Double,
    capped: Boolean,
    count: Double,
    indexDetails: StringDictionary[js.Any],
    indexSizes: StringDictionary[Double],
    nindexes: Double,
    ns: String,
    ok: `1` | `0`,
    size: Double,
    storageSize: Double,
    totalIndexSize: Double,
    wiredTiger: js.Any
  ): AnonAvgObjSize = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize.asInstanceOf[js.Any], capped = capped.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], indexDetails = indexDetails.asInstanceOf[js.Any], indexSizes = indexSizes.asInstanceOf[js.Any], nindexes = nindexes.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageSize = storageSize.asInstanceOf[js.Any], totalIndexSize = totalIndexSize.asInstanceOf[js.Any], wiredTiger = wiredTiger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvgObjSize]
  }
  @scala.inline
  implicit class AnonAvgObjSizeOps[Self <: AnonAvgObjSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvgObjSize(value: Double): Self = {
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexDetails(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexSizes(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNindexes(value: Double): Self = {
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
    def withOk(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalIndexSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalIndexSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWiredTiger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiredTiger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

