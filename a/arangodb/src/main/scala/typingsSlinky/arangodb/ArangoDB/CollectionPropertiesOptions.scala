package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionPropertiesOptions extends js.Object {
  var indexBuckets: js.UndefOr[Double] = js.native
  var journalSize: js.UndefOr[Double] = js.native
  var replicationFactor: js.UndefOr[Double] = js.native
  var waitForSync: js.UndefOr[Boolean] = js.native
}

object CollectionPropertiesOptions {
  @scala.inline
  def apply(): CollectionPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesOptions]
  }
  @scala.inline
  implicit class CollectionPropertiesOptionsOps[Self <: CollectionPropertiesOptions] (val x: Self) extends AnyVal {
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
    def withoutIndexBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBuckets")(js.undefined)
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

