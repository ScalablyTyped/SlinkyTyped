package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends UniqueId {
  /** The default time to live in seconds for documents in a collection. */
  var defaultTtl: js.UndefOr[Double] = js.native
  /** The indexing policy associated with the collection. */
  var indexingPolicy: js.UndefOr[IndexingPolicy] = js.native
  /**
    * This value is used to configure the partition key to be used for partitioning data into multiple partitions.
    *
    * If the x-ms-offer-throughput is over 10,000, then the collection must include a partitionKey definition.
    *
    * If the x-ms-offer-throughput is equal to or under 10,000, then the collection must not include a partitionKey definition.
    */
  var partitionKey: js.UndefOr[CollectionPartitionKey] = js.native
}

object Collection {
  @scala.inline
  def apply(id: String): Collection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexingPolicy(value: IndexingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKey(value: CollectionPartitionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(js.undefined)
        ret
    }
  }
  
}

