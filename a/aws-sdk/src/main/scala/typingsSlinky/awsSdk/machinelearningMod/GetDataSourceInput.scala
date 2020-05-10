package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSourceInput extends js.Object {
  /**
    * The ID assigned to the DataSource at creation.
    */
  var DataSourceId: EntityId = js.native
  /**
    * Specifies whether the GetDataSource operation should return DataSourceSchema. If true, DataSourceSchema is returned. If false, DataSourceSchema is not returned.
    */
  var Verbose: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Verbose] = js.native
}

object GetDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId): GetDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceInput]
  }
  @scala.inline
  implicit class GetDataSourceInputOps[Self <: GetDataSourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Verbose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Verbose")(js.undefined)
        ret
    }
  }
  
}

