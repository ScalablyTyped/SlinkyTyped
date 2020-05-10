package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account. 
    */
  var DataSourceId: ResourceId = js.native
  /**
    * The parameters that QuickSight uses to connect to your underlying source.
    */
  var DataSourceParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.DataSourceParameters] = js.native
  /**
    * A display name for the data source.
    */
  var Name: ResourceName = js.native
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.SslProperties] = js.native
  /**
    * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VpcConnectionProperties] = js.native
}

object UpdateDataSourceRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId, Name: ResourceName): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  @scala.inline
  implicit class UpdateDataSourceRequestOps[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: DataSourceCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceParameters(value: DataSourceParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSslProperties(value: SslProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConnectionProperties(value: VpcConnectionProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConnectionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConnectionProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConnectionProperties")(js.undefined)
        ret
    }
  }
  
}

