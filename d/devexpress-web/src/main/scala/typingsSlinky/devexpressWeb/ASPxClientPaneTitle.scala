package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pane title.
  */
@js.native
trait ASPxClientPaneTitle extends ASPxClientWebChartElement {
  /**
    * Returns the value that defines how to align the pane title.
    */
  var alignment: String = js.native
  /**
    * Returns the pane title's text.
    */
  var text: String = js.native
}

object ASPxClientPaneTitle {
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, text: String): ASPxClientPaneTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPaneTitle]
  }
  @scala.inline
  implicit class ASPxClientPaneTitleOps[Self <: ASPxClientPaneTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

