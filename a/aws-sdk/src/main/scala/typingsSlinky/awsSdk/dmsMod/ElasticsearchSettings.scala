package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchSettings extends js.Object {
  /**
    * The endpoint for the Elasticsearch cluster.
    */
  var EndpointUri: String = js.native
  /**
    * The maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum percentage of records that can fail to be written before a full load operation stops. 
    */
  var FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) used by service to access the IAM role.
    */
  var ServiceAccessRoleArn: String = js.native
}

object ElasticsearchSettings {
  @scala.inline
  def apply(EndpointUri: String, ServiceAccessRoleArn: String): ElasticsearchSettings = {
    val __obj = js.Dynamic.literal(EndpointUri = EndpointUri.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchSettings]
  }
  @scala.inline
  implicit class ElasticsearchSettingsOps[Self <: ElasticsearchSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccessRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorRetryDuration(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorRetryDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorRetryDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorRetryDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadErrorPercentage(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadErrorPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadErrorPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadErrorPercentage")(js.undefined)
        ret
    }
  }
  
}

