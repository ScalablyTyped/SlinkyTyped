package typingsSlinky.chessJs.mod

import typingsSlinky.chessJs.chessJsStrings.b
import typingsSlinky.chessJs.chessJsStrings.k
import typingsSlinky.chessJs.chessJsStrings.p
import typingsSlinky.chessJs.chessJsStrings.w
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends ShortMove {
  /**
    * If an enemy piece was captured this is their type
    */
  var captured: js.UndefOr[Exclude[PieceType, k]] = js.undefined
  /**
    * The color of the piece that moved
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w
  /** Flags indicating what occurred, combined into one string */
  var flags: String
  /**
    * The type of the piece that moved
    */
  var piece: PieceType
  /** The Standard Algebraic Notation (SAN) representation of the move */
  var san: String
}

object Move {
  @scala.inline
  def apply(
    color: b | w,
    flags: String,
    from: Square,
    piece: PieceType,
    san: String,
    to: Square,
    captured: Exclude[PieceType, k] = null,
    promotion: Exclude[PieceType, p] = null
  ): Move = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any], san = san.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (captured != null) __obj.updateDynamic("captured")(captured.asInstanceOf[js.Any])
    if (promotion != null) __obj.updateDynamic("promotion")(promotion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

