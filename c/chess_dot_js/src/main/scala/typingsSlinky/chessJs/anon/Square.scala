package typingsSlinky.chessJs.anon

import typingsSlinky.chessJs.chessJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Square extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.native
  /** Set to true to return verbose move objects instead of strings */
  var verbose: `true` = js.native
}

object Square {
  @scala.inline
  def apply(verbose: `true`): Square = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Square]
  }
  @scala.inline
  implicit class SquareOps[Self <: Square] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbose(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square")(js.undefined)
        ret
    }
  }
  
}

