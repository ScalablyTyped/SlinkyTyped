package typingsSlinky.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains audio data in the encoding specified in the `RecognitionConfig`.
  * Either `content` or `uri` must be supplied. Supplying both or neither
  * returns google.rpc.Code.INVALID_ARGUMENT. See [content
  * limits](/speech-to-text/quotas#content).
  */
@js.native
trait SchemaRecognitionAudio extends js.Object {
  /**
    * The audio data bytes encoded as specified in `RecognitionConfig`. Note:
    * as with all bytes fields, protobuffers use a pure binary representation,
    * whereas JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * URI that points to a file that contains audio data bytes as specified in
    * `RecognitionConfig`. The file must not be compressed (for example, gzip).
    * Currently, only Google Cloud Storage URIs are supported, which must be
    * specified in the following format: `gs://bucket_name/object_name` (other
    * URI formats return google.rpc.Code.INVALID_ARGUMENT). For more
    * information, see [Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris).
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaRecognitionAudio {
  @scala.inline
  def apply(): SchemaRecognitionAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionAudio]
  }
  @scala.inline
  implicit class SchemaRecognitionAudioOps[Self <: SchemaRecognitionAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

