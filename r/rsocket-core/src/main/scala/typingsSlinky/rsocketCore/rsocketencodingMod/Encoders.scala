package typingsSlinky.rsocketCore.rsocketencodingMod

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoders[T /* <: Encodable */] extends js.Object {
  var data: Encoder[T] = js.native
  var dataMimeType: Encoder[String] = js.native
  var message: Encoder[String] = js.native
  var metadata: Encoder[T] = js.native
  var metadataMimeType: Encoder[String] = js.native
  var resumeToken: Encoder[T] = js.native
}

object Encoders {
  @scala.inline
  def apply[T](
    data: Encoder[T],
    dataMimeType: Encoder[String],
    message: Encoder[String],
    metadata: Encoder[T],
    metadataMimeType: Encoder[String],
    resumeToken: Encoder[T]
  ): Encoders[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMimeType = dataMimeType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoders[T]]
  }
  @scala.inline
  implicit class EncodersOps[Self[t] <: Encoders[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: Encoder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataMimeType(value: Encoder[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Encoder[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Encoder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataMimeType(value: Encoder[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeToken(value: Encoder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

