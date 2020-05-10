package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamodbIntegration extends js.Object {
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.native
}

object DynamodbIntegration {
  @scala.inline
  def apply(): DynamodbIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamodbIntegration]
  }
  @scala.inline
  implicit class DynamodbIntegrationOps[Self <: DynamodbIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAws_access_key(value: AwsAccessKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_access_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAws_access_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_access_key")(js.undefined)
        ret
    }
  }
  
}

