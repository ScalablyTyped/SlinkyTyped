package typingsSlinky.hexoUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Length extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var omission: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
}

object Length {
  @scala.inline
  def apply(): Length = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Length]
  }
  @scala.inline
  implicit class LengthOps[Self <: Length] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withOmission(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omission")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

