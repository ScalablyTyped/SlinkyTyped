package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base for ASPxClientChartTitle and ASPxClientSeriesTitle classes.
  */
@js.native
trait ASPxClientTitleBase extends ASPxClientWebChartElement {
  /**
    * Gets the alignment of the title.
    */
  var alignment: String = js.native
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    */
  var dock: String = js.native
  /**
    * Gets the lines of text within a title.
    */
  var lines: js.Array[String] = js.native
}

object ASPxClientTitleBase {
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, dock: String, lines: js.Array[String]): ASPxClientTitleBase = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dock = dock.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTitleBase]
  }
  @scala.inline
  implicit class ASPxClientTitleBaseOps[Self <: ASPxClientTitleBase] (val x: Self) extends AnyVal {
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
    def withDock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

