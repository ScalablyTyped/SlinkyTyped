package typingsSlinky.mongodb.mongodbMod

import typingsSlinky.mongodb.Anon_Allocationsrequiringfileextension
import typingsSlinky.mongodb.Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
import typingsSlinky.mongodb.Anon_Bloomfilterfalsepositives
import typingsSlinky.mongodb.Anon_Btreecheckpointgeneration
import typingsSlinky.mongodb.Anon_Bulkloadedcursorinsertcalls
import typingsSlinky.mongodb.Anon_Bytescurrentlyinthecache
import typingsSlinky.mongodb.Anon_Compressedpagesread
import typingsSlinky.mongodb.Anon_Dictionarymatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiredTigerData extends js.Object {
  var LSM: Anon_Bloomfilterfalsepositives
  var `block-manager`: Anon_Allocationsrequiringfileextension
  var btree: Anon_Btreecheckpointgeneration
  var cache: Anon_Bytescurrentlyinthecache
  var cache_walk: Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
  var compression: Anon_Compressedpagesread
  var cursor: Anon_Bulkloadedcursorinsertcalls
  var reconciliation: Anon_Dictionarymatches
}

object WiredTigerData {
  @scala.inline
  def apply(
    LSM: Anon_Bloomfilterfalsepositives,
    `block-manager`: Anon_Allocationsrequiringfileextension,
    btree: Anon_Btreecheckpointgeneration,
    cache: Anon_Bytescurrentlyinthecache,
    cache_walk: Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: Anon_Compressedpagesread,
    cursor: Anon_Bulkloadedcursorinsertcalls,
    reconciliation: Anon_Dictionarymatches
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(LSM = LSM.asInstanceOf[js.Any], btree = btree.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cache_walk = cache_walk.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], reconciliation = reconciliation.asInstanceOf[js.Any])
    __obj.updateDynamic("block-manager")(`block-manager`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredTigerData]
  }
}

