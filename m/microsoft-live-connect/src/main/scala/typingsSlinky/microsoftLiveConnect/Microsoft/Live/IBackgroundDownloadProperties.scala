package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.backgroundDownload method.
  */
@js.native
trait IBackgroundDownloadProperties extends js.Object {
  /**
    * The file output object to which the downloaded file data is written.
    */
  var file_output: js.UndefOr[StorageFile] = js.native
  /**
    * The path to the file to download. For information on specifying paths
    * for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String = js.native
}

object IBackgroundDownloadProperties {
  @scala.inline
  def apply(path: String): IBackgroundDownloadProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundDownloadProperties]
  }
  @scala.inline
  implicit class IBackgroundDownloadPropertiesOps[Self <: IBackgroundDownloadProperties] (val x: Self) extends AnyVal {
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
    def withFile_output(value: StorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_output: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_output")(js.undefined)
        ret
    }
  }
  
}

