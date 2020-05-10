package typingsSlinky.arangodb.ArangoDB

import typingsSlinky.arangodb.AnonIncrement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionProperties extends js.Object {
  var indexBuckets: Double = js.native
  var isSystem: Boolean = js.native
  var isVolatile: Boolean = js.native
  var journalSize: Double = js.native
  var keyOptions: js.UndefOr[AnonIncrement] = js.native
  var numberOfShards: js.UndefOr[Double] = js.native
  var replicationFactor: js.UndefOr[Double] = js.native
  var shardKeys: js.UndefOr[js.Array[String]] = js.native
  var waitForSync: Boolean = js.native
}

object CollectionProperties {
  @scala.inline
  def apply(
    indexBuckets: Double,
    isSystem: Boolean,
    isVolatile: Boolean,
    journalSize: Double,
    waitForSync: Boolean
  ): CollectionProperties = {
    val __obj = js.Dynamic.literal(indexBuckets = indexBuckets.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], isVolatile = isVolatile.asInstanceOf[js.Any], journalSize = journalSize.asInstanceOf[js.Any], waitForSync = waitForSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProperties]
  }
  @scala.inline
  implicit class CollectionPropertiesOps[Self <: CollectionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVolatile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVolatile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJournalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyOptions(value: AnonIncrement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfShards(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfShards")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withShardKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardKeys")(js.undefined)
        ret
    }
  }
  
}

