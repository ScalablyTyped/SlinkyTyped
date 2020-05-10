package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListS3ResourcesResult extends js.Object {
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of the associated S3 resources returned by the action.
    */
  var s3Resources: js.UndefOr[S3ResourcesClassification] = js.native
}

object ListS3ResourcesResult {
  @scala.inline
  def apply(): ListS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3ResourcesResult]
  }
  @scala.inline
  implicit class ListS3ResourcesResultOps[Self <: ListS3ResourcesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Resources(value: S3ResourcesClassification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Resources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Resources")(js.undefined)
        ret
    }
  }
  
}

