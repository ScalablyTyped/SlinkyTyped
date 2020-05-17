package typingsSlinky.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.anon.Dictoption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCollection extends js.Object {
  var bloomFilterFalsePositiveChance: Double = js.native
  var caching: String = js.native
  var clusteringKeys: js.Array[ColumnInfo] = js.native
  var clusteringOrder: js.Array[String] = js.native
  var columns: js.Array[ColumnInfo] = js.native
  var columnsByName: StringDictionary[ColumnInfo] = js.native
  var comment: String = js.native
  var compactionClass: String = js.native
  var compactionOptions: StringDictionary[js.Any] = js.native
  var compression: Dictoption = js.native
  var crcCheckChange: js.UndefOr[Double] = js.native
  var defaultTtl: Double = js.native
  var extensions: StringDictionary[js.Any] = js.native
  var gcGraceSeconds: Double = js.native
  var localReadRepairChance: Double = js.native
  var maxIndexInterval: js.UndefOr[Double] = js.native
  var minIndexInterval: js.UndefOr[Double] = js.native
  var name: String = js.native
  var partitionKeys: js.Array[ColumnInfo] = js.native
  var populateCacheOnFlush: Boolean = js.native
  var readRepairChance: Double = js.native
  var speculativeRetry: String = js.native
}

object DataCollection {
  @scala.inline
  def apply(
    bloomFilterFalsePositiveChance: Double,
    caching: String,
    clusteringKeys: js.Array[ColumnInfo],
    clusteringOrder: js.Array[String],
    columns: js.Array[ColumnInfo],
    columnsByName: StringDictionary[ColumnInfo],
    comment: String,
    compactionClass: String,
    compactionOptions: StringDictionary[js.Any],
    compression: Dictoption,
    defaultTtl: Double,
    extensions: StringDictionary[js.Any],
    gcGraceSeconds: Double,
    localReadRepairChance: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    speculativeRetry: String
  ): DataCollection = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
  @scala.inline
  implicit class DataCollectionOps[Self <: DataCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBloomFilterFalsePositiveChance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bloomFilterFalsePositiveChance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaching(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusteringKeys(value: js.Array[ColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusteringOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsByName(value: StringDictionary[ColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactionClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactionOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: Dictoption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGcGraceSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcGraceSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalReadRepairChance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localReadRepairChance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionKeys(value: js.Array[ColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopulateCacheOnFlush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateCacheOnFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadRepairChance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRepairChance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeculativeRetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speculativeRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrcCheckChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crcCheckChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrcCheckChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crcCheckChange")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIndexInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIndexInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIndexInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIndexInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMinIndexInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIndexInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinIndexInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIndexInterval")(js.undefined)
        ret
    }
  }
  
}

