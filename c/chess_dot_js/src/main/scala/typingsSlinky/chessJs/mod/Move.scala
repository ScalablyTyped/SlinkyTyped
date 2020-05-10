package typingsSlinky.chessJs.mod

import typingsSlinky.chessJs.chessJsStrings.b
import typingsSlinky.chessJs.chessJsStrings.k
import typingsSlinky.chessJs.chessJsStrings.w
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Move extends ShortMove {
  /**
    * If an enemy piece was captured this is their type
    */
  var captured: js.UndefOr[Exclude[PieceType, k]] = js.native
  /**
    * The color of the piece that moved
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w = js.native
  /** Flags indicating what occurred, combined into one string */
  var flags: String = js.native
  /**
    * The type of the piece that moved
    */
  var piece: PieceType = js.native
  /** The Standard Algebraic Notation (SAN) representation of the move */
  var san: String = js.native
}

object Move {
  @scala.inline
  def apply(color: b | w, flags: String, from: Square, piece: PieceType, san: String, to: Square): Move = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any], san = san.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  @scala.inline
  implicit class MoveOps[Self <: Move] (val x: Self) extends AnyVal {
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
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPiece(value: PieceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("piece")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("san")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptured(value: Exclude[PieceType, k]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captured")(js.undefined)
        ret
    }
  }
  
}

