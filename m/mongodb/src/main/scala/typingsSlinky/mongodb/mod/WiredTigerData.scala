package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.AnonAllocationsrequiringfileextension
import typingsSlinky.mongodb.AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
import typingsSlinky.mongodb.AnonBloomfilterfalsepositives
import typingsSlinky.mongodb.AnonBtreecheckpointgeneration
import typingsSlinky.mongodb.AnonBulkloadedcursorinsertcalls
import typingsSlinky.mongodb.AnonBytescurrentlyinthecache
import typingsSlinky.mongodb.AnonCompressedpagesread
import typingsSlinky.mongodb.AnonDictionarymatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiredTigerData extends js.Object {
  var LSM: AnonBloomfilterfalsepositives = js.native
  var `block-manager`: AnonAllocationsrequiringfileextension = js.native
  var btree: AnonBtreecheckpointgeneration = js.native
  var cache: AnonBytescurrentlyinthecache = js.native
  var cache_walk: AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered = js.native
  var compression: AnonCompressedpagesread = js.native
  var cursor: AnonBulkloadedcursorinsertcalls = js.native
  var reconciliation: AnonDictionarymatches = js.native
}

object WiredTigerData {
  @scala.inline
  def apply(
    LSM: AnonBloomfilterfalsepositives,
    `block-manager`: AnonAllocationsrequiringfileextension,
    btree: AnonBtreecheckpointgeneration,
    cache: AnonBytescurrentlyinthecache,
    cache_walk: AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: AnonCompressedpagesread,
    cursor: AnonBulkloadedcursorinsertcalls,
    reconciliation: AnonDictionarymatches
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(LSM = LSM.asInstanceOf[js.Any], btree = btree.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cache_walk = cache_walk.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], reconciliation = reconciliation.asInstanceOf[js.Any])
    __obj.updateDynamic("block-manager")(`block-manager`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredTigerData]
  }
  @scala.inline
  implicit class WiredTigerDataOps[Self <: WiredTigerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLSM(value: AnonBloomfilterfalsepositives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LSM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBlock-manager`(value: AnonAllocationsrequiringfileextension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtree(value: AnonBtreecheckpointgeneration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: AnonBytescurrentlyinthecache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache_walk(value: AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_walk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: AnonCompressedpagesread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: AnonBulkloadedcursorinsertcalls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconciliation(value: AnonDictionarymatches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconciliation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

