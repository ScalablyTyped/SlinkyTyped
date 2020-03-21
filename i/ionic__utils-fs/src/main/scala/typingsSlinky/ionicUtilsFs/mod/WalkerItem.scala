package typingsSlinky.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerItem extends js.Object {
  var path: String
  var stats: typingsSlinky.fsExtra.mod.Stats
}

object WalkerItem {
  @scala.inline
  def apply(path: String, stats: typingsSlinky.fsExtra.mod.Stats): WalkerItem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WalkerItem]
  }
}

