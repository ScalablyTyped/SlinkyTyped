package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A method that will handle the splitter's client events concerning manipulations with a pane.
  */
@js.native
trait ASPxClientSplitterPaneEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the pane object related to the event.
    */
  var pane: ASPxClientSplitterPane = js.native
}

object ASPxClientSplitterPaneEventArgs {
  @scala.inline
  def apply(pane: ASPxClientSplitterPane): ASPxClientSplitterPaneEventArgs = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitterPaneEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSplitterPaneEventArgsOps[Self <: ASPxClientSplitterPaneEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPane(value: ASPxClientSplitterPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

