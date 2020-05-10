package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  /**
    * The S3 object location of the input media file. The URI must be in the same region as the API endpoint that you are calling. The general form is:   s3://&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  s3://examplebucket/example.mp4   s3://examplebucket/mediadocs/example.mp4  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide.
    */
  var MediaFileUri: js.UndefOr[Uri] = js.native
}

object Media {
  @scala.inline
  def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaFileUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaFileUri")(js.undefined)
        ret
    }
  }
  
}

