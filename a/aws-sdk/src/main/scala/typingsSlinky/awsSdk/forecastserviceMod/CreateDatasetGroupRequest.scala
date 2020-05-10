package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupRequest extends js.Object {
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.native
  /**
    * A name for the dataset group.
    */
  var DatasetGroupName: Name = js.native
  /**
    * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match. The Domain and DatasetType that you choose determine the fields that must be present in training data that you import to a dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires that item_id, timestamp, and demand fields are present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: typingsSlinky.awsSdk.forecastserviceMod.Domain = js.native
}

object CreateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupName: Name, Domain: Domain): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupName = DatasetGroupName.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
  @scala.inline
  implicit class CreateDatasetGroupRequestOps[Self <: CreateDatasetGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetGroupName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetArns(value: ArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetArns")(js.undefined)
        ret
    }
  }
  
}

