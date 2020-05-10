package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEventTopicRequest extends js.Object {
  /**
    * The Directory ID that will publish status messages to the SNS topic.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The SNS topic name to which the directory will publish status messages. This SNS topic must be in the same region as the specified Directory ID.
    */
  var TopicName: typingsSlinky.awsSdk.directoryserviceMod.TopicName = js.native
}

object RegisterEventTopicRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): RegisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEventTopicRequest]
  }
  @scala.inline
  implicit class RegisterEventTopicRequestOps[Self <: RegisterEventTopicRequest] (val x: Self) extends AnyVal {
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
    def withTopicName(value: TopicName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

