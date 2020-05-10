package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import typingsSlinky.microsoftLiveConnect.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned from a successful file picker operation.
  */
@js.native
trait IFilePickerResult extends js.Object {
  /**
    * Contains data concerning the user's picked files.
    */
  var data: AnonFiles = js.native
}

object IFilePickerResult {
  @scala.inline
  def apply(data: AnonFiles): IFilePickerResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilePickerResult]
  }
  @scala.inline
  implicit class IFilePickerResultOps[Self <: IFilePickerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

