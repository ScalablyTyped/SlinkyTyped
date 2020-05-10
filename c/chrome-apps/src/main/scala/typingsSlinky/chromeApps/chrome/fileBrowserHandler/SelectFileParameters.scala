package typingsSlinky.chromeApps.chrome.fileBrowserHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectFileParameters extends js.Object {
  /**
    * List of file extensions that the selected file can have.
    * The list is also used to specify what files to be shown in the select file dialog.
    * Files with the listed extensions are only shown in the dialog.
    * Extensions should not include the leading '.'.
    * @example ['jpg', 'png']
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
  /** Suggested name for the file. */
  var suggestedName: String = js.native
}

object SelectFileParameters {
  @scala.inline
  def apply(suggestedName: String): SelectFileParameters = {
    val __obj = js.Dynamic.literal(suggestedName = suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFileParameters]
  }
  @scala.inline
  implicit class SelectFileParametersOps[Self <: SelectFileParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileExtensions")(js.undefined)
        ret
    }
  }
  
}

