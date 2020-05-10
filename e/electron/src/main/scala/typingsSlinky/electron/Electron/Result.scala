package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: Double = js.native
  var finalUpdate: Boolean = js.native
  /**
    * Number of Matches.
    */
  var matches: Double = js.native
  var requestId: Double = js.native
  /**
    * Coordinates of first match region.
    */
  var selectionArea: SelectionArea = js.native
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
    def withActiveMatchOrdinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeMatchOrdinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionArea(value: SelectionArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionArea")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

