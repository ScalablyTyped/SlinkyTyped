package typingsSlinky.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var `0`: String = js.native
  var `1`: String = js.native
  var `2`: String = js.native
  var `3`: String = js.native
  var `4`: String = js.native
  var catchall: Double = js.native
  var disposable: Double = js.native
  var flags: Academichost = js.native
  var invalid: Double = js.native
  var unknown: Double = js.native
  var valid: Double = js.native
}

object `0` {
  @scala.inline
  def apply(
    `0`: String,
    `1`: String,
    `2`: String,
    `3`: String,
    `4`: String,
    catchall: Double,
    disposable: Double,
    flags: Academichost,
    invalid: Double,
    unknown: Double,
    valid: Double
  ): `0` = {
    val __obj = js.Dynamic.literal(catchall = catchall.asInstanceOf[js.Any], disposable = disposable.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatchall(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Academichost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

