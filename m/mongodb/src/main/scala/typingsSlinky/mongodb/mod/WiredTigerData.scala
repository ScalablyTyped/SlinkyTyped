package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Allocationsrequiringfileextension
import typingsSlinky.mongodb.anon.Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
import typingsSlinky.mongodb.anon.Bloomfilterfalsepositives
import typingsSlinky.mongodb.anon.Btreecheckpointgeneration
import typingsSlinky.mongodb.anon.Bulkloadedcursorinsertcalls
import typingsSlinky.mongodb.anon.Bytescurrentlyinthecache
import typingsSlinky.mongodb.anon.Compressedpagesread
import typingsSlinky.mongodb.anon.Dictionarymatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiredTigerData extends js.Object {
  var LSM: Bloomfilterfalsepositives = js.native
  var `block-manager`: Allocationsrequiringfileextension = js.native
  var btree: Btreecheckpointgeneration = js.native
  var cache: Bytescurrentlyinthecache = js.native
  var cache_walk: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered = js.native
  var compression: Compressedpagesread = js.native
  var cursor: Bulkloadedcursorinsertcalls = js.native
  var reconciliation: Dictionarymatches = js.native
}

object WiredTigerData {
  @scala.inline
  def apply(
    LSM: Bloomfilterfalsepositives,
    `block-manager`: Allocationsrequiringfileextension,
    btree: Btreecheckpointgeneration,
    cache: Bytescurrentlyinthecache,
    cache_walk: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: Compressedpagesread,
    cursor: Bulkloadedcursorinsertcalls,
    reconciliation: Dictionarymatches
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
    def withLSM(value: Bloomfilterfalsepositives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LSM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBlock-manager`(value: Allocationsrequiringfileextension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtree(value: Btreecheckpointgeneration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Bytescurrentlyinthecache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache_walk(value: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_walk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: Compressedpagesread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: Bulkloadedcursorinsertcalls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconciliation(value: Dictionarymatches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconciliation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

