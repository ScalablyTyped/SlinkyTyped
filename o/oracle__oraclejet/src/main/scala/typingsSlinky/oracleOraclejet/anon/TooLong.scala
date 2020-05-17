package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooLong extends js.Object {
  var tooLong: js.UndefOr[String] = js.native
  var tooShort: js.UndefOr[String] = js.native
}

object TooLong {
  @scala.inline
  def apply(): TooLong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooLong]
  }
  @scala.inline
  implicit class TooLongOps[Self <: TooLong] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooLong(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooLong")(js.undefined)
        ret
    }
    @scala.inline
    def withTooShort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooShort")(js.undefined)
        ret
    }
  }
  
}

