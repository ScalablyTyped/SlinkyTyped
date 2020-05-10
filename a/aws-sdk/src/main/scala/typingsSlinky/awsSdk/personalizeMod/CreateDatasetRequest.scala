package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
    */
  var datasetGroupArn: Arn = js.native
  /**
    * The type of dataset. One of the following (case insensitive) values:   Interactions   Items   Users  
    */
  var datasetType: DatasetType = js.native
  /**
    * The name for the dataset.
    */
  var name: Name = js.native
  /**
    * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
    */
  var schemaArn: Arn = js.native
}

object CreateDatasetRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn, datasetType: DatasetType, name: Name, schemaArn: Arn): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], datasetType = datasetType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  @scala.inline
  implicit class CreateDatasetRequestOps[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetType(value: DatasetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

