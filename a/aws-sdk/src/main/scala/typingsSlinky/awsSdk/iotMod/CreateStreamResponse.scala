package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamResponse extends js.Object {
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.native
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.native
  /**
    * The version of the stream.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.native
}

object CreateStreamResponse {
  @scala.inline
  def apply(): CreateStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamResponse]
  }
  @scala.inline
  implicit class CreateStreamResponseOps[Self <: CreateStreamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withStreamArn(value: StreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamId(value: StreamId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamVersion(value: StreamVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamVersion")(js.undefined)
        ret
    }
  }
  
}

