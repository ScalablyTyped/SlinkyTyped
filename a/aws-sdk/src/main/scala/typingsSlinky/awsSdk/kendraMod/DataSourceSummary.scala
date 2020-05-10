package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSummary extends js.Object {
  /**
    * The UNIX datetime that the data source was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier for the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  /**
    * The name of the data source.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The status of the data source. When the status is ATIVE the data source is ready to use.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  /**
    * The UNIX datetime that the data source was lasted updated. 
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.native
}

object DataSourceSummary {
  @scala.inline
  def apply(): DataSourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSummary]
  }
  @scala.inline
  implicit class DataSourceSummaryOps[Self <: DataSourceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: DataSourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DataSourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DataSourceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DataSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
  }
  
}

