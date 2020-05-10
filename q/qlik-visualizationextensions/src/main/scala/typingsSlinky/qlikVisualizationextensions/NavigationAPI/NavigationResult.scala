package typingsSlinky.qlikVisualizationextensions.NavigationAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The navigation result object.
  */
@js.native
trait NavigationResult extends js.Object {
  /**
    * Error code. Can be: NOSUCHSHEET   |   NOCURRENTSHEET   |   NOSUCHSTORY
    */
  var error: NavigationErrorType = js.native
  /**
    * Error message, for example 'No current sheet'.
    */
  var errorMsg: String = js.native
  /**
    * The new mode.
    */
  var mode: String = js.native
  /**
    * The new sheet ID.
    */
  var sheetId: String = js.native
  /**
    * The new story ID.
    */
  var storyId: String = js.native
  /**
    * Returns true if successful.
    */
  var success: Boolean = js.native
}

object NavigationResult {
  @scala.inline
  def apply(
    error: NavigationErrorType,
    errorMsg: String,
    mode: String,
    sheetId: String,
    storyId: String,
    success: Boolean
  ): NavigationResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
  @scala.inline
  implicit class NavigationResultOps[Self <: NavigationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: NavigationErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

