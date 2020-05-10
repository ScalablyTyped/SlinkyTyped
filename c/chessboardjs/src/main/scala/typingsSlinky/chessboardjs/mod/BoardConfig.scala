package typingsSlinky.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardConfig extends js.Object {
  var appearSpeed: js.UndefOr[Double | SpeedType] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var dropOffBoard: js.UndefOr[DropOffBoardType] = js.native
  var moveSpeed: js.UndefOr[Double | SpeedType] = js.native
  var onChange: js.UndefOr[Callback] = js.native
  var onDragMove: js.UndefOr[Callback] = js.native
  var onDragStart: js.UndefOr[Callback] = js.native
  var onDrop: js.UndefOr[Callback] = js.native
  var onMouseoutSquare: js.UndefOr[Callback] = js.native
  var onMouseoverSquare: js.UndefOr[Callback] = js.native
  var onMoveEnd: js.UndefOr[Callback] = js.native
  var onSnapEnd: js.UndefOr[Callback] = js.native
  var onSnapbackEnd: js.UndefOr[Callback] = js.native
  var orientation: js.UndefOr[OrientationType] = js.native
  var pieceTheme: js.UndefOr[String | Callback] = js.native
  var position: js.UndefOr[PositionType] = js.native
  var showErrors: js.UndefOr[Boolean | String | Callback] = js.native
  var showNotation: js.UndefOr[Boolean] = js.native
  var snapSpeed: js.UndefOr[Double | SpeedType] = js.native
  var snapbackSpeed: js.UndefOr[Double | SpeedType] = js.native
  var sparePieces: js.UndefOr[Boolean] = js.native
  var trashSpeed: js.UndefOr[Double | SpeedType] = js.native
}

object BoardConfig {
  @scala.inline
  def apply(): BoardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardConfig]
  }
  @scala.inline
  implicit class BoardConfigOps[Self <: BoardConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearSpeed(value: Double | SpeedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDropOffBoard(value: DropOffBoardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOffBoard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropOffBoard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOffBoard")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveSpeed(value: Double | SpeedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragMove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseoutSquare(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoutSquare")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseoutSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoutSquare")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseoverSquare(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoverSquare")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseoverSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseoverSquare")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMoveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSnapEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSnapEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSnapEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSnapEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSnapbackEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSnapbackEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSnapbackEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSnapbackEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: OrientationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPieceThemeFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieceTheme")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPieceTheme(value: String | Callback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieceTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieceTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieceTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrorsFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowErrors(value: Boolean | String | Callback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapSpeed(value: Double | SpeedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapbackSpeed(value: Double | SpeedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapbackSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapbackSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapbackSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSparePieces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparePieces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparePieces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparePieces")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashSpeed(value: Double | SpeedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashSpeed")(js.undefined)
        ret
    }
  }
  
}

