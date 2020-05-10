package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceInput extends js.Object {
  /**
    * The ID assigned to the DataSource during creation.
    */
  var DataSourceId: EntityId = js.native
  /**
    * A new user-supplied name or description of the DataSource that will replace the current description. 
    */
  var DataSourceName: EntityName = js.native
}

object UpdateDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId, DataSourceName: EntityName): UpdateDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceInput]
  }
  @scala.inline
  implicit class UpdateDataSourceInputOps[Self <: UpdateDataSourceInput] (val x: Self) extends AnyVal {
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
    def withDataSourceName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

