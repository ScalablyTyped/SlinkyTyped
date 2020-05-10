package typingsSlinky.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSloppy extends js.Object {
  /**
    * An optional sloppy flag can be used to parse a variety of
    * non-standard move notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.native
}

object AnonSloppy {
  @scala.inline
  def apply(): AnonSloppy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSloppy]
  }
  @scala.inline
  implicit class AnonSloppyOps[Self <: AnonSloppy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSloppy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sloppy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSloppy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sloppy")(js.undefined)
        ret
    }
  }
  
}

