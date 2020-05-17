package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientValidationSummary.VisibilityChanged event.
  */
@js.native
trait ASPxClientValidationSummaryVisibilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the editor is visible on the client.
    */
  var visible: Boolean = js.native
}

object ASPxClientValidationSummaryVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): ASPxClientValidationSummaryVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationSummaryVisibilityChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientValidationSummaryVisibilityChangedEventArgsOps[Self <: ASPxClientValidationSummaryVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

