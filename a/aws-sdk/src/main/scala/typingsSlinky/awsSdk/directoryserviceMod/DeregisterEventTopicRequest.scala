package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterEventTopicRequest extends js.Object {
  /**
    * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS topic.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The name of the SNS topic from which to remove the directory as a publisher.
    */
  var TopicName: typingsSlinky.awsSdk.directoryserviceMod.TopicName = js.native
}

object DeregisterEventTopicRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): DeregisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEventTopicRequest]
  }
  @scala.inline
  implicit class DeregisterEventTopicRequestOps[Self <: DeregisterEventTopicRequest] (val x: Self) extends AnyVal {
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

