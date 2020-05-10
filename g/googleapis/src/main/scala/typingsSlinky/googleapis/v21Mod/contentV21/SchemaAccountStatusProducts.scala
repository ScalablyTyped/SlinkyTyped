package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusProducts extends js.Object {
  /**
    * The channel the data applies to.
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * The country the data applies to.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The destination the data applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * List of item-level issues.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusItemLevelIssue]] = js.native
  /**
    * Aggregated product statistics.
    */
  var statistics: js.UndefOr[SchemaAccountStatusStatistics] = js.native
}

object SchemaAccountStatusProducts {
  @scala.inline
  def apply(): SchemaAccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusProducts]
  }
  @scala.inline
  implicit class SchemaAccountStatusProductsOps[Self <: SchemaAccountStatusProducts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withItemLevelIssues(value: js.Array[SchemaAccountStatusItemLevelIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLevelIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemLevelIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLevelIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: SchemaAccountStatusStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
  }
  
}

