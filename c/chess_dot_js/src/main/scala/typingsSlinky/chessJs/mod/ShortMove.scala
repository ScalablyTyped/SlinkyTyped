package typingsSlinky.chessJs.mod

import typingsSlinky.chessJs.chessJsStrings.p
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortMove extends js.Object {
  /**
    * The location the piece is moving from.
    * Must be in san format, e.g "h8"
    */
  var from: Square = js.native
  /**
    * If this move results in a promotion, this will have the unit promotion.
    */
  var promotion: js.UndefOr[Exclude[PieceType, p]] = js.native
  /**
    * The location the piece is moving to.
    * Must be in san format, e.g "a1"
    */
  var to: Square = js.native
}

object ShortMove {
  @scala.inline
  def apply(from: Square, to: Square): ShortMove = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortMove]
  }
  @scala.inline
  implicit class ShortMoveOps[Self <: ShortMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotion(value: Exclude[PieceType, p]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotion")(js.undefined)
        ret
    }
  }
  
}

