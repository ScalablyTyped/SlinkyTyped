package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimWhitespaceResponse extends js.Object {
  /** The number of cells that were trimmed of whitespace. */
  var cellsChangedCount: js.UndefOr[Double] = js.native
}

object TrimWhitespaceResponse {
  @scala.inline
  def apply(): TrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimWhitespaceResponse]
  }
  @scala.inline
  implicit class TrimWhitespaceResponseOps[Self <: TrimWhitespaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellsChangedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsChangedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellsChangedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsChangedCount")(js.undefined)
        ret
    }
  }
  
}

