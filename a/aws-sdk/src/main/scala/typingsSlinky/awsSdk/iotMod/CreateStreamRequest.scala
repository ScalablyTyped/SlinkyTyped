package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamRequest extends js.Object {
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The files to stream.
    */
  var files: StreamFiles = js.native
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: RoleArn = js.native
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
  /**
    * Metadata which can be used to manage streams.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateStreamRequest {
  @scala.inline
  def apply(files: StreamFiles, roleArn: RoleArn, streamId: StreamId): CreateStreamRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamRequest]
  }
  @scala.inline
  implicit class CreateStreamRequestOps[Self <: CreateStreamRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: StreamFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamId(value: StreamId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: StreamDescription): Self = {
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

