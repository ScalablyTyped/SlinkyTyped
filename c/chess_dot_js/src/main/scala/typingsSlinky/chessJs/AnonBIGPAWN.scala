package typingsSlinky.chessJs

import typingsSlinky.chessJs.chessJsStrings.b
import typingsSlinky.chessJs.chessJsStrings.c
import typingsSlinky.chessJs.chessJsStrings.e
import typingsSlinky.chessJs.chessJsStrings.k
import typingsSlinky.chessJs.chessJsStrings.n
import typingsSlinky.chessJs.chessJsStrings.p
import typingsSlinky.chessJs.chessJsStrings.q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBIGPAWN extends js.Object {
  /** a pawn push of two squares */
  var BIG_PAWN: b = js.native
  /** a standard capture */
  var CAPTURE: c = js.native
  /** an en passant capture */
  var EP_CAPTURE: e = js.native
  /** kingside castling */
  var KSIDE_CASTLE: k = js.native
  /** a non-capture */
  var NORMAL: n = js.native
  /** a promotion */
  var PROMOTION: p = js.native
  /** queenside castling */
  var QSIDE_CASTLE: q = js.native
}

object AnonBIGPAWN {
  @scala.inline
  def apply(BIG_PAWN: b, CAPTURE: c, EP_CAPTURE: e, KSIDE_CASTLE: k, NORMAL: n, PROMOTION: p, QSIDE_CASTLE: q): AnonBIGPAWN = {
    val __obj = js.Dynamic.literal(BIG_PAWN = BIG_PAWN.asInstanceOf[js.Any], CAPTURE = CAPTURE.asInstanceOf[js.Any], EP_CAPTURE = EP_CAPTURE.asInstanceOf[js.Any], KSIDE_CASTLE = KSIDE_CASTLE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], PROMOTION = PROMOTION.asInstanceOf[js.Any], QSIDE_CASTLE = QSIDE_CASTLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBIGPAWN]
  }
  @scala.inline
  implicit class AnonBIGPAWNOps[Self <: AnonBIGPAWN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBIG_PAWN(value: b): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BIG_PAWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCAPTURE(value: c): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEP_CAPTURE(value: e): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EP_CAPTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKSIDE_CASTLE(value: k): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KSIDE_CASTLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNORMAL(value: n): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPROMOTION(value: p): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROMOTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSIDE_CASTLE(value: q): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QSIDE_CASTLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

