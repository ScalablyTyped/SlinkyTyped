package typingsSlinky.chessJs.mod

import typingsSlinky.chessJs.chessJsStrings.b
import typingsSlinky.chessJs.chessJsStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Piece extends js.Object {
  /**
    * The color of the piece
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w = js.native
  /**
    * The type of the piece to place
    */
  var `type`: PieceType = js.native
}

object Piece {
  @scala.inline
  def apply(color: b | w, `type`: PieceType): Piece = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Piece]
  }
  @scala.inline
  implicit class PieceOps[Self <: Piece] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: b | w): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PieceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

