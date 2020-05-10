package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRowsCellsComment extends js.Object {
  /** Get or sets the value that indicates whether to show or hide comments in Spreadsheet.
    * @Default {false}
    */
  var isVisible: js.UndefOr[Boolean] = js.native
  /** Specifies the value for the comment in Spreadsheet.
    */
  var value: js.UndefOr[String] = js.native
}

object SheetsRowsCellsComment {
  @scala.inline
  def apply(): SheetsRowsCellsComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsComment]
  }
  @scala.inline
  implicit class SheetsRowsCellsCommentOps[Self <: SheetsRowsCellsComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

