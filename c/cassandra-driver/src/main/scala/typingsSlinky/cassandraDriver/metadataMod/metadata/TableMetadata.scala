package typingsSlinky.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.AnonDictoption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableMetadata extends DataCollection {
  var cdc: js.UndefOr[Boolean] = js.native
  var indexInterval: js.UndefOr[Double] = js.native
  var indexes: js.Array[Index] = js.native
  var isCompact: Boolean = js.native
  var memtableFlushPeriod: Double = js.native
  var replicateOnWrite: Boolean = js.native
  var virtual: Boolean = js.native
}

object TableMetadata {
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
    compression: AnonDictoption,
    defaultTtl: Double,
    extensions: StringDictionary[js.Any],
    gcGraceSeconds: Double,
    indexes: js.Array[Index],
    isCompact: Boolean,
    localReadRepairChance: Double,
    memtableFlushPeriod: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    replicateOnWrite: Boolean,
    speculativeRetry: String,
    virtual: Boolean
  ): TableMetadata = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], isCompact = isCompact.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], memtableFlushPeriod = memtableFlushPeriod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], replicateOnWrite = replicateOnWrite.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  @scala.inline
  implicit class TableMetadataOps[Self <: TableMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexes(value: js.Array[Index]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemtableFlushPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memtableFlushPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicateOnWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicateOnWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCdc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdc")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexInterval")(js.undefined)
        ret
    }
  }
  
}

