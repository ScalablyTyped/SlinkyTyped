package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import typingsSlinky.microsoftLiveConnect.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned from a successful file picker operation.
  */
trait IFilePickerResult extends js.Object {
  /**
    * Contains data concerning the user's picked files.
    */
  var data: AnonFiles
}

object IFilePickerResult {
  @scala.inline
  def apply(data: AnonFiles): IFilePickerResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFilePickerResult]
  }
}

