package typingsSlinky.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationOptions extends js.Object {
  var deterministic: js.UndefOr[Boolean] = js.native
  var safeIntegers: js.UndefOr[Boolean] = js.native
  var varargs: js.UndefOr[Boolean] = js.native
}

object RegistrationOptions {
  @scala.inline
  def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  @scala.inline
  implicit class RegistrationOptionsOps[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeterministic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deterministic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeterministic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deterministic")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeIntegers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeIntegers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeIntegers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeIntegers")(js.undefined)
        ret
    }
    @scala.inline
    def withVarargs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varargs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVarargs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varargs")(js.undefined)
        ret
    }
  }
  
}

