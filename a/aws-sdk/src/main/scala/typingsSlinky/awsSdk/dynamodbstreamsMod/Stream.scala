package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.StreamArn] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
    */
  var StreamLabel: js.UndefOr[String] = js.native
  /**
    * The DynamoDB table with which the stream is associated.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.TableName] = js.native
}

object Stream {
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamArn(value: StreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
  }
  
}

