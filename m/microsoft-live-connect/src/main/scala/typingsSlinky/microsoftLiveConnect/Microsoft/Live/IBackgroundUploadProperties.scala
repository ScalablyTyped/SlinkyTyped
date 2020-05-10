package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.backgroundUpload method.
  */
@js.native
trait IBackgroundUploadProperties extends js.Object {
  /**
    * The file input object to read the file from. Can be a
    * Windows.Storage.StorageFile or an IFile.
    */
  var file_input: js.UndefOr[js.Any] = js.native
  /**
    * The name of the file to upload.
    */
  var file_name: js.UndefOr[String] = js.native
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify "true" to overwrite, "false" to not overwrite and for
    * the WL.backgroundUpload method call to fail, or "rename" to not
    * overwrite and enable SkyDrive to assign a new name to the uploaded
    * file.
    * @default "false".
    */
  var overwrite: js.UndefOr[String] = js.native
  /**
    * The path to the file to upload.
    */
  var path: String = js.native
  /**
    * The file input stream to read the file from.
    */
  var stream_input: js.UndefOr[IInputStream] = js.native
}

object IBackgroundUploadProperties {
  @scala.inline
  def apply(path: String): IBackgroundUploadProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundUploadProperties]
  }
  @scala.inline
  implicit class IBackgroundUploadPropertiesOps[Self <: IBackgroundUploadProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_input(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_input: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_input")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_name")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withStream_input(value: IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream_input: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_input")(js.undefined)
        ret
    }
  }
  
}

