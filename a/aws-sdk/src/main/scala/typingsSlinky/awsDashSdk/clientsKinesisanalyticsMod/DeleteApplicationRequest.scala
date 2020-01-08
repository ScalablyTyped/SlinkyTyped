package typingsSlinky.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationRequest extends js.Object {
  /**
    * Name of the Amazon Kinesis Analytics application to delete.
    */
  var ApplicationName: typingsSlinky.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName = js.native
  /**
    *  You can use the DescribeApplication operation to get this value. 
    */
  var CreateTimestamp: js.Date = js.native
}

object DeleteApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CreateTimestamp: js.Date): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CreateTimestamp = CreateTimestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
}

