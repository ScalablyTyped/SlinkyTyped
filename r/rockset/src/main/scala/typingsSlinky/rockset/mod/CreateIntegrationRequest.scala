package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntegrationRequest extends js.Object {
  // longer explanation for the integration
  var description: js.UndefOr[String] = js.native
  // Amazon DynamoDB details, must have one of aws_access_key or aws_role
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.native
  // GCS details
  var gcs: js.UndefOr[GcsIntegration] = js.native
  // Amazon Kinesis details, must have one of aws_access_key or aws_role
  var kinesis: js.UndefOr[KinesisIntegration] = js.native
  // descriptive label
  var name: String = js.native
  // Amazon Redshift details
  var redshift: js.UndefOr[RedshiftIntegration] = js.native
  // Amazon S3 details, must have one of aws_access_key or aws_role
  var s3: js.UndefOr[S3Integration] = js.native
}

object CreateIntegrationRequest {
  @scala.inline
  def apply(name: String): CreateIntegrationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationRequest]
  }
  @scala.inline
  implicit class CreateIntegrationRequestOps[Self <: CreateIntegrationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamodb(value: DynamodbIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(js.undefined)
        ret
    }
    @scala.inline
    def withGcs(value: GcsIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcs")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesis(value: KinesisIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshift(value: RedshiftIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshift")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: S3Integration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(js.undefined)
        ret
    }
  }
  
}

