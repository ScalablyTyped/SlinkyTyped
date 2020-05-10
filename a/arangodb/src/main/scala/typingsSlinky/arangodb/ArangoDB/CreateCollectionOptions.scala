package typingsSlinky.arangodb.ArangoDB

import typingsSlinky.arangodb.AnonAllowUserKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectionOptions extends js.Object {
  var isSystem: js.UndefOr[Boolean] = js.native
  var isVolatile: js.UndefOr[Boolean] = js.native
  var journalSize: js.UndefOr[Double] = js.native
  var keyOptions: js.UndefOr[AnonAllowUserKeys] = js.native
  var numberOfShards: js.UndefOr[Double] = js.native
  var replicationFactor: js.UndefOr[Double] = js.native
  var shardKeys: js.UndefOr[js.Array[String]] = js.native
  var waitForSync: js.UndefOr[Boolean] = js.native
}

object CreateCollectionOptions {
  @scala.inline
  def apply(): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionOptions]
  }
  @scala.inline
  implicit class CreateCollectionOptionsOps[Self <: CreateCollectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVolatile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVolatile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVolatile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVolatile")(js.undefined)
        ret
    }
    @scala.inline
    def withJournalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJournalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyOptions(value: AnonAllowUserKeys): Self = {
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
    @scala.inline
    def withWaitForSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(js.undefined)
        ret
    }
  }
  
}

