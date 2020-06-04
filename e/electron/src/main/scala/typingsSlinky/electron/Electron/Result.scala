package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: Double
  var finalUpdate: Boolean
  /**
    * Number of Matches.
    */
  var matches: Double
  var requestId: Double
  /**
    * Coordinates of first match region.
    */
  var selectionArea: SelectionArea
}

object Result {
  @scala.inline
  def apply(
    activeMatchOrdinal: Double,
    finalUpdate: Boolean,
    matches: Double,
    requestId: Double,
    selectionArea: SelectionArea
  ): Result = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], finalUpdate = finalUpdate.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], selectionArea = selectionArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveMatchOrdinal(value: Double): Self = this.set("activeMatchOrdinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalUpdate(value: Boolean): Self = this.set("finalUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatches(value: Double): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionArea(value: SelectionArea): Self = this.set("selectionArea", value.asInstanceOf[js.Any])
  }
  
}

