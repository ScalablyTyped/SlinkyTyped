package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregation of items by status code as of the specified date.
  */
@js.native
trait SchemaDataSourceIndexStats extends js.Object {
  /**
    * Date for which index stats were calculated. If the date of request is not
    * the current date then stats calculated on the next day are returned.
    * Stats are calculated close to mid night in this case. If date of request
    * is current date, then real time stats are returned.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[SchemaItemCountByStatus]] = js.native
}

object SchemaDataSourceIndexStats {
  @scala.inline
  def apply(): SchemaDataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceIndexStats]
  }
  @scala.inline
  implicit class SchemaDataSourceIndexStatsOps[Self <: SchemaDataSourceIndexStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: SchemaDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCountByStatus(value: js.Array[SchemaItemCountByStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCountByStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCountByStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCountByStatus")(js.undefined)
        ret
    }
  }
  
}

