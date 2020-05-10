package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceFromRDSOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
}

object CreateDataSourceFromRDSOutput {
  @scala.inline
  def apply(): CreateDataSourceFromRDSOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSourceFromRDSOutput]
  }
  @scala.inline
  implicit class CreateDataSourceFromRDSOutputOps[Self <: CreateDataSourceFromRDSOutput] (val x: Self) extends AnyVal {
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
    def withoutDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(js.undefined)
        ret
    }
  }
  
}

