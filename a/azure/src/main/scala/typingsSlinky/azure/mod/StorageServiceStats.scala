package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.LastSyncTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageServiceStats extends js.Object {
  var GeoReplication: LastSyncTime = js.native
}

object StorageServiceStats {
  @scala.inline
  def apply(GeoReplication: LastSyncTime): StorageServiceStats = {
    val __obj = js.Dynamic.literal(GeoReplication = GeoReplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceStats]
  }
  @scala.inline
  implicit class StorageServiceStatsOps[Self <: StorageServiceStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoReplication(value: LastSyncTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoReplication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

