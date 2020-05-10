package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingDataSource extends js.Object {
  /**
    * The data access role ARN for the training data source.
    */
  var dataAccessRoleArn: iamRoleArn = js.native
  /**
    * The data location of the training data source.
    */
  var dataLocation: s3BucketLocation = js.native
}

object TrainingDataSource {
  @scala.inline
  def apply(dataAccessRoleArn: iamRoleArn, dataLocation: s3BucketLocation): TrainingDataSource = {
    val __obj = js.Dynamic.literal(dataAccessRoleArn = dataAccessRoleArn.asInstanceOf[js.Any], dataLocation = dataLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingDataSource]
  }
  @scala.inline
  implicit class TrainingDataSourceOps[Self <: TrainingDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataAccessRoleArn(value: iamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLocation(value: s3BucketLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLocation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

