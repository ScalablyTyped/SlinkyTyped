package typingsSlinky.chessJs.anon

import typingsSlinky.chessJs.chessJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verbose extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.native
  /** Set to true to return verbose move objects instead of strings */
  var verbose: js.UndefOr[`false`] = js.native
}

object Verbose {
  @scala.inline
  def apply(): Verbose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Verbose]
  }
  @scala.inline
  implicit class VerboseOps[Self <: Verbose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withVerbose(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

