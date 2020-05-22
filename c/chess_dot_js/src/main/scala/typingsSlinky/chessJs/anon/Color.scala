package typingsSlinky.chessJs.anon

import typingsSlinky.chessJs.chessJsStrings.b
import typingsSlinky.chessJs.chessJsStrings.w
import typingsSlinky.chessJs.mod.PieceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: w | b
  var `type`: PieceType
}

object Color {
  @scala.inline
  def apply(color: w | b, `type`: PieceType): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

