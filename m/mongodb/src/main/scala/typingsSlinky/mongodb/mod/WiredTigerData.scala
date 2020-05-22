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

trait WiredTigerData extends js.Object {
  var LSM: Bloomfilterfalsepositives
  var `block-manager`: Allocationsrequiringfileextension
  var btree: Btreecheckpointgeneration
  var cache: Bytescurrentlyinthecache
  var cache_walk: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
  var compression: Compressedpagesread
  var cursor: Bulkloadedcursorinsertcalls
  var reconciliation: Dictionarymatches
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
}

