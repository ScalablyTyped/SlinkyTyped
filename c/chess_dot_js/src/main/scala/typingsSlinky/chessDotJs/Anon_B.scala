package typingsSlinky.chessDotJs

import typingsSlinky.chessDotJs.chessDotJsStrings.b
import typingsSlinky.chessDotJs.chessDotJsStrings.c
import typingsSlinky.chessDotJs.chessDotJsStrings.e
import typingsSlinky.chessDotJs.chessDotJsStrings.k
import typingsSlinky.chessDotJs.chessDotJsStrings.n
import typingsSlinky.chessDotJs.chessDotJsStrings.p
import typingsSlinky.chessDotJs.chessDotJsStrings.q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
  /** a pawn push of two squares */
  var BIG_PAWN: b
  /** a standard capture */
  var CAPTURE: c
  /** an en passant capture */
  var EP_CAPTURE: e
  /** kingside castling */
  var KSIDE_CASTLE: k
  /** a non-capture */
  var NORMAL: n
  /** a promotion */
  var PROMOTION: p
  /** queenside castling */
  var QSIDE_CASTLE: q
}

object Anon_B {
  @scala.inline
  def apply(BIG_PAWN: b, CAPTURE: c, EP_CAPTURE: e, KSIDE_CASTLE: k, NORMAL: n, PROMOTION: p, QSIDE_CASTLE: q): Anon_B = {
    val __obj = js.Dynamic.literal(BIG_PAWN = BIG_PAWN.asInstanceOf[js.Any], CAPTURE = CAPTURE.asInstanceOf[js.Any], EP_CAPTURE = EP_CAPTURE.asInstanceOf[js.Any], KSIDE_CASTLE = KSIDE_CASTLE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], PROMOTION = PROMOTION.asInstanceOf[js.Any], QSIDE_CASTLE = QSIDE_CASTLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_B]
  }
}

