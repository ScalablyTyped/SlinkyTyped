package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTopicsRequest extends js.Object {
  /**
    * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all Directory IDs are returned.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TopicNames: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TopicNames] = js.native
}

object DescribeEventTopicsRequest {
  @scala.inline
  def apply(): DescribeEventTopicsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsRequest]
  }
  @scala.inline
  implicit class DescribeEventTopicsRequestOps[Self <: DescribeEventTopicsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicNames(value: TopicNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicNames")(js.undefined)
        ret
    }
  }
  
}

