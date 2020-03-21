package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFaqRequest extends js.Object {
  /**
    * A description of the FAQ.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Description] = js.native
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
  /**
    * The name that should be associated with the FAQ.
    */
  var Name: FaqName = js.native
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: typingsSlinky.awsSdk.kendraMod.RoleArn = js.native
  /**
    * The S3 location of the FAQ input data.
    */
  var S3Path: typingsSlinky.awsSdk.kendraMod.S3Path = js.native
}

object CreateFaqRequest {
  @scala.inline
  def apply(IndexId: IndexId, Name: FaqName, RoleArn: RoleArn, S3Path: S3Path, Description: Description = null): CreateFaqRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Path = S3Path.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFaqRequest]
  }
}

